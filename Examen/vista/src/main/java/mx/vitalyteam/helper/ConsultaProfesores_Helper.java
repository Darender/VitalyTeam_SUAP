/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.vitalyteam.helper;

import java.util.List;
import mx.vitalyteam.entidad.Profesor;
import mx.vitalyteam.integracion.ServiceFacadeLocator;

/**
 *
 * @author David Perez
 */
public class ConsultaProfesores_Helper {
    public List<Profesor> getListaProfesores() {
        return ServiceFacadeLocator.getInstanceFacadeProfesor().listaProfesores();
    }
}
