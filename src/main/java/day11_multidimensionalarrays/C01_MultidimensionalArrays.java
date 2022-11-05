package day11_multidimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class C01_MultidimensionalArrays {
    //kuñllanicidan alinan bir stringde gecen sesli harfleri consolo yazdirin
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println( "lutfen bir string ifade giriniz");
        String str = input.nextLine();
        String arr[]=str.split(""); // cumleyi arraye donusturduk
        System.out.println(Arrays.toString(arr));


            for (int i = 0; i <arr.length ; i++) {
                if (arr[i].equalsIgnoreCase("a")||
                        arr[i].equalsIgnoreCase("e")||
                        arr[i].equalsIgnoreCase("u")||
                        arr[i].equalsIgnoreCase("o")||
                        arr[i].equalsIgnoreCase("i"))
                {
                    System.out.println(arr[i]);
                }

                String st= "java ogrenince para kazanmak kolay, ogrenmeyince ne kolay ki.";
                str=str.toLowerCase();


                String harfler[]=st.split("");
                int counter=0;

                System.out.println(Arrays.toString(harfler));//[j, a, v, a,  , o, g, r, e, n, i, n, c, e,  , p, a, z, a, r, a,  , k, a, z, a, n, m, a, k,  , k, o, l, a, y, ,,  , o, g, r, e, n, m, e, y, i, n, c, e,  , n, e,  , k, o, l, a, y,  , k, i, .]

                for (String w:harfler){
                    switch (w){
                        case "a":
                        case "e":
                        case "i":
                        case "o":
                        case "u":
                            counter++;
                    }
                }
                System.out.println(counter);

            }

        }





}

