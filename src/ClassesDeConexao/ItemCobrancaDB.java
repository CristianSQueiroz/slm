/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDeConexao;

import DAO.ItemCobrancaDAO;
import Model.ItemCobranca;
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
public class ItemCobrancaDB implements ItemCobrancaDAO {

    private String cmd;
    private PreparedStatement stmt;
    private MySqlConnect connect;
    ArrayList<HashMap> retorno;
    HashMap singleRetorno;
    Utilidades util = new Utilidades();
    UtilSql utilsql = new UtilSql();

    public ItemCobrancaDB() {
        connect = MySqlConnect.getInstance();
    }

    @Override
    public boolean cadastrarItemCobranca(ItemCobranca ic) {
        cmd = "insert into TB_ITENS_COBRANCA values(null,"
                + utilsql.aplicarApostofo(ic.getDescricao())
                + ", " + ic.getValor() + ")";
        return connect.executaComandoPadrao(cmd);
    }

    @Override
    public ArrayList<HashMap> getItensCobranca(HashMap atributos, String orderby) {
        cmd = utilsql.montaQuery(atributos, "TB_ITENS_COBRANCA", orderby);
        return connect.executaConsultaPadrao(cmd);
    }

    @Override
    public ArrayList<HashMap> getItensCobranca(HashMap atributos, HashMap restricoes, String orderby) {
        cmd = utilsql.montaQuery(atributos, restricoes, "TB_ITENS_COBRANCA", orderby);
        return connect.executaConsultaPadrao(cmd);
    }

    @Override
    public ItemCobranca getItemCobranca(int id) {
        cmd = "select DS_DESCRICAO,VALOR from TB_ITENS_COBRANCA where id =" + id;
        retorno = connect.executaConsultaPadrao(cmd);
        singleRetorno = retorno.get(0);
        return new ItemCobranca(id,
                util.validaString(singleRetorno.get("DS_DESCRICAO")),
                util.validaDouble(singleRetorno.get("VALOR")));
    }

    public int getIDItemCobranca(String conteudo) {
        cmd = "select ID from TB_ITENS_COBRANCA where DS_DESCRICAO like '%" + conteudo + "%'";
        retorno = connect.executaConsultaPadrao(cmd);
        singleRetorno = retorno.get(0);
        return util.validaInt(singleRetorno.get("ID"));
    }

    @Override
    public boolean editarItemCobranca(ItemCobranca ic) {
        cmd = "update TB_ITENS_COBRANCA set DS_DESCRICAO=" + utilsql.aplicarApostofo(ic.getDescricao()) + ",VALOR=" + ic.getValor() + "where id =" + ic.getId();
        return connect.executaComandoPadrao(cmd);
    }

    @Override
    public boolean excluirItemCobranca(int id) {
        cmd = "delete from TB_ITENS_COBRANCA where id =" + id;
        return connect.executaComandoPadrao(cmd);
    }

    @Override
    public boolean update(HashMap atributos, HashMap restricoes) {
        cmd = utilsql.montaQueryUpdate(atributos, restricoes, "TB_ITENS_COBRANCA");
        return connect.executaComandoPadrao(cmd);
    }
}
