import java.time.LocalDateTime;

public class funciones {
    public static void main(String[] args) {
        //Tratamiento de fechas en Java
        LocalDateTime hoy = LocalDateTime.now();
        System.out.println(hoy.toString());
        System.out.println(hoy.getDayOfWeek());
    }
}
