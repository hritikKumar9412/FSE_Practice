class Car1 extends Vehicle {
    public Car1(String vehicleId, String brand, double rentPerDay) {
        super(vehicleId, brand, rentPerDay);
    }

    @Override
    public double calculateRent(int days) {
        return getRentPerDay() * days;
    }
}
