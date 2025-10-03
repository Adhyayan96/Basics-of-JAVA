import java.util.*;
// Print largest of 2 numbers

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println("'a' is the largest");
        }
        else if(a==b){
            System.out.println("no one is largest, both values are same");
        }
        else{
            System.out.println("'b' is the largest");
        }
    }
}