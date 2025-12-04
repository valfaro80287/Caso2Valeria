/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso2valeria;

import javax.swing.JOptionPane;

/**
 *
 * @author valer
 */
public class Caso2Valeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean continuar = true;
        
        while (continuar){
            String menu = " Bienvenido al sistema de reservas de PatitosVoladores\n" +
                          "1. Ver mapa del avion\n" +
                          "2. Reservar asiento\n" +
                          "3. Reservar con descuento(Cliente Frecuente)\n" +
                          "4. Consultar Pasajero\n" +
                          "5. Ver resumen del vuelo\n" +
                          "6. Salir\n";
            String opcion = JOptionPane.showInputDialog(menu);
            if (opcion.equals("1")){
                avion.mostrarMapa();
            }else if (opcion.equals("2")){
                avion.reservarAsiento();
            }else if (opcion.equals("3")){
                avion.reservarDescuento();
            }else if (opcion.equals("4")){
                avion.consultarPasajero();
            }else if (opcion.equals("5")){
                avion.
            }else if (opcion.equals("6")){
                JOptionPane.showMessageDialog(null, "Gracias por utilizar el sistema");
            }
        }
         
    }
    
}
