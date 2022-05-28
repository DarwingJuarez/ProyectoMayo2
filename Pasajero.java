
package LineaBuses;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Pasajero {
    
    Scanner entrada = new Scanner(System.in);
        
   public void DatosPasajero(int numpasajeros, int numasientos, String nom){
       
       System.out.println("\n******BOSS FRONTERS******");
       System.out.println("~~~~~~~~PASAJERO~~~~~~~~~");
       System.out.println(nom);
       System.out.println("Pasajeros---------------"+numpasajeros);
       System.out.println("No. Asientos------------"+numasientos); 
   }
   public void Efectivo(float efectivo1, float cambio1){
       System.out.println("\nEfectivo           "+efectivo1);
       System.out.println("               -----------");
       System.out.println("Cambio              "+cambio1);
   }
          
}
