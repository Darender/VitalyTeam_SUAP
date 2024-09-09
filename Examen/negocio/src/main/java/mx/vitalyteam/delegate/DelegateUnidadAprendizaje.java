/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.vitalyteam.delegate;

import java.util.List;
import mx.vitalyteam.entidad.UnidadAprendizaje;
import mx.vitalyteam.integracion.ServiceLocator;

/**
 *
 * @author EduardoCardona <>
 */
public class DelegateUnidadAprendizaje {
    /**
     * Metodo de ejemplo para guardar profesor
     * @param profesor de tipo profesor 
     */
    public void saveProfesor(UnidadAprendizaje UA){
        ServiceLocator.getUnidadAprendizajeDAO().save(UA);
    }
    
}
