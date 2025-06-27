import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,k,total=1;

        System.out.print("Üslü sayıyı giriniz:");
        n= scan.nextInt();
        System.out.print("Üssü giriniz:");
        k = scan.nextInt();

        for (int i=1;i<=k;i++){
            total *= n;


        }
        System.out.println("Cevap:"+ total);

    }

}
