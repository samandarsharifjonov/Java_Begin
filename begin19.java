import java.util.Scanner;

public class begin19 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double a = Math.abs(y2 - y1);
        double b = Math.abs(x2 - x1);

        double result = ( a + b ) * 2;
        double result2 = ( a * b);


        System.out.println(result);
        System.out.println(result2);
    }

    }


