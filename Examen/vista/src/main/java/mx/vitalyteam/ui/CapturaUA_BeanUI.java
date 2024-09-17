/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.vitalyteam.UI;

import java.io.IOException;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import mx.vitalyteam.entidad.UnidadAprendizaje;
import mx.vitalyteam.helper.CapturaUA_Helper;

/**
 *
 * @author David Perez
 */
@ManagedBean(name = "capturaUA_UI")
@SessionScoped
public class CapturaUA_BeanUI implements Serializable {
    private CapturaUA_Helper capturaUA_Helper;
    private UnidadAprendizaje unidadAprendizaje;
    
    public CapturaUA_BeanUI() {
        capturaUA_Helper = new CapturaUA_Helper();
    }
    
    @PostConstruct
    public void init(){
        unidadAprendizaje = new UnidadAprendizaje();
    }
    
    public void capturaUnidadesAprendizaje() throws IOException{
        unidadAprendizaje.setIdUa(0);
        if(capturaUA_Helper.guardarUnidadAprendizaje(unidadAprendizaje)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Exito: Unidad de aprendizaje " + unidadAprendizaje.getNombreUa() + " guardado exitosamente", ""));  
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Fallo: No se pudo guardar la unidad de aprendizaje", ""));  
        }
    }
    
    public UnidadAprendizaje getUnidadAprendizaje() {
        return unidadAprendizaje;
    }

    public void setUnidadAprendizaje(UnidadAprendizaje ua) {
        this.unidadAprendizaje = ua;
    }
}
