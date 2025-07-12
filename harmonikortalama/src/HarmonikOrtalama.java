public class HarmonikOrtalama {
    public static void main(String[] args) {
        int[] numbers = {1 , 2 ,3 ,4 ,5};
        double harmonicSum = 0.0;

        for (int i = 0;i < numbers.length;i++){
            harmonicSum += numbers[i];

        }

        double harmonicAvarage = harmonicSum/numbers.length;

        System.out.println("Dizinin harmonik ortalaması:" + harmonicAvarage);
    }
}
