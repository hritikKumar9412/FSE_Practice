import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RentalService rs = new RentalService();

       rs.addVehicle(new Bike("B101","Harley Davidson",1200));
       rs.addVehicle(new Bike("B102","Royal Enfield",1000));
       rs.addVehicle(new Car1("C101","Scorpio",5000));
       rs.addVehicle(new Car1("C102","Thar",6000));


       while(true){
           System.out.println("\n---- Vehicle Rental System ----");
           System.out.println("1. View Vehicles");
           System.out.println("2. Rent Vehicles");
           System.out.println("3. Return Vehicles");
           System.out.println("4. Exit");
           System.out.println("Enter your choice: ");
           int choice = sc.nextInt();

           switch (choice){
               case 1:
                   rs.displayAllVehicles();
                   break;



               case 2:
                   sc.nextLine();

                   System.out.println("Enter Customer ID: ");
                   String customerID = sc.nextLine();

                   System.out.println("Enter Customer Name: ");
                   String customerName = sc.nextLine();

                   Customer customer = new Customer(customerID, customerName);


                   System.out.println("Enter Vehicle ID: ");
                   String vehicleID = sc.nextLine();

                   System.out.println("Enter Number of Days: ");
                   int days = sc.nextInt();

                   rs.rentalServices(vehicleID,customer,days);
                   break;

               case 3:
                   sc.nextLine();

                   System.out.println("Enter Vehicle ID to return: ");
                   String returnID = sc.nextLine();

                   rs.returnVehicle(returnID);
                   break;

               case 4:
                   System.out.println("Thank you for using our service!");
                   System.exit(0);

               default:
                   System.out.println("Invalid choice");
           }
       }
    }
}
