/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.vitalyteam.integracion;

import mx.vitalyteam.facade.FacadeAdministrador;
import mx.vitalyteam.facade.FacadeProfesor;
import mx.vitalyteam.facade.FacadeUnidadAprendizaje;

/**
 *
 * @author EduardoCardona <>
 */
public class ServiceFacadeLocator {
    
    private static FacadeAdministrador facadeAdministrador;
    private static FacadeProfesor facadeProfesor;
    private static FacadeUnidadAprendizaje facadeUa;
    
    public static FacadeAdministrador getInstanceFacadeAdministrador() {
        if (facadeAdministrador == null) {
            facadeAdministrador = new FacadeAdministrador();
            return facadeAdministrador;
        } else {
            return facadeAdministrador;
        }
    }
    
    public static FacadeProfesor getInstanceFacadeProfesor() {
        if (facadeProfesor == null) {
            facadeProfesor = new FacadeProfesor();
            return facadeProfesor;
        } else {
            return facadeProfesor;
        }
    }
    
    public static FacadeUnidadAprendizaje getInstanceFacadeUnidadAprendizaje() {
        if (facadeUa == null) {
            facadeUa = new FacadeUnidadAprendizaje();
            return facadeUa;
        } else {
            return facadeUa;
        }
    }
    
}
