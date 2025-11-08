public class Ejercicio2 {
    public static void main(String[] args) {
        int notas []={1,2,3,4,5};
        int contador=0;

        for (int i=0;i<notas.length;i++){
            if(notas[i]==2) contador++;
        }

        int notas2[]=new int [notas.length-contador];
        for(int i=0;i<notas2.length;i++){
            if(notas[i]!=2){
                notas2[i]=notas[i];
            }
        }
        
        
    }
}
