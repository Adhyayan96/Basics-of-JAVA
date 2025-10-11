import java.util.*;

/*
    *****
   ***** 
  *****  
 *****   
***** 
 */

public class P10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i =1; i<=n; i++){
            // first spaces part
            for(int spaces = 1; spaces<=n-i; spaces++){
                System.out.print(' ');
            }
            // stars
            for(int stars =1; stars<=n; stars++){
                System.out.print('*');
            }
            System.out.println();
        }
        sc.close();
    }
}