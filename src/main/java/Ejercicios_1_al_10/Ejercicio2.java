package Ejercicios_1_al_10;

public class Ejercicio2 {
    public static void main(String[] args) {
    /*
         Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
         Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.
    */
        int num1 = 2, num2 = 2;

        if (num1 < num2){
            System.out.println("El numero mayor es: " + num2);
        } else if (num1 > num2) {
            System.out.println("El numero mayor es: " + num1);
        } else {
            System.out.println("Los dos numeros son iguales");

        }
    }
}
