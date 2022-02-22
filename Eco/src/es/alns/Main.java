package es.alns;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String i;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribeme algo");
        i = entrada.nextLine();

        while (!i.equals("salir")) {
            System.out.println(i);

            System.out.println("Escribeme algo o escribe 'salir' para salir");
            i = entrada.nextLine();
        }
    }
}