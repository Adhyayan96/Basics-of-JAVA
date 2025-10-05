import java.util.*;
import java.lang.*;
import java.io.*;
/*
1
12
123
1234
 */

public class P5 {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            int sum = 1;
            for(int col = 1; col<=n-n+i; col++){
                System.out.print(sum);
                sum++;
            }
            System.out.println();
        }
    }
}