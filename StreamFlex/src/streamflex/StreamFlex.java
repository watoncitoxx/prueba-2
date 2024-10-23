/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package streamflex;


import cl.duoc.model.Cliente;
import cl.duoc.model.Contenido;


/**
 *
 * @author Cetecom
 */
public class StreamFlex {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Contenido content = new Contenido();
        Cliente user = new Cliente();
        int opcion = 0;
        while (opcion != 9){        
            System.out.println("----Menu----");
            System.out.println("1) Crear Usuario");
            System.out.println("2) Agregar al Catalogo");
            System.out.println("3) Listar contenido disponible");
            System.out.println("4) Calcular coste mensual");
            System.out.println("9) Salir");

            switch (opcion) {
                case 1 -> { 
                    user.crearCliente();
                }
                case 2 -> {
                    content.agregarContenido();
                }
                case 3 -> {
                    System.out.println(content.getListacontenido());
                }
                case 4 -> {
                }
                case 9 -> System.out.println("Saliste del sistema");
            
            }
        }
    }
    
           
}
