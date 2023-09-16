import  java.util.Scanner;
public class begin13 {

    public static void main(String[] args) {

        Scanner kirit = new Scanner(System.in);

        double r1 = kirit.nextDouble();
        double r2 = kirit.nextDouble();

        double s1 = Math.PI * r1  * r1;
        double s2 = Math.PI * r2 * r2;
        double s3 = Math.PI*( r1 - r2) * ( r1 + r2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);



    }

}
