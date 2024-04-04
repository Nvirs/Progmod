package Blokk1;

public class karakterelofordulasa {
    public static void main(String[] args) {
        String input = "adklajljhaaxacaaxca";
        char karakter = 'j';
        int elofordulas = karakterszamlalo(input,karakter);
        System.out.println("Ez a karakter: " + karakter + " ennyiszer előfordul: " + elofordulas);

    }
    public static int karakterszamlalo(String str,char c){
        int szamalalo = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c){
                szamalalo++;
            }
        }
        return szamalalo;

    }
}
