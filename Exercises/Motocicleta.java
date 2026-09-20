package Exercises;

public class Motocicleta extends Vehiculo {
    private boolean tieneCanastilla;

    public Motocicleta(String marca, String modelo, boolean tieneCanastilla) {
        super(marca, modelo);
        this.tieneCanastilla = tieneCanastilla;
    }

    public String mostrarInformacion() {
        return super.mostrarInformacion() + " - Canastilla: " + tieneCanastilla;
    }
}