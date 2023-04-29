import java.util.Scanner;

public class SinifGecme {

    public static void main(String[] args) {

        int matematik, fizik, turkce, kimya, muzik;
        double toplam= 0;
        double ortalama;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz:");
        matematik = input.nextInt();
        if ((matematik<0)||(matematik>100)){
            System.out.println("Hatalı not girdiniz. ");
        }
        else{
            toplam += matematik;
        }

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();
        if ((fizik<0)||(fizik>100)){
            System.out.println("Hatalı not girdiniz. ");
        }else{
            toplam += fizik;
        }

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();
        if ((turkce<0)||(turkce>100)){
            System.out.println("Hatalı not girdiniz. ");
        }else{
            toplam += turkce;
        }

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        if ((kimya<0)||(kimya>100)){
            System.out.println("Hatalı not girdiniz. ");
        }else{
            toplam += kimya;
        }
        System.out.print("Müzik notunuz:");
        muzik = input.nextInt();
        if ((muzik<0)||(muzik>100)){
            System.out.println("Hatalı not girdiniz. ");
        }else{
            toplam += muzik;
        }

        ortalama = toplam/5;
        System.out.println("Ortalamanız : " + ortalama);

        if (ortalama>55){
            System.out.println("Sınıfı geçtiniz.");
        }
        else{
            System.out.println("Sınıfta kaldınız.");
        }

    }
}
