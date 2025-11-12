package clases.src;

public class Persona {
        
        String Nombre;
        String DNI;
        String fecha;
        String direccion;
        boolean genero;
        boolean estadoCivil;

        public Persona(){

        }

        
        
        public Persona(String Nombre, String DNI, String fecha, String direccion, boolean genero, boolean estadoCivil){
            this.Nombre = Nombre;
            this.DNI = DNI;
            this.fecha = fecha;
            this.direccion = direccion;
            this.genero = genero;
            this.estadoCivil = estadoCivil;
    
        }

        public void setNombre(String Nombre){
            this.Nombre=Nombre;
        }

        public String getNombre(){
            return this.Nombre;
        }

        
}

