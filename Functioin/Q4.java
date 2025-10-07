import java.util.*;
import java.lang.*;
import java.io.*;
// Check if the number n is prime or not, by using function

public class Q4 {
    
    public static void PrimeCheck(int a){
        String prime = "True";
        for (int i = 2; i<=a-1; i++){
            if(a == 2){
                break;
            }
            else if(a%i == 0){
                prime = "false";
                break;
            }
        }
        if (prime == "True"){
            System.out.println("It's a prime number");
        }
        else{
            System.out.println("It's not a prime number.");
        }
        return;
    }
    public static void main(String[] args) throws java.lang.Exception
{
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    PrimeCheck(a);  
}
}
