import java.util.Scanner;

public class Actividades5 {
    final static double PI= 3.14159;
    public static void main(String[] args) {
        //Actividad 1 funciones diapositivas
        //Leer de teclado la altura y el radio
        Scanner teclado = new Scanner(System.in);

        double altura;
        double radio;

        //Leer parametros
        System.out.println("Escribe la altura del cilindro");
        altura = Double.parseDouble(teclado.nextLine());
        System.out.println("Escribe el radio del cilindro");
        radio = Double.parseDouble(teclado.nextLine());
        imprimeCilindro(altura, radio);

       
    }
    public static void imprimeCilindro(double altura, double radio){
        System.out.println("El area del cilindro es: "+(altura*radio*PI));
        System.out.println("El volumen del cilindro es: "+(altura*radio*PI));
    

        //Actividad 2 funciones diapositivas
        //Leer los numeros entre 1 y 20 y saber cuales son divisibles por 3 y cuales son pares
        
    }
}
