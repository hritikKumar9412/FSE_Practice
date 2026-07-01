class Doctor extends Person1{

    private String specialization;

    public Doctor(String id, String name, int age, String specialization) {
        super(id, name, age);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public void displayDetails() {
        System.out.println("Doctor Id: "+getId()
        +"\nName: "+getName()
        +"\nAge: "+getAge()
        +"\nSpecialization: "+getSpecialization());


    }
}
