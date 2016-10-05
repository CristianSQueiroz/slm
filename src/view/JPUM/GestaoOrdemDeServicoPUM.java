/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.JPUM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import view.Filtro.FiltroGestaoOrdemServico;
import view.Gestao.GestaoOrdemServico;
import view.Gestao.PanelGestaoOrdemDeServico;

/**
 *
 * @author csqueiroz
 */
public class GestaoOrdemDeServicoPUM extends JPopupMenu {

    private GestaoOrdemServico gestaoOS;
    private JMenuItem atualizarJMI;
    private JMenuItem executarJMI;
    private JMenuItem cobrarJMI;
    private JMenuItem finalizarJMI;
    private JMenuItem cancelarJMI;
    private JMenuItem alterarStatusOSJMI;
    private JMenuItem lancarOSJMI;
    private JMenuItem imprimirOSJMI;
    private JMenuItem visualizarJMI;

    public GestaoOrdemDeServicoPUM(GestaoOrdemServico gestaoOS) {
        this.gestaoOS = gestaoOS;
        inicializarMenus();
        addActions();
    }

    private void inicializarMenus() {
        lancarOSJMI = new JMenuItem("Lançar OS (F1)");
        executarJMI = new JMenuItem("Executar OS (F2)");
        atualizarJMI = new JMenuItem("Atualizar consulta (F5)");
        finalizarJMI = new JMenuItem("Finalizar OS (F3)");
        cobrarJMI = new JMenuItem("Cobrar OS (F4)");
        cancelarJMI = new JMenuItem("Cancelar OS (F6)");
        alterarStatusOSJMI = new JMenuItem("Alterar status OS (Shift+A)");
        this.add(executarJMI);
        this.add(atualizarJMI);
        this.add(lancarOSJMI);
        this.add(finalizarJMI);
        this.add(cobrarJMI);
        this.add(cancelarJMI);
        this.add(alterarStatusOSJMI);

    }

    private void habilitarMenu() {
        executarJMI.setVisible(possuiLinhaSelecionada() && habilitaExecutar());
        atualizarJMI.setVisible(true);
        lancarOSJMI.setVisible(true);
        finalizarJMI.setVisible(possuiLinhaSelecionada() && habilitaFinalizar());
        cobrarJMI.setVisible(false);
        cancelarJMI.setVisible(possuiLinhaSelecionada());
        alterarStatusOSJMI.setVisible(possuiLinhaSelecionada() && !habilitaExecutar());
    }

    public boolean habilitaFinalizar() {
        boolean isEmExecucao = true;
        for (Object object : getValores("STATUS_OS")) {
            if (!object.toString().equalsIgnoreCase("EM_EXECUCAO")) {
                isEmExecucao = false;
                break;
            }
        }
        return isEmExecucao;
    }

    public boolean habilitaCobrar() {
        boolean isEmExecucao = true;
        for (Object object : getValores("STATUS_OS")) {
            if (!object.toString().equalsIgnoreCase("EXECUTADA")) {
                isEmExecucao = false;
                break;
            }
        }
        return isEmExecucao;
    }

    public boolean habilitaExecutar() {
        boolean isLancada = true;
        for (Object object : getValores("STATUS_OS")) {
            if (!object.toString().equalsIgnoreCase("LANCADA")) {
                isLancada = false;
                break;
            }
        }
        return isLancada;
    }

    private ArrayList<Object> getValores(String coluna) {

        return ((PanelGestaoOrdemDeServico) gestaoOS.getPanelSouth()).getTable().getValoresLinhasSelecionadas(coluna);
    }

    private boolean possuiLinhaSelecionada() {
        return (((PanelGestaoOrdemDeServico) gestaoOS.getPanelSouth()).getTable().getValoresLinhasSelecionadas() != null);
    }

    public void verificarMenus() {
        habilitarMenu();
    }

    private void addActions() {
        addKeyListener(KeyEvent.VK_F2, executarJMI);
        executarJMI.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ((PanelGestaoOrdemDeServico) gestaoOS.getPanelSouth()).executarOrdens();
            }
        });
        addKeyListener(KeyEvent.VK_F5, atualizarJMI);
        atualizarJMI.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ((PanelGestaoOrdemDeServico) gestaoOS.getPanelSouth()).atualizarConsulta(((FiltroGestaoOrdemServico) gestaoOS.getPanelNorth()).montarRestricoes());
            }
        });
        addKeyListener(KeyEvent.VK_F1, lancarOSJMI);
        lancarOSJMI.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ((PanelGestaoOrdemDeServico) gestaoOS.getPanelSouth()).cadastrarOrdem();
            }
        });
        addKeyListener(KeyEvent.VK_F3, finalizarJMI);
        finalizarJMI.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ((PanelGestaoOrdemDeServico) gestaoOS.getPanelSouth()).finalizarOrdens();
            }
        });
        addKeyListener(KeyEvent.VK_F4, cobrarJMI);
        cobrarJMI.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ((PanelGestaoOrdemDeServico) gestaoOS.getPanelSouth()).cobrarOrdens();
            }
        });
        addKeyListener(KeyEvent.VK_F6, cancelarJMI);
        cancelarJMI.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ((PanelGestaoOrdemDeServico) gestaoOS.getPanelSouth()).cancelarOrdem();
            }
        });
        addKeyListener(KeyEvent.VK_A, alterarStatusOSJMI, true);
        alterarStatusOSJMI.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ((PanelGestaoOrdemDeServico) gestaoOS.getPanelSouth()).alterarStatusOS();
            }
        });
    }

    private void addKeyListener(int keyCode, JMenuItem jMenuItem) {
        addKeyListener(keyCode, jMenuItem, false);
    }

    private void addKeyListener(int keyCode, JMenuItem jMenuItem, boolean shift) {
        KeyAdapter keyAdapter = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                if ((evt.getKeyCode() == keyCode)
                        && ((shift && evt.isShiftDown()) || !shift)) {
                    jMenuItem.doClick();
                }
            }
        };
        ((PanelGestaoOrdemDeServico) gestaoOS.getPanelSouth()).addKeyListener(keyAdapter);
        ((FiltroGestaoOrdemServico) gestaoOS.getPanelNorth()).addKeyListener(keyAdapter);

    }

}
