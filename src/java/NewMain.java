
import Daomapping.EtudiantDAOImplementation;
import interfaceDao.EtudiantDao;
import java.util.List;
import javax.servlet.ServletException;
import modele.Etudiant;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author user
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      EtudiantDao dao
   = new EtudiantDAOImplementation ();
           List<Etudiant> listeEtudiants = dao.findAll();
        System.out.println(" la liste "+ listeEtudiants);
        
        
    //    Etudiant etu = new Etudiant(55, "TEST");
        //System.out.println(" l etudiant 0 "+ etu);
    Etudiant etu   = dao.findById(23);
         System.out.println(" l etudiant 0 " + etu);
        
    }
    
}
