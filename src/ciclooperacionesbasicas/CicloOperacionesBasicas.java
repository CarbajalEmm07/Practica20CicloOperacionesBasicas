/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclooperacionesbasicas;

import java.util.Scanner;

/**
 *
 * @author SAC2-5
 */
public class CicloOperacionesBasicas {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("------ Menú ------");
            System.out.println("1. Realizar suma.");
            System.out.println("2. Realizar resta.");
            System.out.println("3. Realizar multiplicación.");
            System.out.println("4. Realizar división.");
            System.out.println("5. Salir.");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarSuma(scanner);
                    break;
                case 2:
                    realizarResta(scanner);
                    break;
                case 3:
                    realizarMultiplicacion(scanner);
                    break;
                case 4:
                    realizarDivision(scanner);
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            System.out.println();
        } while (opcion != 5);
    }

    public static void realizarSuma(Scanner scanner) {
        System.out.print("Ingrese la cantidad de números a sumar: ");
        int cantidadNumeros = scanner.nextInt();

        double suma = 0;

        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double numero = scanner.nextDouble();
            suma += numero;
        }

        System.out.println("Operación: Suma");
        System.out.println("Números ingresados: " + cantidadNumeros);
        System.out.println("Resultado: " + String.format("%.2f", suma));
    }

    public static void realizarResta(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        double resta = numero1 - numero2;

        System.out.println("Operación: Resta");
        System.out.println("Números ingresados: " + numero1 + ", " + numero2);
        System.out.println("Resultado: " + String.format("%.2f", resta));
    }

    public static void realizarMultiplicacion(Scanner scanner) {
        System.out.print("Ingrese la cantidad de números a multiplicar: ");
        int cantidadNumeros = scanner.nextInt();

        double multiplicacion = 1;

        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double numero = scanner.nextDouble();
            multiplicacion *= numero;
        }

        System.out.println("Operación: Multiplicación");
        System.out.println("Números ingresados: " + cantidadNumeros);
        System.out.println("Resultado: " + String.format("%.2f", multiplicacion));
    }

    public static void realizarDivision(Scanner scanner) {
        System.out.print("Ingrese el dividendo: ");
        double dividendo = scanner.nextDouble();
        System.out.print("Ingrese el divisor: ");
        double divisor = scanner.nextDouble();

        if (divisor == 0) {
            System.out.println("Error: no se puede dividir entre cero.");
        } else {
            double division = dividendo / divisor;

            System.out.println("Operación: División");
            System.out.println("Números ingresados: " + dividendo + ", " + divisor);
System.out.println("Resultado: " + String.format("%.2f", division));
}
}    
}

