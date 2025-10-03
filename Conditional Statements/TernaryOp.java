import java.util.*;
import java.lang.*;
import java.io.*;

public class TernaryOp {
    public static void main(String[] args){

        // Ternary Operator

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a>3? 2: 5; // Use case of Ternary Operator
        long c = ((a%2)==0)? 3333: 666; // Another example
        System.out.println(b);
        System.out.println(c);
    }
}
