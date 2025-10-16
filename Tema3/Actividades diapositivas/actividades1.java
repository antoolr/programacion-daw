import java.util.Scanner;
import java.math.*;
public class actividades1 {
    public static void imprimeMatriz(int[][] matriz){
        for(int i=0;i<matriz.length;i++);
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]);
            }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Actividad 1
        
        //Actividad 2

        //Actividad 3
        
        //Vamos a solicitar filas y columnas
        System.out.println("Introduzca filas:");
        int filas=teclado.nextInt();
        System.out.println("Introduzca columnas:");
        int columnas = teclado.nextInt();

        //Generar la matriz dinámica
        int[][] matriz = new int[filas][columnas];
        for (int i=0;i<filas;i++){
            for (int j=0;i<columnas;j++){
                matriz[i][j]=(int)(Math.random()*10)+1;
                
        }
    }
        //Imprimir matriz
        imprimeMatriz(matriz);

        //Suma de los elementos de cada fila
        int[] resultadoFila = new int[filas];
        int[] resultadoColumna = new int[columnas];

        //Recorrer por filas
        for(int i=0;i<filas;i++){
            int total = 0;
            for(int j=0;j<columnas;j++) {
                total=total+matriz[i][j];

                resultadoFila[i]=total;

            }
        }

        //Mostrar la suma
        for(int i=0;i<filas;i++){
            System.out.println(resultadoFila[i]);
        }

        //Recorrer por columnas
        for(int i=0;i<columnas;j++){
            int total=0;
            for(int j=0;j<filas;j++){
                total=total+matriz[j][i];
            }
        }

    }
}
