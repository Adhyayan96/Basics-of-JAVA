import java.util.*;
import java.lang.*;
import java.io.*;
// Reverse a number + save the rever number in an another integer and print that

public class Q4 {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int rev = 0;
        while(a>0){
            int ans = a%10;
            rev = (rev*10)+ans;
            a /=10;
        }
        System.out.println(rev);
    }
}

