import java.util.*;
import java.lang.*;
import java.io.*;
// Checking whether the input integer is positibe or negative

public class Q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a>0){
            System.out.println("It's a positive number");
        }
            else {
                System.out.println("It's a negative number.");
            }
    }
}
