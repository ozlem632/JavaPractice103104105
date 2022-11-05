package day09_nestedfoorloop;

import java.util.Scanner;

public class C05_ForLoop {

    public static void main(String[] args) {
        // Girilen bir stringin  harflerini teker rteker altalta ekrana yazdiran
        // bosluk veya geldiginde bunlari yazmasin
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen string bir ifade yaziniz");
        String str = input.nextLine();
        for (int i = 0; i<str.length(); i ++){// ifadenin karakterlerine bakildi
            if (str.charAt(i )== 'a'|| str.charAt(i) ==' ')// ifadede a yada bosluk gorursen atla

                continue;
                System.out.println(str.charAt(i));

            }

    }
}
