/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author angelo
 */
public class Main {
    public static void main(String[] args) {
        CConexion objetoConexion=new CConexion();
        objetoConexion.estableceConexion();
        
        Login_1 objetoFormulario=new Login_1();
        objetoFormulario.setVisible(true);
    }
}
