public class Condicional {
    public static void main (String[] args) {

        int user = 30;
        if (user <=18) {
            System.out.println("User es muy joven");
        }
        else if (user > 18 && user <40) {
            System.out.println("User está entre 19 y 39 años");
        }
        else if (user == 45 || user == 50) {
            System.out.println("User esta entre 45 y 50 años");
        }
        else {
            System.out.println("User tiene 40 años");
        }
           int numero=6;
            if (numero%2==0 && numero%3 == 0){
                System.out.println("El numero "+numero+" Es divisible por 2 y por 3");
             } 
             else {
            System.out.println("El numero "+numero+" no es divisible por 2 y 3");
        }
    }
}


            //Comprobar si un numero es divisible entre 2 o 3
            //Si numero %2 es 0 y numero%3 es 0 entonces
            //Sino
            // escribir no es divisible por 2 y 3
            // Fin_si
            



        
    
