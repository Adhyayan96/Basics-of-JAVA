import java.util.*;

public class Code1 {
    // function syntax : without parameters
    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return; // void returns nothing
    }
     // function syntax : with parameters   
    public static int calculateSum(int a, int b){ // int a & int b are parameters & these (Int a, int b) are called formal or actual parameters
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args){
        printHelloWorld(); // calling the 1st function to print hello world
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b); // calling 2nd function with parameters & these (a,b) are called as arguments parameters
        System.out.println(sum);
    }
}
