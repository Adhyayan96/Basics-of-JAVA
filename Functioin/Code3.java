import java.util.*;
import java.lang.*;
import java.io.*;
// Func Overloading Case 1 - function names & types are same, but their parameters are different

public class Code3 {
    // func to calculate only 2 integers
    public static int sum(int a, int b){ // 2 parameters - a & b
        return a+b;
    }
    // func to calculate 3 numbers
    public static int sum(int a, int b, int c){ // 3 parameters - a , b & c
        return a+b+c;
    }
    public static void main(String[] args) throws java.lang.Exception
    {
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2));
    }
}
