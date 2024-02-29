package tombkeveres;

import java.util.Random;
import java.util.Scanner;

public class FeladatokJobbMegoldas {

    static Random rnd = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int db;
        do {
            System.out.print("Hányszor szeretnél dobni?: ");
            db = sc.nextInt();
        } while (db < 0 || db == 0);

        final int OLDAL = 7;
        int[] dobasokTomb = new int[OLDAL];

        for (int i = 0; i < db; i++) {
            int szam = rnd.nextInt(1, OLDAL);
            dobasokTomb[szam]++;
        }

        for (int i = 1; i < OLDAL; i++) {
            System.out.printf("%d volt %3d db\n", i, dobasokTomb[i]);
        }

    }
}
