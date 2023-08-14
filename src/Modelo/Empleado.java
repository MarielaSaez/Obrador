
package Modelo;

public class Empleado {
    private int id_empleado=-1, dni, acceso;
    private String nombre, apellido;
    private boolean estado;

    public Empleado() {
    }

    public Empleado(int id_empleado, int dni, int acceso, String nombre, String apellido, boolean estado) {
        this.dni = dni;
        this.acceso = acceso;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
    }
 public Empleado( int dni, int acceso, String nombre, String apellido, boolean estado) {
       id_empleado=-1;
        this.dni = dni;
        this.acceso = acceso;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
    }
    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getAcceso() {
        return acceso;
    }
    public void setAcceso(int acceso) {
        this.acceso = acceso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  dni + "-" + nombre + "," + apellido;
    }
    
    
}
