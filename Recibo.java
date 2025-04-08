package Problema.pkgC;

public class Recibo {
    private String cliente;
    private String tipoCuenta;
    private int numeroCuenta;
    private String operacion;
    private double monto;
    private double saldoFinal;

    public Recibo(String cliente, String tipoCuenta, int numeroCuenta, String operacion, double monto, double saldoFinal) {
        this.cliente = cliente;
        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = numeroCuenta;
        this.operacion = operacion;
        this.monto = monto;
        this.saldoFinal = saldoFinal;
    }

    public void imprimir() {
        System.out.println("========== RECIBO DE OPERACIÓN ==========");
        System.out.println("Cliente        : " + cliente);
        System.out.println("Cuenta         : " + tipoCuenta + " #" + numeroCuenta);
        System.out.println("Operación      : " + operacion);
        System.out.println("Monto          : $" + monto);
        System.out.println("Saldo final    : $" + saldoFinal);
        System.out.println("=========================================");
        System.out.println();
    }
}
