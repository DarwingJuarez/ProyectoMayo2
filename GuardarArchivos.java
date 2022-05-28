package LineaBuses;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GuardarArchivos {

    public void ArchivoPasajero(String nom, long dp, int person) {
        File archivo;
        FileWriter escribir;
        PrintWriter linea = null;
        String separador;

        archivo = new File("C:\\Users\\juare\\Desktop\\Programacion 1\\LaboratorioMayo2\\ArchivoPasajeros.txt");
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                nom = JOptionPane.showInputDialog(null, "Nombre del pasajero",
                        "Solicitando Datos", 3);
                dp = (long) Float.parseFloat(JOptionPane.showInputDialog(null, "Numero de Identificacion Personal",
                        "Solicitando Datos", 3));
                person = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de Personas:",
                        "Solicitando Datos", 3));

                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                linea.println(nom);
                linea.println(dp);
                linea.println(person);
                linea.println(separador = "\n=================================");

                linea.close();
                escribir.close();

            } catch (IOException ex) {
                Logger.getLogger(GuardarArchivos.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            try {

                nom = JOptionPane.showInputDialog(null, "Nombre del pasajero",
                        "Solicitando Datos", 3);
                dp = (long) Float.parseFloat(JOptionPane.showInputDialog(null, "Numero de Identificacion Personal",
                        "Solicitando Datos", 3));
                person = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de Personas:",
                        "Solicitando Datos", 3));

                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                linea.println(nom);
                linea.println(dp);
                linea.println(person);
                linea.println(separador = "=================================");

                linea.close();
                escribir.close();

            } catch (IOException ex) {
                Logger.getLogger(GuardarArchivos.class.getName()).log(Level.SEVERE, null, ex);

            }
        }

    }

    public void ArchivoBus() {
        File archivo;
        FileWriter escribir;
        PrintWriter linea = null;
        String separador, datos, datos1, datos3, datos4, datos5;

        archivo = new File("C:\\Users\\juare\\Desktop\\Programacion 1\\LaboratorioMayo2\\ArchivoBuses.txt");
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();

                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                linea.println(separador = "\n------------------------------------------------------------------------------------------------------------------------------------");
                linea.println(datos = " | No. Placa |	Chofer				|	Modelo del Bus	|	Horario de Salida	|	Horario de Llegada	|");
                linea.println(separador = "\n------------------------------------------------------------------------------------------------------------------------------------");
                linea.println(datos1 = "| C 456QWR  |	Juan Guarsnizo          	|	2000		|	07:00 hrs		|	22:00 hrs	|");
                linea.println(datos1 = "| C 123PYJ  |	Esteban Quito                   |	1998		|	06:00 hrs		|	18:00 hrs	|");
                linea.println(datos1 = "| C 987ZXS  |	Ronaldo Santos          	|	2010		|	12:00 hrs		|	17:30 hrs	|");
                linea.println(datos1 = "| C 9315XC  |	Pedro Picapiedra                |	2007		|	05:00 hrs		|	14:00 hrs	|");
                linea.println(datos1 = "| C 0071JB  |	Carlos Santos                   |	2000		|	07:00 hrs		|	22:00 hrs	|");
                linea.println(separador = "\n------------------------------------------------------------------------------------------------------------------------------------");

                linea.close();
                escribir.close();

            } catch (IOException ex) {
                Logger.getLogger(GuardarArchivos.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            try {

                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                linea.println(separador = "\n------------------------------------------------------------------------------------------------------------------------------------");
                linea.println(datos = " | No. Placa |	Chofer				|	Modelo del Bus	|	Horario de Salida	|	Horario de Llegada	|");
                linea.println(separador = "\n------------------------------------------------------------------------------------------------------------------------------------");
                linea.println(datos1 = "| C 456QWR  |	Juan Guarsnizo          	|	2000		|	07:00 hrs		|	22:00 hrs	|");
                linea.println(datos1 = "| C 123PYJ  |	Esteban Quito                   |	1998		|	06:00 hrs		|	18:00 hrs	|");
                linea.println(datos1 = "| C 987ZXS  |	Ronaldo Santos          	|	2010		|	12:00 hrs		|	17:30 hrs	|");
                linea.println(datos1 = "| C 9315XC  |	Pedro Picapiedra                |	2007		|	05:00 hrs		|	14:00 hrs	|");
                linea.println(datos1 = "| C 0071JB  |	Carlos Santos                   |	2000		|	07:00 hrs		|	22:00 hrs	|");
                linea.println(separador = "\n------------------------------------------------------------------------------------------------------------------------------------");

                linea.close();
                escribir.close();

            } catch (IOException ex) {
                Logger.getLogger(GuardarArchivos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void ArchivoRuta() {
        File archivo;
        FileWriter escribir;
        PrintWriter linea = null;
        String separador, ruta;

        archivo = new File("C:\\Users\\juare\\Desktop\\Programacion 1\\LaboratorioMayo2\\ArchivoRutas.txt");
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();

                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                linea.println(separador = "\n=============================================");
                linea.println(ruta = "Ruta 1:       Mexico (Chiapas)");
                linea.println(ruta = "Ruta 2:                 Belice");
                linea.println(ruta = "Ruta 3:            El Salvador");
                linea.println(ruta = "Ruta 4:               Honduras");
                linea.println(ruta = "Ruta 1:            Mexico (DF)");
                linea.println(separador = "\n=============================================");

                linea.close();
                escribir.close();

            } catch (IOException ex) {
                Logger.getLogger(GuardarArchivos.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            try {

                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                linea.println(separador = "\n=============================================");
                linea.println(ruta = "Ruta 1:       Mexico (Chiapas)");
                linea.println(ruta = "Ruta 2:                 Belice");
                linea.println(ruta = "Ruta 3:            El Salvador");
                linea.println(ruta = "Ruta 4:               Honduras");
                linea.println(ruta = "Ruta 1:            Mexico (DF)");
                linea.println(separador = "\n=============================================");

                linea.close();
                escribir.close();

            } catch (IOException ex) {
                Logger.getLogger(GuardarArchivos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
