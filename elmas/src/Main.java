import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yukseklik = scanner.nextInt();

        if (yukseklik%2==0){
            yukseklik++;
            System.out.println("Çift sayı girdiniz.Yükseklik"+ yukseklik + "olarak ayarlandı");
        }

        elmasYazdir(yukseklik);

    }
    public static void elmasYazdir(int yukseklik) {
        int yariYukseklik = yukseklik / 2;

        for (int i = 0; i <= yariYukseklik; i++) {
            for (int j = 0; j < yariYukseklik - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = yariYukseklik - 1; i >= 0; i--) {
            // Boşluklar
            for (int j = 0; j < yariYukseklik - i; j++) {
                System.out.print(" ");
            }
            // Yıldızlar
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}