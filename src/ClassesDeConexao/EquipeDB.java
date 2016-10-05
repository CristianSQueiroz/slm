/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDeConexao;

import DAO.EquipeDAO;
import Model.Equipe;
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
public class EquipeDB implements EquipeDAO {

    private String cmd;
    private PreparedStatement stmt;
    private MySqlConnect connect;
    ArrayList<HashMap> retorno;
    HashMap singleRetorno;
    Utilidades util = new Utilidades();
    UtilSql utilsql = new UtilSql();

    public EquipeDB() {
        connect = MySqlConnect.getInstance();
    }

    @Override
    public boolean editarEquipe(Equipe e) {
        cmd = "update TB_EQUIPE set NM_EQUIPE=" + utilsql.aplicarApostofo(e.getNmEquipe())
                + ", NR_FUNCIONARIO=" + e.getNrFuncionario()
                + ", NM_CARRO = " + utilsql.aplicarApostofo(e.getNmCarro())
                + ", NR_PLACA = " + utilsql.aplicarApostofo(e.getNrPlaca())
                + " where id=" + e.getId();
        return connect.executaComandoPadrao(cmd);
    }

    @Override
    public boolean criarEquipe(Equipe e) {
        cmd = "insert into TB_EQUIPE values(null,"
                + utilsql.aplicarApostofo(e.getNmEquipe())
                + "," + e.getNrFuncionario()
                + "," + utilsql.aplicarApostofo(e.getNmCarro())
                + "," + utilsql.aplicarApostofo(e.getNrPlaca()) + ")";
        return connect.executaComandoPadrao(cmd);
    }

    @Override
    public boolean excluirEquipe(int id) {
        cmd = "delete from TB_EQUIPE where id =" + id;
        return connect.executaComandoPadrao(cmd);
    }

    @Override
    public ArrayList<HashMap> getEquipes(HashMap atributos,String orderby) {
        cmd = utilsql.montaQuery(atributos, "TB_EQUIPE",orderby);
        return connect.executaConsultaPadrao(cmd);
    }

    @Override
    public Equipe getEquipe(int ID) {
        cmd = "select * from TB_EQUIPE where id =" + ID;
        retorno = connect.executaConsultaPadrao(cmd);
        singleRetorno = retorno.get(0);
        return new Equipe(ID,
                util.validaInt(singleRetorno.get("NR_FUNCIONARIO")),
                util.validaString(singleRetorno.get("NM_EQUIPE")),
                util.validaString(singleRetorno.get("NM_CARRO")),
                util.validaString(singleRetorno.get("NR_PLACA")));
    }

    @Override
    public ArrayList<HashMap> getEquipes(HashMap atributos, HashMap restricoes,String orderby) {
        cmd = utilsql.montaQuery(atributos, restricoes, "TB_EQUIPE",orderby);
        return connect.executaConsultaPadrao(cmd);
    }

    @Override
    public boolean update(HashMap atributos, HashMap restricoes) {
        cmd = utilsql.montaQueryUpdate(atributos, restricoes, "TB_EQUIPE");
        return connect.executaComandoPadrao(cmd);
    }

}
