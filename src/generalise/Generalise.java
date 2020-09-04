/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generalise;

import outil.GeneriqueDAO;
import java.sql.Connection;

/**
 *
 * @author manohisoa
 */
public class Generalise {

    /**
     * @param args the command line arguments
     * @throws java.lang.NoSuchMethodException
     */
    public static void main(String[] args) throws Exception {
        Connection con = null;
        try {
            con = GeneriqueDAO.getConnection("trosa_db", "postgres", "m1234", "postgres", 5432, "localhost");
            // GeneriqueDAO.insert(new Trosa("sdq","sdfsf","USR0001","USR0002",29.0,Utilitaire.getCurrentTimeStamp(),1), con);
//            con.commit();
            Trosa[] rep = (Trosa[]) GeneriqueDAO.find(new Trosa(null, null, null, null, null, null, -776), "", con);
            for (Trosa test : rep) {
                System.out.println("testid= " + test.getId());
            }

            System.out.println(GeneriqueDAO.CACHE.containsKey("trosa"));
        } catch (Exception e) {
//            con.rollback();
            e.printStackTrace();
        } finally {
            if (con != null) {
                con.close();
            }
        }

    }

    public static void test(String bla) {
        bla += " ble";
    }

}
