/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseprogramacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class ConexionBD {
 
    Connection conectar;
    PreparedStatement ps;
    
    public Connection establecerConexion(){      
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/baseprog", "root", "Usatorre1210");


            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se conecto a la base correctamente"+e.toString());
        }
        
        return conectar;
    }
    
     public Connection establecerConexion1(){      
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/baseprog", "root", "Usatorre1210");
            System.out.println("Conectado corretamente ");

            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se conecto a la base correctamente"+e.toString());
        }
        
        return conectar;
    }
    
    
    public Connection desconectarse(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/baseprog", "root", "Usatorre1210");

            // Realizar operaciones en la base de datos...

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Conexion cerrada exitosamente.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
    
}
