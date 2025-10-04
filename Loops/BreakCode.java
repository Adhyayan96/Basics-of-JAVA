import java.util.*;
import java.lang.*;
import java.io.*;
// Break - it is used when we need to "completely end our loop" when something happens

public class BreakCode{
    public static void main(String[] args) throws java.lang.Exception
    {
        for(int i=0; i<=5; i++){
            if(i==3){
                break;
            }
            else{
                System.out.println(i);
            }
        }
        System.out.println("You are now out of the loop");
    }
}