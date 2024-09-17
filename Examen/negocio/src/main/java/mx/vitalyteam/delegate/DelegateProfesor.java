/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.vitalyteam.delegate;

import java.util.List;
import mx.vitalyteam.entidad.Profesor;
import mx.vitalyteam.integracion.ServiceLocator;

/**
 *
 * @author EduardoCardona <>
 */
public class DelegateProfesor {
    
    public Profesor login(String id){
        Profesor profe = new Profesor();
        List<Profesor> profesores = ServiceLocator.getInstanceProfesorDAO().findAll();
        
        for(Profesor pr:profesores){
            if(pr.getIdProf() == Integer.parseInt(id)){
                profe = pr;
            }
        }
        return profe;
    }
    
  
    public void saveProfesor(Profesor profesor){
        ServiceLocator.getInstanceProfesorDAO().save(profesor);
    }
    
    public boolean RFCExistente(String RFC) {
        List<Profesor> unidades = ServiceLocator.getInstanceProfesorDAO().findAll();
        System.out.println(RFC);
        for(Profesor ad : unidades){
            System.out.println(ad.getRfcProf());
            if(ad.getRfcProf().equals(RFC)){
                System.out.println("VERDADERO");
                return true;
            }
        }
        System.out.println("FALSO2");
        return false;
    }
    
    
    
    public List<Profesor> listaProfesores() {
        return ServiceLocator.getInstanceProfesorDAO().findAll();
    }
    
    public void eliminarProfesor(int id) {
        List<Profesor> lista = listaProfesores();
        for(Profesor pr:lista){
            if(pr.getIdProf() == id){
                ServiceLocator.getInstanceProfesorDAO().delete(pr);
                return;
            }
        }
    }
}
