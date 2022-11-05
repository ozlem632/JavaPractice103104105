package day10_arrays;

public class C02_Arrays {

    //Asagidaki multi dimensional arraylerin ic arraylerinde ayni indexe sahip elemanlarinin toplamini yazdiran programi yaziniz


    public static void main(String[] args) {


        int sinir =0;
        int toplam = 0;
        int arr1[][]= {{1,2},{3,4,5}};//kuculttum daha zor olsun diye.soruda esitlik var ama eger esit olmazsa

        int arr2[][]= {{7,8,9},{10,11},{12}};
        if(arr1.length<=arr2.length){
            for(int i = 0; i<arr1.length; i++){// kisa olani tercih ettim.once dis katlar
                sinir=arr1[i].length;

            }
            for(int j =0; j<sinir;j++);


        }

    }

}
