package day03_IfStatement;

import java.util.Scanner;

public class C01_Scanner_ {

    public static void main(String[] args) {
 /*  Problem Tanımı
       Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
       hesaplayan kodu yazınız.
       Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
       Buna göre 2 işçi aynı işi kaç günde yapar?
       Örnek Ekran Çıktısı
        Bir işçi işi kaç günde bitirmektedir? 10
        Toplamday' kaç işçi çalışacak? 2
       İşin bitme süresi 5 gündür.

  */
        Scanner input=new Scanner(System.in);
        System.out.println("Bir isci bir isi kac gunde bitirmektedir..");
        double bitirmeSuresi=input.nextDouble();
        System.out.println("Toplam kac isci calisacak...");
        double isciSayisi=input.nextDouble();
        double birlikteBitirmeSuresi=bitirmeSuresi/isciSayisi;
        System.out.println("birlikteBitirmeSuresi =" + birlikteBitirmeSuresi);




    }
}
