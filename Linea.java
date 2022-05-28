/*Programa de facturacion de atencion al cliente
sobre una linea de buses*/
package LineaBuses;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;

public class Linea {

    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        Pasajero op = new Pasajero();
        Ruta opc = new Ruta();
        GuardarArchivos opci = new GuardarArchivos();
        Bus opcio = new Bus();

        int pasajeroMc = 30, pasajeroB = 30, pasajeroEs = 30, pasajeroH = 30, pasajeroDf = 30;
        long dpi = 0, num;
        int asiento = 0, personas = 0;
        float efectivo, cambio, subcambio;
        int opcion, ruta = 0;
        String nombre, chofer, placa, modelo;
        nombre = "";
        chofer = "";
        placa = "";
        modelo = "";

        opci.ArchivoBus();
        opci.ArchivoRuta();
        do {

            opci.ArchivoPasajero(nombre, dpi, personas);

            asiento = Integer.parseInt(JOptionPane.showInputDialog("Asientos Correspondientes:"));

            cambio = 0;
            System.out.println("======================================================");
            System.out.println("*****BOSS FRONTERS*****");
            System.out.println("1- Mexico(Chiapas)");
            System.out.println("2- Belice");
            System.out.println("3- El Salvador");
            System.out.println("4- Honduras");
            System.out.println("5- Mexico(DF)");
            opcion = entrada.nextInt();
            System.out.println("======================================================\n\n");

            switch (opcion) {
                case 1 -> {
                    ruta = 0;
                    pasajeroMc = pasajeroMc;
                    if (pasajeroMc == 0) {
                        System.out.println("Ya no hay lugares en este bus");
                        asiento = 0;
                        personas = 0;
                    } else {
                        System.out.println("======================================================");
                        opc.DatosRuta1();
                        cambio = 600;
                        System.out.println("======================================================\n\n");
                    }
                    pasajeroMc = pasajeroMc - asiento;

                    ruta = 1;
                }

                case 2 -> {
                    ruta = 0;
                    pasajeroB = pasajeroB;
                    if (pasajeroB == 0) {
                        System.out.println("Ya no hay lugares en este bus");
                        asiento = 0;
                        personas = 0;
                    } else {
                        System.out.println("======================================================");
                        opc.DatosRuta2();
                        cambio = 700;
                        System.out.println("======================================================\n\n");
                    }
                    pasajeroB = pasajeroB - asiento;
                    ruta = 2;
                }
                case 3 -> {
                    ruta = 0;
                    pasajeroEs = pasajeroEs;
                    if (pasajeroEs == 0) {
                        System.out.println("Ya no hay lugares en este bus");
                        asiento = 0;
                        personas = 0;
                    } else {
                        System.out.println("======================================================");
                        opc.DatosRuta3();
                        cambio = 450;
                        System.out.println("======================================================\n\n");
                    }
                    pasajeroEs = pasajeroEs - asiento;
                    ruta = 3;
                }
                case 4 -> {
                    ruta = 0;
                    pasajeroH = pasajeroH;
                    if (pasajeroH == 0) {
                        System.out.println("Ya no hay lugares en este bus");
                        asiento = 0;
                        personas = 0;
                    } else {
                        System.out.println("======================================================");
                        opc.DatosRuta4();
                        cambio = 500;
                        System.out.println("======================================================\n\n");
                    }
                    pasajeroH = pasajeroH - asiento;
                    ruta = 4;
                }
                case 5 -> {
                    ruta = 0;
                    pasajeroDf = pasajeroDf;
                    if (pasajeroDf == 0) {
                        System.out.println("Ya no hay lugares en este bus");
                        asiento = 0;
                        personas = 0;
                    } else {
                        System.out.println("======================================================");
                        opc.DatosRuta5();
                        cambio = 2000;
                        System.out.println("======================================================\n\n");
                    }
                    pasajeroDf = pasajeroDf - asiento;
                    ruta = 5;
                }
                default ->
                    System.out.println("ELIJA UNA RUTA DEL MENU");
            }
            System.out.println("======================================================");
            subcambio = cambio * asiento;
            System.out.println("Monto a pagar:   Q" + subcambio);
            do {
                cambio = 0;
                efectivo = 0;
                System.out.println("\nIngrese efectivo");
                efectivo = entrada.nextFloat();
                cambio = efectivo - subcambio;

                if (cambio < 0) {
                    System.out.println("El monto no es suficiente");
                    System.out.println("======================================================\n");
                } else {
                    System.out.println("Su cambio es: Q" + cambio);
                    System.out.println("======================================================\n");
                }
            } while (cambio < 0);

            switch (ruta) {
                case 1 -> {
                    System.out.println("\n\n======================================================");
                    opcio.DatosBus1();
                    op.DatosPasajero(personas, asiento, nombre);
                    opc.RutaFac1();
                    op.Efectivo(efectivo, cambio);
                    System.out.println("======================================================\n\n");
                }
                case 2 -> {
                    System.out.println("\n\n======================================================");
                    opcio.DatosBus2();
                    op.DatosPasajero(personas, asiento, nombre);
                    opc.RutaFac2();
                    op.Efectivo(efectivo, cambio);
                    System.out.println("======================================================\n\n");
                }
                case 3 -> {
                    System.out.println("\n\n======================================================");
                    opcio.DatosBus3();
                    op.DatosPasajero(personas, asiento, nombre);
                    opc.RutaFac3();
                    op.Efectivo(efectivo, cambio);
                    System.out.println("======================================================\n\n");
                }
                case 4 -> {
                    System.out.println("\n\n======================================================");
                    opcio.DatosBus4();
                    op.DatosPasajero(personas, asiento, nombre);
                    opc.RutaFac4();
                    op.Efectivo(efectivo, cambio);
                    System.out.println("======================================================\n\n");
                }
                case 5 -> {
                    System.out.println("\n\n======================================================");
                    opcio.DatosBus5();
                    op.DatosPasajero(personas, asiento, nombre);
                    opc.RutaFac5();
                    op.Efectivo(efectivo, cambio);
                    System.out.println("======================================================\n\n");
                }

            }

            System.out.println("======================================================");
            System.out.println("\n\nIngrese 0 para detener el programa");
            num = entrada.nextInt();
            entrada.nextLine();
            System.out.println("======================================================");
        } while (num != 0);
    }

}
