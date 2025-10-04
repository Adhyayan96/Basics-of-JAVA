import java.util.*;
import java.lang.*;
import java.io.*;
// Find factorial of a number

public class Q9 {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int mul = 1;
        for (int i = a; i<=a && i>0; i--){
            mul *= i;
        }
        System.out.println(mul);
    }
}

