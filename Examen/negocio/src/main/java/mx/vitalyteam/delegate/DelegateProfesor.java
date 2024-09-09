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
    
    /**
     * Metodo para verificar si el profesor esta registrado en la bd
     * @param id 
     * @return un tipo profesor si no encuntra el profesor sera null
     */
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
    
    /**
     * Metodo de ejemplo para guardar profesor
     * @param profesor de tipo profesor 
     */
    public void saveProfesor(Profesor profesor){
        ServiceLocator.getInstanceProfesorDAO().save(profesor);
    }
    
}
