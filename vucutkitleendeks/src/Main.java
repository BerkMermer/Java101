import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kilo,boy;
        Scanner input = new Scanner(System.in);

        System.out.print("Boy değerinizzi metre cinsinden giriniz: ");
        boy = input.nextDouble();

        System.out.print("Kilo değerinizi kg cinsinden giriniz: ");
        kilo = input.nextDouble();


        double vucutkitlendeks = kilo  / (boy * boy);
        System.out.println("Vücut kitle İndeksiniz: " + vucutkitlendeks);



    }
}
