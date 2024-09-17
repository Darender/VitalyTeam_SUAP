// Source code is decompiled from a .class file using FernFlower decompiler.
package mx.vitalyteam.helper;

import java.io.Serializable;
import mx.vitalyteam.entidad.Administrador;
import mx.vitalyteam.entidad.Profesor;
import mx.vitalyteam.integracion.ServiceFacadeLocator;

public class LoginHelper implements Serializable {
   public LoginHelper() {
   }

   public Administrador LoginAdmin(String id, String password) {
      return ServiceFacadeLocator.getInstanceFacadeAdministrador().login(password, id);
   }

   public Profesor LoginProfesor(String id) {
      return ServiceFacadeLocator.getInstanceFacadeProfesor().login(id);
   }
}
