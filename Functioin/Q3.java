import java.util.*;

public class Q3 {
    // find Bionomial coefficient of n & r
    public static int BioCoeffiecient(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int coeN = 1;
        int coeR = 1;
        for(int i = 1; i<=n; i++){
            coeN *=i;
        }
        for(int i = 1; i<=r; i++){
            coeR *=i;
        }
        int c = coeR/(n-r);
        int ans = coeN / c;
        return ans;
    }
    public static void main(String[] args) {
        // int ans = BioCoeffiecient();
        System.out.println(BioCoeffiecient());
    }
}