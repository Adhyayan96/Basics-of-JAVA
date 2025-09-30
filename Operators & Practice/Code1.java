import java.util.*;

        /*
         Types of operators:
         1. Arithmatic (binaary and unary) Operators
         2. Relational Operators
         3. Logical Operators
         4. Bitwise Operators
         5. Assignment Operators
         */

public class Code1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

         // # Binary Operators
        System.out.println("Add = " + (a+b));
        System.out.println("Sub = " + (a-b));
        System.out.println("Mul = " + (a*b));
        System.out.println("Devide = " + (a/b));
        System.out.println("Modulo = " + (a%b));

        // ## Unary Operators
        System.out.println(a++);
        System.out.println(a--);
        System.out.println(++a);
        System.out.println(--a);

        // ### Relational Operators
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);

        // #### Logical Operators
        System.out.println(a==b && b>a); // && it's logical and
        System.out.println(a==b || b>a); // || it's logical or
        System.out.println(!(a==b && a>b)); // ! it's logical not

        // ##### Assignment Operators
        System.out.println(a=b);
        System.out.println(a+=10);
        System.out.println(a-=10);
        System.out.println(a*=11);
        System.out.println(a/=10);
    }
}
