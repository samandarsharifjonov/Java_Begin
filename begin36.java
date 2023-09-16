import java.util.Scanner;

public class begin36 {


    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);

        System.out.print(" Birinchi avtomobilni harakatlasnish tezligini kiriting:  ");
        float v = kirit.nextFloat();

        System.out.print(" Ikkinchi avtomobilni harakatlasnish tezligini kiriting:  ");
        float v2 = kirit.nextFloat();

        System.out.print("  Ular orasidagi boshlang'ich masofa:   ");
        float s = kirit.nextFloat();

        System.out.println(" Harakatlanish vaqtini kiriting, Sekundda:  ");
        float t = kirit.nextFloat();

        double masofa = s - (( v / 3.6 ) + ( v2 / 3.6 )) * t;

        System.out.println(" Ular orasidagi masofa " + masofa);








    }


}
