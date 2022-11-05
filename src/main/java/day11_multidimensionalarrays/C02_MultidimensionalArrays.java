package day11_multidimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class C02_MultidimensionalArrays {
    public static void main(String[] args) {

        // kullanicinin girdigi bir arrayin en buyuk elemani ile en kucuk elemaninin farkini bulan kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("arrayin uzunlugunu giriniz ");
        int uzunluk = input.nextInt();
        int arr[] = new int[uzunluk];
        for (int i = 0; i < uzunluk; i++){

    }
        Arrays.sort(arr);
        System.out.println(" Array'in en buyuk elemani :"+arr[uzunluk-1]);//Arrayin en buyuk lemanini verir
        System.out.println(" Array'in en kucuk elemani :"+arr[0]);//Array'in en kucuk elemanini verir



    }
}


