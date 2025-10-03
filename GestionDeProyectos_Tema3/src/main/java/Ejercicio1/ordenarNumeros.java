package Ejercicio1;

import java.util.*;

public class ordenarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        while (scanner.hasNextInt()) {
            numeros.add(scanner.nextInt());
        }

        Collections.sort(numeros);
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
