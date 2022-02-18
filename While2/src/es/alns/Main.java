package es.alns;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner entrada = new Scanner (System.in);

        System.out.println("Dame un numerito");
        n = entrada.nextInt();

        while (n < 0) {
            System.out.println("el numero q me as dao es -");
            System.out.println("Dame 1 numerito +");
            n = entrada.nextInt();
        }
        System.out.println("el numero es +");
    }
}
