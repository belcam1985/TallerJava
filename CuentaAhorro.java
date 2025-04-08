package Problema.pkgC;

public class CuentaAhorro extends Cuenta {
    private double interesMensual = 0.02;

    public CuentaAhorro(int numeroCuenta, double saldoInicial) {
        super(numeroCuenta, saldoInicial);
    }

    @Override
    public void retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
        }
    }

    @Override
    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public void aplicarInteresMensual() {
        saldo += saldo * interesMensual;
    }
}