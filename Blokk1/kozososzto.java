package Blokk1;
import java.util.ArrayList;

public class kozososzto {
    public static ArrayList<Integer> FindKozosOsztok(int num1, int num2) {
        ArrayList<Integer> kozosOsztoi = new ArrayList<>();

        
        int minNum = Math.min(num1, num2);

      
        for (int i = 1; i <= minNum; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                kozosOsztoi.add(i);
            }
        }

        return kozosOsztoi;
    }

    public static void main(String[] args) {
        int number1 = 24;
        int number2 = 36;

        ArrayList<Integer> kozosOsztoi = FindKozosOsztok(number1, number2);

        System.out.println("A közös osztók a következők " + number1 + " és " + number2);
        for (int osztok : kozosOsztoi) {
            System.out.print(osztok + " ");
        }
    }
}

