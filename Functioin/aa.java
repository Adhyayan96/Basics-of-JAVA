import java.util.*;

public class aa {
    // Decimal to Binary Conversion

    public static void ByNum(int n){
    StringBuilder sb = new StringBuilder();
        while (n>=1){
                int ans = n%2;
                n = n/2;
                sb.append(ans);            
        }
        System.out.println(sb.reverse().toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ByNum(n);
    }
}
