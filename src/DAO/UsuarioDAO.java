/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Usuario;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author csqueiroz
 */
public interface UsuarioDAO extends BasicDAODB{

    boolean logar(Usuario u);

    boolean cadastrarUsuario(Usuario u);

    ArrayList<HashMap> getUsuarios(HashMap atributos,String orderby);
    
    ArrayList<HashMap> getUsuarios(HashMap atributos, HashMap restricoes,String orderby);

    Usuario getUsuario(int id);

    boolean editarUsuario(Usuario u);

    boolean excluirUsuario(int id);

}
