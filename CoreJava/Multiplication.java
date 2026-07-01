import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int number = sc.nextInt();

        System.out.println("Multiplication of "+number+" is:");


        for (int i=1;i<=10;i++) {
            System.out.println(number+" x "+i+" = "+(i*number));
        }
    }
}
