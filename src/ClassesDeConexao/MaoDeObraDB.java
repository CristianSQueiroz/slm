/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDeConexao;

import DAO.ItemCobrancaDAO;
import DAO.MaoDeObraDAO;
import Model.ItemCobranca;
import Model.MaoDeObra;
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
public class MaoDeObraDB implements MaoDeObraDAO {

    private String cmd;
    private PreparedStatement stmt;
    private MySqlConnect connect;
    ArrayList<HashMap> retorno;
    HashMap singleRetorno;
    Utilidades util = new Utilidades();
    UtilSql utilsql = new UtilSql();

    public MaoDeObraDB() {
        connect = MySqlConnect.getInstance();
    }

    @Override
    public boolean cadastrarMaoDeObra(MaoDeObra mdo) {
        cmd = "insert into TB_MAODEOBRA values(null"
                + ", " + mdo.getIdOs()
                + ", " + mdo.getCod()
                + ", " + mdo.getQtd()
                + ", " + mdo.getQtdCobrada()
                + ")";
        return connect.executaComandoPadrao(cmd);
    }

    @Override
    public ArrayList<HashMap> getMaoDeObra(HashMap atributos, String orderby) {
        cmd = utilsql.montaQuery(atributos, "TB_MAODEOBRA", orderby);
        return connect.executaConsultaPadrao(cmd);
    }

    @Override
    public ArrayList<HashMap> getMaoDeObra(HashMap atributos, HashMap restricoes, String orderby) {
        cmd = utilsql.montaQuery(atributos, restricoes, "TB_MAODEOBRA", orderby);
        return connect.executaConsultaPadrao(cmd);
    }

    @Override
    public MaoDeObra getMaoDeObra(int id) {
        cmd = "select ID_OS,ID_SERVICO,QTD,QTD_COBRADA from TB_MAODEOBRA where ID =" + id;
        retorno = connect.executaConsultaPadrao(cmd);
        singleRetorno = retorno.get(0);
        return new MaoDeObra(id,
                Utilidades.validaInt(singleRetorno.get("ID_OS")),
                Utilidades.validaInt(singleRetorno.get("ID_SERVICO")),
                Utilidades.validaInt(singleRetorno.get("QTD")),
                Utilidades.validaInt(singleRetorno.get("QTD_COBRADA")));
    }

    @Override
    public boolean editarMaoDeObra(MaoDeObra mdo) {
        cmd = "update TB_MAODEOBRA set "
                + "ID_SERVICO=" + mdo.getIdOs()
                + ",QTD=" + mdo.getQtd()
                + ",QTD_COBRADA=" + mdo.getQtdCobrada()
                + "where ID =" + mdo.getId();
        return connect.executaComandoPadrao(cmd);
    }

    @Override
    public boolean excluirMaoDeObra(int id) {
        cmd = "delete from TB_MAODEOBRA where id =" + id;
        return connect.executaComandoPadrao(cmd);
    }

    @Override
    public boolean update(HashMap atributos, HashMap restricoes) {
        cmd = utilsql.montaQueryUpdate(atributos, restricoes, "TB_MAODEOBRA");
        return connect.executaComandoPadrao(cmd);
    }
}
