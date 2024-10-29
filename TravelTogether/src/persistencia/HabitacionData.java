package persistencia;

import entidad.Habitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class HabitacionData {
    
    Connection con = null;
    
    public HabitacionData(){
        
        con = Conexion.getConexion();
    }
    
    public void AgregarHabitacion(Habitacion hab){
        
        String sql = "INSERT INTO habitacion (nroHab, planta, numerac, cupo, estado) VALUES (?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, hab.getNroHabitacion());
            ps.setInt(2, hab.getPlanta());
            ps.setInt(3, hab.getNumeracion());
            ps.setInt(4, hab.getCupo());
            ps.setBoolean(5, hab.isEstado());
            
            ps.executeUpdate();
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse con la tabla Habitacion");
        }
    }
    
    public Habitacion buscarHabitacion(int nro){
        Habitacion hab = null;
        String sql = "SELECT * FROM habitacion WHERE nroHab = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, nro);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                hab = new Habitacion();
                hab.setNroHabitacion(nro);
                hab.setPlanta(rs.getInt("planta"));
                hab.setNumeracion(rs.getInt("numerac"));
                hab.setCupo(rs.getInt("cupo"));
                hab.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "La habitacion no existe");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse con la tabla Habitacion");
        }
        return hab;
    }
    
    public void modificarHabitacion(Habitacion hab){
        
        String sql = "UPDATE habitacion SET nroHab = ? planta = ? numerac = ? cupo = ? estado = ? WHERE nroHab = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, hab.getNroHabitacion());
            ps.setInt(2, hab.getPlanta());
            ps.setInt(3, hab.getNumeracion());
            ps.setInt(4, hab.getCupo());
            ps.setBoolean(5, hab.isEstado());
            ps.setInt(6, hab.getNroHabitacion());
            
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La Habitacion no existe");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse con la tabla Habitacion");
        }
    }
    
    public void borrarHabitacion(int nro){
        
        String sql = "DELETE FROM habitacion WHERE nroHab = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, nro);
            
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó la habitación.");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse con la tabla Habitacion");
        }
    }
    
    public List<Habitacion> listarHabitaciones(){
        List habitaciones = new ArrayList(); 
        
        String sql = "SELECT * FROM habitacion";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Habitacion hab = new Habitacion();
                hab.setNroHabitacion(rs.getInt("nroHab"));
                hab.setPlanta(rs.getInt("planta"));
                hab.setNumeracion(rs.getInt("numerac"));
                hab.setCupo(rs.getInt("cupo"));
                hab.setEstado(rs.getBoolean("estado"));
                
                habitaciones.add(hab);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse con la tabla Habitacion");
        }
        return habitaciones;
    }
    
}
