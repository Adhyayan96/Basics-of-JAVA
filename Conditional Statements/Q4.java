import java.util.*;
import java.lang.*;
import java.io.*;
// Using terneary operator, check if a student will pass or fail

public class Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String result = marks>=33? "Pass": "fail";
        System.out.println(result);
    }
}
