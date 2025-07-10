import java.util.Scanner;

public class Main {

    static void desenOlustur(int n) {
        // Sayı pozitif olduğu sürece 5 çıkar
        if (n > 0) {
            System.out.print(n + " ");
            desenOlustur(n - 5);
        }
        // Sayı negatif veya 0 olduğunda 5 ekle
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();

        System.out.println("Oluşturulan desen:");
        desenOlustur(n);
    }
}
