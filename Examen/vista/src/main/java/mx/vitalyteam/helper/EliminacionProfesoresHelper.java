package mx.vitalyteam.helper;

import java.util.List;
import mx.vitalyteam.entidad.Profesor;
import mx.vitalyteam.integracion.ServiceFacadeLocator;

public class EliminacionProfesoresHelper {
    public List<Profesor> obtenerListaProfesores(){
         List<Profesor> nuevo = ServiceFacadeLocator.getInstanceFacadeProfesor().listaProfesores();
         return nuevo;
    }
    
    public void eliminarProfesorPorId(int id) {
        ServiceFacadeLocator.getInstanceFacadeProfesor().eliminarProfesor(id);
    }
}
