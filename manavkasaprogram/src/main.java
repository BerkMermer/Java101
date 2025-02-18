import java.util.Scanner;

public class main  {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.1,patlıcan=5.00,muz=0.95;
        double secilenKiloArmut,secilenKiloElma,secilenKiloDomates,secilenKiloPatlıcan,secilenKiloMuz;

        Scanner input =new Scanner(System.in);

        System.out.println("LÜTFEN ALMIŞ OLDUĞUNUZ ÜRÜNLERİ KİLOGRAM CİNSİNDEN GİRİNİZ: ");

        System.out.print("Kaç Kilo Armut Aldıysanız Giriniz :");
        secilenKiloArmut=input.nextDouble();
        System.out.println("Kaç Kilo Armut :"+secilenKiloArmut+ "KG");


        System.out.print("Kaç Kilo Elma Aldıysanız Giriniz :");
        secilenKiloElma=input.nextDouble();
        System.out.println("Kaç Kilo Elma :"+secilenKiloElma +"KG");


        System.out.print("Kaç Kilo Domates Aldıysanız Giriniz :");
        secilenKiloDomates=input.nextDouble();
        System.out.println("Kaç Kilo Domates :"+secilenKiloDomates+ "KG");


        System.out.print("Kaç Kilo Patlıcan Aldıysanız Giriniz :");
        secilenKiloPatlıcan=input.nextDouble();
        System.out.println("Kaç Kilo Patlıcan :"+secilenKiloPatlıcan+ "KG");


        System.out.print("Kaç Kilo Muz Aldıysanız Giriniz :");
        secilenKiloMuz=input.nextDouble();
        System.out.println("Kaç Kilo Muz :"+secilenKiloMuz+ "KG");

        double toplamTutar = (armut*secilenKiloArmut)+(elma*secilenKiloElma)+(domates*secilenKiloDomates)+(patlıcan*secilenKiloPatlıcan)+(muz*secilenKiloMuz);
        System.out.println("Toplam Tutar:"+ toplamTutar +"TL");


        






    }
}
