import java.util.Arrays;
import java.util.Scanner;

public class practicar {

    public static void main(String[] args) {
    int[] array = {3, 1, 5, 7, 31, 54, 75, 89, 80, 69 };


        int[] invertido = new int[array.length];

for (int i = 0; i < array.length; i++) {
    invertido[i] = array[array.length - 1 - i];
}

System.out.println(Arrays.toString(invertido));

        

}


    }

    


