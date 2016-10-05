/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDeConexao;

import Model.InfoCad;
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
public class InfoCadDB {

    private String cmd;
    private PreparedStatement stmt;
    private MySqlConnect connect;
    ArrayList<HashMap> retorno;
    HashMap singleRetorno;
    Utilidades util = new Utilidades();
    UtilSql utilsql = new UtilSql();

    public InfoCadDB() {
        connect = MySqlConnect.getInstance();
    }

    public boolean cadastrarInfoCad(InfoCad ifc) {
        cmd = "insert into TB_INFOCAD values(null"
                + ", " + ifc.getIdOs()
                + ", " + ifc.getCod()
                + ", " + ifc.getQtd()
                + ")";
        return connect.executaComandoPadrao(cmd);
    }

    public ArrayList<HashMap> getInfoCad(HashMap atributos, String orderby) {
        cmd = utilsql.montaQuery(atributos, "TB_INFOCAD", orderby);
        return connect.executaConsultaPadrao(cmd);
    }

    public ArrayList<HashMap> getInfoCad(HashMap atributos, HashMap restricoes, String orderby) {
        cmd = utilsql.montaQuery(atributos, restricoes, "TB_INFOCAD", orderby);
        return connect.executaConsultaPadrao(cmd);
    }

    public InfoCad getInfoCad(int id) {
        cmd = "select IDOS,IDSERVICO,DS_QUANTIDADE from TB_INFOCAD where ID =" + id;
        retorno = connect.executaConsultaPadrao(cmd);
        singleRetorno = retorno.get(0);
        return new InfoCad(id,
                Utilidades.validaInt(singleRetorno.get("IDOS")),
                Utilidades.validaInt(singleRetorno.get("IDSERVICO")),
                Utilidades.validaDouble(singleRetorno.get("DS_QUANTIDADE")));
    }

    public boolean editarMaoDeObra(InfoCad ifc) {
        cmd = "update TB_INFOCAD set "
                + "IDOS=" + ifc.getIdOs()
                + ",IDSERVICO=" + ifc.getCod()
                + ",DS_QUANTIDADE=" + ifc.getQtd()
                + "where ID =" + ifc.getId();
        return connect.executaComandoPadrao(cmd);
    }

    public boolean excluirInfoCad(int id) {
        cmd = "delete from TB_INFOCAD where id =" + id;
        return connect.executaComandoPadrao(cmd);
    }

    public boolean update(HashMap atributos, HashMap restricoes) {
        cmd = utilsql.montaQueryUpdate(atributos, restricoes, "TB_INFOCAD");
        return connect.executaComandoPadrao(cmd);
    }
}
