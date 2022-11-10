/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemareservahospedajes;

/**
 *
 * @author Alejandro
 */

public class Reserva extends Habitacion{
    
   //CLASE HIJA DE HABITACION
   private String codigoReserva;
   private int cantidadClientes;
   private String fechaReserva;
   private String fechaIngreso;
   private String fechaSalida;
   private String fechaCancelacion;
   private float montoTotal;

    public Reserva(){
        
    }

    public Reserva(String nombre, String apellidos, String dni, String telefono) {
        super(nombre, apellidos, dni, telefono);
    }
    
    
    //Para generar el archivo con todas las reservas de habitacion
    public Reserva(String codigoReserva, int cantidadClientes, String fechaReserva, String fechaIngreso, float montoTotal, String numeroHabitacion, 
            String tipoHabitacion, float costoHabitacion, String nombre, String apellidos, String dni, String telefono){
        super(numeroHabitacion, tipoHabitacion, costoHabitacion, nombre, apellidos, dni, telefono);
        this.codigoReserva = codigoReserva;
        this.cantidadClientes = cantidadClientes;
        this.fechaReserva = fechaReserva;
        this.fechaIngreso = fechaIngreso;
        this.montoTotal = montoTotal;
    }

    

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public int getCantidadClientes() {
        return cantidadClientes;
    }

    public void setCantidadClientes(int cantidadClientes) {
        this.cantidadClientes = cantidadClientes;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(String fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    public float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }
   
   
}
