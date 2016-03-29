/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import model.domain.Cliente;

/**
 *
 * @author eduardo
 */
public interface ClienteDao {

    void excluir(Cliente cliente);

    List<Cliente> pesquisar(Cliente cliente);

    void salvarAtualizar(Cliente cliente);
    
}
