import java.util.Scanner;

public class begin22 {

    public static void main(String[] args) {
        double a,  b, s;
        Scanner kirit = new Scanner(System.in);

        a = kirit.nextDouble();
        b = kirit.nextDouble();

        double temp = a;

        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(  b);



    }

}