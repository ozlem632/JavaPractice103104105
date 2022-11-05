package day07_manipulations;

public class C07_StringManipulationsIndexOf {

    public static void main(String[] args) {

  /*
           String str = "Kara kara dusunme Ankara";
        //indexOf() method'u verilen character veya caharacter'lerin "ilk gorunumunun" index'ini verir.
        int idCxA1 = str.indexOf("kara");
        System.out.println(idxA1);//5


        //lastIndexOf() method'u verilen character veya caharacter'lerin "son gorunumunun" index'ini verir.
        int idxA2 = str.lastIndexOf("kara");//20 bastan Ankara'nin kara'si
        System.out.println(idxA2);
         */
//Ex: Verilen bir String'deki bir character'in tekrarli veya
// tekrarsiz olup olmadigini gosteren kodu yaziniz
  String str = "javacancandir";

        if (str.lastIndexOf("a")==str.indexOf("a")){
            System.out.println("Tekrarsız");
        }else System.out.println("Tekrarlı");
    }
}
