package ejercicio_3;

import java.util.Scanner;

/**
 * 3. Recoger por teclado dos numeros que introduzca el usuario, sumarlos y
 * mostrar el resultado por pantalla.
 *
 */
public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1;
        int numero2;
        int resultado;

        System.out.print("Introduzca el primer número: ");
        numero1 = teclado.nextInt();
        System.out.print("Introduzca el segundo número: ");
        numero2 = teclado.nextInt();
        resultado = numero1 + numero2;
        System.out.println("El resultado es: " + resultado);
    }

}
