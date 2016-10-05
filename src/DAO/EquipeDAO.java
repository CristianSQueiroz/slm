/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Equipe;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author csqueiroz
 */
public interface EquipeDAO extends BasicDAODB{

    public boolean editarEquipe(Equipe e);

    public boolean criarEquipe(Equipe e);

    public boolean excluirEquipe(int ID);

    public ArrayList<HashMap> getEquipes(HashMap atributos,String orderby);

    public ArrayList<HashMap> getEquipes(HashMap atributos, HashMap restricoes,String orderby);

    public Equipe getEquipe(int ID);

}
