package mx.vitalyteam.helper;

import java.io.Serializable;
import mx.vitalyteam.entidad.Administrador;
import mx.vitalyteam.entidad.Profesor;
import mx.vitalyteam.integracion.ServiceFacadeLocator;


public class LoginHelper implements Serializable {

    /**
     * Método para hacer login de administradores. Llama a la instancia de administradorFacade.
     * 
     * @param id El ID del administrador
     * @param password La contraseña del administrador
     * @return Administrador si es autenticado correctamente, null en caso contrario
     */
    public Administrador LoginAdmin(String id, String password) {
        return ServiceFacadeLocator.getInstanceFacadeAdministrador().login(password, id);
    }

    /**
     * Método para hacer login de profesores. Llama a la instancia de profesorFacade.
     * 
     * @param id El ID del profesor
     * @return Profesor si es autenticado correctamente, null en caso contrario
     */
    public Profesor LoginProfesor(String id) {
        return ServiceFacadeLocator.getInstanceFacadeProfesor().login(id);
    }
}
