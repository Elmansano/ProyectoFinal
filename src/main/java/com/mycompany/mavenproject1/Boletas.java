/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author angelo
 */
public class Boletas {
    public  void MostrarBoletas(JTable paramTablaBoletas){
        CConexion objetoConexion=new CConexion();

        DefaultTableModel modelo=new DefaultTableModel();
        TableRowSorter<TableModel>ordenarTabla=new TableRowSorter<TableModel>(modelo);
        paramTablaBoletas.setRowSorter(ordenarTabla);
        
        
        String sql="";
        modelo.addColumn("Codigo");
        modelo.addColumn("Monto");
        
        paramTablaBoletas.setModel(modelo);
        
        sql="select * from boletas";
        
        String[] datos=new String[2];
        Statement st;
        try{
            st=objetoConexion.estableceConexion().createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
   
                
                modelo.addRow(datos);
            }
            paramTablaBoletas.setModel(modelo);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se pudo mostrar los registros,Error:"+ e.toString());
        }
    }
}
