package Exercises;

public class UsuarioRegular extends Usuario {
    public UsuarioRegular(String nombre) {
        super(nombre);
    }

    public int getMaximoPrestamos() {
        return 2;
    }
}