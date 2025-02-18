import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int r;
        double pi = 3.14,a;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: " );
        r = inp.nextInt();
        System.out.print("Daire dilimin açısi" );
        a = inp.nextDouble();

        double dairealan  = (pi * (r*r) * a) / 360;

        System.out.print("Daire Diliminin Alanı:" + dairealan);


    }
}
