import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers will you enter:");
        int n = scanner.nextByte();

        if (n<=0){
            System.out.print("You didn't enter a valid number!");
            return;
        }

        System.out.print("1. Enter the number :");
        int firstNumber = scanner.nextInt();
        int MaxNumber = firstNumber;
        int MinNumber = firstNumber;

        for (int i =2;i<=n;i++){
            System.out.print(i+". Enter the number:");
            int number = scanner.nextInt();

            if(number > MaxNumber){
                MaxNumber = number;
            }

            if (number < MinNumber){
                number = MinNumber;
            }
        }

        System.out.println("The largest number:"+ MaxNumber);
        System.out.println("the smallest number:"+MinNumber);

        scanner.close();

    }
}
