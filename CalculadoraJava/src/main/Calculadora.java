package main;

import java.util.Scanner;
import utils.Operaciones;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora básica en Java");
        System.out.println("Elige una operación:");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");

        int opcion = scanner.nextInt();

        System.out.print("Introduce el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int b = scanner.nextInt();

        int resultado = 0;

        switch (opcion) {
            case 1:
                resultado = Operaciones.sumar(a, b);
                break;
            case 2:
                resultado = Operaciones.restar(a, b);
                break;
            case 3:
                resultado = Operaciones.multiplicar(a, b);
                break;
            case 4:
                resultado = Operaciones.dividir(a, b);
                break;
            default:
                System.out.println("Opción inválida");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
}
