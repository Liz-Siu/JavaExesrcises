package Exercises;

public class Automovil extends Vehiculo {
    private int puertas;

    public Automovil(String marca, String modelo, int puertas) {
        super(marca, modelo);
        this.puertas = puertas;
    }

    public String mostrarInformacion() {
        return super.mostrarInformacion() + " - Puertas: " + puertas;
    }
}