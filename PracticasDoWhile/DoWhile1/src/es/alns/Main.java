package es.alns;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int i = 0;
        int n = 0;
        Scanner entrada = new Scanner(System.in);

        do{
            n += i;
            System.out.println("Dame un numero");
                    i = entrada.nextInt();
        }while (i >= 0);
System.out.println(n);
        }
    }

