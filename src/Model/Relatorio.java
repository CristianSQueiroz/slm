/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Util.Utilidades;
import static Util.Utilidades.validaInt;
import static Util.Utilidades.validaString;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author csqueiroz
 */
public class Relatorio {

    private int id;
    private String nmRelatorio;
    private String atributos;
    private String orientacao;

    public Relatorio() {
    }

    public Relatorio(int id, String nmRelatorio, String atributos, String orientacao) {
        this.id = id;
        this.nmRelatorio = nmRelatorio;
        this.atributos = atributos;
        this.orientacao = orientacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNmRelatorio() {
        return nmRelatorio;
    }

    public void setNmRelatorio(String nmRelatorio) {
        this.nmRelatorio = nmRelatorio;
    }

    public String getAtributos() {
        return atributos;
    }

    public void setAtributos(ArrayList<HashMap> camposAtributos) {
        atributos = "";
        for (HashMap hm : camposAtributos) {
            atributos += hm.get("ATRIBUTO") + "#";
            atributos += hm.get("SIZE") + "$";
            atributos += hm.get("ORDER") + "%";
        }
    }

    public void setAtributos(String atributos) {
        this.atributos = atributos;
    }

    public String getOrientacao() {
        return orientacao;
    }

    public void setOrientacao(String orientacao) {
        this.orientacao = orientacao;
    }

    public ArrayList<HashMap> getAtributosAsList() {
        ArrayList<HashMap> List = new ArrayList<>();
        String[] split = atributos.split("%");
        for (String s : split) {
            HashMap campo = new HashMap();
            campo.put("ATRIBUTO", s.substring(0, s.indexOf("#")));
            campo.put("SIZE", s.substring(s.indexOf("#") + 1, s.indexOf("$")));
            campo.put("ORDER", s.substring(s.indexOf("$") + 1, s.length()));
            List.add(campo);
        }
        return getListaOrdenada(List);
    }

    private ArrayList<HashMap> getListaOrdenada(ArrayList<HashMap> lista) {
        ArrayList<HashMap> listaOrdenada = new ArrayList<>();
        int contador = 0;
        while (listaOrdenada.size() < lista.size()) {
            for (HashMap hm : lista) {
                if (validaInt(hm.get("ORDER")) == contador) {
                    listaOrdenada.add(hm);
                }
            }
            contador++;
        }
        return listaOrdenada;
    }

    public String getSelect() {
        String select = "Select ";
        ArrayList<HashMap> lista = getAtributosAsList();
        for (int x = 0; x < lista.size(); x++) {
            select += lista.get(x).get("ATRIBUTO");
        }

        return select.substring(0, select.length()-1);
    }

}
