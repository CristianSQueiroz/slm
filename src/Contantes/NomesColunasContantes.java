package Contantes;

import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author csqueiroz
 */
public class NomesColunasContantes {

    HashMap nomesColunas;

    public NomesColunasContantes() {
        nomesColunas = new HashMap();
        preenchendoNomeColunas();
    }

    public void preenchendoNomeColunas() {
        nomesColunas.put("NM_FUNCIONARIO", "Nome do funcionário");
        nomesColunas.put("ID", "Código");
        nomesColunas.put("NR_FUNCIONARIO", "Código do funcionário");
        nomesColunas.put("NM_USUARIO", "Nome do usuário");
        nomesColunas.put("NM_EQUIPE", "Equipe");
        nomesColunas.put("NM_CARRO", "Carro");
        nomesColunas.put("NR_PLACA", "Placa");
        nomesColunas.put("NM_CLIENTE", "Cliente");
        nomesColunas.put("NR_ORDEM", "Nº Ordem de serviço");
        nomesColunas.put("DT_EMISSAO", "Data de emissão");
        nomesColunas.put("STATUS_OS", "Status");
        nomesColunas.put("SERVICO_A_EXECUTAR", "Serviço a executar");
        nomesColunas.put("NM_BAIRRO", "Bairro");
        nomesColunas.put("NM_RUA", "Rua");
        nomesColunas.put("DS_FUNCAO", "Função");
        nomesColunas.put("DS_DESCRICAO", "Descrição");
        nomesColunas.put("VALOR", "Valor");
        nomesColunas.put("DS_SERVICO", "Descrição do serviço");
        nomesColunas.put("DS_LICITACAO", "Contratos");
        nomesColunas.put("DS_ORIENTACAO", "Orientação");
        nomesColunas.put("NM_RELATORIO", "Nome do relatório");
        nomesColunas.put("ORDER", "Ordem");
        nomesColunas.put("SIZE", "Tamanho");
        nomesColunas.put("ATRIBUTO", "Coluna");

    }

    public HashMap getNomesColunas() {
        return nomesColunas;
    }

    public String getNomeColuna(String atributo) {
        if (nomesColunas.containsKey(atributo)) {
            return nomesColunas.get(atributo).toString();
        }
        return atributo;
    }

}

