import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner say = new Scanner(System.in);

        int sayi1,sayi2;

        System.out.print("Birinci sayıyı giriniz:");
        sayi1 = say.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        sayi2 = say.nextInt();

        System.out.print("1-Toplama\n2-Çıkarman\n3-Çarpma\n4-Bölme\nBu işlermlerden birini seçiniz:");
        int secim = say.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Toplam:"+ (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Çıkarma:" +(sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Çarpma:" +(sayi1 * sayi2));
                break;
            case 4:
                System.out.println("Bölme:" +(sayi1 / sayi2));
                break;
            default:
                System.out.println("Girdiğiniz sayı 1,2,3ve 4 sayılarından biri olmalıdır.");
                break;

        }
    }

}
