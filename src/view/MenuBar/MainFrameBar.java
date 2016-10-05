/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.MenuBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import view.Gestao.GestaoDeParametros;
import view.Gestao.GestaoEquipe;
import view.Gestao.GestaoFuncionario;
import view.Gestao.GestaoItemCobranca;
import view.Gestao.GestaoLicitacao;
import view.Gestao.GestaoOrdemServico;
import view.Gestao.GestaoRelatorio;
import view.Gestao.GestaoServicoAExecutar;
import view.Gestao.GestaoUsuario;
import view.MainFrameSLM;

/**
 *
 * @author csqueiroz
 */
public class MainFrameBar extends JMenuBar {

    private JMenu cadastro;
    private JMenuItem gestaoFuncionario;
    private JMenuItem gestaoUsuario;
    private JMenuItem gestaoItensCobranca;
    private JMenuItem gestaoEquipe;
    private JMenuItem gestaoServicosAExecutar;
    private JMenuItem gestaoOrdemDeServico;
    private JMenuItem gestaoParametros;
    private JMenuItem gestaoDeRelatorios;
    private JMenuItem gestaoDeContratos;

    public MainFrameBar() {
        inicializacaoMenus();
        adicionandoAcoes();
        montandoMenu();
    }

    private void montandoMenu() {
        cadastro.add(gestaoFuncionario);
        cadastro.add(gestaoUsuario);
        cadastro.add(gestaoItensCobranca);
        cadastro.add(gestaoEquipe);
        cadastro.add(gestaoServicosAExecutar);
        cadastro.add(gestaoOrdemDeServico);
        cadastro.add(gestaoDeContratos);
        //cadastro.add(gestaoParametros);
        cadastro.add(gestaoDeRelatorios);
        this.add(cadastro);
    }

    public void inicializacaoMenus() {
        cadastro = new JMenu("Gestão");
        gestaoFuncionario = new JMenuItem("Gestão de Funcionários");
        gestaoUsuario = new JMenuItem("Gestão de Usuários");
        gestaoItensCobranca = new JMenuItem("Gestão de Itens de Cobrança");
        gestaoEquipe = new JMenuItem("Gestão de Equipes");
        gestaoServicosAExecutar = new JMenuItem("Gestão de Serviços à Executar");
        gestaoOrdemDeServico = new JMenuItem("Gestão de Ordem de Serviço");
        gestaoParametros = new JMenuItem("Gestão de parâmetros");
        gestaoDeRelatorios = new JMenuItem("Gestão de Relatórios");
        gestaoDeContratos = new JMenuItem("Gestão de Contratos");
    }

    public void adicionandoAcoes() {
        gestaoFuncionario.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrameSLM.getInstance().adicionarAba(new GestaoFuncionario(), "Gestão de Funcionários");
            }
        });
        gestaoUsuario.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrameSLM.getInstance().adicionarAba(new GestaoUsuario(), "Gestão de Usuários");
            }
        });
        gestaoEquipe.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrameSLM.getInstance().adicionarAba(new GestaoEquipe(), "Gestão de Equipes");
            }
        });
        gestaoServicosAExecutar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrameSLM.getInstance().adicionarAba(new GestaoServicoAExecutar(), "Gestão de Serviços À Executar");
            }
        });
        gestaoItensCobranca.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrameSLM.getInstance().adicionarAba(new GestaoItemCobranca(), "Gestão de Itens de Cobrança");
            }
        });
        gestaoOrdemDeServico.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrameSLM.getInstance().adicionarAba(new GestaoOrdemServico(), "Gestão de Ordem de Serviço");
            }
        });
        gestaoParametros.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrameSLM.getInstance().adicionarAba(new GestaoDeParametros(), "Gestão de Parâmetros");
            }
        });
        gestaoDeRelatorios.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrameSLM.getInstance().adicionarAba(new GestaoRelatorio(), "Gestão de Relatórios");
            }
        });
        gestaoDeContratos.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrameSLM.getInstance().adicionarAba(new GestaoLicitacao(), "Gestão de Contratos");
            }
        });
    }

    public void adiconandoShortCuts() {

    }

}
