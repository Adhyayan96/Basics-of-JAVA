import java.util.*;
import java.lang.*;
import java.io.*;
// Take infinite inputs from user, but when user give any input that is multiple of 10 then break the loop

public class Q5 {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        while (true){
            int a = sc.nextInt();
            if(a%10==0){
                break;
            }
            System.out.println("Enter a new number:");
        }
    }
}
