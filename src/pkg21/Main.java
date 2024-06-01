package pkg21;

import java.util.Random;

public class Main {
    
    private static int[] lapokJ = new int[10];
    private static int[] lapokG = new int[10];
    static Random rnd = new Random();

    public static void main(String[] args) {
        konzolraIr("");
        jatek();
    }    

    private static void konzolraIr(String kimenet) {
        System.out.print(kimenet);
    }

    private static void jatek() {
        jatekeleje();
        
    }

    private static void jatekeleje() {
        konzolraIr("A játékos lapjai: ");
        Elso2Lap();
              
    }

    private static void Elso2Lap() {
        lapok(lapokJ,2);
        lapok(lapokG,2);
    }
    
    private static int[] lapok(int[] tomb, int db) {
        for (int i = 0; i < db; i++) {
            tomb[i] = rnd.nextInt(2, 11);
        }
        return tomb;
    }
}
