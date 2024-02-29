package tombkeveres;

import java.util.Random;
import java.util.Scanner;

public class Feladatok {

    static Random rnd = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int db;
        do {
            System.out.print("Hányszor szeretnél dobni?: ");
            db = sc.nextInt();
        } while (db < 0 || db == 0);

        final int KOCKAOLDAL = 6;
        int[] dobasok = new int[db];
        for (int i = 0; i < db; i++) {
            int dobas = rnd.nextInt(1, KOCKAOLDAL + 1);
            dobasok[i] = dobas;
        }
        for (int i = 1; i <= KOCKAOLDAL; i++) {
            int ossz = 0;
            for (int j = 0; j < db; j++) {
                if (i == dobasok[j]) {
                    ossz++;
                }
            }
            System.out.printf("%d volt %3d db\n", i, ossz);
        }
    }
}
