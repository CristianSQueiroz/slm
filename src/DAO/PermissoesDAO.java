/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author csqueiroz
 */
public interface PermissoesDAO extends BasicDAODB{

    public boolean editarPermissao();

    public boolean criarEquipe();

    public boolean excluirEquipe(int ID);

    public ArrayList<HashMap> getEquipes(HashMap atributos,String orderby);

    public ArrayList<HashMap> getEquipes(HashMap atributos, HashMap restricoes,String orderby);
}
