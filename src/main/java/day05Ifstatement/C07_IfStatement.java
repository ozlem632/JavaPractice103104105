package day05Ifstatement;

import java.util.Scanner;

public class C07_IfStatement {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 1, kenar uzunlugunu giriniz");
        int kenar1 = input.nextInt();
        System.out.println("lUTFEN KENAR 2 UZUNLUGUNU GIRINIZ");
        int kenar2 = input.nextInt();
        System.out.println("lutfen kenar 3 uzunlugunu giriniz");
        int kenar3= input.nextInt();
        System.out.println("lutfen 4, kenar uzunlugunmu giriniz");
        int kenar4= input.nextInt();
         if (kenar1==kenar2 &&kenar2==kenar3 && kenar3==kenar4){
             System.out.println("bu cisim bir karedir");

         }else System.out.println("bu cisim bir kare degildir");

     /*

       bir arkadasin cozumu
        Scanner girdi = new Scanner(System.in);
        System.out.println("Lütfen birinci kenar uzunluğunu giriniz");
        double kenar1 = girdi.nextDouble();
        System.out.println("Lütfen birinci kenar uzunluğunu giriniz");
        double kenar2 = girdi.nextDouble();

        String sonuc = kenar1<0 || kenar2<0 ? "Geçersiz sayı" : kenar1==kenar2 ? "Bu şekil bir karedir." : "Bu şekil bir dikdörtgendir.";
        System.out.println(sonuc);
       */
    }
}


