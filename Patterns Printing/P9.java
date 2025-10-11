import java.util.*;

/*
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
 */

public class P9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       for(int i =1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                if(i<=n/2){
                    if(j<=i){
                    System.out.print('*');
                    }
                    else if(j>n/2 && j>n-i){
                        System.out.print('*');
                    }
                    else{
                        System.out.print(' ');
                    }
                }
                else if(i>n/2 && i<=n){
                    if(j<=n-i+1){
                    System.out.print('*');
                    }
                    else if(j>n/2 && j>=i+1-1){
                        System.out.print('*');
                    }
                    else{
                        System.out.print(' ');
                    }
                }
            }
        System.out.println();
       }
       sc.close();
    }
}
