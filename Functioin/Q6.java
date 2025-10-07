import java.util.*;

public class Q6 {
    // Prime all prime numbers in a given range

    public static void PrimesCheck(int a){
    
                for(int i = 2; i<=a; i++){
                    if(i == 2){
                        System.out.println(i + " is a prime number.");
                    }
                    else{
                        for(int j = 2; j<i; j++){
                            if(i%j == 0){
                                System.out.println(i + " is not a prime number.");
                                break;
                            }
                            else if(j==i-1 && i%j !=0){
                                System.out.println(i + " is a prime number."); 
                            }
                                    
                        }
                    }
                }
        return;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        PrimesCheck(a);
        sc.close();
    }
}
