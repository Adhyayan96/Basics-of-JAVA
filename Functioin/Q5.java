import java.util.*;
import java.lang.*;
import java.io.*;
// Prime checking - Optimized way

public class Q5 {
    
    public static String PrimeCheck(int a){
        for (int i = 2; i<=Math.sqrt(a); i++){
            if(a == 2){
                return "True";
            }
            else if(a%i == 0){
               return "False";
            }
        }
            return "True";
    }
    public static void main(String[] args) throws java.lang.Exception
{
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println(PrimeCheck(a));
}
}
