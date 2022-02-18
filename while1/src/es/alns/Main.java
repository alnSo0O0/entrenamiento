package es.alns;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n;
        int sum = 0;

        System.out.println("Dame un número");
        n = entrada.nextInt();

        while (n >= 0) {
            sum += n;

            System.out.println("Dame un número");
            n = entrada.nextInt();


        }
        System.out.println("Suma : " +sum);
    }
}
