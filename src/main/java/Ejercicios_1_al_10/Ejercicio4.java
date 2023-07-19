package Ejercicios_1_al_10;

import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {
    /*
        Modifica la aplicación anterior, para que nos pida el nombre
        que queremos introducir (recuerda usar JOptionPane).
    */
        String nombre;
        nombre = JOptionPane.showInputDialog("Digite su nombre");
        System.out.println("bienvenido " + nombre);
    }
}
