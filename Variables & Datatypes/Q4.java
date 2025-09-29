import java.util.*;
// Take input of 3 int data types and then calculate average of them

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((a+b+c)/3);
        System.out.println((float)((a+b+c)/3)); // converting to float
    }
}
