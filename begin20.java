import java.util.Scanner;

public class begin20 {

    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);

        double x1, x2, y1, y2;

        x1 = kirit.nextDouble();
        y1 = kirit.nextDouble();
        x2 = kirit.nextDouble();
        y2 = kirit.nextDouble();
        double  s =Math.sqrt(Math.abs((x1-x2)*(x1-x2))+Math.abs((y1-y2)*(y1-y2)));
        System.out.println(s);






    }
}
