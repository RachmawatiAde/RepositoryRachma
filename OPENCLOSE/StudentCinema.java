class StudentCinema extends Cinema {
    public StudentCinema(Double price) {
        this.price = price;
    }
    @Override
    Double calculateAdminFee() {
        return price * 0.02; 
    }
}
