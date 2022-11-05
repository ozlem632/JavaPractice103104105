package day12_localdatetimeVarragsOverloadingOverriding;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C01_LocalDateTime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen dogdugunuz ayi string olarak giriniz");
        String ay = input.nextLine();
        System.out.println("lutfen dogdugunuz gun bilgisini gioriniz");
        int gun = input.nextInt();
        String burc = "";
        if (ay.equalsIgnoreCase("ocak")) {
            if (gun > 22)
                burc = "Kova";
            else
                burc = "oglak";

        }
        if (ay.equalsIgnoreCase("subat")) {

            if (gun > 22)
                burc = "balik";
            else
                burc = "kova";

        }
        if (ay.equalsIgnoreCase("Mart")) {
            if (gun > 22)
                burc = "";
            else
                burc = "oglak";

        }
        if (ay.equalsIgnoreCase("Nisan")) {
            if (gun > 22)
                burc = "Kova";
            else
                burc = "oglak";

        }
        if (ay.equalsIgnoreCase("Mayis")) {
            if (gun > 22)
                burc = "Kova";
            else
                burc = "oglak";

        }
        if (ay.equalsIgnoreCase("Haziran")) {
            if (gun > 22)
                burc = "Kova";
            else
                burc = "oglak";

        }
        if (ay.equalsIgnoreCase("Temmuz")) {
            if (gun > 22)
                burc = "Kova";
            else
                burc = "oglak";

        }
        if (ay.equalsIgnoreCase("Agustos")) {
            if (gun > 22)
                burc = "Kova";
            else
                burc = "oglak";

        }
        if (ay.equalsIgnoreCase("eylul")) {
            if (gun > 22)
                burc = "Kova";
            else
                burc = "oglak";

        }
        if (ay.equalsIgnoreCase("ekim")) {
            if (gun > 22)
                burc = "Kova";
            else
                burc = "oglak";

        }
        if (ay.equalsIgnoreCase("kasim")) {
            if (gun > 22)
                burc = "Kova";
            else
                burc = "oglak";

        }
        if (ay.equalsIgnoreCase("aralik")) {
            if (gun > 22)
                burc = "Kova";
            else
                burc = "oglak";

        }

    }

}