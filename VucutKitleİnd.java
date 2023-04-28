import java.util.Scanner;

public class VucutKitleİnd {

    public static void main(String[] args) {

        double kg, m, vucutkitleindeksi;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu giriniz(m cinsinden): ");
        m = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz(kg cinsinden): ");
        kg = input.nextDouble();

        vucutkitleindeksi = kg/(m*m);
        System.out.println("Vücut Kitle İndeksiniz: " + vucutkitleindeksi);

    }
}
