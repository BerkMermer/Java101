import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");

        int sayi = scanner.nextInt();

        if (sayi<=0){
            System.out.print("Geçersiz sayı girdiniz!");
            return;
        }

        int toplam =0;

        for (int i=1;i<=sayi/2;i++){
            if (sayi%i==0){
                toplam+=i;
            }
        }
        if(sayi==toplam) {
            System.out.println(sayi + "Mükemmel sayıdır.");
        }else{
        System.out.println(sayi+"Mükemmel sayı değildir.");
            {

        scanner.close();


    }
}
    }
}
