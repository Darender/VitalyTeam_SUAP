/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.vitalyteam.helper;

import java.io.IOException;
import java.io.Serializable;
import javax.faces.context.FacesContext;
import mx.vitalyteam.entidad.Administrador;
import mx.vitalyteam.integracion.ServiceFacadeLocator;

/**
 *
 * @author Kevin
 */
public class LoginHelper implements Serializable{
    

    /**
     * Metodo para hacer login llamara a la instancia de administradorFacade
     * @param id
     * @param password
     * @return 
     */
    public Administrador Login(String id, String password){
        return ServiceFacadeLocator.getInstanceFacadeAdministrador().login(password, id);
    }
    
    
    
}
