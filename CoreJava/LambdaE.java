import java.util.*;
public class LambdaE {
    public static void main(String[] args) {
         List<String> list = Arrays.asList("Banana", "Apple", "Mango", "Orange");

            Collections.sort(list, (a, b) -> a.compareTo(b));

            System.out.println(list);
}
}
