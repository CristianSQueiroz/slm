/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDeConexao;

import DAO.RelatorioDAO;
import Model.Relatorio;
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
public class RelatorioDB implements RelatorioDAO {

    private String cmd;
    private PreparedStatement stmt;
    private MySqlConnect connect;
    ArrayList<HashMap> retorno;
    HashMap singleRetorno;
    Utilidades util = new Utilidades();
    UtilSql utilsql = new UtilSql();

    public RelatorioDB() {
        connect = MySqlConnect.getInstance();
    }

    @Override
    public boolean editarRelatorio(Relatorio rel) {
        cmd = "update TB_RELATORIO set DS_CAMPOS=" + utilsql.aplicarApostofo(rel.getAtributos())
                + ", NM_RELATORIO=" + utilsql.aplicarApostofo(rel.getNmRelatorio())
                + ", DS_ORIENTACAO=" + utilsql.aplicarApostofo(rel.getOrientacao())
                + " where id=" + rel.getId();
        return connect.executaComandoPadrao(cmd);
    }

    @Override
    public boolean criarRelatorio(Relatorio rel) {
        cmd = "insert into TB_RELATORIO values(null,"
                + utilsql.aplicarApostofo(rel.getNmRelatorio()) + ","
                + utilsql.aplicarApostofo(rel.getOrientacao()) + ","
                + utilsql.aplicarApostofo(rel.getAtributos()) + ")";
        return connect.executaComandoPadrao(cmd);
    }

    @Override
    public boolean excluirRelatorio(int id) {
        cmd = "delete from TB_RELATORIO where id =" + id;
        return connect.executaComandoPadrao(cmd);
    }

    @Override
    public ArrayList<HashMap> getRelatorios(HashMap atributos, String orderby) {
        cmd = utilsql.montaQuery(atributos, "TB_RELATORIO", orderby);
        return connect.executaConsultaPadrao(cmd);
    }

    @Override
    public Relatorio getRelatorio(int ID) {
        cmd = "select NM_RELATORIO,DS_ORIENTACAO,DS_CAMPOS from TB_RELATORIO where id =" + ID;
        retorno = connect.executaConsultaPadrao(cmd);
        singleRetorno = retorno.get(0);
        return new Relatorio(ID,
                util.validaString(singleRetorno.get("NM_RELATORIO")),
                util.validaString(singleRetorno.get("DS_CAMPOS")),
                util.validaString(singleRetorno.get("DS_ORIENTACAO")));
    }

    @Override
    public ArrayList<HashMap> getRelatorios(HashMap atributos, HashMap restricoes, String orderby) {
        cmd = UtilSql.montaQuery(atributos, restricoes, "TB_RELATORIO", orderby);
        return connect.executaConsultaPadrao(cmd);
    }

    @Override
    public boolean update(HashMap atributos, HashMap restricoes) {
        cmd = utilsql.montaQueryUpdate(atributos, restricoes, "TB_RELATORIO");
        return connect.executaComandoPadrao(cmd);
    }

    @Override
    public ArrayList<HashMap> getRegistros(String select,HashMap restricoes, String orderby) {
        cmd = utilsql.montaQueryRelatorio(select, restricoes, orderby);
        return connect.executaConsultaPadrao(cmd);
    }

}
