package main;

import utils.Operaciones;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Calculadora simple en Java");
        System.out.println("2 + 3 = " + Operaciones.sumar(2, 3));
        System.out.println("5 - 2 = " + Operaciones.restar(5, 2));
    }
}
