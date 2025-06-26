import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n,total=0;


        while(true){
            System.out.print("Sayı giriniz:");
            n = inp.nextInt();


            if (n%2 !=0){
                break;
            }

            if (n%4 ==0){
                total += n;

            }
        }

        System.out.println("Girilen çift ve 4'ün katı olan sayıların toplamı: " + total);
    }


}
