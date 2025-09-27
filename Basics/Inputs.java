import java.util.*; // this is used to take inputs

public class Inputs {
    public static void main(String[] args) {
        // input taking
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); // it will just take only the first word of the input line
        String name2 = sc.nextLine();  // it will just take full input line
        int a = sc.nextInt();

        /*
        for other input data types (*** after 'next', all types first letter must be in capital letter) -
         nextInt()
         nextFloat()
         nextDouble()
         nextBoolean()
         ....
         */

        System.out.println(name);
        System.out.println(name2);
        System.out.println(a);
        sc.close();
    }
}
