import java.util.Scanner;

public class begin40 {


    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        System.out.print(" A1 = ");
        float a1 = kirit.nextFloat();

        System.out.print(" B1 = ");
        float b1 = kirit.nextFloat();

        System.out.print(" C1 = ");
        float c1 = kirit.nextFloat();

        System.out.print(" A2 = ");
        float a2 = kirit.nextFloat();

        System.out.print(" B2 = ");
        float b2 = kirit.nextFloat();

        System.out.print( " C2 = ");
        float c2 = kirit.nextFloat();

        float d = ( a1 * b2 - a2 * b1);
        float x = ( c1 * b1 - c2 * b2)/d;
        float y = ( a1 * c2 - a2 * c2)/d;

        System.out.println( " D =  " + d);
        System.out.println( " X =  " + x);
        System.out.println( " Y =  " + y);






    }



}
