import java.util.*;

public class Condition {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int min = sc.nextInt();
        // If-else

        if(age>=min){
            System.out.println("You are an adult");
        }
        else if(age>13 && age<18){
            System.out.println("Be patient buddy, you are still an teenager");
        }
        else {
            System.out.println("You are not an adult");
        }
    }
}
