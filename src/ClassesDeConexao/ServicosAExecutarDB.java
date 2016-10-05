/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDeConexao;

import DAO.ServicosAExecutarDAO;
import Model.ServicosAExecutar;
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
public class ServicosAExecutarDB implements ServicosAExecutarDAO {

    private String cmd;
    private PreparedStatement stmt;
    private MySqlConnect connect;
    ArrayList<HashMap> retorno;
    HashMap singleRetorno;
    Utilidades util = new Utilidades();
    UtilSql utilsql = new UtilSql();

    public ServicosAExecutarDB() {
        connect = MySqlConnect.getInstance();
    }

    @Override
    public boolean cadastrarServicosAExecutar(ServicosAExecutar sae) {
        cmd = "insert into TB_SERVICOAEXECUTAR values(null,"
                + utilsql.aplicarApostofo(sae.getDsServico()) + ")";
        return connect.executaComandoPadrao(cmd);
    }

    @Override
    public ArrayList<HashMap> getServicosAExecutar(HashMap atributos,String orderby) {
        cmd = utilsql.montaQuery(atributos, "TB_SERVICOAEXECUTAR",orderby);
        return connect.executaConsultaPadrao(cmd);
    }

    @Override
    public ArrayList<HashMap> getServicosAExecutar(HashMap atributos, HashMap restricoes,String orderby) {
        cmd = utilsql.montaQuery(atributos, restricoes, "TB_SERVICOAEXECUTAR",orderby);
        return connect.executaConsultaPadrao(cmd);
    }

    @Override
    public ServicosAExecutar getServicosAExecutar(int id) {
        cmd = "select DS_SERVICO from TB_SERVICOAEXECUTAR where id =" + id;
        retorno = connect.executaConsultaPadrao(cmd);
        singleRetorno = retorno.get(0);
        return new ServicosAExecutar(id,
                util.validaString(singleRetorno.get("DS_SERVICO")));
    }

    @Override
    public boolean editarServicosAExecutar(ServicosAExecutar sae) {
        cmd = "update TB_SERVICOAEXECUTAR set DS_SERVICO=" + utilsql.aplicarApostofo(sae.getDsServico())
                + " where id=" + sae.getId();
        return connect.executaComandoPadrao(cmd);
    }

    @Override
    public boolean excluirServicosAExecutar(int id) {
        cmd = "delete from TB_SERVICOAEXECUTAR where id =" + id;
        return connect.executaComandoPadrao(cmd);
    }

    @Override
    public boolean update(HashMap atributos, HashMap restricoes) {
        cmd = utilsql.montaQueryUpdate(atributos, restricoes, "TB_SERVICOAEXECUTAR");
        return connect.executaComandoPadrao(cmd);
    }

}
