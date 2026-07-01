import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();

        System.out.println("Fibonacci number at position " +number+" is "+ fibonacci(number));

    }

    static int fibonacci(int number) {
        if(number<=1) return number;

        return fibonacci(number-1) + fibonacci(number-2);

    }
}
