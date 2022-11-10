/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemareservahospedajes;

/**
 *
 * @author Alejandro
 */
public class Habitacion extends Cliente{
    private String numeroHabitacion;
    private String tipoHabitacion;
    private float costoHabitacion;

    public Habitacion() {
    }

    public Habitacion(String numeroHabitacion, String tipoHabitacion, float costoHabitacion, String nombre, String apellidos, String dni, String telefono) {
        super(nombre, apellidos, dni, telefono);
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.costoHabitacion = costoHabitacion;
    }

    public Habitacion(String nombre, String apellidos, String dni, String telefono) {
        super(nombre, apellidos, dni, telefono);
    }
    

    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public float getCostoHabitacion() {
        return costoHabitacion;
    }

    public void setCostoHabitacion(float costoHabitacion) {
        this.costoHabitacion = costoHabitacion;
    }
    
    
}
