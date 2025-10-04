import java.util.*;
import java.lang.*;
import java.io.*;
// Write a program that reads a set of integers and prints the sum of the odd and even integers.

public class Q7 {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        for (int i = 1; i<=4; i++){
            int a = sc.nextInt();
            if(a%2 == 0){
                even +=a;
            }
            else{
                odd +=a;
            }
        }
        System.out.println(even);
        System.out.println(odd);     
    }
}
