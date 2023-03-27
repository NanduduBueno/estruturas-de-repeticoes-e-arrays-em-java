package projectArray;

import java.util.Random;
import java.util.Scanner;

public class numerosAleatorios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random random = new Random();

        int[] numerosAleatorios = new int [20];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        System.out.print("Números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }
        System.out.print("\nSucessores dos números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + 1 + " ");
        }
            System.out.print("\nAntecessores dos números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero -1 + " ");
        }
    }
}
