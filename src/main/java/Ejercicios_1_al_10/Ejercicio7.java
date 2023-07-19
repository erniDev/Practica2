package Ejercicios_1_al_10;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        /*
            Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII.
            Por ejemplo: si introduzco un 97, me muestre una a.
        */
        int numero;
        char cartacter;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite numero para saber cual es el caracter");
        numero = sc.nextInt();

        cartacter = (char)numero;

        System.out.println("El caracter es: " +cartacter);

    }
}
