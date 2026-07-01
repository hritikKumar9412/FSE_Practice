import java.util.Scanner;


public class HospitalManagement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        HospitalServices hospitalServices = new HospitalServices();

        hospitalServices.addDoctor(new Doctor("D101","Dr.Dev",45,"Cardiologist"));
        hospitalServices.addDoctor(new Doctor("D102","Dr.Shaikh",32,"Neurologist"));


        while(true){

            System.out.println("\n ---Hospital Mangagement Services---");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. View Doctors");
            System.out.println("4. Book Appointment");
            System.out.println("5. Exit");


            int choice = input.nextInt();
            input.nextLine();

            switch(choice){

                case 1:

                    System.out.println("Enter Patient ID");
                    String patientID = input.nextLine();

                    System.out.println("Enter Patient Name");
                    String patientName = input.nextLine();


                    System.out.println("Age: ");
                    int age = input.nextInt();

                    input.nextLine();


                    System.out.println("Disease: ");
                    String disease= input.nextLine();


                    hospitalServices.addPatient(new Patient(patientID,patientName,age,disease));

                    System.out.println("Patient Added");
                    break;


                case 2:
                    hospitalServices.displayPatients();
                    break;

                case 3:
                    hospitalServices.displayDoctors();
                    break;


                case 4:
                    System.out.println("Enter Patient ID: ");
                    String patientId=input.nextLine();

                    System.out.println("Enter Doctor ID: ");
                    String doctorId=input.nextLine();

                    hospitalServices.bookAppointment(patientId,doctorId);

                    break;

                case 5:
                    System.exit(0);


                default:
                    System.out.println("Invalid choice");
            }

        }
    }
}
