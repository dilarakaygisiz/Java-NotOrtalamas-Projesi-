import java.util.Scanner;

public class ManavKasa {

    public static void main(String[] args) {

        double kgArmut, kgElma, kgDomates, kgMuz, kgPat;
        double tlArmut = 2.14, tlElma = 3.67, tlDomates = 1.11, tlMuz = 0.95, tlPat = 5.00;
        double toplam;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut: ");
        kgArmut = input.nextDouble();
        System.out.print("Elma: ");
        kgElma = input.nextDouble();
        System.out.print("Domates: ");
        kgDomates = input.nextDouble();
        System.out.print("Muz: ");
        kgMuz = input.nextDouble();
        System.out.print("Patlıcan: ");
        kgPat = input.nextDouble();

        toplam = (kgArmut*tlArmut) + (kgElma*tlElma) + (kgDomates*tlDomates) + (kgMuz*tlMuz) + (kgPat*tlPat);
        System.out.print("Toplam Tutar: " + toplam);



    }
}
