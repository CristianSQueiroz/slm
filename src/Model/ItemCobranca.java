/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author csqueiroz
 */
public class ItemCobranca {

    private int id;
    private String ds_descricao;
    private double valor;

    public ItemCobranca(int id, String ds_descricao, double valor) {
        this.id = id;
        this.ds_descricao = ds_descricao;
        this.valor = valor;
    }

    public int getId() {
        return this.id;
    }

    public String getDescricao() {
        return this.ds_descricao;
    }

    public Double getValor() {
        return this.valor;
    }

}
