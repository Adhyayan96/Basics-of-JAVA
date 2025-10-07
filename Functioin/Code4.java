import java.util.*;
import java.lang.*;
import java.io.*;
// Func Overloading Case 2 - function names are same, parameters can be also same but their types are different

public class Code4 {

    public static int sum(int a, int b){ // 2 parameters - a & b
        return a+b;
    }

    public static float sum(float a, float b, float c){ // 3 parameters - a , b & c
        return a+b+c;
    }
    public static void main(String[] args) throws java.lang.Exception
    {
        System.out.println(sum(1,2));
        System.out.println(sum(1.44f,2.56f, 3.47f));
    }
}