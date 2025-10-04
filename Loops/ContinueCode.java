import java.util.*;
import java.lang.*;
import java.io.*;
// Continue - it is used when we need to "skip something" in our loop when something happens

public class ContinueCode {
    public static void main(String[] args) throws java.lang.Exception
    {
        // Q: Print 1 to 9, but skip 5 number
        for (int i = 1; i<10; i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
