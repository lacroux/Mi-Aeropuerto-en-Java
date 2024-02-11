/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miaeropuerto;



/**
 *
 * @author yobanylacruz
 */
class Aeropuerto {
    //Atributos
    private int ValorID = 0;
    
    private String nombre;
    private Avion[] ArregloAviones;

    public Aeropuerto(String nombre) {
    this.nombre = nombre;
    ArregloAviones = new Avion[100];
    for (int i = 0; i < 100; i++)
    ArregloAviones[i] = new Avion(++ValorID, true);
    }    
    
           
    public String getNombre() {
        return nombre;
    }

    public Avion[] getArregloAviones() {
        return ArregloAviones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArregloAviones(Avion[] ArregloAviones) {
        this.ArregloAviones = ArregloAviones;
    }
    
  
    public void listarID() {
        for (Avion av: ArregloAviones) 
	System.out.println("--> " + av.getValorCorrelativoid());
        }

    public int getCantidadPasajerosActuales() {
	int total = 0;
	for (Avion av: ArregloAviones)
	total += av.getCantidadPasajerosActuales();
	return total;
	}
 
    public int getCantidadAsientosDisponibles() {
	int total = 0;
	for (Avion av: ArregloAviones)
	total += av.getCantidadMaximaPasajeros() - av.getCantidadPasajerosActuales();
	return total;
	}

    public Avion getAvion(int ValorID){
	for (Avion av: ArregloAviones) 

        if (av.getValorCorrelativoid() == ValorID)
            return av;

            return null; 
           
        }
    }

    

