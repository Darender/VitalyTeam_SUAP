/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.vitalyteam.integracion;

import mx.vitalyteam.DAO.AdministradorDAO;
import mx.vitalyteam.DAO.ProfesorDAO;
import mx.vitalyteam.DAO.UnidadAprendizajeDAO;



/**
 *
 * @author total
 */
public class ServiceLocator {
    
    private static AdministradorDAO administradorDAO;
    private static ProfesorDAO profesorDAO;
    private static UnidadAprendizajeDAO unidadAprendizajeDAO;
    
    /**
     * se crea la instancia para alumno DAO si esta no existe
     */
    public static AdministradorDAO getInstanceAdministradorDAO(){
        if(administradorDAO == null){
            administradorDAO = new AdministradorDAO();
            return administradorDAO;
        } else{
            return administradorDAO;
        }
    }
    /**
     * se crea la instancia para alumno DAO si esta no existe
     */
    public static ProfesorDAO getInstanceProfesorDAO(){
        if(profesorDAO == null){
            profesorDAO = new ProfesorDAO();
            return profesorDAO;
        } else{
            return profesorDAO;
        }
    }
    /**
     * se crea la instancia de usuario DAO si esta no existe
     */
    public static UnidadAprendizajeDAO getUnidadAprendizajeDAO(){
        if(unidadAprendizajeDAO == null){
            unidadAprendizajeDAO = new UnidadAprendizajeDAO();
            return unidadAprendizajeDAO;
        } else{
            return unidadAprendizajeDAO;
        }
    }
    
}
