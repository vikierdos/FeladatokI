
package feladatoki;

import java.util.Random;
import java.util.Scanner;

public class FeladatokI {
    static Random randomszam = new Random();
    static Scanner sc = new Scanner(System.in, "latin2");
    public static void main(String[] args) {
//        1.
        int szam = randomszam.nextInt(3,11);
        System.out.println(szam);
//        2.
        System.out.println("Adj meg egy betűt: ");
        String betu = sc.nextLine();
//        3.
        while (betu.length() > 1) {            
            System.out.println("Hiba! Csak egy betűt írj be: ");
            betu = sc.nextLine();
        }
//        4.
        for (int i = 0; i < szam-1; i++) {
            System.out.printf("%s, ", betu);
        }
        System.out.printf("%s\n",betu);
//        5.
        double[] valos = new double[5];
        valos[0] = Math.PI;
        valos[1] = Math.E;
        for (int i = 0; i < 5; i++) {
            System.out.println(valos[i]);
        }
//        6.
        valos[2] = (1.0/3);
        for (int i = 0; i < 5; i++) {
            if (valos[i] > 0) {
                System.out.println(valos[i]);
            }
            
        }
//        7.
        for (int i = 3; i < 5; i++) {
            double random = randomszam.nextDouble(10.1, 19.5);
            valos[i] = random;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(valos[i]);
        }
        
    }
    
}
