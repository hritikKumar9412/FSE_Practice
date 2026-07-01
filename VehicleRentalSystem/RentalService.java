import java.util.ArrayList;

class RentalService {
    private ArrayList<Vehicle> vehicles=new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
    public void displayAllVehicles() {
        for (Vehicle vehicle : vehicles) {
            vehicle.dispalyDetails();
        }
    }

    public void rentalServices(String vehicleID, Customer customer,int days) {
           for(Vehicle vehicle : vehicles) {
                if(vehicle.getVehicleId().equals(vehicleID) && vehicle.isAvailable()) {
                        vehicle.setAvailable(false);
                        double  bill= vehicle.calculateRent(days);

            System.out.println("\nVehicle Rented Successfully");
            System.out.println("Customer: "+customer.getName());
            System.out.println("Vehicle : "+vehicle.getBrand());
            System.out.println("Days: "+days);
            System.out.println("Total Rent: "+bill);
            return;
        }
        }
        System.out.println("Vehicle Not Available");
    }

    public void returnVehicle(String vehicleId) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId().equals(vehicleId)) {

                // check if vehicle is rented

                if (vehicle.isAvailable()) {
                    vehicle.setAvailable(true);
                    System.out.println("Vehicle Returned Successfully");
                } else {
                    System.out.println("The Vehicle was not rented");
                }
                return;
            }
        }
        System.out.println("Invalid Vehicle Id");
    }
}

