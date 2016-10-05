/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ItemCobranca;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author csqueiroz
 */
public interface ItemCobrancaDAO extends BasicDAODB{

    boolean cadastrarItemCobranca(ItemCobranca ic);

    ArrayList<HashMap> getItensCobranca(HashMap atributos,String orderby);
    
    ArrayList<HashMap> getItensCobranca(HashMap atributos, HashMap restricoes,String orderby);

    ItemCobranca getItemCobranca(int id);

    boolean editarItemCobranca(ItemCobranca ic);

    boolean excluirItemCobranca(int id);

}
