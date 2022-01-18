package es.alns;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int n;
        Scanner entrada = new Scanner (System.in);

        System.out.println("Dame un número");
        n = entrada.nextInt();

        for (int i = 0; i < n; i++) {
            sum += (i + 1);

        }

        System.out.println("Resultado: " + sum);
    }
}