package dbms;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Oorja Saxena
 */
public class DBMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/musync", "root", "Oo@120902");
             System.out.println(con);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBMS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBMS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
