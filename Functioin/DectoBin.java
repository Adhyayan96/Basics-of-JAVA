import java.util.*;

public class DectoBin {
    // Decimal to Binary Conversion

    public static void ByNum(int n){
        int ans = 0;
        while (n>=1){
            if(n==1){
                ans = (10*ans)+(n%2);
                break;
            }
            else{
                ans = (10*ans)+(n%2);
                n = n/2;
            }
        }
        System.out.println("The binary number is: " + ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ByNum(n);
    }
}
