import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Kullanicidan 2 deger alacagiz ve bu degerlere top,çkr,çrp,bol komutları ekleyecegiz

        int n1,n2, select ;
        Scanner input = new Scanner(System.in) ;

        System.out.print("Birinci Sayıyı Giriniz: ");
        n1 = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapmak İstediğiniz İşlem:");
        select = input.nextInt();

        switch (select) {
            case 1 :
                System.out.println("Sonuç:" + (n1+n2));
                break;
            case 2 :
                System.out.println("Sonuç:" + (n1-n2));
                break;
            case 3 :
                System.out.println("Sonuç:" + (n1*n2));
                break;
            case 4 :
                if (n2 !=0) {
                    System.out.println("Sonuç:" + (n1/n2));
                } else {
                    System.out.println("Hiçbir sayı 0'a bölünemez!");
                }
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız!");
        }


    }
}
