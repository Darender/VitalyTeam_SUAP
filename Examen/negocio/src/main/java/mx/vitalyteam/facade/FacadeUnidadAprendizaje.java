/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.vitalyteam.facade;

import mx.vitalyteam.delegate.DelegateUnidadAprendizaje;
import mx.vitalyteam.entidad.UnidadAprendizaje;

/**
 *
 * @author EduardoCardona <>
 */
public class FacadeUnidadAprendizaje {
    
    private final DelegateUnidadAprendizaje delegateUa;

    public FacadeUnidadAprendizaje() {
        this.delegateUa = new DelegateUnidadAprendizaje();
    }
    
    /**
     * Metodo de ejemplo para guardar Usuario
     * @param usuario de tipo usuario con id 0 para poder que se cree un id nuevo
     */
    public void saveUnidadAprendizaje(UnidadAprendizaje ua){
        delegateUa.saveProfesor(ua);
    }
    
}
