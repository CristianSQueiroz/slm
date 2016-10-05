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
public class Usuario {
    private int id;
    private int nrFuncionario;
    private String nmUsuario;
    private String dsSenha;
    
    public Usuario(int id, int nrFuncionario,String nmUsuario,String dsSenha){
        this.id = id;
        this.nrFuncionario = nrFuncionario;
        this.nmUsuario = nmUsuario;
        this.dsSenha = dsSenha;
    }
    
    public int getInt(){
        return this.id;
    }
    
    public int getNrFuncionario(){
        return this.nrFuncionario;
    }
    
    public String getNmUsuario(){
        return this.nmUsuario;
    }
    
    public String getDsSenha(){
        return this.dsSenha;
    }
}
