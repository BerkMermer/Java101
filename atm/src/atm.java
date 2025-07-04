import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        String userName,passWord;
        Scanner input =new Scanner(System.in);
        int right=3;
        int balance =1500;
        int select;

        while(right>0){
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            passWord = input.nextLine();


            if (userName.equals("patika") && passWord.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");


                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Güncel bakiyeniz: " + balance);
                            System.out.print("Yatırmak istediğiniz para miktarı : ");
                            int depositAmount = input.nextInt();
                            balance += depositAmount;
                            System.out.println("Yeni bakiyeniz: " + balance);
                            System.out.println();
                            break;
                        case 2:
                            System.out.println("Güncel bakiyeniz: " + balance);
                            System.out.print("Çekmek istediğiniz para miktarı : ");
                            int withdrawAmount = input.nextInt();
                            if (withdrawAmount > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= withdrawAmount;
                                System.out.println("Yeni bakiyeniz: " + balance);
                            }
                            System.out.println();
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            System.out.println();
                            break;
                        case 4:
                            System.out.println("Tekrar görüşmek üzere.");
                            break;
                        default:
                            System.out.println("Geçersiz işlem numarası!");
                            System.out.println();
                    }
                } while (select != 4);
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
                System.out.println();



                }
            }
        }
    }
