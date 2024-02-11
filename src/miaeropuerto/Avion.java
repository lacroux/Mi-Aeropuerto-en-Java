/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miaeropuerto;

import java.util.Random;

/**
 *
 * @author yobanylacruz
 */
public class Avion {
    
        //Atributos
	private int ValorCorrelativoid;
	private int CantidadMaximaPasajeros;
	private int CantidadPasajerosActuales;
        private int AsientosDisponibles;
	private boolean EstadoAvion;
        
        //Constructor
    public Avion (int ValorCorrelativoid, int CantidadMaximaPasajeros, int CantidadPasajerosActuales, int AsientosDisponibles, boolean EstadoAvion) {
        this.ValorCorrelativoid =  ValorCorrelativoid;
        this.CantidadMaximaPasajeros = CantidadMaximaPasajeros;
        this.CantidadPasajerosActuales = CantidadPasajerosActuales;
        this.AsientosDisponibles = AsientosDisponibles;
        this.EstadoAvion = EstadoAvion;                             
            
        }

    public int getValorCorrelativoid() {
        return ValorCorrelativoid;
    }

    public int getCantidadMaximaPasajeros() {
        return CantidadMaximaPasajeros;
    }

    public int getCantidadPasajerosActuales() {
        return CantidadPasajerosActuales;
    }

    public boolean isEstadoAvion() {
        return EstadoAvion;
    }

    public void setValorCorrelativoid(int ValorCorrelativoid) {
        this.ValorCorrelativoid = ValorCorrelativoid;
    }

    public void setCantidadMaximaPasajeros(int CantidadMaximaPasajeros) {
        this.CantidadMaximaPasajeros = CantidadMaximaPasajeros;
    }

    public void setCantidadPasajerosActuales(int CantidadPasajerosActuales) {
        this.CantidadPasajerosActuales = CantidadPasajerosActuales;
    }

    public void setEstadoAvion(boolean EstadoAvion) {
        this.EstadoAvion = EstadoAvion;
    }
    
    public Avion(int ValorCorrelativoid, boolean EstadoAvion){
        
        this.ValorCorrelativoid = ValorCorrelativoid;
        Random as = new Random();
        this.CantidadMaximaPasajeros = as.nextInt(100) + 1; //Numero de asientos en cada avion
        this.CantidadPasajerosActuales = as.nextInt(CantidadMaximaPasajeros +1);
        this.EstadoAvion = EstadoAvion;
    }
    
          
        public void bajarPasajeros(int Pasajeros) {
        if (this.CantidadPasajerosActuales >= Pasajeros) {    
            this.AsientosDisponibles = this.CantidadMaximaPasajeros - this.CantidadPasajerosActuales;
            System.out.println("Cantidad de pasajeros es superior a la disponible");			
        } else {
           CantidadPasajerosActuales -= Pasajeros;
       }       
    }
        public void subirPasajeros(int Pasajeros) {
        if (Pasajeros >= this.CantidadPasajerosActuales + Pasajeros) {            
            this.AsientosDisponibles = this.CantidadMaximaPasajeros - this.CantidadPasajerosActuales;
            System.out.println("No hay asientos Disponibles");
        } else {
            CantidadPasajerosActuales += Pasajeros;
      }
   }
    

    @Override
	public String toString() {
	return String.format("Avion ValorID: %d\nMax. Pasajeros: %d\nPasajeros actuales: %d",ValorCorrelativoid, CantidadMaximaPasajeros, CantidadPasajerosActuales);
        }
 }
          



    
    
  

