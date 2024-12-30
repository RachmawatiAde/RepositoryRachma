import java.util.Objects;

public class ValidateRequest {
    public void validate(CustomerInquiryRequest request, int customerFieldLength, int productFieldLength) {
        // 1. Check both parameters are not null and not empty strings
        checkBothParametersPopulated(request);

        // 2. Check both parameters are null or empty
        checkBothParametersNullOrEmpty(request);

        // 3. Validate and format CustomerID
        validateAndFormatCustomerID(request, customerFieldLength);

        // 4. Validate and format ProductNumber
        validateAndFormatProductNumber(request, productFieldLength);
    }

    private void checkBothParametersPopulated(CustomerInquiryRequest request) {
        if (!isNullOrEmpty(request.getCustomerProduct().getProductNumber()) &&
            !isNullOrEmpty(request.getCustomer().getCustomerID())) {
            throw new BusinessException(HandledErrors.INVALID_BOTH_PARAMETER_MESSAGE);
        }
    }

    private void checkBothParametersNullOrEmpty(CustomerInquiryRequest request) {
        if (isNullOrEmpty(request.getCustomer().getCustomerID()) &&
            isNullOrEmpty(request.getCustomerProduct().getProductNumber())) {
            throw new BusinessException(HandledErrors.CUSTOMER_EMPTY_MESSAGE);
        }
    }

    private void validateAndFormatCustomerID(CustomerInquiryRequest request, int customerFieldLength) {
        if (!isNullOrEmpty(request.getCustomer().getCustomerID())) {
            if (request.getCustomer().getCustomerID().length() > customerFieldLength) {
                throw new BusinessException(HandledErrors.CUSTOMER_INVALID_LENGTH_MESSAGE);
            }

            // Pad CustomerID with leading zeros
            request.getCustomer().setCustomerID(
                String.format("%" + customerFieldLength + "s", request.getCustomer().getCustomerID()).replace(' ', '0')
            );
        }
    }

    private void validateAndFormatProductNumber(CustomerInquiryRequest request, int productFieldLength) {
        if (!isNullOrEmpty(request.getCustomerProduct().getProductNumber())) {
            if (request.getCustomerProduct().getProductNumber().length() > productFieldLength) {
                throw new BusinessException(HandledErrors.PRODUCT_INVALID_LENGTH_MESSAGE);
            }

            // Pad ProductNumber with leading zeros
            request.getCustomerProduct().setProductNumber(
                String.format("%" + productFieldLength + "s", request.getCustomerProduct().getProductNumber()).replace(' ', '0')
            );
        }
    }

    private boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }
}

class CustomerInquiryRequest {
    private Customer customer;
    private CustomerProduct customerProduct;

    // Getters and Setters
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public CustomerProduct getCustomerProduct() {
        return customerProduct;
    }

    public void setCustomerProduct(CustomerProduct customerProduct) {
        this.customerProduct = customerProduct;
    }
}

class Customer {
    private String customerID;

    // Getters and Setters
    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
}

class CustomerProduct {
    private String productNumber;

    // Getters and Setters
    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }
}

class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        super(message);
    }
}

class HandledErrors {
    public static final String INVALID_BOTH_PARAMETER_MESSAGE = "Both CustomerID and ProductNumber cannot be populated at the same time.";
    public static final String CUSTOMER_EMPTY_MESSAGE = "Both CustomerID and ProductNumber cannot be empty.";
    public static final String CUSTOMER_INVALID_LENGTH_MESSAGE = "CustomerID exceeds the allowed length.";
    public static final String PRODUCT_INVALID_LENGTH_MESSAGE = "ProductNumber exceeds the allowed length.";
}
