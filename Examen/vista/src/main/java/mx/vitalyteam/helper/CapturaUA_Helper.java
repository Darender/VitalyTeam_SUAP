/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.vitalyteam.helper;

import mx.vitalyteam.entidad.UnidadAprendizaje;
import mx.vitalyteam.integracion.ServiceFacadeLocator;

/**
 *
 * @author David Perez
 */
public class CapturaUA_Helper {
    public boolean guardarUnidadAprendizaje(UnidadAprendizaje ua){
        boolean razon = ServiceFacadeLocator.getInstanceFacadeUnidadAprendizaje().saveUnidadAprendizaje(ua);
        return razon;
    }
}
