import java.util.*;

public class Code2 {
    public static void main(String[] args) {
        //Inputs
        Scanner sc = new Scanner(System.in);
        // String name = sc.next(); = next() function captures just the first word of a line
        String name2 = sc.nextLine(); // nextline() function captures the whole line of given input
        System.out.println(name2);

        int number = sc.nextInt();
        System.out.println(number);

        float price = sc.nextFloat();
        System.out.println(price);

        System.out.println(number + price);
    }
}
