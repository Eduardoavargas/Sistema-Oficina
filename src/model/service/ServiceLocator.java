/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import model.dao.ClienteDao;
import model.dao.ClienteDaoImpl;
import model.dao.UsuarioDao;
import model.dao.UsuarioDaoImpl;

/**
 *
 * @author eduardo
 */
public class ServiceLocator {

    public static ClienteDao getClienteDao() {
     return new ClienteDaoImpl();
    }

    public static UsuarioDao getUsuarioDao() {
       return new UsuarioDaoImpl();
    }
    
}
