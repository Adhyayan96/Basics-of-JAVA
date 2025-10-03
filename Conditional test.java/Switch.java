import java.util.*;
import java.io.*;
import java.lang.*;

public class Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        System.out.println("Give a input in between 1 to 3.");
        // Switch Statement

        switch (user) {
            case 1: System.out.println("Samosa");
            break;
            case 2: System.out.println("Burger");
            break;
            case 3: System.out.println("Cake");
            break;
            default: System.out.println("You are dreaming, man.\nIf you really want any food choose a number in between 1 to 3.");
        }
    }
}
