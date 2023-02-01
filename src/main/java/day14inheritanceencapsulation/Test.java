package day14inheritanceencapsulation;

public class Test {
    private double genislik;
    private double yukseklik;
    private double ekranBuyukñlugiu;
    private int maxSes = 30;
    private int ses = 12;
    private boolean guc;

    public Test(double genislik, double yukseklik, double ekranBuyuklugu) {//consturactor olusturduk
        this.genislik = genislik;
        this.yukseklik = yukseklik;
        this.ekranBuyukñlugiu = ekranBuyuklugu;//yukardaki genislik yukseklik soluktu this yazinca renklendi
    }

    public double kanalDegistirme(int kanal) {//caselerle kanallari degistirebilecegiz
        switch (kanal) {
            case 1:
                return 34.75;
            case 2:
                return 45.23;
            case 3:
                return 50.89;//return yaptik cunku double birsey dondurmesi icin
        }
        return 0;

    }

    public void gucDugmesi() {
        this.guc = !guc;
    }

    public int sesAzaltma(){



    if(0<ses)
        ses--;

    return ses;
            }
       public int sesArttirma() {
           if (maxSes > ses) {
               ses++;
           }
               return ses;
           }

       }




