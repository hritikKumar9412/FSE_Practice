class Patient extends Person1 {
    private String Diseases;

    public Patient(String id, String name, int age, String diseases) {
        super(id, name, age);
        Diseases = diseases;
    }

    public String getDiseases() {
        return Diseases;
    }

    @Override
    public  void displayDetails() {

        System.out.println("Patient ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Disease: "+getDiseases());
        System.out.println("----------------------------");
    }
}
