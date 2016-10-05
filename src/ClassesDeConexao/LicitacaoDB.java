/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDeConexao;

import DAO.LicitacaoDAO;
import Model.Licitacao;
import SQLUtil.MySqlConnect;
import Util.UtilSql;
import Util.Utilidades;
import com.mysql.jdbc.PreparedStatement;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author csqueiroz
 */
public class LicitacaoDB implements LicitacaoDAO {

    private String cmd;
    private PreparedStatement stmt;
    private MySqlConnect connect;
    ArrayList<HashMap> retorno;
    HashMap singleRetorno;
    Utilidades util = new Utilidades();
    UtilSql utilsql = new UtilSql();

    public LicitacaoDB() {
        connect = MySqlConnect.getInstance();
    }

    @Override
    public boolean update(HashMap atributos, HashMap restricoes) {
        cmd = utilsql.montaQueryUpdate(atributos, restricoes, "TB_LICITACAO");
        return connect.executaComandoPadrao(cmd);
    }

    @Override
    public boolean cadastrarLicitacao(Licitacao licitacao) {
        cmd = "insert into TB_LICITACAO values(null," + utilsql.aplicarApostofo(licitacao.getDsLicitacao()) + ")";
        return connect.executaComandoPadrao(cmd);
    }

    @Override
    public ArrayList<HashMap> getLicitacoes(HashMap atributos, String orderby) {
        cmd = utilsql.montaQuery(atributos, "TB_LICITACAO", orderby);
        return connect.executaConsultaPadrao(cmd);
    }

    @Override
    public ArrayList<HashMap> getLicitacoes(HashMap atributos, HashMap restricoes, String orderby) {
        cmd = utilsql.montaQuery(atributos, restricoes, "TB_LICITACAO", orderby);
        return connect.executaConsultaPadrao(cmd);
    }

    @Override
    public Licitacao getLicitacao(int id) {
        cmd = "select DS_LICITACAO from TB_LICITACAO where ID =" + id;
        retorno = connect.executaConsultaPadrao(cmd);
        singleRetorno = retorno.get(0);
        return new Licitacao(id,
                util.validaString(singleRetorno.get("DS_LICITACAO")));
    }

    public Licitacao getLicitacao(String dsLicitacao) {
        cmd = "select ID from TB_LICITACAO where DS_LICITACAO =" + utilsql.aplicarApostofo(dsLicitacao);
        retorno = connect.executaConsultaPadrao(cmd);
        singleRetorno = retorno.get(0);
        return new Licitacao(util.validaInt(singleRetorno.get("ID")),
                dsLicitacao);
    }

    @Override
    public boolean editarLicitacao(Licitacao licitacao) {
        cmd = "update TB_LICITACAO set DS_LICITACAO=" + utilsql.aplicarApostofo(licitacao.getDsLicitacao()) + " where ID=" + licitacao.getCdLicitacao();
        return connect.executaComandoPadrao(cmd);
    }

    @Override
    public boolean excluirLicitacao(int id) {
        cmd = "delete from TB_LICITACAO where ID =" + id;
        return connect.executaComandoPadrao(cmd);
    }

}
