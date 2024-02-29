package tombkeveres;

import java.util.Random;
import java.util.Scanner;

public class KetKocka {

    static Random rnd = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int db;
        do {
            System.out.print("Hányszor szeretnél dobni?: ");
            db = sc.nextInt();
        } while (db < 0 || db == 0);

        final int DB = 13;
        int[] dobasLehetosegek = new int[DB];

        for (int i = 0; i < db; i++) {
            int dobas = rnd.nextInt(2, DB);
            dobasLehetosegek[dobas]++;
        }
        for (int i = 0; i < DB; i++) {
            System.out.print(dobasLehetosegek[i] + " ");
        }
    }
}
