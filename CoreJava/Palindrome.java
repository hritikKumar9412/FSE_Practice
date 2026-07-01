import java.util.Scanner;

public class Palindrome {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String str = sc.nextLine();

        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equals(reversed))
            System.out.println("The string is a Palindrome.");
        else
            System.out.println("The string is not a Palindrome.");

    }
}
