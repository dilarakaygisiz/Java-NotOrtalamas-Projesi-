import java.util.Scanner;

public class Kdv {

    public static void main(String[] args) {

        double fiyat;
        double kdvOranı = 0.18;
        double KDV1;
        double KDV2;

        Scanner input = new Scanner(System.in);

        System.out.print("Fiyat giriniz: ");
        fiyat = input.nextInt();

        KDV1 = (fiyat*18)/100;
        KDV2 = (fiyat*8)/100;
        System.out.println("KDV Oranı: " + kdvOranı);
        System.out.println("KDV1 Tutarı:" + KDV1);
        System.out.println("KDV1'li Tutar: " + (fiyat+KDV1));
        System.out.println("KDV2 Tutarı:" + KDV2);
        System.out.println("KDV2'li Tutar: " + (fiyat+KDV2));


        double tutar = (0 < fiyat && fiyat < 1000) ? ( fiyat + KDV1 ) : (fiyat + KDV2);
        System.out.println(tutar);


    }
}
