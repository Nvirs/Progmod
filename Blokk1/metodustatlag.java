package Blokk1;
import java.math.*;
public class metodustatlag {
    public static void main(String[] args) {
        int[] tomb = new int [10];
        int veletlenSzam;
        for (int i = 0; i < tomb.length; i++) {
            veletlenSzam = (int)(Math.random()*100);
            tomb[i] = veletlenSzam;
            System.out.print(tomb[i] + " ");
        }
        System.out.println();
        System.out.println("A tomb elemeinek osszege: "+osszegtomb(tomb));
        System.out.println("A tomb elemeinek atlaga: "+atlagszamitas(tomb));

    }
    public static int osszegtomb(int[] tomb){
        int osszeg = 0;
        for(int i = 0; i < tomb.length; i++){
            osszeg += tomb[i];
        }
        return osszeg;
    }
    public static double atlagszamitas(int[] tomb){
        return (double)osszegtomb(tomb) / tomb.length;
    }
}
