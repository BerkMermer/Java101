import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int limit = input.nextInt();

        System.out.println("4'ün kuvvetleri:");
        for (int i = 1;i <=limit;i*=4){
            System.out.println(i);
        }

        System.out.println("5'in kuvveteleri:");
        for (int i = 1;i<=limit;i*=5){
            System.out.println(i);
        }
    }
}
