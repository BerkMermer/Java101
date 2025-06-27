import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0, r = 0;
        System.out.print("n değerini giriniz:");
        n = scan.nextInt();
        System.out.print("r değerini giriniz:");
        r = scan.nextInt();
        if (n < 0 || r < 0 || n < r) {
            System.out.println("Hatalı bir işlem yaptınız:");
            return;
        }
        long kombinasyon = 1;

        for (int i = 1; i <= r; i++) {
        kombinasyon = kombinasyon * (n - r + i )/i;
            {

        System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);

    }
        }
    }
}
