import java.util.Scanner;
// Tax calculator

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<=500000) {
            System.out.println("Your total tax is 0%");
        }
        else if(a>500000 && a<=1000000){
            System.out.println("Your total tax is " + 20*(a/100) + ".");
        }
        else{
            System.out.println("Your total tax is " + 30*(a/100) + ".");
        }
    }
}
