import java.util.Scanner;

public class practicar {

    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6};
        array[1] = 22;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero = teclado.nextInt();

        int posicion = buscarPosicion(array, numero);

        if (posicion != -1) {
            System.out.println("El número está en la posición: " + posicion);
        } else {
            System.out.println("El número NO está en el array.");
        }
    }

    // ✅ Este método debe estar FUERA del main
    public static int buscarPosicion(int[] array, int valorBuscado) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valorBuscado) {
                return i;
            }
        }
        return -1;
    }
}
