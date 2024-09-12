/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.vitalyteam.ui;

import java.io.IOException;
import java.io.Serializable;
import java.util.regex.Pattern;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import mx.vitalyteam.entidad.Profesor;
import mx.vitalyteam.entidad.UnidadAprendizaje;
import mx.vitalyteam.helper.CapturaProfesorHelper;

@ManagedBean(name = "capPROUI")
@SessionScoped

public class CapturaProfesorUI implements Serializable {
    private CapturaProfesorHelper captu;
    private Profesor profesor;
    
    public CapturaProfesorUI() {
       captu = new CapturaProfesorHelper();
    }
    
    @PostConstruct
    public void init(){
        profesor = new Profesor();
    }
    
    public boolean VCP() {
    if (profesor.getRfcProf() == null || profesor.getRfcProf().trim().isEmpty()) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error: El campo 'RFC' es obligatorio.", ""));
        return false;
    }
    
    if (profesor.getNombreProf() == null || profesor.getNombreProf().trim().isEmpty()) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error: El campo 'Nombre' es obligatorio.", ""));
        return false;
    }
    if (profesor.getApellidoPProf() == null || profesor.getApellidoPProf().trim().isEmpty()) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error: El campo 'Apellido Paterno' es obligatorio.", ""));
        return false;
    } 
    if (profesor.getApellidoMProf() == null || profesor.getApellidoMProf().trim().isEmpty()) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error: El campo 'Apellido Materno' es obligatorio.", ""));
        return false;
    }    
    return true;
}
    
    public boolean validarNombreApellido(String nombre) {
        String regex = "^[a-zA-ZáéíóúüñÑ\\s]+$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(nombre).matches();
    }
    
    public boolean validarRFC(String rfc) {
    // Expresión regular para permitir solo caracteres alfanuméricos y verificar longitud
        String regex = "^[a-zA-Z0-9]{13}$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(rfc).matches();
    }
    
    public void capturaProfesor() throws IOException{
        if(VCP()){
            if(!validarNombreApellido(profesor.getNombreProf()) ||
               !validarNombreApellido(profesor.getApellidoPProf()) ||
               !validarNombreApellido(profesor.getApellidoMProf())){
                FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_WARN, 
                "Error: Los campos nombre y apellido solo pueden contener letras y espacios.", ""));
                return;
            } 
            
            if (!validarRFC(profesor.getRfcProf())) {
                FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_WARN, 
                "Error: El RFC solo acepta caracteres alfanuméricos.", ""));
            return;
            }
            profesor.setIdProf(0);
        if(captu.guardarProfesor(profesor)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Exito: El docente " + profesor.getNombreProf() + " registrado exitosamente", ""));  
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Fallo: No se pudo registrar a este docente, RFC ya existente", ""));  
        }
        }
    }
    
    public void capturaProfesor2() throws IOException {
    if (!validarNombreApellido(profesor.getNombreProf()) ||
        !validarNombreApellido(profesor.getApellidoPProf()) ||
        !validarNombreApellido(profesor.getApellidoMProf())) {
        FacesContext.getCurrentInstance().addMessage(null, 
            new FacesMessage(FacesMessage.SEVERITY_WARN, 
            "Error: Los campos nombre y apellido solo pueden contener letras y espacios.", ""));
        return;
    }
    
    }
    
    
    public Profesor getProfesor() {
        return profesor;
    }
    
    public void setProfesor(Profesor pro) {
        this.profesor = pro;
    }
}
