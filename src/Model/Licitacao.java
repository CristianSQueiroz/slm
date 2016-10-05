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
public class Licitacao {
    
    private int cdLicitacao;
    private String dsLicitacao;

    public Licitacao(int cdLicitacao, String dsLicitacao) {
        this.cdLicitacao = cdLicitacao;
        this.dsLicitacao = dsLicitacao;
    }

    public int getCdLicitacao() {
        return cdLicitacao;
    }

    public void setCdLicitacao(int cdLicitacao) {
        this.cdLicitacao = cdLicitacao;
    }

    public String getDsLicitacao() {
        return dsLicitacao;
    }

    public void setDsLicitacao(String dsLicitacao) {
        this.dsLicitacao = dsLicitacao;
    }
    
    
}
