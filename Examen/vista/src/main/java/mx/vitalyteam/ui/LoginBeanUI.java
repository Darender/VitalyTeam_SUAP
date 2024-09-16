package mx.vitalyteam.UI;

import java.io.IOException;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import mx.vitalyteam.entidad.Administrador;
import mx.vitalyteam.entidad.Profesor;
import mx.vitalyteam.helper.LoginHelper;

@ManagedBean(name = "loginUI")
@SessionScoped

public class LoginBeanUI implements Serializable {
    private LoginHelper loginHelper;
    private Administrador administrador;
    private Profesor profesor;
    private String modo;  // Para almacenar si es administrador o docente

    public LoginBeanUI() {
        loginHelper = new LoginHelper();
    }

    @PostConstruct
    public void init() {
        administrador = new Administrador();
        profesor = new Profesor();
    }

        //COSAS NUEVAS AGREGADAS
    public void cambiarModo(String nuevoModo) {
        this.modo = nuevoModo;
    }
    
    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }
    
    public void login() throws IOException {
        if ("administrador".equals(modo)) {
            loginAdministrador();
        } else if ("docente".equals(modo)) {
            loginProfesor();
        }
    }

    public void loginAdministrador() throws IOException {
        String appURL = "/MenuAdministrador.xhtml";
        
        // Utilizar String.valueOf para convertir a String en lugar de concatenar
        Administrador ad = loginHelper.LoginAdmin(String.valueOf(administrador.getIdAdmin()), administrador.getPasswordAdmin());
        
        if (ad != null && ad.getIdAdmin() != null) {
            administrador = ad;
            FacesContext.getCurrentInstance().getExternalContext().redirect(FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath() + appURL);
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Usuario o contraseña incorrecta:", "Intente de nuevo"));
        }
    }

    public void loginProfesor() throws IOException {
        String appURL = "/Menu.xhtml";
        
        // Utilizar String.valueOf para convertir a String
        Profesor pr = loginHelper.LoginProfesor(String.valueOf(profesor.getIdProf()));
        
        if (pr != null && pr.getIdProf() != null) {
            profesor = pr;
            FacesContext.getCurrentInstance().getExternalContext().redirect(FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath() + appURL);
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "ID incorrecto:", "Intente de nuevo"));
        }
    }

    /* getters y setters */

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
