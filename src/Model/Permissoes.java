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
public class Permissoes {

    private int id;
    private int idUsuario;
    private int cdFuncao;
    private int cdFuncionabilidade;
    private boolean isPermitido;

    public Permissoes(int id, int idUsuario, int cdFuncao, int cdFuncionabilidade, boolean isPermitido) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.cdFuncao = cdFuncao;
        this.cdFuncionabilidade = cdFuncionabilidade;
        this.isPermitido = isPermitido;
    }

    public int getId() {
        return this.id;
    }
    
    public int getIdUsuario(){
        return this.idUsuario;
    }
    
    public int getCdFuncao(){
        return this.cdFuncao;
    }
}
