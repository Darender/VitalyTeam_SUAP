/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.vitalyteam.facade;

import java.util.List;
import mx.vitalyteam.delegate.DelegateProfesor;
import mx.vitalyteam.entidad.Profesor;

/**
 *
 * @author EduardoCardona <>
 */
public class FacadeProfesor {
    
    private final DelegateProfesor delegateProfesor;

    public FacadeProfesor() {
        this.delegateProfesor = new DelegateProfesor();
    }
    
    public Profesor login(String id){
        return delegateProfesor.login(id);
    }
    
    public boolean saveProfesor(Profesor profesor){
        boolean existente = delegateProfesor.RFCExistente(profesor.getRfcProf());
        if(existente){
            return false;
        }else{
            delegateProfesor.saveProfesor(profesor);
            return true;
        }
    }
    
    public List<Profesor> listaProfesores() {
        return delegateProfesor.listaProfesores();
    }
    
    public void eliminarProfesor(int id) {
        delegateProfesor.eliminarProfesor(id);
    }
}
