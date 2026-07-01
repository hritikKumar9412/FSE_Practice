import java.util.ArrayList;
class HospitalServices {
        private  ArrayList<Patient> patients=new ArrayList<>();
        private  ArrayList<Doctor> doctors=new  ArrayList<>();

        public void addPatient(Patient p){
            patients.add(p);
        }
        public void addDoctor(Doctor d){
            doctors.add(d);
        }

        public void displayPatients(){
            for(Patient p:patients){
                p.displayDetails();
            }
        }
        public void displayDoctors(){
            for(Doctor d:doctors){
                d.displayDetails();
            }
        }
        public void bookAppointment(String patientId,String doctorId){
            Patient foundPatient = null;
            Doctor foundDoctor = null;

            for(Patient p:patients){
                if(p.getId().equals(patientId)){
                    foundPatient = p;
                }
            }

            for(Doctor d:doctors){
                if(d.getId().equals(doctorId)){
                    foundDoctor = d;
                }
            }

            if(foundPatient != null && foundDoctor != null){
                Appointment appointment = new Appointment(foundPatient,foundDoctor);

                appointment.displayAppointment();
            }
            else {
                System.out.println("Invalid Patient ID or Doctor ID");
            }
        }
}
