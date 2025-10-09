import java.util.*;

public class Q10 {
    // Check sum of the digits of an integer
    public static void Palindrome(int a){
        int sum = 0;
        while(a>0){
            sum += (a%10);
            a/=10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Palindrome(a);
        sc.close();
    }
}