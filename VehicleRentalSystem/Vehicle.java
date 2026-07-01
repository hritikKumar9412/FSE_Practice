abstract public class Vehicle {
    private String vehicleId;
    private String brand;
    private double rentPerDay;
    private boolean available;

    public Vehicle(String vehicleId, String brand, double rentPerDay) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.rentPerDay = rentPerDay;
        this.available = true;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public double getRentPerDay() {
        return rentPerDay;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public  abstract double calculateRent(int days);


    public void dispalyDetails(){
        System.out.println("ID: "+vehicleId+
                ",Brand: "+brand
        +",RentPerDay: "+rentPerDay+
                ",Available: "+available);
    }


}
