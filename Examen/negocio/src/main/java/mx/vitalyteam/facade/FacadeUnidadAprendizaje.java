/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.vitalyteam.facade;

import java.sql.Time;
import java.util.Date;
import java.util.List;
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
    
    public List<UnidadAprendizaje> gerListaUnidades() {
        return delegateUa.gerListaUnidades();
    }
    
    public boolean saveUnidadAprendizaje(UnidadAprendizaje ua){
        if(!verificarSolapamientoGeneral(ua.getHraInicioClase(), ua.getHraFinClase(), ua.getHraInicioLab(), ua.getHraFinLab(), ua.getHraInicioTaller(), ua.getHraFinTaller()) && !delegateUa.nombreUnidadAprendizajeExistente(ua.getNombreUa())) {
            delegateUa.saveProfesor(ua);
            System.out.println("EJEMPLO");
            return true;
        } else {
            return false;
        }
    }
    
    public boolean verificarSolapamientoGeneral(Date inicioClase, Date finClase, Date inicioLab, Date finLab, Date inicioTaller, Date finTaller) {
        // Verificar solapamiento entre clase y laboratorio
        if ((inicioClase.before(finLab) && inicioClase.after(inicioLab)) || 
            (finClase.before(finLab) && finClase.after(inicioLab)) || 
            inicioClase.equals(inicioLab) || finClase.equals(finLab)) {
            System.out.println("Clase y laboratorio se solapan.");
            return true;
        }

        // Verificar solapamiento entre clase y taller
        if ((inicioClase.before(finTaller) && inicioClase.after(inicioTaller)) || 
            (finClase.before(finTaller) && finClase.after(inicioTaller)) || 
            inicioClase.equals(inicioTaller) || finClase.equals(finTaller)) {
            System.out.println("Clase y taller se solapan.");
            return true;
        }

        // Verificar solapamiento entre laboratorio y taller
        if ((inicioLab.before(finTaller) && inicioLab.after(inicioTaller)) || 
            (finLab.before(finTaller) && finLab.after(inicioTaller)) || 
            inicioLab.equals(inicioTaller) || finLab.equals(finTaller)) {
            System.out.println("Laboratorio y taller se solapan.");
            return true;
        }
        
        return false;
    }
}
