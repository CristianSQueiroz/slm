/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQLUtil;

import Dialogs.JOPaneAviso;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import view.MainFrameSLM;
import view.StatusBar;

public class MySqlConnect {

    Connection conn;

    String url = "duckbilly.com";
    String porta = "3306";
    String db = "duckb974_slm";
    String driver = "com.mysql.jdbc.Driver";

    String user = "duckb974_root";
    String pass = "012718";

    String urlComposto = "jdbc:mysql://" + url + ":" + porta + "/" + db;

    private static MySqlConnect connect;

    private StatusBar statusbar = MainFrameSLM.getInstance().getStatusBar();

    public static MySqlConnect getInstance() {
        if (connect == null) {
            connect = new MySqlConnect();
        }
        return connect;
    }

    private MySqlConnect() {

    }

    public void open() {
        try {
            //statusbar.setProcesso("Abrindo conexão");
            Class.forName(driver).newInstance();
            conn = (Connection) DriverManager.getConnection(urlComposto, user, pass);

        } catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            if (e.getMessage().contains("")) {

            }
        }
        //statusbar.setProcesso("");
    }

    public void close() {
        try {
            //statusbar.setProcesso("Fechando conexão");
            conn.close();
        } catch (SQLException e) {
            System.out.println((e.getMessage()));
            e.printStackTrace();
        }
        //statusbar.setProcesso("");
    }

    public Connection getConn() {
        return conn;
    }

    public ArrayList<HashMap> executaConsultaPadrao(String cmd) {
        //statusbar.setProcesso("Executando consulta");
        ArrayList<HashMap> retorno = new ArrayList<HashMap>();
        PreparedStatement stmt = null;
        try {
            open();
            stmt = (PreparedStatement) getConn().prepareStatement(cmd);
            System.out.println(cmd);
            ResultSet rs = stmt.executeQuery();
            int colunas = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                HashMap row = new HashMap();
                for (int x = 0; x < colunas; x++) {
                    row.put(rs.getMetaData().getColumnName(x + 1), rs.getObject(x + 1));
                }
                retorno.add(row);
            }
            stmt.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            close();
        }
        //statusbar.setProcesso("");
        return retorno;
    }

    public ArrayList<HashMap> executaConsultaPadrao(String cmd, boolean console) {
        //statusbar.setProcesso("Executando consulta");
        ArrayList<HashMap> retorno = new ArrayList<HashMap>();
        PreparedStatement stmt = null;
        try {
            open();
            stmt = (PreparedStatement) getConn().prepareStatement(cmd);
            if (console) {
                System.out.println(cmd);
            }
            ResultSet rs = stmt.executeQuery();
            int colunas = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                HashMap row = new HashMap();
                for (int x = 0; x < colunas; x++) {
                    row.put(rs.getMetaData().getColumnName(x + 1), rs.getObject(x + 1));
                }
                retorno.add(row);
            }
            stmt.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            close();
        }
        //statusbar.setProcesso("");
        return retorno;
    }

    public boolean executaComandoPadrao(String cmd) {
        //statusbar.setProcesso("Executando comando");
        ArrayList<HashMap> retorno = new ArrayList<HashMap>();
        HashMap row = new HashMap();
        PreparedStatement stmt = null;
        try {
            open();
            stmt = (PreparedStatement) getConn().prepareStatement(cmd);
            System.out.println(cmd);
            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            close();
        }
        //statusbar.setProcesso("");
        return false;
    }
}
