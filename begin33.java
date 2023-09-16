import java.util.Scanner;

public class begin33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double kg = scanner.nextDouble();
        double uzs = scanner.nextDouble();
        double y = scanner.nextDouble();


        double kg1 = uzs / kg;

        double uzs2 = (y * kg1);


        System.out.println(kg1);
        System.out.println(uzs2);





    }
}
