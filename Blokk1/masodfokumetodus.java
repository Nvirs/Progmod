package Blokk1;

import java.util.Scanner;

public class masodfokumetodus {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a paramétereket: ");
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();
        mfmegoldo(a,b,c);
    }
   public static void mfmegoldo(double a, double b, double c){
        double det = Math.pow(b, 2) -(4 * a * c);
        if (det < 0){
            System.out.println("Nincs megoldás");
            return;
        }else {
            double det2 = Math.sqrt(det);
            double x1 = (-b + det2) / (2 * a);
            double x2 = (-b - det2) / (2 * a);
            System.out.print("Az első megoldás: " + x1);
            System.out.println();
            System.out.print("A második megoldás megoldás: " + x2);
            if (x1 == x2) System.out.print("A két megoldás egyenlő");
        }
   }
}
