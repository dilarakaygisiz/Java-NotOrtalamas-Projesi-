import java.util.Scanner;

public class NotOrt {

    public static void main(String[] args) {

     int matematik, fizik, kimya, turkce, tarih, muzik;


        Scanner input = new Scanner(System.in);
        System.out.println("Matematik Notunuzu Giriniz:");
        matematik = input.nextInt();
        System.out.println("Fizik Notunuzu Giriniz:");
        fizik = input.nextInt();
        System.out.println("Kimya Notunuzu Giriniz:");
        kimya = input.nextInt();
        System.out.println("Türkçe Notunuzu Giriniz:");
        turkce = input.nextInt();
        System.out.println("Tarih Notunuzu Giriniz:");
        tarih = input.nextInt();
        System.out.println("Müzik Notunuzu Giriniz:");
        muzik = input.nextInt();

        double ortalama = (matematik+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Ortalamanız: " + ortalama);

        String sonuc = (ortalama > 60) ? "Sınıfı Geçtiniz." : "Sınıfta Kaldınız.";
        System.out.println(sonuc);

    }
}
