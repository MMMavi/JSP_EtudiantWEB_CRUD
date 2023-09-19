/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Daomapping;

/**
 *
 * @author user
 */



import connection.ConnectionFactory;
import interfaceDao.EtudiantDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modele.Etudiant;


public class EtudiantDAOImplementation implements EtudiantDao {
    
      Connection connection = ConnectionFactory.getConnection();

    // Constructor 
    public EtudiantDAOImplementation() {

    }

    // Create a new Person
    public void create(Etudiant etudiant) {

        PreparedStatement preparedStatement;

        try {
            String createQuery = "INSERT INTO etudiants(id, name) VALUES(?,?)";
            preparedStatement = connection.prepareStatement(createQuery);
            
            preparedStatement.setInt(1, etudiant.getId());
            preparedStatement.setString(2, etudiant.getName());
            
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Find by id
    @Override
    public Etudiant findById(int id) {

        Etudiant etudiant = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        try {
            String selectIdQuery = "SELECT * FROM etudiants where id = ?";
            preparedStatement = connection.prepareStatement(selectIdQuery);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        try {
            resultSet.next();
            etudiant = new Etudiant();
            etudiant.setId(resultSet.getInt("id"));
            etudiant.setName(resultSet.getString("name"));
            resultSet.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return etudiant;
    }

    // find All people
    public List<Etudiant> findAll() {

        List<Etudiant> etudiants = new ArrayList<>();
        Etudiant etudiant = null;
        ResultSet resultSet;
        PreparedStatement preparedStatement;

        try {
            String selectAllQuery = "SELECT * FROM etudiants ORDER BY ID";
            preparedStatement = connection.prepareStatement(selectAllQuery);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                etudiant = new Etudiant();
                etudiant.setId(resultSet.getInt("id"));
                etudiant.setName(resultSet.getString("name"));
                etudiants.add(etudiant);
            }
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return etudiants;
    }

    // Update person's info
    public void update(Etudiant etudiant) {

        PreparedStatement preparedStatement;

        try {
            String updateQuery = "UPDATE ETUDIANTS SET NAME = ? WHERE ID = ?";
            //System.out.println("Query = " + updateQuery);
            preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1, etudiant.getName());
            preparedStatement.setInt(2, etudiant.getId());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Delete person
    public void delete(int id) {

        PreparedStatement preparedStatement;

        try {
            String deleteQuery = "DELETE FROM ETUDIANTS WHERE ID =" + id;
            preparedStatement = connection.prepareStatement(deleteQuery);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    
    
}
