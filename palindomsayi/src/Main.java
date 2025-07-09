public class Main {

    public static void findPalindromicNum(int a) {
        String b = Integer.toString(a);
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) != b.charAt(b.length() - 1 - i)) {
                System.out.println(a + " sayısı palindromik sayı değildir.");
                return;
            }

        }
        System.out.println(a + " sayısı palindromik sayıdır.");
    }

    public static void main(String[] args) {
        findPalindromicNum(121);
        findPalindromicNum(1234321);
    }

}