import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını girin:");
        int elemanSayisi = scanner.nextInt();

        System.out.println(elemanSayisi + " Elemanlı Fibonacci Serisi:");

        int a=0;int b=1;

        for (int i=1;i<=elemanSayisi;i++){
            System.out.println( a + " ");

            int toplam = a + b;
            a=b;
            b=toplam;
        }
        
        scanner.close();

    }
}
