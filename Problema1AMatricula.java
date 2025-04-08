package problema.pkg1a.matricula;

import java.util.Scanner;

public class Problema1AMatricula {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Datos del estudiante
        System.out.print("Nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("Carrera: ");
        String carrera = sc.nextLine();

        System.out.print("Modalidad (Presencial/Virtual): ");
        String modalidad = sc.nextLine();

        System.out.print("Semestre actual: ");
        int semestre = sc.nextInt();

        System.out.print("Número de materias inscritas: ");
        int materiasInscritas = sc.nextInt();

        System.out.print("Número de materias perdidas: ");
        int materiasPerdidas = sc.nextInt();

        int creditos = materiasInscritas * 3;
        double valorCredito = modalidad.equalsIgnoreCase("Presencial") ? 50000 : 30000;
        double totalPagar = creditos * valorCredito;
        double recargo = materiasPerdidas * 20000;
        double totalFinal = totalPagar + recargo;

        // Recibo personalizado
        System.out.println("\n----- RECIBO DE MATRÍCULA -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Carrera: " + carrera);
        System.out.println("Modalidad: " + modalidad);
        System.out.println("Semestre: " + semestre);
        System.out.println("Materias inscritas: " + materiasInscritas);
        System.out.println("Materias perdidas: " + materiasPerdidas);
        System.out.println("Créditos totales: " + creditos);
        System.out.println("Valor por crédito: $" + valorCredito);
        System.out.println("Total matrícula: $" + totalPagar);
        System.out.println("Recargo por materias perdidas: $" + recargo);
        System.out.println("Total a pagar: $" + totalFinal);
    }
}