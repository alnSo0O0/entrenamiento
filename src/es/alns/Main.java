package es.alns;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char letra;
        String texto;
        int contador = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe una frase (intro para terminar): ");
        texto = entrada.nextLine();
        System.out.println("dime una letra: ");
        letra = entrada.nextLine().charAt(0);

        for (int i = 0; i < texto.length(); i++) {
            if (texto.toLowerCase().charAt(i) == letra) {
                contador++;

            }
        }
        System.out.println("Número de veces que aparece el carácter " + letra + " : " + contador );

    }
}