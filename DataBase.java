/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final_project;

import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.DatabaseMetaData;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.OracleResultSet;
import oracle.jdbc.OracleStatement;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author Diego de Luis Ballesteros
 */
public class DataBase {

    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String user = "sys as sysdba";
    String password = "265122";
    Connection connection = null;
    Statement statement;

    String editionCode;

    public DataBase() {

    }

    public void establishConnection() {
        try {
            connection = DriverManager.getConnection(url, user, password);
            if (connection != null) {
                System.out.println("Connected to the database");
                statement = connection.createStatement();
                connection.setAutoCommit(false);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error connecting to the database");
        }
    }

    // Change referee
    public void changeReferee(javax.swing.JTextField matchCode, javax.swing.JTextField newRefereeDNI) throws SQLException {
        String update = "UPDATE MATCH_ SET DNI_REFEREE='"
                + newRefereeDNI.getText() + "' WHERE MATCH_CODE='"
                + matchCode.getText() + "'";
        statement.executeUpdate(update);
    }



    public void saveEdition(javax.swing.JTextField edition) {
        editionCode = edition.getText();
    }

    public void queryCouples(javax.swing.JTable couplesList) throws SQLException {
        this.commit();
        DefaultTableModel model = (DefaultTableModel) couplesList.getModel();

        // Remove existing rows
        int rows = model.getRowCount();
        for (int i = 0; i < rows; i++) {
            model.removeRow(0);
        }
        if(editionCode!=null) {
	        String query = "SELECT P.DNI, P.NAME_, P.LAST_NAME, B.SCORE FROM BELONGS B, PLAYER P WHERE B.EDITION_CODE='"
	                + editionCode + "' AND (P.DNI=B.DNI1 OR P.DNI=B.DNI2) ORDER BY B.SCORE DESC";

	        ResultSet resultSet = statement.executeQuery(query);
	      
	        int counter = 1;
	
	        while (resultSet.next()) {
	            if (counter % 2 == 1) {
	                String[] title = {"", "", "", ""};
	                model.addRow(title);
	            
	            }
	            String[] row = {resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4)};
	            model.addRow(row);
	            counter++;
	        }
        }
        	
    }

    // Show workers
    public void searchWorkerTable(javax.swing.JTable workerTable, String table) throws SQLException {
        this.commit();
        DefaultTableModel model = (DefaultTableModel) workerTable.getModel();

        // Remove existing rows
        int rows = model.getRowCount();
        for (int i = 0; i < rows; i++) {
            model.removeRow(0);
        }

        String show = "SELECT DNI, ROUND(SUM(((END_DATE-START_DATE)*24)),2) AS HOURS_ FROM WORKS GROUP BY DNI ORDER BY HOURS_ DESC";

        ResultSet resultSet = statement.executeQuery(show);

        if (table.equals("WORKS")) {
            while (resultSet.next()) {
                String[] row = {resultSet.getString(1), resultSet.getString(2)};
                model.addRow(row);
            }
        }
    }
    
 // Show Materials
    public void searchMaterialsTable(javax.swing.JTable materialsTable, String table) throws SQLException {
        this.commit();
        DefaultTableModel model = (DefaultTableModel) materialsTable.getModel();

        // Remove existing rows
        int rows = model.getRowCount();
        for (int i = 0; i < rows; i++) {
            model.removeRow(0);
        }

        String show = "SELECT MATERIAL_CODE, CIF, EDITION_CODE FROM MATERIAL";

        ResultSet resultSet = statement.executeQuery(show);

        if (table.equals("MATERIAL")) {
            while (resultSet.next()) {
                String[] row = {resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)};
                model.addRow(row);
            }
        }
    }
    
    //show collaborators
    public void searchCollaboratorsTable(javax.swing.JTable collaboratorsTable, String table) throws SQLException {
        this.commit();
        DefaultTableModel model = (DefaultTableModel) collaboratorsTable.getModel();

        // Remove existing rows
        int rows = model.getRowCount();
        for (int i = 0; i < rows; i++) {
            model.removeRow(0);
        }

        String show = "SELECT CIF, EDITION_CODE FROM COLLABORATES";

        ResultSet resultSet = statement.executeQuery(show);

        if (table.equals("COLLABORATES")) {
            while (resultSet.next()) {
                String[] row = {resultSet.getString(1), resultSet.getString(2)};
                model.addRow(row);
            }
        }
    }

    //show referees
    public void searchRefereesTable(javax.swing.JTable refereesTable, String table) throws SQLException {
        this.commit();
        DefaultTableModel model = (DefaultTableModel) refereesTable.getModel();

        // Remove existing rows
        int rows = model.getRowCount();
        for (int i = 0; i < rows; i++) {
            model.removeRow(0);
        }

        String show = "SELECT DNI_REFEREE, MATCH_CODE FROM MATCH_";

        ResultSet resultSet = statement.executeQuery(show);

        if (table.equals("REFEREE")) {
            while (resultSet.next()) {
                String[] row = {resultSet.getString(1), resultSet.getString(2)};
                model.addRow(row);
            }
        }
    }
    // Insert material
    public void insertMaterial(javax.swing.JTextField editionCode, javax.swing.JTextField materialCode, javax.swing.JTextField materialName,
            javax.swing.JTextField materialQuantity, javax.swing.JTextField CIF) throws SQLException {
        String update = "INSERT INTO MATERIAL VALUES ('" + materialCode.getText() + "','" + materialName.getText() + "','"
                + materialQuantity.getText() + "','" + CIF.getText() + "','" + editionCode.getText() + "')";
      
        statement.executeUpdate(update);
      
    }
    
    // Insert Collaboration
    public void insertCollaboration(javax.swing.JTextField editionCode, 
             javax.swing.JTextField CIF, javax.swing.JTextField quantity) throws SQLException {
        String update = "INSERT INTO COLLABORATES VALUES ('" + CIF.getText() + "','" + editionCode.getText() + "','"
                + quantity.getText() + "')";
      
        statement.executeUpdate(update);
      
    }

    // Delete collaborator
    public void deleteCollaborator(javax.swing.JTextField CIF, javax.swing.JTextField edition_code) throws SQLException {
        String delete = "DELETE FROM COLLABORATES WHERE CIF='"
                + CIF.getText() + "' AND EDITION_CODE= '"+edition_code.getText() + "'";
        statement.execute(delete);
    }
    // Delete material
    public void deleteMaterial(javax.swing.JTextField material_code) throws SQLException {
        String delete = "DELETE FROM MATERIAL WHERE MATERIAL_CODE='"
                + material_code.getText() + "'";
        statement.execute(delete);
    }
    
    //delete worker from a pitch
    public void deleteWorkerPitch(javax.swing.JTextField DNI) throws SQLException {
        String delete = "DELETE FROM WORKS WHERE DNI='"
                + DNI.getText() + "'";
        statement.execute(delete);
    }
    
    public void changeWorkerPitch(javax.swing.JTextField DNI1, javax.swing.JTextField DNI2) throws SQLException {
        String update = "UPDATE WORKS SET DNI = '"+ DNI1.getText() + "' WHERE DNI= '" +DNI2.getText() +"'";
               
        statement.executeUpdate(update);
    }

    // Register material
    public void rollback() {
        try {
            connection.rollback();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void commit() {
        try {
            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void closeConnection() {
        try {
            statement.close();
            connection.close();
            System.out.println("Disconnected successfully");
            System.exit(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error disconnecting from the database");
            System.exit(0);
        }
    }
}

