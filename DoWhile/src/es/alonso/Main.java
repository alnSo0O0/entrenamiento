package es.alonso;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Dame 1 nº ");
            i = entrada.nextInt();
        } while (i >= 0);


    }
}