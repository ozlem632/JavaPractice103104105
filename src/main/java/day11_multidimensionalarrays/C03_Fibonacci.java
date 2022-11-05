package day11_multidimensionalarrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03_Fibonacci {

    public static void main(String[] args) {

        List<Integer> fibonacci = new ArrayList<Integer>();

        /*
        interwiew
        kullanicidan alinan bir tamsayiya kadar Fibonacci dizisi olusturun
        0-1-1-2-3-5-8-13-21-34....toplayarak gidilen sayilar mesela 0 ile 1=1
        1 ile 1=2 1ile 2 =3 gibi
         */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = input.nextInt();

        fibonacci.add(0);
        fibonacci.add(1);
        int i = 1;
        if (sayi <= 1) {// eksili sayi girmesin diye
            System.out.println("lutfen 1 den buyuk bir sayi giriniz");

        } else {
            while (fibonacci.get(i) < sayi) {
                fibonacci.add(fibonacci.get(i) + fibonacci.get(i - 1));// bir onceki elemanla topladik
                i++;


            }
            if (fibonacci.get(fibonacci.size() - 1) > sayi) {// fibonacci de yer almiyorsa
                fibonacci.remove(fibonacci.size() - 1);//son elemani.listenin son elemani buyukse verilen sayidan sil dedik


                System.out.println("girdiginiz sayi fibonaccide yer almiyor.girilen sayiya kadarki fibonacci" + fibonacci);
            } else {
                System.out.println("girdiginiz sayi bir fibonacci sayisidir" + fibonacci);

            }

        }
        }

    }