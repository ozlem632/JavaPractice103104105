package day05Ifstatement;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {




     /*Soru 6) Kullanicidan iki sayi isteyin,
 sayilarin ikisi de pozitif ise "sayilarin toplamini "yazdirin,
 sayilarin ikisi de negative ise "sayilarin carpimini" yazdirin,
 sayilarin ikisi farkli isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
 sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.*/


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz");

        double sayi1 = input.nextDouble();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        double sayi2 = input.nextDouble();

        if (sayi1 > 0 && sayi2 > 0) {
            System.out.println("sayilarin toplami " + (sayi1 + sayi2));

        } else if (sayi1 < 0 && sayi2 < 0) {
            System.out.println("Sayilarin carpimini" + (sayi1 + sayi2));
        } else if (sayi1 * sayi2 > 0) {//sayi1<0 &&  sayi2>0 ise


            System.out.println("farkli isaretlerde sayilarla islem yapamazsin ");
        }else
            System.out.println("sifir carpmaya gore yutan elemandir...");//tum ihtimaller denendi bir tanesi sifirsa yutan elemandir




        }


    }


