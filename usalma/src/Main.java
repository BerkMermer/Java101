import java.util.Scanner;

public class Main {

    // Recursive üs alma metodu
    static int usAlma(int taban, int us) {
        // Üs 0 ise sonuç her zaman 1'dir
        if (us == 0) {
            return 1;
        }
        // Recursive çağrı: taban * taban^(us-1)
        return taban * usAlma(taban, us - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan taban ve üs değerlerini alma
        System.out.print("Taban değeri giriniz : ");
        int taban = scanner.nextInt();

        System.out.print("Üs değerini giriniz : ");
        int us = scanner.nextInt();

        // Üs alma işlemini yapıp sonucu yazdırma
        int sonuc = usAlma(taban, us);
        System.out.println("Sonuç : " + sonuc);
    }
}