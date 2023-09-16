import javax.imageio.ImageTranscoder;
import java.util.Scanner;

public class begin21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x1, x2, y1, y2,x3,y3;

        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        x3 = sc.nextDouble();
        y3 = sc.nextDouble();

        double a= Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
        double b= Math.sqrt(Math.pow((x1-x3),2)+Math.pow((y1-y3),2));
        double c= Math.sqrt(Math.pow((x3-x2),2)+Math.pow((y3-y2),2));
        double z = a+b+c;
       double p=z/2;
        double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println(s);
        System.out.println(p);

    }
}
