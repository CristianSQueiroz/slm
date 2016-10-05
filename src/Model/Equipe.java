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
public class Equipe {

    private int id;
    private int nrFuncionario;
    private String nmEquipe;
    private String nmCarro;
    private String nrPlaca;

    public Equipe(int id, int nrFuncionario, String nmEquipe, String nmCarro, String nrPlaca) {
        this.id = id;
        this.nrFuncionario = nrFuncionario;
        this.nmEquipe = nmEquipe;
        this.nmCarro = nmCarro;
        this.nrPlaca = nrPlaca;
    }

    public int getId() {
        return this.id;
    }

    public int getNrFuncionario() {
        return this.nrFuncionario;
    }

    public String getNmEquipe() {
        return this.nmEquipe;
    }

    public String getNmCarro() {
        return this.nmCarro;
    }

    public String getNrPlaca() {
        return this.nrPlaca;
    }
}
