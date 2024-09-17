// Source code is decompiled from a .class file using FernFlower decompiler.
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

@ManagedBean(
   name = "loginUI"
)
@SessionScoped
public class LoginBeanUI implements Serializable {
   private LoginHelper loginHelper = new LoginHelper();
   private Administrador administrador;
   private Profesor profesor;
   private String modo;

   public LoginBeanUI() {
   }

   @PostConstruct
   public void init() {
      this.administrador = new Administrador();
      this.profesor = new Profesor();
   }

   public void cambiarModo(String nuevoModo) {
      this.modo = nuevoModo;
   }

   public String getModo() {
      return this.modo;
   }

   public void setModo(String modo) {
      this.modo = modo;
   }

   public void login() throws IOException {
      if ("administrador".equals(this.modo)) {
         this.loginAdministrador();
      } else if ("docente".equals(this.modo)) {
         this.loginProfesor();
      }

   }

   public void loginAdministrador() throws IOException {
      String appURL = "/MenuAdministrador.xhtml";
      Administrador ad = this.loginHelper.LoginAdmin(String.valueOf(this.administrador.getIdAdmin()), this.administrador.getPasswordAdmin());
      if (ad != null && ad.getIdAdmin() != null) {
         this.administrador = ad;
         FacesContext.getCurrentInstance().getExternalContext().redirect(FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath() + appURL);
      } else {
         FacesContext.getCurrentInstance().addMessage((String)null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Usuario o contrase\u00f1a incorrecta", "Intente de nuevo"));
      }

   }

   public void loginProfesor() throws IOException {
      String appURL = "/Menu.xhtml";
      Profesor pr = this.loginHelper.LoginProfesor(String.valueOf(this.profesor.getIdProf()));
      if (pr != null && pr.getIdProf() != null) {
         this.profesor = pr;
         FacesContext.getCurrentInstance().getExternalContext().redirect(FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath() + appURL);
      } else {
         FacesContext.getCurrentInstance().addMessage((String)null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Usuario incorrecto", "Intente de nuevo"));
      }

   }

   public Administrador getAdministrador() {
      return this.administrador;
   }

   public void setAdministrador(Administrador administrador) {
      this.administrador = administrador;
   }

   public Profesor getProfesor() {
      return this.profesor;
   }

   public void setProfesor(Profesor profesor) {
      this.profesor = profesor;
   }
}