import java.util.Scanner;

public class begin35 {

    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);

        System.out.print(" Qayiqning tezligi > Daryoning oqish tezligidan \n ");
        System.out.print(" Qayiqning tezligi:  ");
        float v = kirit.nextFloat();

        System.out.print(" Daryoning oqish tezligi: ");
        float u = kirit.nextFloat();

        System.out.print(" Qayiqni daryo oqimi bo'yicha xarakatlanish vaqti: ");
        float t1 = kirit.nextFloat();

        System.out.print(" Oqimga qarshi harakatlanish vaqti: ");
        float t2 = kirit.nextFloat();

        float s = ( v + u) * t1; // oqim bn yurilgan yo'l
        float s1 = ( v - u ) * t2; // oqimga qarshi yurilgan yo'l.
        float s3 = ( s + s1); // umumiy masofa.

        System.out.println(" oqim bilan yurilgan yo'l >>>" + s);
        System.out.println(" Oqimga qarshi yurilgan yo'l>>>" +s1);
        System.out.println(" Umumiy masofa  " +s3+ " KM");



    }

}
