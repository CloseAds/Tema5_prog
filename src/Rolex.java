import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Rolex {
    public static void main(String[] args) {
        // Obtener la hora actual
        LocalTime horaActual = LocalTime.now();

        // Restar tres minutos
        LocalTime horaHaceTresMinutos = horaActual.minusMinutes(3);

        // Formatear la hora en formato HH:mm:ss
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Mostrar la hora hace tres minutos
        System.out.println("La hora es: bicuelin ");
    }
}

