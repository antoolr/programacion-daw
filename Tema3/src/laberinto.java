
public class laberinto {
    public static void main(String[] args) {
        final int incio=0;
        final int fila=7;
        final int columna=8;
        


       char[][] laberinto = {
            {'0', '0', '0', '0','0', '0', '0', '0'},
            {'0', '0', '#', '0','0', '0', '0', '0'},
            {'0', '0', '0', '0','#', '0', '0', '0'},
            {'0', '0', '0', '0','0', '0', '0', '#'},
            {'#', '0', '0', '0','0', '0', '0', '0'},
            {'0', '0', '0', '0','#', '0', '0', '0'},
            {'0', '#', '0', '0','0', '0', '0', '0'},
            {'0', '0', '0', '0','0', '0', '#', '0'}
        };  
        System.out.println("laberinto:");
         for (int i = 0; i < laberinto.length; i++) {
            for (int j = 0; j < laberinto[i].length; j++) {
                System.out.print(laberinto[i][j] + " ");
            }
            System.out.println();
        for (int j = 0; j < laberinto.length; j++) {
                if (laberinto[i][j] == '#') {
                    System.out.println("Pared encontrada en la posición: (" + i + ", " + j + ")");
                }
            }
        }

    }
}

