/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Modelo.Materia;
import org.mariadb.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author aguse
 */
public class materiaData {
    
    private Connection red = null;
    
    public materiaData(){
        red = conecxion.getConexion();
    }
    
    public void guardarMateria (Materia m){
        
        String sql = "INSERT INTO materia( nombre_materia, cuatrimestre, estado) VALUES (?,?,?)";
        
        try {
            PreparedStatement ps = red.prepareStatement(sql);
            
            ps.setString(1, m.getNombre_materia());
            ps.setString(2, m.getCuatrimestre());
            ps.setBoolean(3, m.isEstado());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
            m.setId_materia(rs.getInt(1));
            
            JOptionPane.showMessageDialog(null, "Se ha añadido una materia!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia ");
        }
    
    }
    
   public void actualizarMateria (Materia materia){
   
       String sql ="UPDATE materia SET nombre_materia = ? , cuatrimestre = ? , estado = ? WHERE id_materia";
       
       try {
           PreparedStatement ps = red.prepareStatement(sql);
           
           ps.setString(1, materia.getNombre_materia());
           ps.setString(2, materia.getCuatrimestre());
           ps.setBoolean(3, true);
           
           int i =ps.executeUpdate();
           
           if( i == 1){
               JOptionPane.showMessageDialog(null, "Modificado exitosamente!");
           }else{
               JOptionPane.showMessageDialog(null, "La materia no existe!");
           
           }
           
       } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
           
       }
   }
   
   public void eliminarMateria (int id){
   String sql = "DELETE FROM materia WHERE id_materia = ?";
   
       try {
           PreparedStatement ps = red.prepareStatement(sql);
           
           ps.setInt(1, id);
           
           int i = ps.executeUpdate();
           
           if( i == 1){
               JOptionPane.showMessageDialog(null, "La materia se elimino con exito!");
           }else{
               JOptionPane.showMessageDialog(null, "No se encontro la materia!");
           }
       } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
                   
       }
   }
   
   public Materia buscarMateria(int id){
   
       Materia materia = null;
       
       String sql = "SELECT nombre_materia, cuatrimestre, estado, FROM materia WHERE id_materia = ?";
       
       try {
           PreparedStatement ps = red.prepareStatement(sql);
           ps.setInt(1, id);
           
           ResultSet rs = ps.executeQuery();
           
           if(rs.next()){
               materia = new Materia();
               materia.setNombre_materia(rs.getNString("nombre"));
               materia.setCuatrimestre(rs.getNString("cuatrimestre"));
               materia.setEstado(rs.getBoolean("estado"));
           }else{
               JOptionPane.showMessageDialog(null, "No se encontro la materia");
           
           }
       } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
       }
       return materia;
   }
   
   public void bajaLogica(int id){
   
       String sql = "UPDATE materia SET estado = 0  WHERE id_materia = ?";
       
       try {
           PreparedStatement ps = red.prepareStatement(sql);
           
           ps.setInt(1, id);
           int i = ps.executeUpdate();
           
           if(i==1){
               JOptionPane.showMessageDialog(null, "La materia ha sido dada de baja");
           
           }
           
       } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
       }
   }
   
   public void altaLogica(int id){
   
       String sql = "UPDATE materia SET estado = 1  WHERE id_materia = ?";
       
       try {
           PreparedStatement ps = red.prepareStatement(sql);
           
           ps.setInt(1, id);
           int i = ps.executeUpdate();
           
           if(i==1){
               JOptionPane.showMessageDialog(null, "La materia ha sido dada de baja");
           
           }
           
       } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
       }
   }
    
}
