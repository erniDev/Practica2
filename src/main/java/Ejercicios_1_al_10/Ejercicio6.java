package Ejercicios_1_al_10;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        /*
        Lee un número por teclado e indica si es divisible entre 2 (resto = 0).
         Si no lo es, también debemos indicarlo.
        */
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un numero");
        numero = sc.nextInt();

        if (numero % 2 == 0){
            System.out.println("El numero "+ numero + " es divisiblen entre 2");
        }else {
            System.out.println("El numero "+ numero + " no es divisiblen entre 2");
        }

    }
}
