import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b,c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number");
         a = sc.nextDouble();
        System.out.print("Enter the second number");
         b = sc.nextDouble();
        System.out.printl"Enter the third number");
         c = sc.nextDouble();

        double u = (a + b + c) / 2;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin çevresi: " + (2 * u));
        System.out.println("Üçgenin alanı: " + alan);


    }
}
