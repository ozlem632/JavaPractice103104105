package day03_IfStatement;

public class C02_AsciiDegerleri {

    public static void main(String[] args) {






        char space=' ';
        System.out.println("space'in ASCII degeri:" +(space+0)); // 32 Space'in ASCII degerini bulmak icin 0 la toplariz

        char m='m';
        System.out.println("m nin ascii degeri: " +(m+0));
         //. yol
        int harf3='m';

        System.out.println("m nin ascii degeri =" +harf3); //charlarda java caractarlere int atayabiliyoruz.cunku charin
        // bir resim birde matematiksel caraktari var .

        byte b1 =12;
        byte b2 =-125;
        System.out.println("b1>b2  ==>" +(b1>b2));
        float f1 =2.45645f;
        float f2 = 5.86786f;
        System.out.println("f1>f2 ==> " + (f1>f2));
        System.out.println("b1>f1 ==>" +(b1 >f1));

        long lgn1 = 5456456464L;
        System.out.println("b1<lng1 =" +(b1<lgn1));

        char ch='h';
        System.out.println("b1<ch =" +(b1<ch));
















    }
}
