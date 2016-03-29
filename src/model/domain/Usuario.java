/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import util.ValidacaoException;

/**
 *
 * @author eduardo
 */
@Entity
@Table(name = "TB_USUARIO")
//@Inheritance(strategy = InheritanceType.JOINED)//Highly normalized  
//@DiscriminatorColumn(name = "USER_TIPO")
public class Usuario implements Serializable {

    /**
     *
     */
   // private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ID")
    private Integer idUsuario;

    @Column(name = "USER_TIPO")
    private String userTipo;

   // @Column(name = "USER_NOME")
   //private String userNome;

    @Column(name = "USER_SENHA")
    private String senha;

    @Column(name = "USER_NOME")
    private String nome;

    public Usuario() {
    }

    public boolean isNew() {
        return idUsuario == null;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setUserTipo(String userTipo) {
        this.userTipo = userTipo;
    }

    public String getUserTipo() {
        return userTipo;
    }

 //   public String getUserNome() {
//        return userNome;
 //   }

 //   public void setUserNome(String userNome) {
 //       this.userNome = userNome;
 //   }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.idUsuario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.idUsuario, other.idUsuario)) {
            return false;
        }
        return true;
    }

    public void validar() throws ValidacaoException {
        if (this.nome == null || this.nome.equals("")) {
            throw new ValidacaoException("Campo nome não preenchido");
        }
    }
}