package Ejercicio1;

import java.util.Random;

public class aleatorios {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 40; i++) {
            System.out.print(rand.nextInt(101) + " ");
        }
    }
}
