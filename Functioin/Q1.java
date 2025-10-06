import java.util.*;

public class Q1 {
    // find product of a & b through calling from a function
    public static int product(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a*b;
    }
    public static void main(String[] args) {
        int a = product();
        System.out.println(a);
    }
}
