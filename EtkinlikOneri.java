import java.util.Scanner;

public class EtkinlikOneri {

    public static void main(String[] args) {

        double sicaklik;

        Scanner input = new Scanner(System.in);

        System.out.print("Hava sıcaklığını giriniz: ");
        sicaklik = input.nextDouble();

        if (sicaklik<5){
            System.out.println("Kayak yapmak için ideal bir gün!");
        }
        else if (sicaklik>5 && sicaklik<15){
            System.out.println("Güzel bir film seçip sinemaya gitmek için harika bir gün!");
        }
        else if (sicaklik>15 && sicaklik<25){
            System.out.println("Piknik sepetlerinizi hazırlayınnn!");
        }
        else if (sicaklik>25){
            System.out.println("Deniz, kum, güneş! Yüzmek için harika bir gün!");
        }
        else{
            System.out.println("Bu sıcaklığa uygun aktivite bulunamamıştır. Evinizde dinlenmenizi öneririz.");
        }

    }
}
