package day15excepcionsabstraction;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit extends Runner {

    static List<String> listKullaniciID = new ArrayList<>();
    static List<Integer> listKullaniciSaniye = new ArrayList<>();
    static Scanner input= new Scanner(System.in);//baslarina static yazdik diger clastan cagirmak icin runner clasindan

    static  int counter=0;


    public void kayit(){
        String kullaniciID="";
        System.out.println("Lutfen kullanici ID giriniz ");
        kullaniciID= input.nextLine();

        int kullaniciSaniye= LocalDateTime.now().getSecond();// 0 ile 60 saniye arasinda bir deger verir
        System.out.println("Kullanici saniye "+kullaniciSaniye);
        listKullaniciID.add(kullaniciID);
        listKullaniciSaniye.add(kullaniciSaniye);

        tamamMiDevammi();



    }//kayit()

    private void tamamMiDevammi() {
        String tmmMDvmmM ="";

        do {
            System.out.println("Baska Kayit Varmi? (E/H) ");
            tmmMDvmmM =input.next();
            if(tmmMDvmmM.equalsIgnoreCase("e")){
                kayit();
            }else if(tmmMDvmmM.equalsIgnoreCase("h")){
                System.out.println("Gule gule");
                break;
            }

        }while(!tmmMDvmmM.equalsIgnoreCase("e")&& !tmmMDvmmM.equalsIgnoreCase("h"));
        counter++;
        if (counter==1) {//bunu yazmazsak Arrayi tekrar tekrar yazdirir
            SansliKullanici snslKlnc = new SansliKullanici();
            snslKlnc.sansliKullaniciYazdir(listKullaniciID, listKullaniciSaniye);//sanslikullaniciyi altina badspi  c reat deyince
            //direk oteki clasa gecti
        }
    }
}


