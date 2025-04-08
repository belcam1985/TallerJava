package Problema.pkgc;

import Problema.pkgc.CuentaAhorro;
import Problema.pkgc.Recibo;
import Problema.pkgc.Cliente;

public class Main {
    public static void main(String[] args) {
        System.out.println("Simulación bancaria iniciada...");

        // Crear cliente
        Cliente cliente = new Cliente("Ana Gómez", "100200300");

        // Crear cuenta de ahorro con 300000
        CuentaAhorro cuenta = new CuentaAhorro("A0001", cliente, 300000);

        // Imprimir estado inicial
        Recibo.imprimir(cliente.getNombre(), cuenta.getNumeroCuenta(), "Apertura", cuenta.getSaldo());

        // Cierre de mes: se aplica 1.5% de mantenimiento
        cuenta.cierreMensual();

        // Imprimir estado final
        Recibo.imprimir(cliente.getNombre(), cuenta.getNumeroCuenta(), "Cierre de mes", cuenta.getSaldo());
    }
}

