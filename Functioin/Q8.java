import java.util.*;

public class Q8 {
    // Check a number is even or odd using function, if yes then print ture and if not print false

    public static boolean EvenOdd(int a){
        if(a%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(EvenOdd(a));
        sc.close();
    }
}