/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar Sanchez
 */
public class Vivienda 
{
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    
    public Vivienda(double pvp, int numRoom, double superf, boolean park, String state, String prop)
    {
         this.precio = pvp;
         this.numHabitaciones = numRoom;
         this.superficie = superf;
         this.parking = park;
         this.estado = state;
         this.propietario = prop;   
    }
    
    public Vivienda(double precio)
    {
        this.precio = precio;
    }
    
    public void actualizarPrecio(double descuento)
    {
        precio -= precio * descuento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public boolean isParking() {
        return parking;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    
    public static void imprimirVivienda(Vivienda casa1) {
         System.out.println("Precio: " + casa1.getPrecio());
         System.out.println("Número de habitaciones: "+ casa1.getNumHabitaciones());
         System.out.println("Superficie en m2: " + casa1.getSuperficie());
         System.out.println("¿Dispone de parking?: " + casa1.isParking());
         System.out.println("Estado: "+ casa1.getEstado());
         System.out.println("Propietario: "+ casa1.getPropietario());
     }
    
}