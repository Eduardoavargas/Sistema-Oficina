/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.domain.Usuario;

/**
 *
 * @author eduardo
 */
public class UsuarioDaoImpl implements UsuarioDao {

    @Override
    public void salvarAtualizar(Usuario usuario) {
        EntityManager em = Conexao.getEntityManager();
        em.getTransaction().begin();
        //  if (usuario.getIdUsuario()!= null) {
        //      usuario = em.merge(usuario);
        //  }
        em.persist(usuario);
        em.getTransaction().commit();
        em.close();
    }

    /**
     *
     * @param usuario
     * @param senha
     * @return
     */
    @Override
    public List<Usuario> BuscaSenhaELogin(Usuario usuario) {
        EntityManager em = Conexao.getEntityManager();
                StringBuilder sql = new StringBuilder("from Usuario u " + "where nome = " + usuario.getNome());
                //+ "where 1 = 1 ");
           //     if (lusuario != null && !lusuario.equals("")) {
         //   sql.append("and c.nome like :nome ");}
      // sql.append(" and c.userNome l :" + lusuario );}
       //                         if (lsenha != null && !lsenha.equals("")) {
         //   sql.append("and c.nome like :nome ");}
       //sql.append(" and c.senha like :" + lsenha );}
        System.out.println("model.dao.UsuarioDaoImpl.BuscaSenhaELogin()"+sql);
        Query query = em.createQuery(sql.toString());
      //  query.setParameter("USER_NOME ", usuario);
       //if (usuario != null && !usuario.equals("")) {
//query.setParameter("nome", "%" + usuario.getNome() + "%");
       // }
        System.out.println("model.dao.UsuarioDaoImpl.BuscaSenhaELogin()" + query.getResultList() + "em.createQuery(sql.toString())" + query);
        return query.getResultList();// getResultList();
    }
    
    @Override
    public void excluir(Usuario usuario) {
        EntityManager em = Conexao.getEntityManager();
        em.getTransaction().begin();
        usuario = em.merge(usuario);
        em.remove(usuario);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<Usuario> pesquisar(Usuario usuario) {
        EntityManager em = Conexao.getEntityManager();
        StringBuilder sql = new StringBuilder("from Usuario c "
                + "where 1 = 1 ");
        if (usuario.getIdUsuario() != null) {
            sql.append("and c.idUsuario = :idUsuario ");
        }
        if (usuario.getNome() != null && !usuario.getNome().equals("")) {
            sql.append("and c.nome like :nome ");
        }
        Query query = em.createQuery(sql.toString());
        if (usuario.getIdUsuario() != null) {
            query.setParameter("idUsuario", usuario.getIdUsuario());
        }
        if (usuario.getNome() != null && !usuario.getNome().equals("")) {
            query.setParameter("nome", "%" + usuario.getNome() + "%");
        }
        return query.getResultList();
    }


}
