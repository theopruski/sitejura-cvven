/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.sitejura;

import java.sql.Connection;
import java.sql.DriverManager;
/* import java.sql.SQLException;*/
import javax.swing.JOptionPane;

/**
 *
 * @author theop
 */
public class conbdd {
    
    Connection con;

    /**
     *
     */
    public conbdd(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sitejura","root","root");
            // JOptionPane.showMessageDialog(null,"Connection etablie");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Echec connection"+e);
        }     
    }
}
