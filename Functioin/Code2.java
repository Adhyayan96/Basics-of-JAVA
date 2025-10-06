import java.util.*;

public class Code2 {
    // function : call by value (pass only values' copy of original variables) and call by reference (pass values of original variables) 
    public static int changea(int a, int b){ // call by value
        a = b;
        return a;
    }

    // java doesn't allow us for pass by reference

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(b); // call by value (original stays original)
        int c = (int) changea(a, b);
        System.out.println(c);
    }
}
