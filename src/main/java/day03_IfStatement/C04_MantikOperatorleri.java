package day03_IfStatement;

public class C04_MantikOperatorleri {

    public static void main(String[] args) {

        // && ile & arasindaki fark
        // && cift v daha hizli calisir .digerinde ilk hatada durur
        //digerinde tum satiri kontrol etmeye calisir
        //mukemmeliyetcidir cay +seker gibi  her iki tarafta true olmali

        System.out.println(5*2==8);//false

        boolean sonuc1=5>4 && 7<9 && 6+3==9 && 5+2!=8;
        System.out.println("sonuc1==> " + sonuc1);//true

        boolean sonuc2 = 5>4 && 7>9 && 6+3==9 && 5+2!=8;
        System.out.println("sonuc2 =" + sonuc1);//
        // FALSE
        int sayi1=15;
        // sayi 1 in  10 ile 20 araliginda oldugunu true diyerek dondurelim
        // java<10sayi1>20 java 3 lu karsilastirma yapmaz
        //ikili karsilastirmalar yapip mantiksal operatorler ile bkirlestirmeliyiz
         // || veya da birinin true olasi yeterlidir.ikisi de true olabilir



        System.out.println(10<sayi1 && sayi1<20);

        int sayi2=5;
        // sayi 2 nin 10 ile 20 arasinda olmadigini tru diye donduren program

        System.out.println("sayi2 10 ile 20 arasinda degildir :" + (sayi2<10 || sayi2<20));
        System.out.println(sayi2<10 || sayi2>20);//

        //&&==ve ||=veya







    }
}
