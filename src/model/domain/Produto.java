/*
 * The MIT License
 *
 * Copyright 2016 eduardo.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package model.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author eduardo
 */
@Entity
@Table(name = "TB_PRODUTO")
public class Produto implements Serializable {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PRO_ID")
    private int produtoId;

    @OneToMany(mappedBy = "produto")
    private List<ItemVenda> ordemDeServicos;

    @Column(name = "PRO_NOME", length = 255, nullable = false)
    private String produtoNome;

    @Column(name = "PRO_DESCRICAO", length = 255, nullable = false)
    private String produtoDescricao;

    @Column(name = "PRO_FORNECEDOR_ID", nullable = false)
    private int proFornecedorId;

    @Column(name = "PRO_NOTA_ENTRADA", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date produtoNotaEntrada;

    @Column(name = "PRO_DATA_ENTRADA", nullable = false)
    private Date produtoDatEntrada;

    @Column(name = "PRO_VALOR_ENTRADA", nullable = false)
    private float produtoValorEntrada;

    @Column(name = "PRO_PRECO_VENDA", nullable = false)
    private float produtoPrecoVenda;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.produtoId);
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
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.produtoId, other.produtoId)) {
            return false;
        }
        return true;
    }

    public List<ItemVenda> getOrdemDeServicos() {
        return ordemDeServicos;
    }

    public void setOrdemDeServicos(List<ItemVenda> ordemDeServicos) {
        this.ordemDeServicos = ordemDeServicos;
    }

    public int getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    public String getProdutoNome() {
        return produtoNome;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }

    public String getProdutoDescricao() {
        return produtoDescricao;
    }

    public void setProdutoDescricao(String produtoDescricao) {
        this.produtoDescricao = produtoDescricao;
    }

    public int getProFornecedorId() {
        return proFornecedorId;
    }

    public void setProFornecedorId(int proFornecedorId) {
        this.proFornecedorId = proFornecedorId;
    }

    public Date getProdutoNotaEntrada() {
        return produtoNotaEntrada;
    }

    public void setProdutoNotaEntrada(Date produtoNotaEntrada) {
        this.produtoNotaEntrada = produtoNotaEntrada;
    }

    public Date getProdutoDatEntrada() {
        return produtoDatEntrada;
    }

    public void setProdutoDatEntrada(Date produtoDatEntrada) {
        this.produtoDatEntrada = produtoDatEntrada;
    }

    public float getProdutoValorEntrada() {
        return produtoValorEntrada;
    }

    public void setProdutoValorEntrada(float produtoValorEntrada) {
        this.produtoValorEntrada = produtoValorEntrada;
    }

    public float getProdutoPrecoVenda() {
        return produtoPrecoVenda;
    }

    public void setProdutoPrecoVenda(float produtoPrecoVenda) {
        this.produtoPrecoVenda = produtoPrecoVenda;
    }

}
