/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.MaoDeObra;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author csqueiroz
 */
public interface MaoDeObraDAO extends BasicDAODB{

    boolean cadastrarMaoDeObra(MaoDeObra mdo);

    ArrayList<HashMap> getMaoDeObra(HashMap atributos,String orderby);
    
    ArrayList<HashMap> getMaoDeObra(HashMap atributos, HashMap restricoes,String orderby);

    MaoDeObra getMaoDeObra(int id);

    boolean editarMaoDeObra(MaoDeObra mdo);

    boolean excluirMaoDeObra(int id);

}
