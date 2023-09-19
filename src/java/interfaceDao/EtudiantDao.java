/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaceDao;

import java.util.List;

/**
 *
 * @author user
 */

import java.util.List;
import modele.Etudiant;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public interface EtudiantDao {
    



    void create(Etudiant p);
    
    void update(Etudiant p);
    
    void delete(int id);

    List<Etudiant> findAll();

    Etudiant findById(int id);
}
