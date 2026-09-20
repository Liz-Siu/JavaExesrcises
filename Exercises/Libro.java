package Exercises;

public class Libro {
    private String titulo;
    private boolean prestado;

    public Libro(String titulo) {
        this.titulo = titulo;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean estaPrestado() {
        return prestado;
    }

    public void prestar() {
        if (prestado) {
            System.out.println("El libro ya esta prestado");
            return;
        }
        prestado = true;
    }

    public void devolver() {
        prestado = false;
    }
}