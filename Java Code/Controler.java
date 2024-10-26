/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final_project;

import java.sql.SQLException;

/**
 *
 * @author Diego de Luis Ballesteros
 */
public class Controler {
    private DataBase database;
    public View view;
    public Referee referee;
    public DeleteCollaborator collaboratorView;
    public CouplesList couplesList;
    public Couples couples;
    public Queries queries;
    public Material material;
    public DeleteWorkers deleteWorkers;
    public ChangeWorker changeWorkers;
    public AddCollaboration addCollaboration;
    public DeleteMaterials deleteMaterial;

    public Controler(View view, DataBase database, Referee referee, DeleteCollaborator collaboratorView, Couples couples, CouplesList couplesList, ShowMaterials workers,
            Queries queries, Material material, DeleteWorkers deleteWorkers, ChangeWorker changeWorkers, AddCollaboration addCollaboration, DeleteMaterials deleteMaterial) {
        this.database = database;
        this.view = view;
        this.referee = referee;
        this.collaboratorView = collaboratorView;
        this.couples = couples;
        this.couplesList = couplesList;
        this.queries = queries;
        this.material = material;
        this.deleteWorkers = deleteWorkers;
        this.changeWorkers = changeWorkers;
        this.addCollaboration = addCollaboration;
        this.deleteMaterial = deleteMaterial;
        this.view.setController(this);
        this.view.setVisible(true);
    }

    // Insert material
    public void insertMaterial(javax.swing.JTextField editionCode, javax.swing.JTextField materialCode, javax.swing.JTextField materialName,
            javax.swing.JTextField materialQuantity, javax.swing.JTextField CIF) throws SQLException {
        this.database.insertMaterial(editionCode, materialCode, materialName, materialQuantity, CIF);
    }

    public void materialData() {
        this.view.setVisible(false);
        this.material.setController(this);
        this.material.setVisible(true);
    }

    // Change referee
    public void changeReferee(javax.swing.JTextField matchCode, javax.swing.JTextField refereeDNI) throws SQLException {
        this.database.changeReferee(matchCode, refereeDNI);
    }

    public void refereeData() {
        this.view.setVisible(false);
        this.referee.setController(this);
        this.referee.setVisible(true);
    }

    // Save edition
    public void saveEdition(javax.swing.JTextField edition) throws SQLException {
        this.database.saveEdition(edition);
    }

    public void queryCouples(javax.swing.JTable couplesList) throws SQLException {
        this.database.queryCouples(couplesList);
    }

    public void couplesData() {
        this.view.setVisible(false);
        this.couples.setController(this);
        this.couples.setVisible(true);
    }

    // Show workers
    public void showWorkers(javax.swing.JTable tableWorkers, String table) throws SQLException {
        this.database.searchWorkerTable(tableWorkers, table);
    }

    public void showTables() {
        this.view.setVisible(false);
        this.queries.setController(this);
        this.queries.setVisible(true);
    }
    
    // Show Materials
    public void showMaterials(javax.swing.JTable tableCollaborators, String table) throws SQLException {
        this.database.searchMaterialsTable(tableCollaborators, table);
    }

    // Show collaborators
    public void showCollaborators(javax.swing.JTable tableCollaborators, String table) throws SQLException {
        this.database.searchCollaboratorsTable(tableCollaborators, table);
    }
    // Show referees
    public void showReferees(javax.swing.JTable tableCollaborators, String table) throws SQLException {
        this.database.searchRefereesTable(tableCollaborators, table);
    }

  
    // Delete collaborator
    public void deleteCollaborator(javax.swing.JTextField CIF, javax.swing.JTextField edition_code) throws SQLException {
        this.database.deleteCollaborator(CIF, edition_code);
    }
  

    public void collaboratorData() {
        this.view.setVisible(false);
        this.collaboratorView.setController(this);
        this.collaboratorView.setVisible(true);
    }
    
    // Delete material
    public void deleteMaterial(javax.swing.JTextField material_code) throws SQLException {
        this.database.deleteMaterial(material_code);
    }
  

    public void deleteMaterialData() {
        this.view.setVisible(false);
        this.deleteMaterial.setController(this);
        this.deleteMaterial.setVisible(true);
    }

    // Delete worker in a pitch
    public void deleteWorkerPitch(javax.swing.JTextField DNI) throws SQLException {
        this.database.deleteWorkerPitch(DNI);
    }
    
    public void deleteWorkerData() {
        this.view.setVisible(false);
        this.deleteWorkers.setController(this);
        this.deleteWorkers.setVisible(true);
    }
    
    // Add collaboration
    public void insertCollaboration(javax.swing.JTextField editionCode, 
            javax.swing.JTextField CIF, javax.swing.JTextField quantity) throws SQLException {
        this.database.insertCollaboration(editionCode, CIF, quantity);
    }
    
    public void insertCollaborationData() {
        this.view.setVisible(false);
        this.addCollaboration.setController(this);
        this.addCollaboration.setVisible(true);
    }
    // Change worker in a pitch
    public void changeWorkerPitch(javax.swing.JTextField DNI1, javax.swing.JTextField DNI2) throws SQLException {
        this.database.changeWorkerPitch(DNI1, DNI2);
    }

    public void changeWorkerData() {
        this.view.setVisible(false);
        this.changeWorkers.setController(this);
        this.changeWorkers.setVisible(true);
    }
    // Register material

    // General methods
    public void backToMenu() {
        this.referee.setVisible(false);
        this.collaboratorView.setVisible(false);
        this.couples.setVisible(false);
        this.queries.setVisible(false);
        this.couplesList.setVisible(false);
        this.couples.setVisible(false);
        this.deleteMaterial.setVisible(false);
        this.changeWorkers.setVisible(false);
        this.view.setVisible(true);
    }

    public void disconnect() {
        this.database.closeConnection();
    }

    public void cancel() {
        this.database.rollback();
    }

    public void commit() {
        this.database.commit();
    }

    public void tables() {
        this.couples.setVisible(false);
        this.queries.setVisible(true);
        this.queries.setController(this);
    }
}

