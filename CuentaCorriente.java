package Problema.pkgC;

public class CuentaCorriente extends Cuenta {
    private double sobregiro = 100;

    public CuentaCorriente(int numeroCuenta, double saldoInicial) {
        super(numeroCuenta, saldoInicial);
    }

    @Override
    public void retirar(double cantidad) {
        if (saldo + sobregiro >= cantidad) {
            saldo -= cantidad;
        }
    }

    @Override
    public void depositar(double cantidad) {
        saldo += cantidad;
    }
}
