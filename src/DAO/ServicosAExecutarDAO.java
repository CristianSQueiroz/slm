/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ServicosAExecutar;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author csqueiroz
 */
public interface ServicosAExecutarDAO extends BasicDAODB{

    boolean cadastrarServicosAExecutar(ServicosAExecutar sae);

    ArrayList<HashMap> getServicosAExecutar(HashMap atributos,String orderby);
    
    ArrayList<HashMap> getServicosAExecutar(HashMap atributos, HashMap restricoes,String orderby);

    ServicosAExecutar getServicosAExecutar(int id);

    boolean editarServicosAExecutar(ServicosAExecutar sae);

    boolean excluirServicosAExecutar(int id);

}
