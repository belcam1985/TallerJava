package Problema.pkgC;

public abstract class Cuenta {
    protected int numeroCuenta;
    protected double saldo;

    public Cuenta(int numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public abstract void retirar(double cantidad);
    public abstract void depositar(double cantidad);

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
}
