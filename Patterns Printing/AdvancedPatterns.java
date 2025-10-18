import java.util.*;

public class AdvancedPatterns {

    public static void pattern15(int n){
        /*
        1
        01
        101
        0101
        10101
         */
        for(int row = 1; row<=n; row++){
            for(int col=1; col<=row; col++){
                if((col+row)%2==0){
                    System.out.print('1');
                }
                else{
                    System.out.print('0');
                }
            }
            System.out.println();
        }
    }

    public static void pattern16(int n){
        /*
         1      1
         12    21
         123  321
         12344321
         */

        for(int row=1; row<=n/2; row++){
            //1st part
            int output = 1;
            for(int col1 = 1; col1<=row; col1++){
                System.out.print(output);
                output++;
            }
            //2nd part
            for(int col2 = 1; col2<=n-(row+row); col2++){
                System.out.print(" ");
            }
            // last part
            int output2 = row;
            for(int col3=1; col3<=row; col3++){
                System.out.print(output2);
                output2--;
            }
            System.out.println();
        }
    }

    public static void pattern17(int n){
        /*
        1 
        2 3 
        4 5 6 
        7 8 9 10 
        11 12 13 14 15 
        */

        int var = 1;
        for(int row = 1; row<=n; row++){
            // main part
            for(int col = 1; col<=row; col++){
                System.out.print(var + " ");
                var++;
            }
            System.out.println();
        }
    }

    public static void pattern18(int n){
        /*
        A
        AB
        ABC
        ABCD
        ABCDE
         */

        for(int row =1; row<=n; row++){
            // main part
            char output = 'A' + 1 -1;
            for(int col = 1; col<=row; col++){
                System.out.print(output);
                output++;
            }
            System.out.println();
        }
    }

    public static void pattern19(int n){
        /*
            A
           ABA
          ABCBA
         ABCDCBA
        ABCDEDCBA
         */

        for(int row=1; row<=n; row++){
            char out = 'A';
            // first spaces part
            for(int spaces=1; spaces<=n-row; spaces++){
                System.out.print(" ");
            }
            // middle part
            for(int middle =1; middle <=row; middle++){
                System.out.print(out);
                out++;
            }
            // last part
            int lastout = row-1;
            for(int last=1; last<=row-1; last++){
                System.out.print((char)(lastout+'A'-1));
                lastout--;
            }
            System.out.println();
        }
    }

    public static void pattern20(int n){
        /*
        E
        DE
        CDE
        BCDE
        ABCDE
         */

        for(int row=1; row<=n; row++){
            int out = n-row+1;
            for(int col=1; col<=row; col++){
                System.out.print((char) (out+'A'-1));
                out++;
            }
            System.out.println();
        }
    }

    public static void pattern21(int n){
        /*
        **********
        ****  ****
        ***    ***
        **      **
        *        *
        *        *
        **      **
        ***    ***
        ****  ****
        **********
         */

        // Upper half
        for(int row =1; row<=n/2; row++){
            // upper left
            for(int left = 1; left<=n/2; left++){
                if(left<=(n/2)-row+1){
                    System.out.print('*');
                }
                else{
                    System.out.print(" ");
                }
            }
            // upper right 
            for(int upright = 1; upright<=n/2; upright++){
                if(upright>row-1){
                    System.out.print('*');
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // Lower half
        for(int row =1; row<=n/2; row++){
            // lower left
            for(int left = 1; left<=n/2; left++){
                if(left<=row){
                    System.out.print('*');
                }
                else{
                    System.out.print(" ");
                }
            }
            // lower right 
            for(int right = 1; right<=n/2; right++){
                if(right>(n/2)-row){
                    System.out.print('*');
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern22(int n){
        /*
        4444444
        4333334
        4322234
        4321234
        4322234
        4333334
        4444444
         */
        for(int i =1; i<=n+n-1; i++){
            for(int j = 1; j<=n+n-1; j++){
            int up = j-1;
            int left = i-1;
            int down = n+n-1-j;
            int right = n+n-1-i;
            System.out.print(n-Math.min(Math.min(up, left), Math.min(down, right)));
            }
            System.out.println();
        }    
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern22(n);
        sc.close();
    }
}
