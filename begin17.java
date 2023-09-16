import java.util.Scanner;

public class begin17 {

    public static void main(String[] args) {

        Scanner kirit = new Scanner( System.in);

        double a = kirit.nextInt();



        double b = kirit.nextInt();


        double c = kirit.nextInt();

        double result = Math.abs( c - a ); // A dan C gacha bo'gan masofa.
        double result2 = Math.abs( c - b); // B dan C gacha bo'gan masofa.
        double sum = Math.abs (result2 + result); // Masofalar yig'indisi.

        System.out.println(result);
        System.out.println(result2);
        System.out.println(sum );


    }
}
