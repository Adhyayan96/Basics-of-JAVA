import java.util.*;

public class BintoDec {
    // Binary to Decimal Conversion
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Dec = 0;
        int j = 1;
        for (int i = 0; i<=String.valueOf(n).length(); i++){
            Dec += ((n%10)*j);
            n /=10;
            j +=j;
        }
        System.out.println(Dec);
    }
}
