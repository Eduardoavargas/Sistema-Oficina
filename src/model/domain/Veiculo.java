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

/**
 *
 * @author eduardo
 */
@Entity
@Table(name = "TB_VEICULO")
public class Veiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "VEI_ID")
    private Integer veiculoId;
    @OneToMany(mappedBy = "osVeiculoId", targetEntity = OrdemDeServico.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<OrdemDeServico> ordemDeServicos;
    
    @Column(name = "VEI_PLACA", nullable = false)
    private String veiPlaca;

    @Column(name = "VEI_MARCA")
    private String veiMarca;

    @Column(name = "VEI_MODELO")
    private String veiModelo;

    @Column(name = "VEI_ANO")
    private int veiAno;

    @Column(name = "VEI_COR")
    private String veiCor;

    @Column(name = "VEI_CRIADO")
    private String veiCriado;

    public Integer getVeiculoId() {
        return veiculoId;
    }

    public void setVeiculoId(Integer veiculoId) {
        this.veiculoId = veiculoId;
    }

    public List<OrdemDeServico> getOrdemDeServicos() {
        return ordemDeServicos;
    }

    public void setOrdemDeServicos(List<OrdemDeServico> ordemDeServicos) {
        this.ordemDeServicos = ordemDeServicos;
    }

    public String getVeiPlaca() {
        return veiPlaca;
    }

    public void setVeiPlaca(String veiPlaca) {
        this.veiPlaca = veiPlaca;
    }

    public String getVeiMarca() {
        return veiMarca;
    }

    public void setVeiMarca(String veiMarca) {
        this.veiMarca = veiMarca;
    }

    public String getVeiModelo() {
        return veiModelo;
    }

    public void setVeiModelo(String veiModelo) {
        this.veiModelo = veiModelo;
    }

    public int getVeiAno() {
        return veiAno;
    }

    public void setVeiAno(int veiAno) {
        this.veiAno = veiAno;
    }

    public String getVeiCor() {
        return veiCor;
    }

    public void setVeiCor(String veiCor) {
        this.veiCor = veiCor;
    }

    public String getVeiCriado() {
        return veiCriado;
    }

    public void setVeiCriado(String veiCriado) {
        this.veiCriado = veiCriado;
    }

    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.veiculoId);
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
        final Veiculo other = (Veiculo) obj;
        if (!Objects.equals(this.veiculoId, other.veiculoId)) {
            return false;
        }
        return true;
    }
    
    
}
