package Exercises;

public class NotificacionCorreo implements Notificacion {
    private String destinatario;

    public NotificacionCorreo(String destinatario) {
        this.destinatario = destinatario;
    }

    public void enviar(String mensaje) {
        System.out.println("Correo para " + destinatario + ": " + mensaje);
    }
}
