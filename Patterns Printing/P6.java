import java.util.*;
import java.lang.*;
import java.io.*;
/*
*****
*   *
*   *
*****
 */

public class P6 {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==n-1|| j==1 || j==n){
                System.out.print('*');
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
        sc.close();
    }
}