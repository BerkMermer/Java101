import java.util.Scanner;

public class Main {

    // Recursive asal sayı kontrol metodu
    static boolean isAsal(int sayi, int bolen) {
        // Temel durumlar
        if (sayi <= 1) {
            return false;
        }
        if (bolen == 1) {
            return true;
        }
        if (sayi % bolen == 0) {
            return false;
        }
        // Recursive çağrı
        return isAsal(sayi, bolen - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int sayi = scanner.nextInt();

        // 2'den sayının yarısına kadar kontrol yeterli
        boolean sonuc = isAsal(sayi, sayi / 2);

        if (sonuc) {
            System.out.println(sayi + " sayısı ASALDIR !");
        } else {
            System.out.println(sayi + " sayısı ASAL değildir !");
        }
    }
}
