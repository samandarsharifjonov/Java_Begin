import java.util.Scanner;

public class begin18 {

    public static void main(String[] args) {


        Scanner kirit = new Scanner(System.in);

        double a = kirit.nextDouble();
        double b = kirit.nextDouble();
        double c = kirit.nextDouble();


        double ac =Math.abs (a - c);
        double bc = Math.abs(b - c);
        double s3 = ( ac * bc );

        System.out.println(s3);





    }
}
