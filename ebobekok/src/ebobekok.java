import java.util.Scanner;

public class ebobekok {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("n1 sayısını giriniz:");
        int n1 = scanner.nextInt();

        System.out.print("n2 sayısını giriniz:");
        int n2 = scanner.nextInt();

        int ebob = 1;
        int i = 1;
        while(i <= n1 && i <= n2){
            if (n1%i==0 &&  n2%i==0){
                ebob = i;

            }
            i++;

        }
        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + (n1 * n2) / ebob);



    }
}
