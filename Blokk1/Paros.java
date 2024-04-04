package Blokk1;

import java.util.Random;

public class Paros {
    public static void main(String[] args) {
        int[] tomb = new int[50];
        Random rnd = new Random();
        //Tomb inicializalasa
        for (int i = 0; i < tomb.length; i++) {
        tomb[i] = rnd.nextInt(100);
        }
        for (int i = 0; i < tomb.length; i++) {
            System.out.printf(tomb[i] + " ");

        }
        System.out.println();
        //Páros számok
        for (int k = 0; k < tomb.length; k++) {
            if (tomb[k] % 2 == 0){
                System.out.printf(tomb[k]+ " ");
            }
        }




    }
}
