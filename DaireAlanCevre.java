import java.util.Scanner;

public class DaireAlanCevre {

    public static void main(String[] args) {

        double alanDaire, alanDilim, cevre, r, a, pi =3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Yarıçap değeri: ");
        r = input.nextDouble();

        alanDaire = pi*r*r;
        cevre = 2*pi*r;
        System.out.println("Dairenin Alanı: " + alanDaire);
        System.out.println("Dairenin Çevresi: " + cevre);

        System.out.println("a açısını giriniz: ");
        a = input.nextDouble();
        alanDilim = (pi*(r*r)*a)/360;
        System.out.println("Dairenin " + a + " açılı diliminin alanı: " + alanDilim);
    }
}
