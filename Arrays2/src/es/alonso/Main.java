package es.alonso;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int [] elementos = new int[10];
    int numero, repetidos = 0;
        Scanner entrada = new Scanner(System.in);
System.out.println("Cagando numeros....");
        for (int i = 0; i < elementos.length; i++){
            elementos[i] = (int) (Math.random() *10) +1;
        }
        System.out.println();

        System.out.print("Escribe un numero: ");
        numero = entrada.nextInt();

        for (int i = 0; i < elementos.length; i++){
            if (elementos [i] == numero){
                repetidos++;
            }
        }
        if (repetidos == 1){
            System.out.println("el numeor " +numero+ " seta repetido una cves");
        }else{
            System.out.println("el numero " +numero+ " esta repartio " + repetidos+ " veses");
        }
        for (int elemento : elementos){
            System.out.print(elemento + " ");
        }
    }
}
