package day13_overliddingoverloading;

public class C01_Varargs {
    public static void main(String[] args) {

        //verilen sayilardan ilki haric sayilari toplayip ilk sayiyla carpan kod yaziniz
        int sayi1 = 5;
        int sayi2 = 7;
        int sayi3 = 2;
        int sayi4 = 4;
        int sayi5 = 9;
        toplam(sayi1, sayi2, sayi3, sayi4, sayi5);


    }//main

    private static void toplam(int sayi1, int... toplanacakSayi) {//sadece yazdirmasini istiyorum o yuzden void oldu

        int top = 0;
        for (int w : toplanacakSayi) {//ilki haric tuttuk)

            top+=w;


        }
        System.out.println("Toplam"+top);//22
        System.out.println("Toplam ile Ilksayinin carpimi"+(top*sayi1));

    }
}