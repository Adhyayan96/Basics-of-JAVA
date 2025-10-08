import java.util.*;

public class Q9 {
    // Check a number is palindrome or not
    public static void Palindrome(int a){
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        System.out.println(sb.reverse());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Palindrome(a);
        sc.close();
    }
}