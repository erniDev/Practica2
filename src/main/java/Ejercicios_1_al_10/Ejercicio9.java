package Ejercicios_1_al_10;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        /*
        Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio
        final con IVA. El IVA sera una constante que sera del 21%.
        */
        final Float IVA = 0.21F;
        double precioProducto, iva, precio;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el precio del producto");

        precioProducto= sc.nextDouble();

        iva = IVA * precioProducto;
        precio = iva + precioProducto;

        System.out.println("El precio del preoducto con iva es de: "+ precio);
    }
}
