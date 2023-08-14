
package Control;

import Modelo.Empleado;
import Modelo.Herramienta;
import Modelo.Movimiento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;

public class MovimientoData {
    private Connection con;

    public MovimientoData() {
        con = DatabaseConnection.getInstance().getConnection();
    }
    
    public void guardarMovimiento(Movimiento m){
        try {
            
            String sql = "INSERT INTO movimiento (id_empleado, id_herramienta, fechap,fechad, cantidadret) VALUES ( ? , ? , ? ,?,?);";

            PreparedStatement statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            statement.setInt(1, m.getEmpleado().getId_empleado());
            statement.setInt(2, m.getHerramienta().getId_herramienta());
            Date fechap=java.sql.Date.valueOf(m.getFechap());
            statement.setDate(3, fechap);
           // Date fechad = null;//(Date) Date.from(m.getFechad().atStartOfDay(ZoneId.systemDefault()).toInstant());
            statement.setDate(4, null);
            statement.setInt(5, m.getCantidad());
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
               // m.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar movimiento: " + ex.getMessage());
        }
    }
    public ArrayList<Movimiento> obtenerMovimientos(){
       ArrayList<Movimiento> lista=new ArrayList();
       try {
            String sql = "SELECT * FROM movimiento";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Movimiento mov;
            while(resultSet.next()){
               mov=new Movimiento();
               mov.setId_movimiento(resultSet.getInt("id_movimiento"));
               
               Empleado e=buscarEmpleado(resultSet.getInt("id_empleado"));
               mov.setEmpleado(e);
               Herramienta h=buscarHerramienta(resultSet.getInt("id_herramienta"));
               mov.setHerramienta(h);
               if(resultSet.getDate("fechad")!=null) 
                   mov.setFechad(resultSet.getDate("fechad").toLocalDate());
               mov.setFechap(resultSet.getDate("fechap").toLocalDate());
               mov.setCantidad(resultSet.getInt("cantidadret"));
              
               lista.add(mov);
            }
            statement.close();
       
       }
       catch (SQLException ex) {
            System.out.println("Error al obtener los movimientos: " + ex.getMessage());
        }
       return lista;
    }
    
    private Empleado buscarEmpleado(int id){
        return new EmpleadoData().buscarEmpleadoxid(id);
    
    }
    private Herramienta buscarHerramienta(int id){
        return new HerramientaData().buscarHerramienta(id);
    
    }
    
    public void registrarDevolucion(Movimiento m){
         String sql="UPDATE movimiento SET fechad=? WHERE id_movimiento=?";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
             if(m.getFechad()!=null){
                 
                 ps.setDate(1, java.sql.Date.valueOf(m.getFechad()));
             }
             
            ps.setInt(2,m.getId_movimiento());
            
            ps.executeUpdate();//guardo en la bd
         } catch (SQLException ex) {
            System.out.println("Error al modificar "+ex);;
        }
    }
}
