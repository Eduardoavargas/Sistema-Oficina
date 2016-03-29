/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;
import model.dao.UsuarioDao;
import model.domain.Usuario;
import model.service.ServiceLocator;
import org.jdesktop.observablecollections.ObservableCollections;
import util.ValidacaoException;

/**
 *
 * @author eduardo
 */
public class UsuarioControl {
    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    private Usuario usuarioDigitado;

    private Usuario usuarioSelecionado;

    private List<Usuario> usuariosTabela;

    private final UsuarioDao usuarioDao;

    public UsuarioControl() {
        usuarioDao = ServiceLocator.getUsuarioDao();
        usuariosTabela = ObservableCollections.observableList(new ArrayList<Usuario>());
        novo();
        pesquisar();
    }

    public void novo() {
        setUsuarioDigitado(new Usuario());
    }

        public List<Usuario> BuscaSenhaELogin() {
       
       
        usuarioDao.BuscaSenhaELogin(usuarioDigitado);
        //usuariosTabela.addAll(usuarioDao.pesquisar(usuarioDigitado));
        return usuariosTabela;
    }
        
    public void pesquisar() {
        usuariosTabela.clear();
        usuariosTabela.addAll(usuarioDao.pesquisar(usuarioDigitado));
    }
    
    public void salvar() throws ValidacaoException {
       // usuarioDigitado.validar();
        usuarioDao.salvarAtualizar(usuarioDigitado);
        novo();
        pesquisar();
    }
    
    public void excluir ()  {
        
        usuarioDao.excluir(usuarioDigitado);
        novo();
        pesquisar();
    }

    public Usuario getUsuarioDigitado() {
        return usuarioDigitado;
    }

    public void setUsuarioDigitado(Usuario usuarioDigitado) {
        Usuario oldUsuarioDigitado = this.usuarioDigitado;
        this.usuarioDigitado = usuarioDigitado;
        propertyChangeSupport.firePropertyChange("usuarioDigitado", oldUsuarioDigitado, usuarioDigitado);
    }

    public Usuario getUsuarioSelecionado() {
        return usuarioSelecionado;
    }

    public void setUsuarioSelecionado(Usuario usuarioSelecionado) {
        this.usuarioSelecionado = usuarioSelecionado;
        if (this.usuarioSelecionado != null) {
            setUsuarioDigitado(usuarioSelecionado);
        }

    }

    public List<Usuario> getUsuariosTabela() {
        return usuariosTabela;
    }

    public void setUsuariosTabela(List<Usuario> usuariosTabela) {
        this.usuariosTabela = usuariosTabela;
    }

    public void addPropertyChangeListener(PropertyChangeListener e) {
        propertyChangeSupport.addPropertyChangeListener(e);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener e) {
        propertyChangeSupport.removePropertyChangeListener(e);
    }
}
