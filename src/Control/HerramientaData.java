package Control;

import Modelo.Herramienta;
import java.sql.*;
import java.util.ArrayList;

public class HerramientaData {
    private Connection con;

    public HerramientaData() {
         con = DatabaseConnection.getInstance().getConnection();
    }
    public void guardarHerramienta(Herramienta herramienta){
       String sql="INSERT INTO herramienta (nombre, descripcion, stock, estado) VALUES (?,?,?,?)";
       
        try {
            PreparedStatement ps= con.prepareStatement(sql,java.sql.Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, herramienta.getNombre());
            ps.setString(2, herramienta.getDescripcion());
            ps.setInt(3,herramienta.getStock());
            ps.setBoolean(4, herramienta.isEstado());
            
            ps.executeUpdate();//guardo en la bd
            
            ResultSet rs= ps.getGeneratedKeys();//recupero la clave primaria
            
            if (rs.next()){
              
                System.out.println("Alta exitosa");
            }else
                System.out.println("error al obtener el id ");
            
        
        
        
        
        } catch (SQLException ex) {
            System.out.println("Error al insertar "+ex);;
        }
       
       
    }
     public void actualizarHerramienta(Herramienta herramienta){
       
       String sql="UPDATE herramienta SET nombre=?,descripcion=?, stock=?, estado=? WHERE id_herramienta=?";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1, herramienta.getNombre());
            ps.setString(2,herramienta.getDescripcion());
            ps.setInt(3, herramienta.getStock());
            ps.setBoolean(4, herramienta.isEstado());   
            ps.setInt(5, herramienta.getId_herramienta());
            ps.executeUpdate();//guardo en la bd
            
           
        
        } catch (SQLException ex) {
            System.out.println("Error al modificar "+ex);;
        }
       
    }
    public Herramienta buscarHerramienta(int id){
       Herramienta herramienta=null;
       try {
            
            String sql = "SELECT * FROM herramienta WHERE id_herramienta =?;";

             PreparedStatement ps= con.prepareStatement(sql,java.sql.Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
           
            
            ResultSet resultSet=ps.executeQuery();
            
            while(resultSet.next()){
                herramienta = new Herramienta();
                herramienta.setId_herramienta(id);
                herramienta.setNombre(resultSet.getString("nombre"));
                herramienta.setDescripcion(resultSet.getString("descripcion"));
                herramienta.setStock(resultSet.getInt("stock"));
                herramienta.setEstado(resultSet.getBoolean("estado"));

                
            }      
      } catch (SQLException ex) {
            System.out.println("Error al insertar un empleado: " + ex.getMessage());
        }
        
        return herramienta;
    }
      
       public int borrarHerramienta(int id){        
            int exito = -1;
            // Verificar si existen registros relacionados en la tabla "movimiento"
            String consultaVerificación = "SELECT COUNT(*) FROM movimiento WHERE id_herramienta = ?";
            try (PreparedStatement ps = con.prepareStatement(consultaVerificación)) {
                ps.setInt(1, id);
                try (ResultSet resultado = ps.executeQuery()) {
                    resultado.next();
                    int cantidadRegistros = resultado.getInt(1);

                    if (cantidadRegistros > 0) {
                        System.out.println("No se puede eliminar la herramienta debido a que existen registros relacionados en Movimiento.");
                    } else {
                        // Realizar eliminación de la herramienta
                        String consultaEliminación = "DELETE FROM herramienta WHERE id_herramienta = ?";
                        try (PreparedStatement ps1 = con.prepareStatement(consultaEliminación)) {
                            ps1.setInt(1, id);
                            int filasAfectadas = ps1.executeUpdate();

                            if (filasAfectadas > 0) {
                                System.out.println("Herramienta eliminada.");
                                exito=1;
                            } else {
                                System.out.println("No se encontró la herramienta con el ID especificado.");
                            }
                        }
                        catch (SQLException e) {
                            System.out.println("Error al eliminar herramienta: " + e.getMessage());
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
       
       public ArrayList<Herramienta> obtenerHerramientas(){
        ArrayList<Herramienta> herramientas = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM herramienta;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            Herramienta herramienta;
            while(resultSet.next()){
                herramienta = new Herramienta();
                herramienta.setId_herramienta(resultSet.getInt("id_herramienta"));
                herramienta.setStock(resultSet.getInt("stock"));
                herramienta.setNombre(resultSet.getString("nombre"));
                herramienta.setDescripcion(resultSet.getString("descripcion"));
                
                herramienta.setEstado(resultSet.getBoolean("estado"));

                herramientas.add(herramienta);
            }      
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener herramientas: " + ex.getMessage());
        }
        
        
        return herramientas;
    }
}

    


