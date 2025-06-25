import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz:");
        int mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz:");
        int yas = input.nextInt();

        System.out.print("yolculuk tipini giriniz (1=>Tek yön, 2=>Gidiş-Dönüş:");
        int tip = input.nextInt();

        double birimFiyat = 0.10;
        double fiyat = mesafe * birimFiyat;

        if (mesafe >0 && yas >0 && (tip==1 || tip==2)){
            if (yas<12){
                fiyat*=0.5;
            } else if (yas >=12 && yas <24) {
                fiyat*=0.9;
            } else if (yas>65) {
                fiyat*=0.7;
            }

            if (tip==2){
                fiyat*=2;
                fiyat*=0.8;
            }

            System.out.print("Toplam Bilet Fiyatı:"+fiyat+ "TL");

        }else {
            System.out.print("Hatalı Veri Girdiniz !!");
        }

    }
}
