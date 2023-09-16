import java.util.Scanner;


public class begin12 {

    public static void main(String[] args) {

        Scanner kirit = new Scanner( System.in);

        double a = kirit.nextDouble();
        double b = kirit.nextDouble();


        double c = Math.pow(a, 2);
        double cc = Math.pow(b,  2);
        double ccc = Math.sqrt(c+cc);

        double p = ( a + b + ccc);

        System.out.println( ccc );
        System.out.println( p );






    }
}
