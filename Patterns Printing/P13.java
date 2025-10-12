import java.util.*;

/*
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 
 */

public class P13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int rows=1; rows<=n; rows++){
            for(int col = 1; col<=n; col++){
                if(col>=n-rows+1){
                    System.out.print(rows + " ");
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
