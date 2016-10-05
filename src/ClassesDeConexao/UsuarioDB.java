/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDeConexao;

import DAO.UsuarioDAO;
import Model.Usuario;
import SQLUtil.MySqlConnect;
import Util.UtilSql;
import Util.Utilidades;
import com.mysql.jdbc.PreparedStatement;
import java.util.ArrayList;
import java.util.HashMap;
import view.MainFrameSLM;

/**
 *
 * @author csqueiroz
 */
public class UsuarioDB implements UsuarioDAO {

    private String cmd;
    private PreparedStatement stmt;
    private MySqlConnect connect;
    ArrayList<HashMap> retorno;
    HashMap singleRetorno;
    Utilidades util = new Utilidades();
    UtilSql utilsql = new UtilSql();

    public UsuarioDB() {
        connect = MySqlConnect.getInstance();
    }

    @Override
    public boolean logar(Usuario u) {
        cmd = "select count(*),max(ID),max(NR_FUNCIONARIO) from TB_USUARIO where nm_usuario =" + utilsql.aplicarApostofo(u.getNmUsuario()) + " and ds_senha=" + utilsql.aplicarApostofo(u.getDsSenha());
        retorno = connect.executaConsultaPadrao(cmd,false);
        if ((Long) retorno.get(0).get("count(*)") >= 1) {
            MainFrameSLM.getInstance().setUsuario(new Usuario(Utilidades.validaInt(retorno.get(0).get("max(ID)")), Utilidades.validaInt(retorno.get(0).get("max(NR_FUNCIONARIO)")), u.getNmUsuario(),""));
            return true;
        }
        return false;
    }

    @Override
    public boolean cadastrarUsuario(Usuario u) {
        if (u.getInt() > 0) {
            return editarUsuario(u);
        } else {
            cmd = "insert into TB_USUARIO values(null," + u.getNrFuncionario() + "," + utilsql.aplicarApostofo(u.getNmUsuario()) + "," + utilsql.aplicarApostofo(u.getDsSenha()) + ")";
            return connect.executaComandoPadrao(cmd);
        }
    }

    @Override
    public ArrayList<HashMap> getUsuarios(HashMap atributos,String orderby) {
        cmd = utilsql.montaQuery(atributos, "TB_USUARIO",orderby);
        return connect.executaConsultaPadrao(cmd);
    }

    @Override
    public Usuario getUsuario(int id) {
        cmd = "select NR_FUNCIONARIO,NM_USUARIO,DS_SENHA from TB_USUARIO where id =" + id;
        retorno = connect.executaConsultaPadrao(cmd);
        singleRetorno = retorno.get(0);
        return new Usuario(id,
                util.validaInt(singleRetorno.get("NR_FUNCIONARIO")),
                util.validaString(singleRetorno.get("NM_USUARIO")),
                util.validaString(singleRetorno.get("DS_SENHA")));
    }

    @Override
    public boolean editarUsuario(Usuario u) {
        cmd = "update TB_USUARIO set NR_FUNCIONARIO = "+u.getNrFuncionario()+", NM_USUARIO=" + utilsql.aplicarApostofo(u.getNmUsuario()) + ", DS_SENHA=" + utilsql.aplicarApostofo(u.getDsSenha()) + " where id=" + u.getInt();
        return connect.executaComandoPadrao(cmd);
    }

    @Override
    public boolean excluirUsuario(int id) {
        cmd = "delete from TB_USUARIO where id =" + id;
        return connect.executaComandoPadrao(cmd);
    }

    @Override
    public ArrayList<HashMap> getUsuarios(HashMap atributos, HashMap restricoes,String orderby) {
        cmd = utilsql.montaQuery(atributos, restricoes, "TB_USUARIO",orderby);
        return connect.executaConsultaPadrao(cmd);
    }

    @Override
    public boolean update(HashMap atributos, HashMap restricoes) {
        cmd = utilsql.montaQueryUpdate(atributos, restricoes, "TB_USUARIO");
        return connect.executaComandoPadrao(cmd);
    }

}
