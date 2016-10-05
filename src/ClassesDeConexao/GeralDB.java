/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDeConexao;

import Contantes.Procedures;
import DAO.GeralDAO;
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
public class GeralDB implements GeralDAO {

    private String cmd;
    private PreparedStatement stmt;
    private MySqlConnect connect;
    ArrayList<HashMap> retorno;
    HashMap singleRetorno;
    Utilidades util = new Utilidades();

    public GeralDB() {
        connect = MySqlConnect.getInstance();
    }

    @Override
    public boolean executeProcedure(String procedure,HashMap parametros) {
        procedure = new Procedures().getProcedureParametros(procedure);
        return connect.executaComandoPadrao(UtilSql.preparaProcedure(procedure, parametros));
    }

    @Override
    public ArrayList<HashMap> getFuncoes() {
        return connect.executaConsultaPadrao("SELECT DS_FUNCAO FROM TB_FUNCOES order by DS_FUNCAO");
    }

    @Override
    public ArrayList<HashMap> executaConsulta(String consulta) {
        return connect.executaConsultaPadrao(consulta);
    }

}
