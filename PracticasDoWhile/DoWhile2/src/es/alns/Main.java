package es.alns;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i;
        Scanner entrada = new Scanner(System.in);
for (int n = 0; n < 5; n++) {

    do {
        System.out.print("Dame un numero: ");
        i = entrada.nextInt();
        System.out.println("Numero " +n+ " : " + i);
    } while (i < 0);
    System.out.println("El numero que me has dado es " + i);
}
        }

    }
