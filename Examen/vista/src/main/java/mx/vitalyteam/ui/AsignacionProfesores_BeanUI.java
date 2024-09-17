/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.vitalyteam.ui;

import java.io.IOException;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import mx.vitalyteam.entidad.Profesor;
import mx.vitalyteam.entidad.UnidadAprendizaje;
import mx.vitalyteam.helper.AsignacionProfesores_Helper;

@ManagedBean(name = "asignacionProfesoresUI")
@ViewScoped
public class AsignacionProfesores_BeanUI {
    private List<UnidadAprendizaje> unidades;
    private List<Profesor> profesores;
    private AsignacionProfesores_Helper helper;
    static UnidadAprendizaje unidadAsignada; 
    
    @PostConstruct
    public void init() {
        helper = new AsignacionProfesores_Helper();
        unidades = helper.getListaUnidades();
        profesores = helper.getListaProfesores();
    }
    
    public void setUnidadAsignada(UnidadAprendizaje unidadAsignada) {
        AsignacionProfesores_BeanUI.unidadAsignada = unidadAsignada;
        System.out.println("ADIOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOS" + unidadAsignada.getNombreUa());
    }
    
    public boolean asignado(Profesor profesor) {
        System.out.println("HOLAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + unidadAsignada.getNombreUa());
        if(profesor.getUnidadAprendizajeList().contains(unidadAsignada))
            return true;
        return false;
    }

    
    public List<Profesor> getProfesores () {
        return profesores;
    }
    
    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }
    
    public List<UnidadAprendizaje> getUnidades () {
        return unidades;
    }
    
    public void setUnidades(List<UnidadAprendizaje> unidades) {
        this.unidades = unidades;
    }
    
    
}
