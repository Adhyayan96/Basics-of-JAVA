import java.util.*;
import java.lang.*;
import java.io.*;
// Checking the if the user have a fever (if the user give >=100 temp)  or not (<100)

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        if(temp>=100){
            System.out.println("You have a fever");
        }
        else{
            System.out.println("You don't have a fever");
        }
    }
}
