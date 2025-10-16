import java.util.Scanner;

public class Array {

    public static void main(String[] args) throws Exception {
        // //Array estatico
        // int edad;
        // double notaProg;
        // double notaBD;
        // double notaLMGSI;

        // double[] calificaciones={2,4,5,6,8,1};
        // System.out.println(calificaciones[3]);

        //Array dinámico
        double[] calificaciones2;
        System.out.println("Indica el tamaño del array dinámico");
        Scanner teclado=new Scanner(System.in);
        calificaciones2=new double[teclado.nextInt()];

        // Arrays que apuntan al mismo sitio
        // double [] calificacionesOtro;
        // calificacionesOtro=calificaciones;
        // System.out.println(calificaciones[3]);
        // calificaciones=null;
        // calificacionesOtro=null;
        // System.out.println(calificacionesOtro[3]);

        // //Imprime la posicion 1
        // imprimeArray(calificaciones);
        // double[] resultado=devolverArray(calificaciones);
        // System.out.println(resultado[1]);

        //Matrices
        String[][] comidas={{"arroz", "manzana", "conejo"}, {"verdura", "pollo", "fresa"},{"pechuga", "fideos", "lechuga"}};
        System.out.println(comidas[0][2]);
        String[] aux=comidas[1];
        System.out.println("Matriz: "+comidas[1][2]);
        System.out.println("Vector; "+aux[2]);

        //Usar la memoria dinámica reservada
        calificaciones2[3]=5;
        System.out.println(calificaciones2[3]);
        System.out.println(calificaciones2[1]);
        
        //Recorrer un vector
        int[] vector={1,2,3,4};
        for(int i=vector.length-1; i>=0; i--){
            System.out.println(vector[i]+"");
        }

        //Realizar una copia de un array
        int[] vector2={3,6,8,9,11,33};
        int[] copiavector= new int[vector.length];
        for(int i=0;i<vector2.length;i++){
            copiavector[i]=vector2[i];
        }
        for (int i=0;i<vector2.length;i++){
            System.out.print(vector2);
        }

        //Insertar un vector mas
        int[] vectorPrueba={1,2,3};
        int[] vectorFinal={1,2,3,4};
        System.out.println(vectorPrueba.length);

        //Primero: Reserva memoria para un elemento mas
        vectorFinal=new int[vectorPrueba.length+1];
        for (int i=0;i<vectorPrueba.length;i++){
            vectorFinal[i]=vectorPrueba[i];
        }

        vectorFinal[vectorPrueba.length]=40;
        for (int i=0;i<vectorFinal.length;i++){
            System.out.println(vectorFinal[i]+" ");
        }

    }
}
   
