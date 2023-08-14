
package Modelo;

import java.time.LocalDate;

public class Movimiento {
    private int id_movimiento, cantidad;
    private Empleado empleado;
    private Herramienta herramienta;
    private LocalDate fechap, fechad;

    public Movimiento() {
    }

    public Movimiento(int cantidad, Empleado empleado, Herramienta herramienta, LocalDate fechap, LocalDate fechad) {
        this.cantidad = cantidad;
        this.empleado = empleado;
        this.herramienta = herramienta;
        this.fechap = fechap;
        this.fechad = fechad;
    }

    public Movimiento(int id_movimiento, int cantidad, Empleado empleado, Herramienta herramienta, LocalDate fechap, LocalDate fechad) {
        this.id_movimiento = id_movimiento;
        this.cantidad = cantidad;
        this.empleado = empleado;
        this.herramienta = herramienta;
        this.fechap = fechap;
        this.fechad = fechad;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Herramienta getHerramienta() {
        return herramienta;
    }

    public void setHerramienta(Herramienta herramienta) {
        this.herramienta = herramienta;
    }


    public int getId_movimiento() {
        return id_movimiento;
    }

    public void setId_movimiento(int id_movimiento) {
        this.id_movimiento = id_movimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getFechap() {
        return fechap;
    }

    public void setFechap(LocalDate fechap) {
        this.fechap = fechap;
    }

    public LocalDate getFechad() {
        return fechad;
    }

    public void setFechad(LocalDate fechad) {
        this.fechad = fechad;
    }
    
}
