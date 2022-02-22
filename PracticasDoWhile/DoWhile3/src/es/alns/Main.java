package es.alns;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner entrada = new Scanner(System.in);

        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println("numero " + i + ":");
            System.out.println("------------");

            do {
                System.out.println("dame 1 numero del 1-100");
                n = entrada.nextInt();
            } while (n < 1 || n > 100);
            System.out.println();
        }
    }
}
