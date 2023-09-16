import  java.util.Scanner;
public class begin14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double L = input.nextDouble();
        
        double R = L / ( 2 * Math.PI);
        double S = Math.PI * R * R;
        System.out.println(R);
        System.out.println(S);


    }
}
