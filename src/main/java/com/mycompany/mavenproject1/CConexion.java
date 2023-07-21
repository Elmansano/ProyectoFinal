/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author angelo
 */
public class CConexion {
    Connection conectar=null;
    String usuario="root";
    String contraseña="123456";
    String bd="proyectopoo";
    String ip="localhost";
    String puerto="3307";
    
    String cadena="jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection(cadena,usuario,contraseña);
            //JOptionPane.showMessageDialog(null, "Se conecto correctamente");   
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se conecto a la base de datos,error:"+e.toString());
        }
        return conectar;
    }
}
