package es.alns;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum = 1;
        int n;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame un número: ");
            n = entrada.nextInt();

            for(int i = 1; i <= n; i++) {
                sum *= i;
            }
        System.out.println("Factorial: " + sum);
    }
}
