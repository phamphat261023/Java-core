import java.util.Scanner;
import java.lang.Math;

public class Helloword {

    public static void main(String[] args){
        int a,b,c;
        System.out.println("Nhap a: ");
        a = new Scanner(System.in).nextInt();
        System.out.println("Nhap b: ");
        b = new Scanner(System.in).nextInt();
        System.out.println("Nhap c: ");
        c = new Scanner(System.in).nextInt();
        if(a == 0){
            if(b == 0){
                System.out.println("Phuong trinh vo nghem!!!");
            }
            else{
                System.out.println("Phuong trinh co 1 nghiem: "+(-c/b));
            }
        }

        double x1, x2;
        float delta = b*b - 4*a*c;
        if(delta > 0){
            x1 = (-b + Math.sqrt(delta))/2*a;
            x2 = (-b - Math.sqrt(delta))/2*a;
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        if(delta == 0){
            x1 = x2 = -b/2*a;
            System.out.println("x1 = x2 = " + x1);
        }

        if(delta < 0){
            System.out.println("Phuong trinh vo nghiem!!!");
        }
    }
}
