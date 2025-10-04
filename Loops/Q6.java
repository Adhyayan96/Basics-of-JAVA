import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        boolean prime = true;
        if(t<=3){
            System.out.println("It's a prime number.");
        }
        else{
            for(int i = 2; i<t; i++){
                if(t%i == 0){
                    prime = false;
                    break;
                }
            }
            if(prime == true){
                System.out.println("It's a prime number.");
            }
            else {
                System.out.println("It's not a prime number.");
            }
        }
        sc.close;
    }
}
