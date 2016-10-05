/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDeConexao;

import DAO.OrdemDeServicoDAO;
import Model.InfoCad;
import Model.OrdemDeServico;
import Model.Status;
import SQLUtil.MySqlConnect;
import Util.UtilSql;
import Util.Utilidades;
import com.mysql.jdbc.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import view.MainFrameSLM;

/**
 *
 * @author csqueiroz
 */
public class OrdemDeServicoDB implements OrdemDeServicoDAO {

    private String cmd;
    private PreparedStatement stmt;
    private MySqlConnect connect;
    ArrayList<HashMap> retorno;
    HashMap singleRetorno;
    Utilidades util = new Utilidades();
    UtilSql utilsql = new UtilSql();

    public OrdemDeServicoDB() {
        connect = MySqlConnect.getInstance();
    }

    @Override
    public boolean editarOrdemDeServico(OrdemDeServico os) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean CadastrarOrdemDeServico(OrdemDeServico os, InfoCad ifc) {
        String osValue = "SELECT Auto_increment FROM information_schema.tables WHERE table_name='TB_OS'";
        retorno = connect.executaConsultaPadrao(osValue);
        ifc.setIdOs(Utilidades.validaInt(retorno.get(0).get("AUTO_INCREMENT")));

        java.sql.Timestamp dateEmissaoTime = new java.sql.Timestamp(os.getDataEmissao().getTime());
        cmd = "INSERT INTO TB_OS (ID,NR_ORDEM,DT_EMISSAO,NM_CLIENTE,NR_OBRAS_CIVIS,NM_RUA,NUMERO,COMPL_CLIENTE,NR_TELEFONE,NM_BAIRRO,SERVICO_A_EXECUTAR,COD_RUA,COD_SETOR,NR_HIDROMETRO,STATUS_OS,REFERENCIA,IE_URGENCIA,CD_LICITACAO) values (null,"
                + utilsql.aplicarApostofo(os.getNumeroOrdem()) + " , "
                + utilsql.aplicarApostofo(dateEmissaoTime) + " , "
                + utilsql.aplicarApostofo(os.getCliente()) + " , "
                + os.getObrasCivis() + " , "
                + utilsql.aplicarApostofo(os.getRuaCliente()) + " , "
                + os.getNumero() + " , "
                + utilsql.aplicarApostofo(os.getComplementoCliente()) + " , "
                + os.getTelefoneCliente() + " , "
                + utilsql.aplicarApostofo(os.getBairro().toString()) + " , "
                + utilsql.aplicarApostofo(os.getServicosAExecutar()) + " , "
                + os.getCodRua() + " , "
                + os.getCodSetor() + " , "
                + os.getnHidrometro() + " , "
                + utilsql.aplicarApostofo(os.getStatus().toString()) + " , "
                + utilsql.aplicarApostofo(os.getReferencia()) + " , "
                + os.getUrgencia() + " , "
                + os.getCdLicitacao()
                + ")";
        if (connect.executaComandoPadrao(cmd)) {
            return new InfoCadDB().cadastrarInfoCad(ifc);
            //return new MaoDeObraDB().cadastrarMaoDeObra(mdo);
        }
        return false;
    }

    @Override
    public boolean cancelarOrdemDeServico(int ID, String motivo) {
        cmd = "UPDATE TB_OS SET STATUS_OS =" + utilsql.aplicarApostofo(Status.CANCELADA) + " WHERE ID=" + ID;
        if (connect.executaComandoPadrao(cmd)) {
            cmd = "INSERT INTO TB_OSNOTES VALUES(null," + ID + "," + MainFrameSLM.getInstance().getUsuario().getNrFuncionario() + "," + utilsql.aplicarApostofo(motivo) + ")";
            return connect.executaComandoPadrao(cmd);
        }
        return false;
    }

    @Override
    public ArrayList<HashMap> getOrdemDeServicos(HashMap atributos, String orderby) {
        cmd = utilsql.montaQuery(atributos, "TB_OS&ordem", orderby);
        return connect.executaConsultaPadrao(cmd);
    }

    @Override
    public ArrayList<HashMap> getOrdemDeServicos(HashMap atributos, HashMap restricoes, String orderby) {
        cmd = utilsql.montaQuery(atributos, restricoes, "TB_OS&ordem", orderby);
        return connect.executaConsultaPadrao(cmd);
    }

    @Override
    public OrdemDeServico getOrdemDeServico(int ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean executaOrdem(Date data, int IDEquipe, ArrayList<HashMap> OS) {
        String in = "(";
        for (HashMap hm : OS) {
            in += Utilidades.validaInt(hm.get("ID")) + ",";
        }
        in = in.substring(0, in.lastIndexOf(",")) + ")";
        java.sql.Timestamp dateInicial = new java.sql.Timestamp(data.getTime());
        cmd = "UPDATE TB_OS SET STATUS_OS= " + utilsql.aplicarApostofo(Status.EM_EXECUCAO) + " , "
                + "DT_INICIAL =" + utilsql.aplicarApostofo(dateInicial) + " , "
                + "NR_EQUIPE =" + IDEquipe
                + " WHERE ID IN " + in;
        return connect.executaComandoPadrao(cmd);
    }

    @Override
    public boolean finalizarOrdem(Date data, String observacao, int ID) {
        java.sql.Timestamp dateFinal = new java.sql.Timestamp(data.getTime());
        cmd = "UPDATE TB_OS SET STATUS_OS= " + utilsql.aplicarApostofo(Status.EXECUTADA) + " , "
                + "DT_FINAL =" + utilsql.aplicarApostofo(dateFinal) + " , "
                + "DS_OBSERVACAO =" + utilsql.aplicarApostofo(observacao)
                + " WHERE ID =" + ID;
        return connect.executaComandoPadrao(cmd);
    }

    @Override
    public boolean update(HashMap atributos, HashMap restricoes) {
        cmd = utilsql.montaQueryUpdate(atributos, restricoes, "TB_OS");
        return connect.executaComandoPadrao(cmd);
    }

}
