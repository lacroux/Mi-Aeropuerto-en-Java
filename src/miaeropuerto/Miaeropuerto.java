/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miaeropuerto;

import java.util.Scanner;

/**
 *
 * @author yobanylacruz
 */
public class Miaeropuerto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Aeropuerto aeropuerto = new Aeropuerto("Aviones");
        Scanner Aeropuerto = new Scanner(System.in);
        int opcion = 0;
        
            while (opcion != 7) {
            System.out.println("Aeropuerto " + aeropuerto.getNombre());
            System.out.println("1. Listar ID de todos los Aviones");
            System.out.println("2. Cantidad de pasajeros actuales en todos los Aviones");
            System.out.println("3. Cantidad de asientos disponibles en todos los Aviones");
            System.out.println("4. Buscar y mostrar todos los Avion atraves de su ID");
            System.out.println("5. Subir pasajeros a un Avion");
            System.out.println("6. Bajar pasajeros de un Avion");
            System.out.println("7. SALIR");
            System.out.print("Opcion: ");
            opcion = Aeropuerto.nextInt();
                              
            switch(opcion) {
            case 1:
                    System.out.println("Numero Listado de ID de Aviones");
                    aeropuerto.listarID();
                    break;                   
            case 2:
                    System.out.println("Numero Pasajeros actuales: " + aeropuerto.getCantidadPasajerosActuales());
                    break;
                        
            case 3:
                    System.out.println("Numero de Asientos disponibles: " + aeropuerto.getCantidadAsientosDisponibles());
                    break;
            case 4:
                    System.out.print("Ingrese Numero ID de avion a consultar: ");
                    int idBuscarMostrarAviones = Aeropuerto.nextInt();
                    Avion AvionBuscado = aeropuerto.getAvion(idBuscarMostrarAviones);
                    if (AvionBuscado == null)
                            System.out.println("No hay aviones con ese ID: " + idBuscarMostrarAviones);
                    else
                            System.out.println(AvionBuscado);
                    break;
            case 5:
                    System.out.print("Ingrese Numero ID de avion para subir pasajeros: ");
                    int idSubirPasajeros = Aeropuerto.nextInt();
                    Avion AvionSubir = aeropuerto.getAvion(idSubirPasajeros);
                    if (AvionSubir == null) {
                            System.out.println("No hay ningún avion con ese ID: " + idSubirPasajeros);
                    }else {
                            System.out.print("Cuantos suben?: ");
                            int suben = Aeropuerto.nextInt();
                            AvionSubir.subirPasajeros(suben);
                    }
                    break;
            case 6:
                    System.out.print("Ingrese Numero ID del avion para bajar pasajeros: ");
                    int idBajarPasajeros = Aeropuerto.nextInt();
                    Avion AvionBajar = aeropuerto.getAvion(idBajarPasajeros);
                    if (AvionBajar == null) {
                            System.out.println("No hay ningún avion con ese ID: " + idBajarPasajeros);
                    }else {
                            System.out.print("Cuantos bajan?: ");
                            int bajan = Aeropuerto.nextInt();
                            AvionBajar.bajarPasajeros(bajan);
                    }
                    break;
            case 7:
                    System.out.println("\n\t\tFIN DE PROGRAMA");
                    break;
            default:
                    System.out.println("\nOpcion Invalida");
			 }
		 }
 
	}
 
}
                    
            
            
          
                    
            

    
        
        
        
        
        
    

