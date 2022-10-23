/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemareservahospedajes;

/**
 *
 * @author Alejandro
 */
public class Habitacion {
    private String numeroHabitacion;
    private String tipoHabitacion;
    private float costoHabitacion;
    private boolean estadoHabitacion;

    public Habitacion() {
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

    public boolean isEstadoHabitacion() {
        return estadoHabitacion;
    }

    public void setEstadoHabitacion(boolean estadoHabitacion) {
        this.estadoHabitacion = estadoHabitacion;
    }

    public float getCostoHabitacion() {
        return costoHabitacion;
    }

    public void setCostoHabitacion(float costoHabitacion) {
        this.costoHabitacion = costoHabitacion;
    }
    
    
}
