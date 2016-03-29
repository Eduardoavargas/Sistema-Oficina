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
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;

/**
 *
 * @author eduardo
 */
@Entity
@Table(name = "TB_ORDEM_DE_SERVICO")
public class OrdemDeServico implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

public OrdemDeServico(){
}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "OS_ID")
    private Integer osId;

    @OneToMany(mappedBy = "ordemDeServico")
    private List<ItemVenda> produtos;

    @ManyToOne
    @JoinColumn(name = "CLI_ID")
    private Cliente osClienteId;

    @ManyToOne
    @JoinColumn(name = "OS_VEI_ID")
    //@Column(name = "OS_CARRO_ID")
    private Veiculo osVeiculoId;

    @Column(name = "OS_PRODUTO_ID")
    private int produtoId;

    @Column(name = "OS_PROBLEMA", length = 255, nullable = false)
    private String problema;

    @Column(name = "OS_OBSERVACAO", length = 255, nullable = false)
    private String observacao;

    @Column(name = "OS_CRIADO")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date criado;

    @Column(name = "OS_DATE_PREVISTA")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataPrevista;

    @Column(name = "OS_FINALIZADO")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataFechado;

    @Column(name = "OS_FORMA_PGTO")
    private int formaPgto;

    @Column(name = "OS_VALOR_ITEM")
    private float valorItem;

    @Column(name = "OS_VALOR_TOTAL")
    private float valorTotal;

    public List<ItemVenda> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ItemVenda> produtos) {
        this.produtos = produtos;
    }






    public Integer getOsId() {
        return osId;
    }


    public void setOsId(Integer osId) {
        Integer oldOsId = this.osId;
        this.osId = osId;
        changeSupport.firePropertyChange("osId", oldOsId, osId);
    }

    public Cliente getOsClienteId() {
        return osClienteId;
    }

    public void setOsClienteId(Cliente osClienteId) {
        Cliente oldOsClienteId = this.osClienteId;
        this.osClienteId = osClienteId;
        changeSupport.firePropertyChange("osClienteId", oldOsClienteId, osClienteId);
    }

    public Veiculo getOsVeiculoId() {
        return osVeiculoId;
    }

    public void setOsVeiculoId(Veiculo osVeiculoId) {
        Veiculo oldOsVeiculoId = this.osVeiculoId;
        this.osVeiculoId = osVeiculoId;
        changeSupport.firePropertyChange("osVeiculoId", oldOsVeiculoId, osVeiculoId);
    }

    public int getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(int produtoId) {
        int oldProdutoId = this.produtoId;
        this.produtoId = produtoId;
        changeSupport.firePropertyChange("produtoId", oldProdutoId, produtoId);
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        String oldProblema = this.problema;
        this.problema = problema;
        changeSupport.firePropertyChange("problema", oldProblema, problema);
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        String oldObservacao = this.observacao;
        this.observacao = observacao;
        changeSupport.firePropertyChange("observacao", oldObservacao, observacao);
    }

    public Date getCriado() {
        return criado;
    }

    public void setCriado(Date criado) {
        Date oldCriado = this.criado;
        this.criado = criado;
        changeSupport.firePropertyChange("criado", oldCriado, criado);
    }

    public Date getDataPrevista() {
        return dataPrevista;
    }

    public void setDataPrevista(Date dataPrevista) {
        Date oldDataPrevista = this.dataPrevista;
        this.dataPrevista = dataPrevista;
        changeSupport.firePropertyChange("dataPrevista", oldDataPrevista, dataPrevista);
    }

    public Date getDataFechado() {
        return dataFechado;
    }

    public void setDataFechado(Date dataFechado) {
        Date oldDataFechado = this.dataFechado;
        this.dataFechado = dataFechado;
        changeSupport.firePropertyChange("dataFechado", oldDataFechado, dataFechado);
    }

    public int getFormaPgto() {
        return formaPgto;
    }

    public void setFormaPgto(int formaPgto) {
        int oldFormaPgto = this.formaPgto;
        this.formaPgto = formaPgto;
        changeSupport.firePropertyChange("formaPgto", oldFormaPgto, formaPgto);
    }

    public float getValorItem() {
        return valorItem;
    }

    public void setValorItem(float valorItem) {
        float oldValorItem = this.valorItem;
        this.valorItem = valorItem;
        changeSupport.firePropertyChange("valorItem", oldValorItem, valorItem);
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        float oldValorTotal = this.valorTotal;
        this.valorTotal = valorTotal;
        changeSupport.firePropertyChange("valorTotal", oldValorTotal, valorTotal);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }





    

}
