/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.vitalyteam.helper;

import mx.vitalyteam.entidad.Profesor;
import mx.vitalyteam.integracion.ServiceFacadeLocator;

/**
 *
 * @author uziel
 */
public class CapturaProfesorHelper {
        public boolean guardarProfesor(Profesor pro){
        boolean razon = ServiceFacadeLocator.getInstanceFacadeProfesor().saveProfesor(pro);
        return razon;
    }

}
