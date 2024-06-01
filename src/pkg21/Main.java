package pkg21;

import java.util.Random;

public class Main {
    
    private static int[] lapokJ = new int[10];
    private static int[] lapokG = new int[10];
    static Random rnd = new Random();
    static int osszeg = 0;

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
        ElsoLapok();           
        konzolraIr("A gép lapjai: ");
        kiirTomb(lapokG);   
        konzolraIr("A játékos lapjai: ");
        kiirTomb(lapokJ);  
    }

    private static void ElsoLapok() {
        GLapjai();
        while(osszegzes(lapokG) < 17){
            lapok(lapokG);
        }
    }
    
    private static void GLapjai() {
        
    }
    
    private static int[] lapok(int[] tomb) {
        for (int i = 0; i < tomb.length; i++) {
            if(tomb[i] == 0){
                tomb[i] = rnd.nextInt(2, 11);
            }else{ i++; }
        }
        return tomb;
    }
    
    private static int osszegzes(int[] tomb){
        int osszeg = 0;
        for (int i = 0; i < tomb.length; i++) {
            osszeg += tomb[i];
        }
        return osszeg;
    }
    
    private static void ujabbHuzas() {
        
    }
    
    private static void kiirTomb(int[] tomb) {
        for (int i = 0; i < tomb.length; i++) {
            if ((tomb[i] != 0)) {
                System.out.print(tomb[i] + " ");
            }
        }
        System.out.println("");
    }   
    
}
