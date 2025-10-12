import java.util.*;

/*
          ***********
         *         *
        *         *
       *         *
      *         *
     *         *
    *         *
   *         *
  *         *
 *         *
***********
 */

public class P11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =1; i<=n; i++){
            // first spaces part
            for(int spaces = 1; spaces<=n-i; spaces++){
                System.out.print(' ');
            }
            // 1st stars column
            for(int stars1 =1; stars1<=n-(n-1); stars1++){
                System.out.print('*');
            }
            // top stars line
            for(int topstars =1; topstars<n-1 && i == 1; topstars++){
                System.out.print('*');
            }
            // below stars line
            for(int belowstars =1; belowstars<n-1 && i == n; belowstars++){
                System.out.print('*');
            }
            // middle spaces
            for(int midspaces = 1; midspaces<n-1 && i!=1 && i!=n; midspaces++){
                System.out.print(' ');
            }
            // last stars column
            for(int laststars =1; laststars==1; laststars++){
                System.out.print('*');
            }
            System.out.println();
        }
        sc.close();
    }
}
