package day05Ifstatement;

import java.util.Scanner;

public class C05_IfStatement {

    public static void main(String[] args) {


        //Kullanicidan iki sayi alin buyuk olmayan sayiyi yazdirin.



            Scanner input = new Scanner(System.in);
            System.out.println("Lutfen iki sayi giriniz...");
            double sayi1= input.nextDouble();
            double sayi2= input.nextDouble();

           /*
            if( sayi1< sayi2){
                System.out.println("*Buyuk Olmayan Sayi "+ sayi1);

            }else if(sayi1>sayi2){
                System.out.println( "*Buyuk Olmayan Sayi "+sayi2);

            }else System.out.println( "*Sayilar biribirine esit ");
           */
//ternary metodu
            System.out.println( sayi1==sayi2  ? "Sayilar Esit " : sayi1> sayi2 ? sayi2 : sayi1);





    }
}


