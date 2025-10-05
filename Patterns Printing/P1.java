import java.util.*;
import java.lang.*;
import java.io.*;
/*
*
**
***
****
 */

public class P1 {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++){
            for(int col = 0; col<=i; col++){
            System.out.print('*');
            }
            System.out.println();
        }
    }
}
