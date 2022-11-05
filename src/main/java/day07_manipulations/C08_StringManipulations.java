package day07_manipulations;

public class C08_StringManipulations {

    public static void main(String[] args) {
        String email ="abc@gmail.com";
        String arananMetin ="@gmail.com";

        if(!email.contains(arananMetin)){
            System.out.println("Lutfen gmail adresini giriniz");

        }else if(email.endsWith(arananMetin)){
            System.out.println("Email adresiniz kaydedild");


        }else System.out.println("lutfen yazimi kontrol edin");





    }
}
