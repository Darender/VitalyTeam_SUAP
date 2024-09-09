/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.vitalyteam.facade;

import mx.vitalyteam.delegate.DelegateAdministrador;
import mx.vitalyteam.entidad.Administrador;

/**
 *
 * @author EduardoCardona <>
 */
public class FacadeAdministrador {
    
    private final DelegateAdministrador delegateAdministrador;

    public FacadeAdministrador() {
        this.delegateAdministrador = new DelegateAdministrador();
    }
    
    public void guardarAdministrador(Administrador administrador){
        delegateAdministrador.saveAdministrador(administrador);
    }
    
    public Administrador login(String password,String id){
        return delegateAdministrador.login(password,id);
    }
}
