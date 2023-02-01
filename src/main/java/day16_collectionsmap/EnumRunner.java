package day16_collectionsmap;

import java.sql.SQLOutput;

public class EnumRunner {

    public static void main(String[] args) {
        Level oyun =Level.LOW;//nokta yazinca medium otomatik cikti

        switch(oyun){
            case LOW:
                System.out.println("kolay bir oyun");
                break;
            case MEDIUM:
                System.out.println("orta seviye bir oyun");
                break;

            case HIGH:
                System.out.println("Zor bir oyun" );
                break;

        }
    }

}
