package Exercises;

public class UsuarioPremium extends Usuario {
    public UsuarioPremium(String nombre) {
        super(nombre);
    }

    public int getMaximoPrestamos() {
        return 5;
    }
}