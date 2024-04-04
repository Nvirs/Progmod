package Blokk1;

import java.util.Random;

public class lekisebb_sum {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] tomb = new int[50];
        for (int i = 0; i < tomb.length; i++)
        {
            tomb[i] = rnd.nextInt(10, 200);
        }
       for (int i = 0; i < tomb.length; i++) {System.out.print(tomb[i] + " ");}
        System.out.println();
        //Legkisebb szam keresese
        int smallest = tomb[0];
        for (int j = 0; j < tomb.length; j++) {
           if (tomb[j] < smallest){
               smallest = tomb[j];
           }
        }
        System.out.println("A legkisebb szám: " + smallest);
        //Tomb elemei osszeadasa
        int sum = 0;
        for (int k = 0; k < tomb.length; k++) {
           sum = sum + tomb[k];
        }
        System.out.println("A tömb elemeinek az összege: " + sum);
    }
}
