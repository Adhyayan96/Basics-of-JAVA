import java.util.*;
import java.lang.*;
import java.io.*;
// Input Day number and prinbt day of week name, using swith statement

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose a number in between 1 - 7, to exact day based on the day number");
        int a = sc.nextInt();
        switch(a){
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Tuesday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            case 7: System.out.println("Sunday");
            break;
            default: System.out.println("Give right input");
        }
    }
}
