package tombkeveres;

import java.util.Random;

public class TombKeveres {

    static Random rnd = new Random();

    public static void main(String[] args) {
        final int M = 9;
        char[] betuk = new char[M];

        for (int i = 0; i < M; i++) {
            char betu = (char) (i + 97);
            betuk[i] = betu;
        }

        int[] sorrend = new int[M];

        for (int i = 0; i < M; i++) {
            sorrend[i] = i;
        }

        for (int i = 0; i < M; i++) {
            int szam = rnd.nextInt(0, 9);
            
            int ideiglenes = sorrend[i];
            sorrend[i] = sorrend[szam];
            sorrend[szam] = ideiglenes;
        }

        for (int i = 0; i < M; i++) {
            if (i != 0 && i % 3 == 0) {
                System.out.println("");
            }
            System.out.print(betuk[sorrend[i]] + " ");
        }
        System.out.println("");
    }

}
