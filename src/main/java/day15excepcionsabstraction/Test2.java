package day15excepcionsabstraction;

public class Test2 {//cozumlemeye main metoddan basñla

    String str = "a";
    void A() {
        try {
            str = str + "b";
            B();//b metodu dedi o yuzden direk Void B ye atladik c yazmadik
        } catch (Exception e) {
            str = str + "c";//c yi yazmadi ustte b metoduna git diyor cunku


        }
    }
    void B() throws Exception {
        try {
            str = str + "d";
            C();//c methoduna gidiyoruz direk
        } catch (Exception e) {
            str = str + "e";
        } finally {
            str = str + "f";//herhalukarda calisir f eklenir cunku
        }
        str = str + "g";
    }
    void C() throws Exception {
        System.out.println(12/0);//abdefg 12 0 a  bolunmuyor o yuzden exception verir yukari ciktik
    }
    void display() {
        System.out.println(str);
    }
    public static void main(String[] args) {//main metoddan basla
        Test2 object = new Test2();
        object.A();//obje clasindan a methodunu calistir

        object.display();
    }
}

