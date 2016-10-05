/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Relatorio;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author csqueiroz
 */
public interface RelatorioDAO extends BasicDAODB {

    public boolean editarRelatorio(Relatorio rel);

    public boolean criarRelatorio(Relatorio rel);

    public boolean excluirRelatorio(int ID);

    public ArrayList<HashMap> getRelatorios(HashMap atributos, String orderby);

    public ArrayList<HashMap> getRelatorios(HashMap atributos, HashMap restricoes, String orderby);

    public Relatorio getRelatorio(int ID);
    
    public ArrayList<HashMap> getRegistros(String select,HashMap restricoes, String orderby);
}
