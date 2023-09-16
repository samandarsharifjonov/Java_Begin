import java.util.Scanner;

public class begin23 {

    public static void main(String[] args) {

        double a, b, c;
        Scanner kirit = new Scanner(System.in);

        a = kirit.nextDouble();
        b = kirit.nextDouble();
        c = kirit.nextDouble();

      double temp = a;
      a = b;
      b = temp;

      double  temp2 = c;

      c = a;
      a = temp2;



        System.out.println( a);
        System.out.println( b);
        System.out.println(c);


    }

}
