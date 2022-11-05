package day02_variables;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

       // soru 1) kullanicinin girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini yazdiran prog
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("4 basamakli bir sayi giriniz..");
        int sayi=scanner1.nextInt();


        // bir sayinin birler basamagindaki rakami %10 ile hesaplayabiliriz 1234


        int sonRakam=sayi%10;
        int ilkRakam=sayi/1000;


        System.out.println("ilk rakam + son rakam "+(ilkRakam+sonRakam));

        // soru2)kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler onlar ve yuzler diye yazin


         /* Ornek : Inputs : 853
         Output : Girdiginiz sayinin birler basamagi : 3
                  Girdiginiz sayinin onlar basamagi : 5
                  Girdiginiz sayinin yuzler basamagi : 8
     */






        Scanner scan2=new Scanner(System.in);
        System.out.println("uc basamakli bir sayi giriniz");
        int sayi2=scan2.nextInt();
        // 1) 1 ler basamagindaki sayiyi bulun
        int birler=sayi2%10;
        System.out.println("girdiginiz sayinin birler basamagi " + birler);


        int yeniSayi=sayi2/10;
        System.out.println("yenisayi = " + yeniSayi);
        int onlar=sayi2%10;
        System.out.println("Girdiginiz sayinin onlar basamagi " + onlar);
        int yuzler=sayi2/=10;
        System.out.println("yuzler bas=" +yuzler);












    }
}
