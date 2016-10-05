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
public class Funcionario {

    private int ID;
    private String nmFuncionario;
    private String PIS;

    public Funcionario(int id,String nmFuncionario, String PIS) {
        this.ID = id;
        this.nmFuncionario = nmFuncionario;
        this.PIS = PIS;
    }

    public String getNmFuncionario() {
        return this.nmFuncionario;
    }

    public String getPIS() {
        return this.PIS;
    }
    
    public int getID(){
        return this.ID;
    }
}
