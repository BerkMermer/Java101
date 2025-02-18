import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        String usurName,password,newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınız : ");
        usurName = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (usurName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız ! ");
        }else{
            System.out.println("Bilgileriniz Yanlış ! ");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (E/H): ");

            String resetChoice = input.nextLine();

            if (resetChoice.equals("E")) {
                while (true){
                    System.out.print("Yeni şifrenizi giriniz: ");
                    newPassword = input.nextLine();

                    if (newPassword.equals("java123")) {
                        System.out.println("Şifre oluşturulamadı,lütfen başka bir şifre giriniz.");
                    } else {
                        System.out.println("Şifre oluşturuldu.");
                        break;
                    }
                }
            }else{
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");

            }


        }
    }
}
