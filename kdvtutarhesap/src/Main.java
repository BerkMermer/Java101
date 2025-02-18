import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double tutar, kdvOran, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarınızı giriniz:");
        tutar = input.nextDouble();

        kdvOran = (0 < tutar && tutar < 1000) ? 0.18 : 0.08;


        kdvTutar = tutar * kdvOran;
         kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Oranı : " + kdvOran);
        System.out.println("Kdv Tutarı : " + kdvTutar);
        System.out.println("KDV'li Tutar : " + kdvliTutar);
        System.out.print(kdvliTutar);




    }


}
