package Exercises;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser positiva");
            return;
        }
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser positiva");
            return;
        }
        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente");
            return;
        }
        saldo = saldo - cantidad;
    }
}