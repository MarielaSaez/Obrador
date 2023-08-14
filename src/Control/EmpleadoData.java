
package Control;

import Modelo.Empleado;
import java.sql.*;
import java.util.ArrayList;


public class EmpleadoData {
    private Connection con;

    public EmpleadoData() {
         con = DatabaseConnection.getInstance().getConnection();
    }
   public void guardarEmpleado(Empleado empleado){//viene un empleado sin id
       String sql="INSERT INTO empleado (dni,nombre, apellido, acceso, estado) VALUES (?,?,?,?,?)";
       
        try {
            PreparedStatement ps= con.prepareStatement(sql,java.sql.Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, empleado.getDni());
            ps.setString(2, empleado.getNombre());
            ps.setString(3,empleado.getApellido());
            ps.setInt(4,empleado.getAcceso());
            ps.setBoolean(5, empleado.isEstado());
            
            ps.executeUpdate();//guardo en la bd
            
            ResultSet rs= ps.getGeneratedKeys();//recupero la clave primaria
            
            if (rs.next()){
               empleado.setId_empleado(rs.getInt(1));//completo el empleado en java
                System.out.println("Alta exitosa");
            }else
                System.out.println("error al obtener el id ");
       
        } 
        catch (SQLException ex) {
            System.out.println("Error al insertar "+ex);;
        }
       
       
    }
    
   public void actualizarEmpleado(Empleado empleado){//viene un empleado con id
       String sql="UPDATE empleado SET nombre=?,apellido=?, estado=?, acceso=? WHERE dni=?";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1, empleado.getNombre());
            ps.setString(2,empleado.getApellido());
            ps.setBoolean(3, empleado.isEstado());
            ps.setInt(4, empleado.getAcceso());
            ps.setInt(5, empleado.getDni());
            ps.executeUpdate();//guardo en la bd
         } catch (SQLException ex) {
            System.out.println("Error al modificar "+ex);;
        }
       
       
    }
    
      public ArrayList<Empleado> obtenerEmpleados(){
        ArrayList<Empleado> empleados = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM empleado;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            Empleado empleado;
            while(resultSet.next()){
                empleado = new Empleado();
                empleado.setId_empleado(resultSet.getInt("id_empleado"));
                empleado.setDni(resultSet.getInt("dni"));
                empleado.setNombre(resultSet.getString("nombre"));
                empleado.setApellido(resultSet.getString("apellido"));
                empleado.setAcceso(resultSet.getInt("acceso"));
                empleado.setEstado(resultSet.getBoolean("estado"));

                empleados.add(empleado);
            }      
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los empleados: " + ex.getMessage());
        }
        
        
        return empleados;
    }
    
    public int borrarEmpleado(int id){
     int exito = -1;
            // Verificar si existen registros relacionados en la tabla "movimiento"
            String consultaVerificación = "SELECT COUNT(*) FROM movimiento WHERE id_empleado = ?";
            try (PreparedStatement ps = con.prepareStatement(consultaVerificación)) {
                ps.setInt(1, id);
                try (ResultSet resultado = ps.executeQuery()) {
                    resultado.next();
                    int cantidadRegistros = resultado.getInt(1);

                    if (cantidadRegistros > 0) {
                        System.out.println("No se puede eliminar el empleado debido a que existen registros relacionados en Movimiento.");
                    } else {
                        // Realizar eliminación de la herramienta
                        String consultaEliminación = "DELETE FROM empleado WHERE id_empleado = ?";
                        try (PreparedStatement ps1 = con.prepareStatement(consultaEliminación)) {
                            ps1.setInt(1, id);
                            int filasAfectadas = ps1.executeUpdate();

                            if (filasAfectadas > 0) {
                                System.out.println("Empleado eliminado.");
                                exito=1;
                            } else {
                                System.out.println("No se encontró el empleado con el ID especificado.");
                            }
                        }
                        catch (SQLException e) {
                            System.out.println("Error al eliminar el empleado: " + e.getMessage());
                        }
                    }
                }
                catch (SQLException e) {
                     System.out.println("Error al eliminar herramienta: " + e.getMessage());
               }
            
             } 
            catch (SQLException e) {
                System.out.println("Error al eliminar herramienta: " + e.getMessage());
            }
        return (exito);
        
    
    }
    

    
    public Empleado buscarEmpleado(int id){
    Empleado empleado=null;
    try {
            
            String sql = "SELECT * FROM empleado WHERE dni =?;";
            PreparedStatement ps= con.prepareStatement(sql,java.sql.Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
              
            ResultSet resultSet=ps.executeQuery();
            
            while(resultSet.next()){
                empleado = new Empleado();
                empleado.setId_empleado(resultSet.getInt("id_empleado"));
                empleado.setDni(resultSet.getInt("dni"));
                empleado.setNombre(resultSet.getString("nombre"));
                empleado.setApellido(resultSet.getString("apellido"));
                empleado.setAcceso(resultSet.getInt("acceso"));
                empleado.setEstado(resultSet.getBoolean("estado"));

                
            }      
            ps.close();
            
            
            
            
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un empleado: " + ex.getMessage());
        }
        
        return empleado;
    }
    
    public Empleado buscarEmpleadoxid(int id){
    Empleado empleado=null;
    try {
            
            String sql = "SELECT * FROM empleado WHERE id_empleado=?;";
            PreparedStatement ps= con.prepareStatement(sql,java.sql.Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
              
            ResultSet resultSet=ps.executeQuery();
            
            while(resultSet.next()){
                empleado = new Empleado();
                empleado.setId_empleado(resultSet.getInt("id_empleado"));
                empleado.setDni(resultSet.getInt("dni"));
                empleado.setNombre(resultSet.getString("nombre"));
                empleado.setApellido(resultSet.getString("apellido"));
                empleado.setAcceso(resultSet.getInt("acceso"));
                empleado.setEstado(resultSet.getBoolean("estado"));

                
            }      
            ps.close();
            
            
            
            
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un empleado: " + ex.getMessage());
        }
        
        return empleado;
    }
}