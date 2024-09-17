/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.vitalyteam.helper;

import java.util.List;
import mx.vitalyteam.entidad.Profesor;
import mx.vitalyteam.entidad.UnidadAprendizaje;
import mx.vitalyteam.integracion.ServiceFacadeLocator;

/**
 *
 * @author David Perez
 */
public class AsignacionProfesores_Helper {
     public List<UnidadAprendizaje> getListaUnidades() {
        List<UnidadAprendizaje> nuevo = ServiceFacadeLocator.getInstanceFacadeUnidadAprendizaje().gerListaUnidades();
        return nuevo;
    }
     
     public List<Profesor> getListaProfesores() {
        List<Profesor> nuevo = ServiceFacadeLocator.getInstanceFacadeProfesor().listaProfesores();
        return nuevo;
    }
}
