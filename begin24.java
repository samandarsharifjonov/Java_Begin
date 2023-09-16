import java.util.Scanner;

public class begin24 {

    public static void main(String[] args) {

        double a, b, c;
        Scanner kirit = new Scanner(System.in);

        a = kirit.nextDouble();


        b = kirit.nextDouble();


        c = kirit.nextDouble();

        double temp = a;
        a = c;
        c = temp;

        double temp2 = c;
        c = b;
        b = temp2;

        double temp3 = c;
        c = a;
        a = temp3;

        System.out.println( a);
        System.out.println( c);
        System.out.println (b);


    }

}
