public class Actividades6 {
    
    public static int numeroDigitos(int n){
            int contador=0;
        while(n>0){
            n=n/10;
            contador++;
        }
        return contador;
    }

    public static int numeroDigitosRecurisvo(int n){
        if(n>=0 && n<10) { //Caso base
            return 1;
        }
        else{
            return 1+numeroDigitosRecurisvo(n/10);
        }
        }
    
    public static void main(String[] args) {
        int numero=392434235;
        System.out.println(numeroDigitosRecurisvo(numero));

        System.out.println(potencia(6,0));
    }


        //Ejercicio 2
        public static int sumaNumeros(int n){
            int suma=0;
            for(int i=1;i<=n;i++){
                suma+=i;

            }
            return suma;
        }
        public static int sumaNumerosRecursivo(int n){
            if(n==1){
                return 1;
        }
        else {
            return n+sumaNumerosRecursivo(n-1);
        }
        }
        
        //Ejercicio 3

        public static int potencia(int base, int exponente){
            //Caso base
            if(exponente==0) return 1;
            else return base*potencia(base,exponente-1);

            
        }

        
        //Ejercicio 4
        public static String pasarbinario (int n){
            String cadena="";
            if (n==0) {
            return cadena; 
        }
        else {
            cadena=cadena+n%2;
            pasarbinario(n/2);
        }
        return cadena;    
        }

        

        
    }


