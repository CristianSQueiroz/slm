/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Funcionario;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author csqueiroz
 */
public interface FuncionarioDAO extends BasicDAODB{

    public boolean editarFuncionario(Funcionario f);

    public boolean criarFuncionario(Funcionario f);

    public boolean excluirFuncionario(int ID);

    public ArrayList<HashMap> getFuncionarios(HashMap atributos,String orderby);

    public ArrayList<HashMap> getFuncionarios(HashMap atributos, HashMap restricoes,String orderby);

    public Funcionario getFuncionario(int ID);

}
