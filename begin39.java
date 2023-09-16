import java.util.Scanner;

public class begin39 {


    public static void main(String[] args) {


        Scanner kirit = new Scanner(System.in);

        System.out.print(" a = ");
        float a = kirit.nextFloat();

        System.out.print(" b = ");
        float b = kirit.nextFloat();

        System.out.print(" c = ");
        float c = kirit.nextFloat();

        double d = Math.pow ( b, 2) - 4 * a * c;

        if ( d > 0 ){

            double x1 = ( -b + d ) / ( 2 * a );
            double x2 = ( -b - d ) / ( 2 * a );

            System.out.println(" X1 = " +x1);
            System.out.println(" X2 = " +x2);

        } else if ( d == 0 ) {

            double x = ( -b ) / ( a * 2 );
            System.out.println(" X = " +x);
        }else{

            System.out.println(" Bo'sh to'plam");
        }


    }



}
