package Ejercicios_1_al_10;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        /*
            Modifica el ejercicio anterior, para que en lugar de pedir un número,
            pida un carácter (char) y muestre su código en la tabla ASCII.
        */

        String cartac;
        int numero;
        char cartacter;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite el caracter para saber cual es el numero");
        cartac = sc.nextLine();

        cartacter = cartac.charAt(0);
        numero = (int)cartacter;

        System.out.println("El caracter es: " +numero);
    }
}
