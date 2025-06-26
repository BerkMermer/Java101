import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int k,toplam=0,adet = 0;

        System.out.print("Sayı giriniz:");
        k = inp.nextInt();

        for (int i=0 ; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                adet++;
            }
        }
           if (adet>0){
               double ortalama =(double) toplam/adet;
               System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
           } else {
               System.out.println("3 ve 4'e tam bölünen sayı bulunamadı.");

}

}
    }

