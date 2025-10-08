import java.util.*;

public class Q7 {
    // Check average of 3 numbers using function

    public static void Average(float a, float b, float c){
        System.out.println((a+b+c)/3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        Average(a, b, c);
        sc.close();
    }
}
