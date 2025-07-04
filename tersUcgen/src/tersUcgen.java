import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz:");
        int basamak = scanner.nextInt();

        if (basamak<=0){
            System.out.print("Geçersiz bir basamak sayısı girdiniz!");
            return;
        }

        for (int i=basamak;i>=1;i--){
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();

    }
}
