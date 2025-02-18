import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int km;
        double Perkm = 2.20,total,StartPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen Kilometreyi giriniz: ");
        km = input.nextInt();

        total = (km*Perkm);
        total += StartPrice;

        total = (total<20) ? 20 : total;
        System.out.print("Total Kilometreyi giriniz: " + total);


    }
}
