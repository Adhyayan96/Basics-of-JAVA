import java.util.*;
import java.lang.*;
import java.io.*;
// A basic calculator which can do basic operations of anyh two numbers = +,-,/,* & %

public class Q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1");
        long number1 = sc.nextLong();
        System.out.println("Enter number2");
        long number2 = sc.nextLong();
        System.out.println("Enter operator");
        char operator = sc.next().charAt(0);
             
        switch(operator){
            case '+': System.out.println(number1+number2);
            break;
            case '-': System.out.println(number1-number2);
            break;
            case '*': System.out.println(number1*number2);
            break;
            case '/': System.out.println(number1/number2);
            break;
            case '%': System.out.println(number1%number2);
            break;
            default: System.out.println("Please choose a valid operator");
            sc.close();
        } 
    }    
}
