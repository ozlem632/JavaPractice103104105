package day15excepcionsabstraction;

import static day15excepcionsabstraction.Kayit.counter;

public class Runner {

    public static void main(String[] args) {

        Kayit obj=new Kayit();
        obj.kayit();
        System.out.println(counter+ "kez dogru kulanici girisi yapildi");

    }
}
