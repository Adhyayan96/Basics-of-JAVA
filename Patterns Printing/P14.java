import java.util.*;

/*
    1
   212
  32123
 4321234
543212345
 */

public class P14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int rows =1; rows<=n; rows++){
            // first speaces
            for(int spaces=1; spaces<=n-rows; spaces++){
                System.out.print(' ');
            }
            // 2nd part
            int row = rows;
            for(int part2=1; part2<=rows; part2++){
                System.out.print(row);
                row--;
            }
            // last part
            int last = 2;
            for(int end = 1; end<=rows-1 && rows!=1; end++){
                System.out.print(last);
                last++;
            }
            System.out.println();
        }
        sc.close();
    }
}

