package day09_nestedfoorloop;

import java.util.Scanner;

public class C06_WhileLoop {

    public static void main(String[] args) {

        /* kullanicidan toplanmak uzere sayilar isteyin sayi adedi 10 u gecerse ya da toplami 500 u gecerse
        bu kadar sayi yeter ....adet sayi girdiniz toplami ...yazdirin

         */
        Scanner input = new Scanner(System.in);



        int sayi = 0;
        int toplam = 0;
        int sayac = 0;

        while (sayac < 11 && toplam < 500) {//donecegi icin ayni islemi yapacagi kicin
            System.out.println("Lutfen toplanmak uzere sayi giriniz");//asagida hyazdik ki devamli bu nu cikarsin
            sayi = input.nextInt();
            toplam += sayi;
            sayac ++;
            //asagida hyazdik ki devamli bu nu cikarsin
            sayi = input.nextInt();
             toplam += sayi;
             sayac ++;
        }
    if (toplam>500){
        System.out.println(sayac +"adet sayi girdiniz .Toplami" +toplam);

    }else System.out.println("bu kadar sayi yeter." +sayac+"");


    }
}