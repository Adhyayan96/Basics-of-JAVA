import java.util.*;
import java.lang.*;
import java.io.*;
/*
****
***
**
*
 */

public class P2 {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i+1; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}