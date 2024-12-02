/*class EmployeeType {
    abstract int payAmount(Employee emp);
    }
    class Salesman {
    int payAmount(Employee emp) {
    return emp.getMonthlySalary() + emp.getCommission();
    }
    }
    class Manager {
    int payAmount(Employee emp) {
    return emp.getMonthlySalary() + emp.getBonus();
}
}*/

abstract class EmployeeType {
    abstract int payAmount(Employee emp);
}

class Salesman extends EmployeeType {
    @Override
    int payAmount(Employee emp) {
        return emp.getMonthlySalary() + emp.getCommission();
    }
}

class Manager extends EmployeeType {
    @Override
    int payAmount(Employee emp) {
        return emp.getMonthlySalary() + emp.getBonus();
    }
}

class Employee {
    private int monthlySalary;
    private int commission;
    private int bonus;

    public Employee(int monthlySalary, int commission, int bonus) {
        this.monthlySalary = monthlySalary;
        this.commission = commission;
        this.bonus = bonus;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getCommission() {
        return commission;
    }

    public int getBonus() {
        return bonus;
    }
}
