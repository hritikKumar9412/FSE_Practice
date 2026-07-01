import java.util.Scanner;

public class SimpleCalculator {
    static void main() {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double firstNumber= sc.nextDouble();
        System.out.println("Enter second number: ");
        double secondNumber= sc.nextDouble();

        System.out.println("\n Choose an Operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.println("Enter your choice(1-4): ");
        int choice= sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Addition of firstNumber and secondNumber :"+(firstNumber+secondNumber));
                break;

            case 2:
                System.out.println("Subtraction of firstNumber and secondNumber :"+ (firstNumber-secondNumber));
                break;

            case 3:
                System.out.println("Multiplication of firstNumber and secondNumber :"+ (firstNumber*secondNumber));
                break;

            case 4:
                System.out.println("Division of firstNumber and secondNumber :"+ (firstNumber/secondNumber));
                break;

            default:
                System.out.println("Invalid choice");
        }



    }
}
