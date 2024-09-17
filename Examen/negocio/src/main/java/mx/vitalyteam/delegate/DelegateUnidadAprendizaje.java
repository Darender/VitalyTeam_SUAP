package mx.vitalyteam.delegate;

import java.util.List;
import mx.vitalyteam.entidad.UnidadAprendizaje;
import mx.vitalyteam.integracion.ServiceLocator;


public class DelegateUnidadAprendizaje {

    public void saveProfesor(UnidadAprendizaje UA){
        ServiceLocator.getUnidadAprendizajeDAO().save(UA);
    }
    
    public boolean nombreUnidadAprendizajeExistente(String nombre) {
        List<UnidadAprendizaje> unidades = ServiceLocator.getUnidadAprendizajeDAO().findAll();
        System.out.println(nombre);
        for(UnidadAprendizaje ad : unidades){
            System.out.println(ad.getNombreUa());
            if(ad.getNombreUa().equals(nombre)){
                System.out.println("VERDADERO");
                return true;
            }
        }
        System.out.println("FALSO2");
        return false;
    }

}
