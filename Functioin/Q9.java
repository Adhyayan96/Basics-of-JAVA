import java.util.*;

public class Q9 {
    // Check a number is palindrome or not
    public static void Palindrome(int a){
        //1st way -
        // StringBuilder sb = new StringBuilder();
        // sb.append(a);
        // if (a.equals(sb.reverse().toString())){ // compares with the reverse form of string a
        //     System.out.println("Palindrome");
        // }
        // else{
        //     System.out.println("Not Palindrome");
        // }

        // 2nd way -
        int b = a;
        int sum = 0;
        while(b>0){
            sum = (sum*10)+(b%10);
            b/=10;
        }
        if(a==sum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Palindrome(a);
        sc.close();
    }
}