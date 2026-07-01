public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Sum of two integers: " + add(10, 20));
        System.out.println("Sum of two doubles: " + add(5.5, 4.5));
        System.out.println("Sum of three integers: " + add(10, 20, 30));
    }

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }
}
