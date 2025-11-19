import java.util.Scanner;

public class practicar {

    public static void main(String[] args) {
    int[] array1 = {3, 4, 5, 6};
    int[] array2 = {7, 8, 9, 10};

    int max1 = array1[0];
    for (int i = 1; i < array1.length; i++) {
        if (array1[i] > max1) {
            max1 = array1[i];
        }
    }

    int max2 = array2[0];
    for (int j = 1; j < array2.length; j++) {
        if (array2[j] > max2) {
            max2 = array2[j];
        }
    }

    // Mostrar los máximos
    System.out.println("Máximo de array1: " + max1);
    System.out.println("Máximo de array2: " + max2);

    // Comparar ambos
    if (max1 > max2) {
        System.out.println("El número más grande es: " + max1);
    } else if (max2 > max1) {
        System.out.println("El número más grande es: " + max2);
    } else {
        System.out.println("Ambos arrays tienen el mismo número máximo: " + max1);
    }
}
}
