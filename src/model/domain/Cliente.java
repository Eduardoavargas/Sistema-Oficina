/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import util.ValidacaoException;

/**
 *
 * @author eduardo
 */
@Entity
@Table(name = "TB_CLIENTE")
public class Cliente implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    //private Set enderecos;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CLI_ID")
    private Integer codigo;
    @OneToMany(mappedBy = "osClienteId", targetEntity = OrdemDeServico.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<OrdemDeServico> ordemDeServicos;

    @Column(name = "CLI_NOME", length = 255, nullable = false)
    private String nome;

    @Column(name = "CLI_TIPO", nullable = false)
    private int tipo;

    @Column(name = "CLI_DOCUMENTO")
    private int cpf;

    @Column(name = "CLI_NUMERO_END")
    private int numero;

    @Column(name = "CLI_RUA", length = 255)
    private String rua;

    @Column(name = "CLI_BAIRRO", length = 255)
    private String bairro;

    @Column(name = "CLI_CIDADE", length = 255)
    private String cidade;

    @Column(name = "CLI_UF", length = 255)
    private String uf;

    @Column(name = "CLI_CEP")
    private int cep;

    @Column(name = "CLI_EMAIL", length = 255)
    private String email;

    @Column(name = "CLI_COMPLEMENTO", length = 255)
    private String complemento;

    @Column(name = "CLI_TELEFONE")
    private String telefone;

    @Column(name = "CLI_CELULAR")
    private String celular;

    @Column(name = "CLI_COMERCIAL")
    private String telefone2;

    @Column(name = "CLI_CRIADO")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date criado;

    @Column(name = "CLI_MODIFICADO")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date modificado;

    public Cliente() {

    }

    public List<OrdemDeServico> getOrdemDeServicos() {
        return ordemDeServicos;
    }

    public void setOrdemDeServicos(List<OrdemDeServico> ordemDeServicos) {
        this.ordemDeServicos = ordemDeServicos;
    }

    public Date getCriado() {
        return criado;
    }

    public void setCriado(Date criado) {
        Date oldCriado = this.criado;
        this.criado = criado;
        changeSupport.firePropertyChange("criado", oldCriado, criado);
    }

    public Date getModificado() {
        return modificado;
    }

    public void setModificado(Date modificado) {
        Date oldModificado = this.modificado;
        this.modificado = modificado;
        changeSupport.firePropertyChange("modificado", oldModificado, modificado);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        int oldNumero = this.numero;
        this.numero = numero;
        changeSupport.firePropertyChange("numero", oldNumero, numero);
    }

    public String getRua() {
        return rua;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public void setRua(String rua) {
        String oldRua = this.rua;
        this.rua = rua;
        changeSupport.firePropertyChange("rua", oldRua, rua);
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        String oldBairro = this.bairro;
        this.bairro = bairro;
        changeSupport.firePropertyChange("bairro", oldBairro, bairro);
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        String oldCidade = this.cidade;
        this.cidade = cidade;
        changeSupport.firePropertyChange("cidade", oldCidade, cidade);
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        String oldUf = this.uf;
        this.uf = uf;
        changeSupport.firePropertyChange("uf", oldUf, uf);
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        int oldCep = this.cep;
        this.cep = cep;
        changeSupport.firePropertyChange("cep", oldCep, cep);
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        String oldComplemento = this.complemento;
        this.complemento = complemento;
        changeSupport.firePropertyChange("complemento", oldComplemento, complemento);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        String oldTelefone = this.telefone;
        this.telefone = telefone;
        changeSupport.firePropertyChange("telefone", oldTelefone, telefone);
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        String oldCelular = this.celular;
        this.celular = celular;
        changeSupport.firePropertyChange("celular", oldCelular, celular);
    }

    public String getTelefone2() {
        return telefone2;
    }

    /* public Set getEnderecos() {
    return enderecos;
    }
    public void setEnderecos(Set enderecos) {
    this.enderecos = enderecos;
    }
     */
    public void setTelefone2(String telefone2) {
        String oldTelefone2 = this.telefone2;
        this.telefone2 = telefone2;
        changeSupport.firePropertyChange("telefone2", oldTelefone2, telefone2);
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        int oldTipo = this.tipo;
        this.tipo = tipo;
        changeSupport.firePropertyChange("tipo", oldTipo, tipo);
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        int oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        Integer oldCodigo = this.codigo;
        this.codigo = codigo;
        changeSupport.firePropertyChange("codigo", oldCodigo, codigo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public boolean isNew() {
        return codigo == null;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.codigo);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    public void validar() throws ValidacaoException {
        if (this.nome == null || this.nome.equals("")) {
            throw new ValidacaoException("Campo nome não preenchido");
        }
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
