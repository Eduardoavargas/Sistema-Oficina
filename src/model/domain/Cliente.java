/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain;

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
import util.ValidacaoException;

/**
 *
 * @author eduardo
 */
@Entity
@Table(name = "TB_CLIENTE")
public class Cliente implements Serializable {

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
        this.criado = criado;
    }

    public Date getModificado() {
        return modificado;
    }

    public void setModificado(Date modificado) {
        this.modificado = modificado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
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
        this.telefone2 = telefone2;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

}
