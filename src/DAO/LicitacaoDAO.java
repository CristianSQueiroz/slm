/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Licitacao;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author csqueiroz
 */
public interface LicitacaoDAO extends BasicDAODB {

    boolean cadastrarLicitacao(Licitacao licitacao);

    ArrayList<HashMap> getLicitacoes(HashMap atributos, String orderby);

    ArrayList<HashMap> getLicitacoes(HashMap atributos, HashMap restricoes, String orderby);

    Licitacao getLicitacao(int id);

    boolean editarLicitacao(Licitacao licitacao);

    boolean excluirLicitacao(int id);

}
