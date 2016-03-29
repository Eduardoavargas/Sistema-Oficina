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

/**
 *
 * @author eduardo
 */
public class ItemVendaId implements Serializable {
 
    private static final long serialVersionUID = 1L;
 
    private int produto;
    private int ordemDeServico;

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }

    public int getOrdemDeServico() {
        return ordemDeServico;
    }

    public void setOrdemDeServico(int ordemDeServico) {
        this.ordemDeServico = ordemDeServico;
    }

      @Override
    public int hashCode() {
        return ordemDeServico + produto;
    }
 
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof ItemVendaId){
            ItemVendaId itemVendaId = (ItemVendaId) obj;
            return itemVendaId.produto == produto && itemVendaId.ordemDeServico == ordemDeServico;
        }
 
        return false;
    }

 
    
}
