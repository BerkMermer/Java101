import java.util.Arrays;
import java.util.Scanner;

public class MinMaxFind {
    public static void main(String[] args) {
        int[] list = {15,22,788,1,-1,-778,2,0};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dİzi:" + Arrays.toString(list));

        for (int i = 1;i<=5;i++){
            System.out.print("\n"+ i + ".hedef sayıyı giriniz:");
            int target = scanner.nextInt();

            int closestSmaller = Integer.MIN_VALUE;
            int closestLarger = Integer.MAX_VALUE;

            for (int num : list) {
                // Girilen sayıdan küçük en yakın sayıyı bul
                if (num < target && num > closestSmaller) {
                    closestSmaller = num;

        }

                if (num > target && num < closestLarger) {
                    closestLarger = num;

    }
}
            System.out.println("Girilen Sayı: " + target);

            if (closestSmaller != Integer.MIN_VALUE) {
                System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmaller);
            } else {
                System.out.println("Girilen sayıdan küçük bir sayı bulunamadı.");
            }

            if (closestLarger != Integer.MAX_VALUE) {
                System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestLarger);
            } else {
                System.out.println("Girilen sayıdan büyük bir sayı bulunamadı.");
            }
        }

        scanner.close();
    }
}