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
public class ServicosAExecutar {
    private int id;
    private String dsServico;

    public ServicosAExecutar(int id, String dsServico) {
        this.id = id;
        this.dsServico = dsServico;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getDsServico(){
        return this.dsServico;
    }
    
    
}
