import java.util.Scanner;

public class Asalsayibulma {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("1-100 arasındaki asal sayılar:");

        for (int sayi=2;sayi<=100;sayi++){
            boolean asalMi=true;

            for (int i=2;i<=sayi/2;i++){
                if (sayi%i==0){
                    asalMi=false;
                    break;
                }
            }

            if (asalMi){
                System.out.print(sayi +" ");
            }
        }
    }
}
