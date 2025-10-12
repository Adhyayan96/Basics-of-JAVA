import java.util.*;

/*
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
 */

public class P12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int rows =1; rows<=n; rows++){
            // first part
            for(int part1=1; rows<=(n/2) && part1<=(n/2); part1++){
                if(part1>=(n/2)-rows+1){
                    System.out.print('*');
                }
                else{
                    System.out.print(' ');
                }
            }
            // 2nd part
            for(int part2 = 1; rows!=1 && part2<rows && rows<=n/2; part2++){
                    System.out.print('*');
            }
            // 3rd part
            for(int part3 = 1; rows>n/2 && part3<=n/2; part3++){
                if(part3>rows-(n/2)-1){
                    System.out.print('*');
                }
                else{
                    System.out.print(' ');
                }
            }
            // 4th part
            for(int part4 =1; rows!=n && part4<=n-rows && rows>(n/2); part4++){
                System.out.print('*');
            }
            System.out.println();
        }
        sc.close();
    }
}
