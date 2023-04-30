import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args) {

        String kullaniciAdı, sifre, yenisifre;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        kullaniciAdı = input.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        sifre = input.nextLine();

        //Koşul bloklarında Stringlerde eşitlik .equals ile kontrol edilir.
        if (kullaniciAdı.equals("kdilara") && (sifre.equals("123456"))){
            System.out.println("Giriş Yaptınız.");
        }
        else{
            System.out.println("Hatalı giriş yaptınız.\nŞifrenizi mi unuttunuz?\nYeni şifre oluşturmak için aşağıya yeni şifrenizi giriniz: ");
            yenisifre = input.nextLine();
            if (yenisifre.equals("123456")){
                System.out.println("Yeni şifreniz, eski şifrenizle aynı olamaz!");

            }else {
                sifre = yenisifre;
                System.out.println("Şifreniz başarılı bir şekilde değiştirildi.");

            }

        }


    }
}
