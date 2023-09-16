
import  java.util.Scanner;
public class begin15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float s = scanner.nextFloat();

        double r = Math.sqrt(s/Math.PI);
        double l = 2 * Math.PI * r;

        System.out.println(l);
        System.out.println(r);

    }
}




