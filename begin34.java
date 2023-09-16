import java.util.Scanner;

public class begin34 {

    public static void main(String[] args) {

        Scanner kirit = new Scanner(System.in);


        double x = kirit.nextDouble();


        double a = kirit.nextDouble();


        double y = kirit.nextDouble();


        double b = kirit.nextDouble();

        double kg = a / x; // 1 Kg Shokolad narxi.
        double kg2 = b / y; // 1 Kg Konfet narxi.
        double zarar = ( kg - kg2);// shokoladdan konfetni qancha qimmat turishi.


        System.out.println(zarar);


    }


}
