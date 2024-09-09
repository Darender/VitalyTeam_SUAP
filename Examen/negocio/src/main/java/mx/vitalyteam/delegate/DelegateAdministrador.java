/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.vitalyteam.delegate;

import java.util.List;
import mx.vitalyteam.entidad.Administrador;
import mx.vitalyteam.integracion.ServiceLocator;

/**
 *
 * @author EduardoCardona <>
 */
public class DelegateAdministrador {
    
    /**
     * Metodo de ejemplo para guardar Administrador
     * @param alumno de tipo usuario con id 0 para que se cree un id nuevo
     */
    public void saveAdministrador(Administrador admin){
        ServiceLocator.getInstanceAdministradorDAO().save(admin);
    }
    
    /**
     * Metodo para verificar si el administrador esta registrado en la bd
     * @param password 
     * @param id
     * @return un tipo Administrador si no encuntra el usuario sera null
     */
    public Administrador login(String password, String id){
        Administrador admin = new Administrador();
        List<Administrador> administradores = ServiceLocator.getInstanceAdministradorDAO().findAll();
        
        for(Administrador ad:administradores){
            if(ad.getPasswordAdmin().equalsIgnoreCase(password) && ad.getIdAdmin() == Integer.parseInt(id)){
                admin = ad;
            }
        }
        return admin;
    }
    
}
