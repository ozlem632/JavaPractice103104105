package day04_IfStatement;

import java.util.Scanner;

public class C01_IfStatment {
    public static void main(String[] args) {

        /*
        kullanicidan Y/N IKILISINI GIRDIGINDE girdigi degeri ekrana yazdiran java kodunu yaziniz
        input ==> output
        Y= YES
        N ===> NO

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Y/N ikilisinden birini giriniz");

        char karakter = input.next().charAt(0);
        if (karakter == 'Y' || karakter == 'y') {
            System.out.println("YES");

        }


         /* ogrenci asagidaki gibi notlar aldiginda karsisindaki degerleri yazdiran bir kod yaziniz

          */


        }

    }