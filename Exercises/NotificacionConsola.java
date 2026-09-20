package Exercises;

public class NotificacionConsola implements Notificacion {
    public void enviar(String mensaje) {
        System.out.println("Notificacion: " + mensaje);
    }
}