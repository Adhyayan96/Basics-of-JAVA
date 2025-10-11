import java.util.*;

public class MathPractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc. nextInt();

        int d = Math.min(a,b); // minimum
        int c = Math.max(a, b); // maximum
        int e = (int) (Math.sqrt(a)); // square root
        int f = (int) (Math.pow(a, b)); // power
        int g = Math.abs(x); // negative to positive value, like -123 to 123

        System.out.println(d);
        System.out.println(c);
        System.out.println(e);
        System.out.println(f);
        System.out.println(f);
        System.out.println(g);
    }
}
