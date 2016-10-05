/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.InfoCad;
import Model.OrdemDeServico;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author csqueiroz
 */
public interface OrdemDeServicoDAO extends BasicDAODB {

    public boolean editarOrdemDeServico(OrdemDeServico os);

    public boolean CadastrarOrdemDeServico(OrdemDeServico os, InfoCad ifc);

    public boolean cancelarOrdemDeServico(int ID, String motivo);

    public ArrayList<HashMap> getOrdemDeServicos(HashMap atributos, String orderby);

    public ArrayList<HashMap> getOrdemDeServicos(HashMap atributos, HashMap restricoes, String orderby);

    public OrdemDeServico getOrdemDeServico(int ID);

    public boolean executaOrdem(Date data, int IDEquipe, ArrayList<HashMap> OS);

    public boolean finalizarOrdem(Date data, String observacao, int ID);

}
