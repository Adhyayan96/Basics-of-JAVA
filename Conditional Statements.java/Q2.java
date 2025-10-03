import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%2 == 0){
            System.out.println(a + ", it's an even number.");
        }
        else{
            System.out.println(a+", it's an odd number.");
        }
    }
}
