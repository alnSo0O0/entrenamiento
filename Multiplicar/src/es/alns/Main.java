package es.alns;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i;
        int n = 1;
        int resultado;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Que tabla de multiplicar quieres saber?");
        i = entrada.nextInt();

        while( n <= 10 ){
            resultado = i * n;
            System.out.println(i + " x " + n + " = " + resultado);
            n++;
        }
    }
}
