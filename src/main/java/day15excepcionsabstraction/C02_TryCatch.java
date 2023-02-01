package day15excepcionsabstraction;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_TryCatch {
    public static void main(String[] args) {
        /*

         */

        String[] urunler = {"et", "sut", "findik", "fistik"};
        Scanner input;//input objesi olusturduk//tekrar tekrar soursun diye
        boolean flag = true;//dogru veri girdigin surece calisir fñlag bu demek.yanlis veride diursun diye.default deger gitrue ya da falsebi ekledik
        int index = 0;//deger atadiktrue diye default deger


        while (flag) {
            try {
                input =new Scanner(System.in);
                System.out.println("istedigininiz urunun sira no giriniz");
                index = input.nextInt();
                flag =false;//eger false olursa durupkod basa donuyor
            } catch (InputMismatchException e) {
                e.printStackTrace();
            }
        }


        try {
            System.out.println(urunler[index]);//Array oldugu icin kopseli parantez
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("girdiginiz deger 0 ile 3 arasi olmali");

        }
    }
}