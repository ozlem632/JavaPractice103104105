package day10_arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class C03_Arrays {

    public static void main(String[] args) {

            /*
    INTERWIEW QUESTIONS
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */
        //split
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir string giriniz");
        String str = input.nextLine();
        String arr[] = str.split("");
        System.out.println(Arrays.toString(arr));
        // sort
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int counter = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].equals(arr[i])) {
                counter++;//Ayni  harflerse bir artir
            } else {
                System.out.println(arr[i - 1] + " karakter sayisi " + (counter + 1));

                counter = 0;//farkli karaktere gectigi icin counteri sifirla
            }

            if (i == arr.length - 1) {
                System.out.println(arr[i] + " karakterinin sayisi " + (counter + 1));


            }


        }
    }
}

