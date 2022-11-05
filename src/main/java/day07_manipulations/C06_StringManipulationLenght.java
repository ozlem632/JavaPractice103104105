package day07_manipulations;

import java.util.Scanner;

public class C06_StringManipulationLenght {

    public static void main(String[] args) {

        /**
         * Length()
         * length() method'u girilen String'in uzunlugunu verir
         * butun karakterlerin adedi (bosluklar da birer karakterdir)
         */
        //havva ==lenght =5
        //index =4

        String cumle ="Bugun hava yagmurlu";
        System.out.println(cumle.length());//19
        String str1="";
        System.out.println(str1.length());
        String str2 =" ";
        System.out.println(str2.length());

        //kullanicidan isim ve soyisim girmesini isteyin ve hangisinin daha uzun oldugunu yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz : \n");
        String isim =input.next();
        System.out.println("soyisim");
        String soyIsim=input.nextLine();
        if(isim.length()> soyIsim.length()){
            System.out.println("isminiz soyisminizden uzun");

        }else if(isim.length()==soyIsim.length()){
            System.out.println("isminiz soyisminizle ayni uzunlukta");


        }else System.out.println("soyisminiz isminizden uzun");


        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin
        Scanner input2 = new Scanner(System.in);
        System.out.println("Lutfen 4 karakterli bir kelime giriniz");
        String kelime=input2.next();
        System.out.println(kelime.length());
        if(kelime.length()==4){
            char bir=kelime.charAt(0);
            char iki= kelime.charAt(1);
            char uc=kelime.charAt(2);
            char dort=kelime.charAt(3);
            System.out.println("Tersten yazilmis hali : "+dort+uc+iki+bir);
        }else if(kelime.length()>4){
            System.out.println("Giriginiz kelime 4 karakterden fazla");
        }else if(kelime.length()<4){
            System.out.println("Girdiginiz kelime 4 karakterden az");
        }
    }
}











