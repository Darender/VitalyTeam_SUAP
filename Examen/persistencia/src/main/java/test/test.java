/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.List;
import mx.vitalyteam.DAO.AdministradorDAO;
import mx.vitalyteam.entidad.Administrador;

/**
 *
 * @author lukki
 */
public class test {
    public static void main(String[] args) {
        List<Administrador> listaAdministradores = new ArrayList();
        AdministradorDAO administradordao = new AdministradorDAO();
        listaAdministradores = administradordao.findAll();
        
        for(Administrador ad : listaAdministradores){
            System.out.println("id: " + ad.getIdAdmin());
            System.out.println("password: " + ad.getPasswordAdmin());
        }
    }
}
