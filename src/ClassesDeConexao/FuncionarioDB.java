/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDeConexao;

import DAO.FuncionarioDAO;
import Model.Funcionario;
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
public class FuncionarioDB implements FuncionarioDAO {

    private String cmd;
    private PreparedStatement stmt;
    private MySqlConnect connect;
    ArrayList<HashMap> retorno;
    HashMap singleRetorno;
    Utilidades util = new Utilidades();
    UtilSql utilsql = new UtilSql();

    public FuncionarioDB() {
        connect = MySqlConnect.getInstance();
    }

    @Override
    public boolean editarFuncionario(Funcionario f) {
        HashMap restricao = new HashMap();
        restricao.put("ID", f.getID());
        
        HashMap atributos = new HashMap();
        atributos.put("NM_FUNCIONARIO", f.getNmFuncionario());
        atributos.put("PIS", f.getPIS());
        cmd  = utilsql.montaQueryUpdate(atributos, restricao, "TB_FUNCIONARIO");
        //cmd = "update TB_FUNCIONARIO set nm_funcionario=" + utilsql.aplicarApostofo(f.getNmFuncionario()) + ", PIS=" + f.getPIS() + " where id=" + f.getID();
        return connect.executaComandoPadrao(cmd);
    }

    @Override
    public boolean criarFuncionario(Funcionario f) {
        cmd = "insert into TB_FUNCIONARIO values(null," + utilsql.aplicarApostofo(f.getNmFuncionario()) +","+ utilsql.aplicarApostofo(f.getPIS())+")";
        return connect.executaComandoPadrao(cmd);
    }

    @Override
    public boolean excluirFuncionario(int id) {
        cmd = "delete from TB_FUNCIONARIO where id =" + id;
        return connect.executaComandoPadrao(cmd);
    }

    @Override
    public ArrayList<HashMap> getFuncionarios(HashMap atributos,String orderby) {
        cmd = utilsql.montaQuery(atributos, "TB_FUNCIONARIO",orderby);
        return connect.executaConsultaPadrao(cmd);
    }

    @Override
    public Funcionario getFuncionario(int ID) {
        cmd = "select NM_FUNCIONARIO,PIS from TB_FUNCIONARIO where id =" + ID;
        retorno = connect.executaConsultaPadrao(cmd);
        singleRetorno = retorno.get(0);
        return new Funcionario(ID,
                util.validaString(singleRetorno.get("NM_FUNCIONARIO")),
                util.validaString(singleRetorno.get("PIS")));
    }

    @Override
    public ArrayList<HashMap> getFuncionarios(HashMap atributos, HashMap restricoes,String orderby) {
        cmd = utilsql.montaQuery(atributos,restricoes, "TB_FUNCIONARIO",orderby);
            return connect.executaConsultaPadrao(cmd);
    }

    @Override
    public boolean update(HashMap atributos, HashMap restricoes) {
        cmd = utilsql.montaQueryUpdate(atributos, restricoes, "TB_FUNCIONARIO");
        return connect.executaComandoPadrao(cmd);
    }

}
