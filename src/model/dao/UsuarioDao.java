/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import model.domain.Usuario;

/**
 *
 * @author eduardo
 */
public interface UsuarioDao {

    void excluir(Usuario usuario);

    List<Usuario> pesquisar(Usuario usuario);

    List<Usuario> BuscaSenhaELogin(Usuario usuario);

    void salvarAtualizar(Usuario usuario);

}
