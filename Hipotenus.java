import java.util.Scanner;

public class Hipotenus {

    public static void main(String[] args) {

        int kenar1, kenar2;
        double hipo;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci kenar uzunluğu: ");
        kenar1 = input.nextInt();
        System.out.print("İkinci kenar uzunluğu: ");
        kenar2 = input.nextInt();

        hipo = Math.sqrt((kenar1*kenar1) + (kenar2*kenar2));
        System.out.println("Hipotenüs Uzunluğu : " + hipo);

    }
}
