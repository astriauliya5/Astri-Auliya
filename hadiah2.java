// genap ganjil
import java.util.Scanner;
public class hadiah2 {
    public static void main(String[] args) {
       //membuat variabel dengan array
       long[] bilangan={1, 2, 3,  6, 8, 24, 26, 288, 857235, 238, 9709186, 3528037, 5235, 2836, 5723, 568, 
       923650, 2365, 32589, 6209, 867203, 7650, 235, 23, 23857, 206, 98, 27049, 8732535, 283572, 9385};
       System.out.print("Bilangan Genap :");
        //mengambil data array dengan perulangan for
        for(int i=0; i<bilangan.length; i++){
            //jika data array bilangan habis dibagi 2 = 0
            if(bilangan[i]% 2 ==0){
                System.out.print(bilangan[i] + " ");
            }
        }
        System.out.println("");
        System.out.print("Bilangan ganjil :");
        for(int i=0; i<bilangan.length; i++){
            //jika data array bilangan tidak habis dibagi 2 = 0
            if(bilangan[i] % 2!=0){
                System.out.print(bilangan[i] +" ");   
            }
        }
        System.out.println("");
    }
}
