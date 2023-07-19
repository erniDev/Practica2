package Ejercicios_1_al_10;

import javax.swing.*;
public class Ejercicio5 {
    public static void main(String[] args) {
    /*
        Haz una aplicación que calcule el área de un círculo(pi*R2).
        El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
        Usa la constante PI y el método pow de Math.
    */
        int radio;
        double area;
        radio = Integer.parseInt(JOptionPane.showInputDialog("Digite el radio del circulo"));
        area = Math.PI * Math.pow(radio, 2);

        System.out.println("El area del circulo es: "+ area);
    }
}
