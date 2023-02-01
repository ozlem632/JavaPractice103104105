package practice07;

import java.util.Random;

public class Q05_Exceptiontrows {

    public static void main(String[] args) throws Exception {
      rastgeleSayi();
    }
    public static void rastgeleSayi(){

        Random random = new Random();
        int top = 0;
        while (true) {


            int a = random.nextInt(11);
            int b = random.nextInt(11);
          try{

              if(a+b<12){
                  throw new Exception ();
          }


            System.out.println(a + "--"+b);
            System.out.println(a + b);




            } catch (Exception e) {
              throw new RuntimeException(e);



          }

        }
    }
}