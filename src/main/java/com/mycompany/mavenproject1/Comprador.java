
package com.mycompany.mavenproject1;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author angelo
 */
public class Comprador extends javax.swing.JFrame {

    /**
     * Creates new form Comprador
     */
    //agragamos un arreglo con los productos para el combobox solo como ejemplos ya que este se rellenara con la base de datos automaticamente cuando la vinculemos
    String productos[]={"Comida para gatos","Pepsi","Fanta","Sprit"};
    //lo mismo este se rellenara con la base de datos
    double precios[]={4,1.9,2,2.2};
    double precio=0;
    int cantidad=0;
    DefaultTableModel modelo=new DefaultTableModel();
    //Rellena los tabla con los getter and setter de venta
    ArrayList<Venta> listaVentas=new ArrayList<Venta>();
    public Comprador() {
        initComponents();
        //(queria ocultar el boton salir pero este lo inhabilita y oculta xd)this.btnsalir.setVisible(false);
        //Hace funcionar al boton con combinaciones de tecla
        btnsalir.setMnemonic(KeyEvent.VK_X);
        //Centra la ventana
        this.setLocationRelativeTo(null);
        //Rellana el combo box
        DefaultComboBoxModel comboModel=new DefaultComboBoxModel(productos);
        cboProductos.setModel(comboModel);
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("PRECIO U.");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("IMPORTE");
        actualizarTabla();
        calcularPrecio();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboProductos = new javax.swing.JComboBox<>();
        spnCantidad = new javax.swing.JSpinner();
        lblSubtotal = new javax.swing.JLabel();
        lblIva = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblImporte = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jbtnPagar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Cantidad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 100, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Subototal");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("IVA");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 70, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("TOTAL");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 70, -1));

        cboProductos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cboProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProductosActionPerformed(evt);
            }
        });
        getContentPane().add(cboProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        spnCantidad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        spnCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCantidadStateChanged(evt);
            }
        });
        getContentPane().add(spnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 80, -1));

        lblSubtotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSubtotal.setText("$0.00 PEN");
        getContentPane().add(lblSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 110, -1));

        lblIva.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblIva.setText("$0.00 PEN");
        getContentPane().add(lblIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 100, -1));

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTotal.setText("$0.00 PEN");
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 100, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Precio");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 90, -1));

        lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl.setText("Importe");
        getContentPane().add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 90, -1));

        lblPrecio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPrecio.setText("$0.00 PEN");
        getContentPane().add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 100, -1));

        lblImporte.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblImporte.setText("$0.00 PEN");
        getContentPane().add(lblImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 100, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Producto");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 100, -1));

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblProductos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, 90));

        jbtnPagar.setText("Pagar");
        jbtnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPagarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 180, 40));

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 400, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProductosActionPerformed
        calcularPrecio();
    }//GEN-LAST:event_cboProductosActionPerformed

    private void spnCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCantidadStateChanged
        calcularPrecio();
    }//GEN-LAST:event_spnCantidadStateChanged

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //Creamos on objeto de la clase venta y asi heredar sus atributos
        Venta venta=new Venta();
        venta.setId(cboProductos.getSelectedIndex());
        venta.setDecripcion(cboProductos.getSelectedItem().toString());
        venta.setPrecio(precio);
        venta.setCantidad(cantidad);
        venta.setImporte(precio*cantidad);
        if (!buscarVenta(venta)) {
            listaVentas.add(venta);
        }
        
        actualizarTabla();
        borrarVenta();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jbtnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPagarActionPerformed
            JOptionPane.showMessageDialog(null, "El monto a pagar es:"+lblTotal.getText());
            modelo.getDataVector().removeAllElements();
            tblProductos.updateUI();
    }//GEN-LAST:event_jbtnPagarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        Login_1 newframe=new Login_1();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed
    //Creamos este metodo para actualizar la tabla solo si el producto ya a sido añadido antes
    public boolean buscarVenta(Venta nueva){
        for (Venta v :listaVentas) {
            if (v.getId()==nueva.getId()) {
                int nuevaCantidad=v.getCantidad()+nueva.getCantidad();
                v.setCantidad(nuevaCantidad);
                v.setImporte(v.getPrecio()*nuevaCantidad);
                return true;
            }
        }
        return false;
    }
    public void borrarVenta(){
        precio=0;
        cantidad=1;

        cboProductos.setSelectedIndex(0);
        spnCantidad.setValue(1);
        calcularPrecio();
    }
    public void calcularPrecio(){
        precio=precios[cboProductos.getSelectedIndex()];
        cantidad=Integer.parseInt(spnCantidad.getValue().toString());
        lblPrecio.setText(aMoneda(precio));
        lblImporte.setText(aMoneda(precio*cantidad));
        
    }
    public String aMoneda(double precio){
        return "$"+Math.round(precio*100.0)/100.0+"PEN";
    }
    public void actualizarTabla(){
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
        }
        double subtotal=0;
        for (Venta v :listaVentas) {
            Object x[]=new Object[4];
            x[0]=v.getDecripcion();
            x[1]=aMoneda(v.getPrecio());
            x[2]=v.getCantidad();
            x[3]=aMoneda(v.getImporte());
            subtotal+=v.getImporte();
            modelo.addRow(x);
        }
        double iva=subtotal*0.18;
        double total=subtotal+iva;
        lblSubtotal.setText(aMoneda(subtotal));
        lblIva.setText(aMoneda(iva));
        lblTotal.setText(aMoneda(total));
        
        tblProductos.setModel(modelo);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Comprador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comprador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comprador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comprador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comprador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cboProductos;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnPagar;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblImporte;
    private javax.swing.JLabel lblIva;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables
}
