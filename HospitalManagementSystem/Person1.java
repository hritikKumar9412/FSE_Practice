abstract class Person1 {
    private String id;
    private String name;
    private int age;

    public Person1(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public abstract void displayDetails();
}
