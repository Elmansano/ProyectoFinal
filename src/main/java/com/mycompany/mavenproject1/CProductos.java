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
public class CProductos {
    int codigo;
    String nombre;
    double precio;
    int stock;

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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public void InsertarProductos(JTextField paraNombre,JTextField paraPrecio,JTextField paraStock){
        setNombre(paraNombre.getText());
        setPrecio(Double.parseDouble(paraPrecio.getText()));
        setStock(Integer.parseInt(paraStock.getText()));
        
        CConexion objetoConexion=new CConexion();
        
        String consulta="insert into Productos(nombre,precio,stock)values (?,?,?);";
        
        try{
            CallableStatement cs=objetoConexion.estableceConexion().prepareCall(consulta);
            
            cs.setString(1,getNombre ());
            cs.setDouble(2,getPrecio());
            cs.setInt(3,getStock());
            
            JOptionPane.showMessageDialog(null, "Se inserto correctamente el prodcuto");
            
            cs.execute();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se inserto el prodcuto,Error:"+ e.toString());
        }
        
    }
    public  void MostrarProductos(JTable paramTablaProductos){
        CConexion objetoConexion=new CConexion();

        DefaultTableModel modelo=new DefaultTableModel();
        TableRowSorter<TableModel>ordenarTabla=new TableRowSorter<TableModel>(modelo);
        paramTablaProductos.setRowSorter(ordenarTabla);
        
        
        String sql="";
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        
        paramTablaProductos.setModel(modelo);
        
        sql="select * from productos";
        
        String[] datos=new String[4];
        Statement st;
        try{
            st=objetoConexion.estableceConexion().createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                
                modelo.addRow(datos);
            }
            paramTablaProductos.setModel(modelo);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se pudo mostrar los registros,Error:"+ e.toString());
        }
    }
    public void SeleccionarProducto(JTable paramTablaProductos,JTextField paraCodigo,JTextField paraNombre,JTextField paraPrecio,JTextField paraStock){
        
        try{
            int fila =paramTablaProductos.getSelectedRow();
            if(fila>=0){
                paraCodigo.setText((paramTablaProductos.getValueAt(fila, 0).toString()));
                paraNombre.setText((paramTablaProductos.getValueAt(fila, 1).toString()));
                paraPrecio.setText((paramTablaProductos.getValueAt(fila, 2).toString()));
                paraStock.setText((paramTablaProductos.getValueAt(fila, 3).toString()));
            }else{
                JOptionPane.showMessageDialog(null,"Fila no seleccionada");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error de seleccion,Error:"+ e.toString());
        }
        
    }
    public void ModificarProducto(JTextField paraCodigo,JTextField paraNombre,JTextField paraPrecio,JTextField paraStock){
        
        setNombre(paraNombre.getText());
        setPrecio(Double.parseDouble(paraPrecio.getText()));
        setStock(Integer.parseInt(paraStock.getText()));
        setCodigo(Integer.parseInt(paraCodigo.getText()));
        
        CConexion objetoconexion=new CConexion();
        String consulta="UPDATE Productos set productos.nombre=?,productos.precio=?,productos.stock=? where productos.cod=?;";
        
        try{
            CallableStatement cs=objetoconexion.estableceConexion().prepareCall(consulta);
            cs.setString(1,getNombre ());
            cs.setDouble(2,getPrecio());
            cs.setInt(3,getStock());
            cs.setInt(4,getCodigo());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Modificado correctamente");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se modifico,Error:"+e.toString());

        }
        
    }
    public void EliminarProducto(JTextField paraeCodigo){
        setCodigo(Integer.parseInt(paraeCodigo.getText()));
        CConexion objetoconexion=new CConexion();
        String consulta="delete from productos where productos.cod=?;";
        
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
