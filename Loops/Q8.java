import java.util.*;
import java.lang.*;
import java.io.*;
// Write a program to print the multiplication table of a number N, entered by the user.

public class Q8 {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println("for " + i + '*' + a + " = " + (i*a));
        }
    }
}
