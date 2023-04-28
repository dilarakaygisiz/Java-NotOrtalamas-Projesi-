import java.util.Scanner;

public class Taksimetre {

    public static void main(String[] args) {

        double km, tutar;
        double perkm = 2.20;
        double min = 20;
        double acilis = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Gidilecek mesafeyi giriniz: ");
        km = input.nextDouble();
        tutar = acilis + (km * perkm);
        double son = (tutar < min) ? 20 : tutar;
        System.out.println(km + " km yol gidildiğinde ödenecek tutar: " + son);


    }
}
