import java.util.*;
import java.lang.*;
import java.io.*;
/*
A
BC
DEF
GHIJ
 */

public class P4 {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char sum = 'A';
        for(int i = 1; i<=n; i++){
            for(int col = 1; col<=n-n+i; col++){
                System.out.print(sum);
                sum++;
            }
            System.out.println();
        }
    }
}