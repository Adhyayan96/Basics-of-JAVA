import java.util.*;;
// Total cost of buying theree products and with it add 18% gst.

public class Q6 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float ans = pen+pencil+eraser; // formula
        System.out.println(ans);
        float fin = (ans +(1+(18/100)));
        System.out.println(fin);
    }
}