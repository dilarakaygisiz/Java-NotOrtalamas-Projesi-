import java.util.Scanner;

public class UcakBileti {

    public static void main(String[] args) {

        double km;
        int age;
        int typeFlight;
        double perKm = 0.10;
        double toplam;

        Scanner input = new Scanner(System.in);

        System.out.print("Uçuş mesafesini giriniz: ");
        km = input.nextDouble();
        if (km>0){
            System.out.println("Uçuş Mesafesi: " + km);
        }else{
            System.out.println("Hatalı veri girdiniz!");
        }

        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();
        if (age<0){
            System.out.println("Hatalı veri girdiniz!");
            return;
        }

        System.out.println("Yolculuk tipini seçiniz: ");
        System.out.println("1-Tek Yön\n2-Gidiş-Dönüş");
        typeFlight = input.nextInt();
        if ((typeFlight != 1) && (typeFlight != 2)){
            System.out.println("Hatalı veri girdiniz!");
            return;
        }
        toplam = km*perKm;
        System.out.println("İndirimsiz bilet fiyatı: " + toplam);
        if (typeFlight == 1){
            if (age<12){
                System.out.println("İndirimli bilet fiyatı: " + (toplam -= (toplam/2)));
            }else if (age>=12 && age<24){
                System.out.println("İndirimli bilet fiyatı: " + (toplam -=toplam*0.10));
            }else if (age>65){
                System.out.println("İndirimli bilet fiyatı: " + (toplam -=toplam*0.30));

            }
        }
        else if (typeFlight == 2){
            System.out.println("İndirimli bilet fiyatı: " + 2*(toplam -= toplam*0.20));
            if (age<12){
                System.out.println("İndirimli bilet fiyatı: " + 2*(toplam -= (toplam/2)));
            }else if (age>=12 && age<24){
                System.out.println("İndirimli bilet fiyatı: " + 2*(toplam -=toplam*0.10));
            }else if (age>65){
                System.out.println("İndirimli bilet fiyatı: " + 2*(toplam -=toplam*0.30));

            }

        }



    }
}
