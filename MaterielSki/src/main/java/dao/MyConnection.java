package dao;

import java.sql.Connection;
import java.sql.SQLException;

public class MyConnection {
    static String typeBase = "MYSQL";
    static String nomBase = "Java634";
    static Connection cnx = null;

    public MyConnection(String typeBase, String nomBase) { this.typeBase=typeBase; this.nomBase=nomBase; }

    public static Connection get() {
        if (cnx == null){
            try {
                cnx = outils.Bases.connect(typeBase, nomBase);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return cnx;
    }

    public static void close() {
        if (cnx != null){
            try {
                cnx.close();
                cnx = null;
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}