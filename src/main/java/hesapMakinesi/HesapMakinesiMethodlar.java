package hesapMakinesi;

import java.util.Scanner;

public class HesapMakinesiMethodlar {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz");
        double sayi1 = scanner.nextDouble();

        System.out.println("yapmak istediginiz islemi seciniz: +, -, /, *, ^, √ ");
        char islem= scanner.next().charAt(0);


        double sayi2=0;
        if(islem!='√'){
            System.out.println("2. sayiyi giriniz");
            sayi2=scanner.nextDouble();
        }

        double sonuc= hesapla(sayi1,sayi2,islem);
        System.out.printf("Sonuç: %.2f\n", sonuc);







    }
    public static double hesapla(double a, double b, char islem) {

        switch (islem) {
            case '+':
                return toplamaIslemi(a, b);

            case '-':
                return cikarmaIslemi(a, b);


            case '*':
                return carpmaIslemi(a, b);


            case '/':
                return bolmeIslemi(a, b);


            case '^':
                return usAlmaIslemi(a,b);


            case '√':
                return karekokAlmaIslemi(b);


            default:
                System.out.println("gecersiz bir islem girdiniz");
                return 0; // emin degilim
        }


    }


    /*
Java'da switch ifadesinde break kullanmak, her durumda zorunlu değildir. Ancak, case bloklarının sonuna geldiğinde break kullanılmazsa, kodunuz diğer durumlara geçmeye devam eder. Bu, yanlış sonuçlar almanıza veya beklenmedik davranışlar görmesine neden olabilir.

Ancak, sizin kodunuzda break ifadeleri kullanmanıza gerek yoktur. Çünkü her case bloğunun sonunda return ifadesi var ve return ifadesi zaten o case bloğunun sonunu işaret eder. Dolayısıyla, break ifadesi kullanmanıza gerek yoktur. Bu nedenle, break ifadelerini kaldırarak kodunuzu şu şekilde düzeltebilirsiniz:
     */


/*
Kodunuz iyi bir şekilde ilerliyor. main metodunda kullanıcının girişini alıyorsunuz ve ardından hesapla metodunu çağırarak işlemi gerçekleştiriyorsunuz. Ancak, hesapla metodunu çağırmak için bir nesne oluşturmanız gerekiyor.

hesapla metodunu çağırmak için iki seçeneğiniz var:

main metodu static olduğu için hesapla metodunu da static olarak tanımlayabilirsiniz. Böylece doğrudan main metodundan çağırabilirsiniz.
hesapla metodunu bir nesne üzerinden çağırabilirsiniz. Bunun için main metodunda bir nesne oluşturmanız gerekecek.
İlk seçenek daha uygun görünüyor gibi, çünkü main metodu zaten static ve main içerisinde bir nesne oluşturmanıza gerek yok. Dolayısıyla hesapla metodunu da static olarak tanımlamanız daha doğru olacaktır.
 */

//asagidaki methodlari da static yapmam gerekti


    public static double toplamaIslemi(double a, double b) {
        return a + b;
    }


    public static double cikarmaIslemi(double a, double b) {
        return a - b;
    }


    public static double carpmaIslemi(double a, double b) {
        if (a == 0 || b == 0) {
            return 0;
        }

        return a * b;
    }


    public static double bolmeIslemi(double a, double b) {
        if (a == 0) {
            return 0;
        }
        if (b == 0) {
            throw new IllegalArgumentException("sayi 0'a bölünemez");
        }
        return a / b;
    }


    public static double karekokAlmaIslemi(double a) {
        if (a == 1) {
            System.out.println(1);
        }
        return Math.sqrt(a);
    }


    public static double usAlmaIslemi(double a, double b) {

        if (a == 1) {
            System.out.println(1);
        }
        if (b == 0) {
            return 1;
        }
        return Math.pow(a, b);
    }


}










