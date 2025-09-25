public class EntradaSalida {
    public static void main (String[] args){
            //Instrucciones de salida por pantalla
            int valor=9;
            System.out.println(valor);

            //Usar printf
            double precio=13.38587;
            System.out.printf("El precio del producto %s tiene un valor de %5.2f y se han comprado %d", "", precio, valor);


            // Incluir un icono
            System.out.println(" Que ganas tengo de unas vacaciones \u26F1");

            //Formato reciente
            System.out.println("El precio del producto "+"Tablet "+"tiene un valor de "+precio+" y se han comprado "+valor+"");

            //Formato salida texto
            System.out.printf("%10s, %-10s", "Domingo", "Informático");

            //Formato tabla
            System.out.println();
            System.out.println("|---------|----------|---------|");
            System.out.printf("|%-10s|%-10s|%-10s|\n", "Producto","Cantidad","Valor");
            System.out.println("|---------|----------|---------|");
            System.out.printf("|%-10s|%d     |%f   |\n", "Producto",10,3.5);
            System.out.println("|---------|----------|---------|");



            System.out.println("|---------|----------|---------|");
            System.out.println("|"+"Producto"+"  |"+"Cantidad"+"  |"+"Precio"+"   |");
            System.out.println("|---------|----------|-----------|");
            System.out.printf("|%-10s|%d     |%f   |\n", "Producto",10,3.5);
            System.out.println("|---------|----------|-----------|");
 

        }
}
