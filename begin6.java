import java.util.Scanner;

public class begin6 {
    public static void main(String[] args) {

        Scanner kirit = new Scanner(System.in);

        System.out.print("");
        int a = kirit.nextInt();

        System.out.print("");
        int b = kirit.nextInt();

        System.out.print("");
        int c = kirit.nextInt();

        int v, s;
         v = a * b * c;
         s = 2 * ( a * b + b * c + a * c );

        System.out.println(v);
        System.out.println(s);



    }

}
