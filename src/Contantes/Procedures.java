/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contantes;

/**
 *
 * @author csqueiroz
 */
public class Procedures {

    public String ObterSeVinculoOSItemCobranca(String IDCobranca) {
        String retorno;
        retorno = " (select COUNT(*) "
                + "FROM	TB_OS OS, TB_ITENS_COBRANCA IC,	TB_INFOCAD INFOC "
                + "WHERE INFOC.IDOS = OS.ID "
                + "AND INFOC.IDSERVICO = IC.ID "
                + "AND IC.ID = " + IDCobranca + " "
                + "AND OS.ID = ordem.ID) > 0";
        return retorno;
    }

    public String ObterSeVinculoOSItemCobrancaRel(String IDCobranca) {
        String retorno;
        retorno = " (select COUNT(*) "
                + "FROM	TB_OS OS, TB_ITENS_COBRANCA IC,	TB_INFOCAD INFOC "
                + "WHERE INFOC.IDOS = OS.ID "
                + "AND INFOC.IDSERVICO = IC.ID "
                + "AND IC.ID = " + IDCobranca + " "
                + "AND OS.ID = os.ID) > 0";
        return retorno;
    }

    public String getProcedureParametros(String procedure) {
        switch (procedure) {
            case "ALTERAR_STATUS_OS":
                return "ALTERAR_STATUS_OS(ID_OS_P , OPCAO_STATUS)";
        }
        return "";
    }
}
