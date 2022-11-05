package day09_nestedfoorloop;

import java.util.Scanner;

public class C01_ForLoop {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz...");
        String str = input.nextLine();
        int sayac = 0;
        for (int i = 0; i < str.length(); i++) {
            sayac++;


        }
    }

}