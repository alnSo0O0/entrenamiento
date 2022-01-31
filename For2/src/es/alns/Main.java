package es.alns;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;
        int sum = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dame un número: ");
        n = entrada.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum++;
                System.out.println(sum);
            }

        }
        if (sum <= 2) {
            System.out.println("El número " + n + " es primo");
        } else {
            System.out.println("El número " + n + " no es primo");

        }
    }
}