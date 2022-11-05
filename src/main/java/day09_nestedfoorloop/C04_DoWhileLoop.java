package day09_nestedfoorloop;

public class C04_DoWhileLoop {

    public static void main(String[] args) {


//Maymunun kac gun hayatta kalacagini gosteren kod//
//hayatta kaldigi surece kac muz vermelisin (Do While )
// eger 4 ten az muz kalirsa maymunlar olur

        int muzSayisi = 165;
        boolean maymunAlive = true;
        int survivalDays = 1;
        do {
            muzSayisi -= 4;//her gun 4 muz eksiltir
            survivalDays++;

            if (muzSayisi < 4) {
                maymunAlive = false;
                System.out.println("Bugun " + survivalDays + "bun yasadi muz kalmadi.Maymun oldu");

            } else System.out.println("bugun" + survivalDays + "gun yasadi muz bitmedi ,maymun hayatta");

        } while (maymunAlive);
        System.out.println("Toplam maymunun yasadigi gun sayisi " + (survivalDays-1));









}
}