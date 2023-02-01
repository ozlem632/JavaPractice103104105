package practice07;

public class Q04_Exception_Throws {
    public static void main(String[] args) throws Exception {

        rastgeleSayi();
        /*
   randomSayi isminde bir method oluşturunuz.
   Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)
   Bu iki random sayının toplamını yazdırın.
   Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
   ("Sayı 12'den küçük ise hata verir") yazdırın.

     */
    }
        public static void rastgeleSayi() throws Exception {//0 dan 10 kadar olan sayilar
        int a =(int)(Math.random()*11);//bu metod 0 dan 11 kadar olan sayilari verir.0 ile 0,9999 kadaryani
        int b =(int)(Math.random()*11);// 0 ile 0,99 sayilari verir11 ile carpip 10 a kadar sayi alacagiz
            System.out.println(a+"--"+b);


            System.out.println(a+b);
            if(a+b<12){
                throw new Exception("Sayi 12 den kucukse hata verir");



            }










    }
}
