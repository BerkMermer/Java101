import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Turkce notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Muzik notunuzu giriniz: ");
        muzik = input.nextInt();

        double avarage = (mat + fizik + kimya + turkce + muzik) / 5;
        if (avarage <=55) {
            System.out.println("Sınıfta kaldınız,seneye tekrar deneyin.");
        }else{
            System.out.println("Tebrikler.sınıf geçtiniz !");

        }
        System.out.println("Ortalamanız : " + avarage);


    }
}
