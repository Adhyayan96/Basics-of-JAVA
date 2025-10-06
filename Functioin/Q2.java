import java.util.*;

public class Q2 {
    // find factorial of a
    public static int factorial(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int fact = 1;
        for(int i = 1; i<=a; i++){
            fact *=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int a = factorial();
        System.out.println(a);
    }
}