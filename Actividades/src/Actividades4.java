import java.util.Random;
import java.util.Scanner;

public class Actividades4 {

    public static void main (String[] args){
    
        Scanner teclado = new Scanner(System.in);

        int suma=0;
        int mayores_edad=0;
        int contador=0;
        int edad=0;

        do {
            System.out.print("Introduce la edad del alumno (-1 para salir): ");
            edad = teclado.nextInt();

            if (edad != -1) {
                suma += edad;             // acumulamos la edad
                contador++;               // contamos un alumno más
                if (edad >= 18) {
                    mayores_edad++;            // contamos mayores de edad
                }
            }
        } while (edad != -1);

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("Suma: " + suma);
            System.out.println("Número de alumnos: " + contador);
            System.out.println("Media: " + media);
            System.out.println("Mayores de edad: " + mayores_edad);
        } else {
            System.out.println("No se introdujeron alumnos.");
        }


        // Ejercicio 5
        Random rand = new Random(); // Para generar el número aleatorio

        int numeroSecreto = rand.nextInt(100) + 1; // Número entre 1 y 100
        int intento; // Número que introduce el usuario
        int contador_intentos = 0; // Número de intentos

        System.out.println("Adivina el número entre 1 y 100:");

        while (true) { // Bucle que se repite hasta acertar
            System.out.print("Introduce tu número: ");
            intento = teclado.nextInt(); // Leer el número del usuario
            contador++; // Contar el intento justo después de introducir el número

            if (intento < numeroSecreto) {
                System.out.println("Demasiado bajo.");
            } else if (intento > numeroSecreto) {
                System.out.println("Demasiado alto.");
            } else {
                System.out.println("¡Correcto! Lo adivinaste en " + contador + " intentos.");
                break; // Salimos del bucle porque ya acertó
            }
        }

        

        //Ejercicio 6
        int opcion; // Guarda la operación elegida
        double num1, num2; // Los numeros que vamos a usar

        do {
            System.out.println("Elige una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("Introduce -1 para salir.");
            opcion = teclado.nextInt(); // Lee la opción

            if (opcion == -1) {
                System.out.println("Saliendo de la calculadora...");
                break; // Sale del bucle si el usuario pone -1
            }

            System.out.print("Introduce el primer número: ");
            num1 = teclado.nextDouble(); // Primer número

            System.out.print("Introduce el segundo número: ");
            num2 = teclado.nextDouble(); // Segundo número

            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("No se puede dividir entre cero.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (true); // El bucle se repite hasta que el usuario pone -1

         teclado.close();
    }
}
        
    


