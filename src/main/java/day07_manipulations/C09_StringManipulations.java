package day07_manipulations;


import java.util.Scanner;

public class C09_StringManipulations {
    public static void main(String[] args) {
 /*
       Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.
                   i)En az 8 character icermeli
                   ii)Space characteri icermemeli
                   iii)Buyuk harf icermemeli
                   iv)Son characteri "." olmali

*/




         /*

                ooooo*
                oooo* *
                ooo*   *
                oo*     *
                o* * * * *


         */

        Scanner input = new Scanner(System.in);
        System.out.println("Satir sayisi giriniz...");
        int satir = input.nextInt();


        for (int i = 1; i <= satir; i++) {

            for (int bosluk = satir; bosluk >= i; bosluk--) {//bosluk kontrol konsoldan uzaklastir en ust satirdaki 5 ,4 ,3  soldaki bosluk
                System.out.print(" ");//o
            }
            for (int sutun = 1; sutun <= i; sutun++) {

                if (sutun == 1 || sutun == i) {
                    System.out.print("* ");//en distaki yildizlar
                } else if (i == satir) {
                    System.out.print("* ");//en alt satirdaki yildizlar
                } else
                    System.out.print("  ");//3. ve  4. satirdaki bosluklar
            }
            System.out.println();
        }

    }
}