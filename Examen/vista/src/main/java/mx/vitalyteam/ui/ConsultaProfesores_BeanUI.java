package mx.vitalyteam.UI;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.bean.ViewScoped;
import javax.faces.bean.ManagedBean;
import mx.vitalyteam.entidad.Profesor;
import mx.vitalyteam.entidad.UnidadAprendizaje;
import mx.vitalyteam.helper.ConsultaProfesores_Helper;
import org.primefaces.context.RequestContext;

@ManagedBean(name = "consultaProfesoresUI")
@ViewScoped
public class ConsultaProfesores_BeanUI {

    private List<Profesor> profesores;
    private Profesor seleccionadoProfesor;
    private ConsultaProfesores_Helper helper;
    
    @PostConstruct
    public void init() {
        helper = new ConsultaProfesores_Helper();
        cargarProfesores();
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public Profesor getSeleccionadoProfesor() {
        return seleccionadoProfesor;
    }

    public void setSeleccionadoProfesor(Profesor seleccionadoProfesor) {
        this.seleccionadoProfesor = seleccionadoProfesor;
    }

    private void cargarProfesores() {
        List<Profesor> profesoresTemp = helper.getListaProfesores();
        this.profesores = profesoresTemp;
    }
    
    public String unidades(Profesor prof) {
        String temp = "";
        for(UnidadAprendizaje unidad : prof.getUnidadAprendizajeList()) {
            temp += " " + unidad.getNombreUa();
        }
        return temp;
    }
}
