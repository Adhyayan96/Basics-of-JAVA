public class Q1 {
    // Check the outputs of x, y & z
    public static void main(String[] args) {
        int x,y,z;
        x = y = z = 2;
        x += y;
        y -= z;
        z /= (x+y);
        System.out.println(x + " " + y + " " + z);
    }
}
