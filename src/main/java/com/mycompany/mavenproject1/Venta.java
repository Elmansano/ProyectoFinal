
package com.mycompany.mavenproject1;


public class Venta {
   //Creamos variables de compra 
   int id;
   String decripcion;
   int cantidad;
   double precio;
   double importe;
   //Creamos un constructor
    public Venta() {
        
    }
    //Insertamos los getter and setter
    public int getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDecripcion() {
        return decripcion;
    }

    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
   
}
