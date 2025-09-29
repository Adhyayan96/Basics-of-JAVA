import java.util.*;

public class Code3 {
    public static void main(String[] args) {

        // # Type conversion / Implicit conversion / Wide conversion - converting low size of datatype to big size data type.
        int c = 33;
        float d = (float) c;

        // ## Typecasting / Narrowing conversion /  Explicit conversion - forcefully converting big size of datatype to low size data type, like long to int, float to int.
        float a = 22.33f;
        int b = (int) a; // through mentioning datatype before a we forcefully converted a into int datatype from float.
        // int b = a; - if I did like this I would get error & would say lossy conversion, because java doesn't allow it.
        System.out.println(b);
        System.out.println(d);

        // ### Diffrent type conversion
        char ch = 'A';
        int ans = (int) ch; // the value of letter A is being printed through this.
        System.out.println(ans);

        // #### Type promotion = case 1; Java automatically converts a & b into their assigned integer value.
        char e = 'a';
        char f = 'b';
        System.out.println((int)e);
        System.out.println((int)f);
        System.out.println(e+f);
        int ans2 = (int)(a+e+ch); // Another example
        System.out.println(ans2);

        // ##### Type promotion = case 2; in a calculation if there are different types of data types, then the final calculation must be stored in that data type that's size is the biggest among all.
        int v = 10;
        float w = 22.99f;
        long x = 333333333;
        System.out.println((long)(v+w+x)); // I stored the answer in the biggest data type, that was present in the claculation
    }
}
