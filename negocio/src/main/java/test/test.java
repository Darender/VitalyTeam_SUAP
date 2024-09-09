/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import mx.vitalyteam.entidad.Administrador;
import mx.vitalyteam.integracion.ServiceFacadeLocator;

/**
 *
 * @author lukki
 */
public class test {
    public static void main(String[] args) {
        Administrador admin = new Administrador();
        
        admin = ServiceFacadeLocator.getInstanceFacadeAdministrador().login("papu","1234567890");
        
        if(admin.getIdAdmin()!= null){
            System.out.println("Login exitoso: " + admin.getIdAdmin());
        }else{
            System.out.println("No se encontro registro");
        }
    }
}
