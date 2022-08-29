/*Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp
sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse
yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile
aynı olmaması gerektiğini kontrol edip , şifreler aynı ise
ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.*/
import java.util.Scanner;
public class sifreolustur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password, sifrelendirme, newpass;
        System.out.print("kullanıcı adınızı giriniz:");
        username = input.nextLine();
        System.out.print("şifrenizi giriniz:");
        password = input.nextLine();

        if (username.equals("java") && password.equals("patika")) {
            System.out.print("giriş yaptınız.");
        } else {
            System.out.print("hatalı giriş yaptınız.Şifrenizi sıfırlamak isterseniz \"yes\"  istemezseniz \" no\"  secin");
            sifrelendirme = input.nextLine();

            if (sifrelendirme.equals("no")) {
                System.out.print("Giriş sonlandırıldı.");
            } else if (sifrelendirme.equals("yes")) {
                System.out.print("yeni şifrenizi yazınız:");
                newpass = input.nextLine();

                if (newpass.equals("patika") || newpass.equals(password)) {
                    System.out.print("Hatalı şifre tekrar deneyiniz.");
                } else {
                    System.out.println("Şifreniz başarıyla yenilendi.");
                }

            } else {
                System.out.println("hatalı seçim yaptınız tekrar deneyiniz.");
            }
        }
    }
}