/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author angelo
 */
public class CClientes {
    int codigo;
    String nombre;
    String apellido;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
    
    public void InsertarCliente(JTextField paraNombre,JTextField paraApellido){
        setNombre(paraNombre.getText());
        setApellido(paraApellido.getText());
        
        
        CConexion objetoConexion=new CConexion();
        
        String consulta="insert into clientes(nombre,apellido)values (?,?);";
        
        try{
            CallableStatement cs=objetoConexion.estableceConexion().prepareCall(consulta);
            
            cs.setString(1,getNombre ());
            cs.setString(2, getApellido());
            JOptionPane.showMessageDialog(null, "Se inserto correctamente el cliente");
            
            cs.execute();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se inserto el cliente,Error:"+ e.toString());
        }
    }
    public void MostrarCliente(JTable paramTablaCliente){
        CConexion objetoConexion=new CConexion();

        DefaultTableModel modelo=new DefaultTableModel();
        TableRowSorter<TableModel>ordenarTabla=new TableRowSorter<TableModel>(modelo);
        paramTablaCliente.setRowSorter(ordenarTabla);
        
        
        String sql="";
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        
        paramTablaCliente.setModel(modelo);
        
        sql="select * from clientes";
        
        String[] datos=new String[3];
        Statement st;
        try{
            st=objetoConexion.estableceConexion().createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                
                
                modelo.addRow(datos);
            }
            paramTablaCliente.setModel(modelo);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se pudo mostrar los registros,Error:"+ e.toString());
        }
    }
    public void SeleccionarCliente(JTable paramTablaCliente,JTextField paraCodigo,JTextField paraNombre,JTextField paraApellido){
        
        try{
            int fila =paramTablaCliente.getSelectedRow();
            if(fila>=0){
                paraCodigo.setText((paramTablaCliente.getValueAt(fila, 0).toString()));
                paraNombre.setText((paramTablaCliente.getValueAt(fila, 1).toString()));
                paraApellido.setText((paramTablaCliente.getValueAt(fila, 2).toString()));
                
            }else{
                JOptionPane.showMessageDialog(null,"Fila no seleccionada");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error de seleccion,Error:"+ e.toString());
        }
        
    }
    public void ModificarCliente(JTextField paraCodigo,JTextField paraNombre,JTextField paraApellido){
        
        setNombre(paraNombre.getText());
        setApellido(paraApellido.getText());
        setCodigo(Integer.parseInt(paraCodigo.getText()));
        
        CConexion objetoconexion=new CConexion();
        String consulta="UPDATE clientes set clientes.nombre=?,clientes.apellido=? where clientes.cod=?;";
        
        try{
            CallableStatement cs=objetoconexion.estableceConexion().prepareCall(consulta);
            cs.setString(1,getNombre ());
            cs.setString(2,getApellido());
            cs.setInt(3,getCodigo());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Modificado correctamente");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se modifico,Error:"+e.toString());

        }
        
    }
    public void EliminarCliente(JTextField paraeCodigo){
        setCodigo(Integer.parseInt(paraeCodigo.getText()));
        CConexion objetoconexion=new CConexion();
        String consulta="delete from cliente where cliente.cod=?;";
        
        try{
            CallableStatement cs=objetoconexion.estableceConexion().prepareCall(consulta);
            cs.setInt(1, getCodigo());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se elimino correctamente el producto");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"No se pudo eliminar el producto"+ e.toString());
        }
        
    }
}
