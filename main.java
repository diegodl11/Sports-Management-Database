/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package final_project;

import java.sql.SQLException;


/**
 *
 * @author Diego de Luis Ballesteros
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Referee referee = new Referee();
        DeleteCollaborator collaboratorView = new DeleteCollaborator();
        Couples couples = new Couples();
        ShowMaterials workers = new ShowMaterials();
        Queries queries = new Queries();
        Material material = new Material();
        DeleteWorkers deleteWorkers = new DeleteWorkers();
        ChangeWorker changeWorkers = new ChangeWorker();
        CouplesList couplesList = new CouplesList();
        AddCollaboration addCollaboration = new AddCollaboration();
        DeleteMaterials deleteMaterial = new DeleteMaterials();
        // Connect to the database
        DataBase database = new DataBase();
        
        try {
            database.establishConnection();
        } catch (Exception e) {
            System.out.println("Error connecting to the database");
        }
        // Ask what to do
        View view = new View();
        Controler controller = new Controler(view, database, referee, collaboratorView, couples, couplesList, workers, queries, material, 
        		deleteWorkers, changeWorkers, addCollaboration, deleteMaterial);
    }
    
}
