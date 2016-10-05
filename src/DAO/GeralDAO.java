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
public interface GeralDAO {

    boolean executeProcedure(String procedure,HashMap parametros);
    
    ArrayList<HashMap> executaConsulta(String comando);
    
    ArrayList<HashMap> getFuncoes();
}
