import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;
        String wrongDay = "Gün değerini hatalı girdiniz!";
        String wrongMonth = "Ay değerini yanlış girdiniz!";


        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz Ay:");
        month = input.nextInt();

        System.out.print("Doğduğunuz Gün:");
        day = input.nextInt();

        if (month == 1) {
            if (day > 0 && day < 22)
                System.out.println("Burcunuz Oğlak!");
            else if (day >= 22 && day <= 31)
                System.out.println("Burcunuz Kova!");
            else
                System.err.println(wrongDay);
        } else if (month == 2) {
            if (day > 0 && day < 20)
                System.out.println("Burcunuz Kova!");
            else if (day <= 29)
                System.out.println("Burcunuz Balık!");
            else
                System.err.println(wrongDay);
        } else if (month == 3) {
            if (day > 0 && day < 20)
                System.out.println("Burcunuz Balık!");
            else if (day <= 29)
                System.out.println("Burcunuz Koç!");
            else
                System.err.println(wrongDay);
        } else if (month == 4) {
            if (day > 0 && day < 20)
                System.out.println("Burcunuz Koç!");
            else if (day <= 29)
                System.out.println("Burcunuz Boğa!");
            else
                System.err.println(wrongDay);
        } else if (month == 4) {
            if (day > 0 && day < 20)
                System.out.println("Burcunuz Boğa!");
            else if (day <= 29)
                System.out.println("Burcunuz İkizler!");
            else
                System.err.println(wrongDay);
        } else if (month == 5) {
            if (day > 0 && day < 20)
                System.out.println("Burcunuz İkizler!");
            else if (day <= 29)
                System.out.println("Burcunuz Yengeç!");
            else
                System.err.println(wrongDay);
        } else if (month == 6) {
            if (day > 0 && day < 20)
                System.out.println("Burcunuz Yengeç!");
            else if (day <= 29)
                System.out.println("Burcunuz Aslan!");
            else
                System.err.println(wrongDay);
        } else if (month == 7) {
            if (day > 0 && day < 20)
                System.out.println("Burcunuz Aslan!");
            else if (day <= 29)
                System.out.println("Burcunuz Başak!");
            else
                System.err.println(wrongDay);
        } else if (month == 8) {
            if (day > 0 && day < 20)
                System.out.println("Burcunuz Başak!");
            else if (day <= 29)
                System.out.println("Burcunuz Terazi!");
            else
                System.err.println(wrongDay);
        } else if (month == 9) {
            if (day > 0 && day < 20)
                System.out.println("Burcunuz Terazi!");
            else if (day <= 29)
                System.out.println("Burcunuz Akrep!");
            else
                System.err.println(wrongDay);
        } else if (month == 10) {
            if (day > 0 && day < 20)
                System.out.println("Burcunuz Akrep!");
            else if (day <= 29)
                System.out.println("Burcunuz Yay!");
            else
                System.err.println(wrongDay);
        } else if (month == 11) {
            if (day > 0 && day < 20)
                System.out.println("Burcunuz Yay!");
            else if (day <= 29)
                System.out.println("Burcunuz Oğlak!");
            else
                System.err.println(wrongDay);
        } else if (month == 12) {
            if (day > 0 && day < 20)
                System.out.println("Burcunuz Oğlak!");
            else if (day <= 29)
                System.out.println("Burcunuz Kova!");
            else
                System.err.println(wrongDay);
        } else {
            System.err.println(wrongMonth);
        }

        input.close();
    }
}






