/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.vitalyteam.UI;

import java.io.IOException;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import mx.vitalyteam.entidad.Administrador;
import mx.vitalyteam.helper.LoginHelper;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.application.FacesMessage;

@ManagedBean
@ViewScoped

public class LoginBeanUI {

    private String id;
    private String password;
    private boolean modoAdmin = false;

    // Getters y setters para id, password, modoAdmin

    public void cambiarModo() {
        System.out.println("holaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        this.modoAdmin = !this.modoAdmin;
        this.id = ""; // Limpiar ID cuando se cambia el modo
        this.password = ""; // Limpiar contraseña cuando se cambia el modo
    }

    public void login() {
        if (modoAdmin) {
            // Validación en modo Administrador
            if (id == null || id.trim().isEmpty()) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "ID es requerido."));
                return;
            }
            if (password == null || password.trim().isEmpty()) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Contraseña es requerida."));
                return;
            }
            // Lógica de autenticación para modo Administrador
            if (id.equals("admin") && password.equals("adminPassword")) {
                // Autenticación exitosa
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Éxito", "Inicio de sesión exitoso en modo Administrador."));
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "ID o Contraseña incorrectos."));
            }
        } else {
            // Validación en modo Maestro
            if (id == null || id.trim().isEmpty()) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "ID es requerido."));
                return;
            }
            // Lógica de autenticación para modo Maestro
            if (id.equals("master")) {
                // Autenticación exitosa
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Éxito", "Inicio de sesión exitoso en modo Maestro."));
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "ID incorrecto."));
            }
        }
    }

    // Métodos getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isModoAdmin() {
        return modoAdmin;
    }

    public void setModoAdmin(boolean modoAdmin) {
        this.modoAdmin = modoAdmin;
    }
}