import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<>();

        System.out.print("How many students? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            students.add(sc.nextLine());
        }

        System.out.println("\nStudent Names:");
        for (String name : students) {
            System.out.println(name);
        }

        sc.close();
    }
}