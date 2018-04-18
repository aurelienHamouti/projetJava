package dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MaterielDao {
    
    public MaterielDao(){}
    
    public static ArrayList loadMateriel(){
        ArrayList aLst = new ArrayList();
        try {
            Statement stmt = MyConnection.get().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM tblmateriel ORDER BY mat_nom");
            while (rs.next()) { 
                aLst.add(new domaine.Materiel(rs.getInt("mat_no"), rs.getString("mat_nom"), rs.getDouble("mat_prix"), rs.getInt("mat_rabais")));
            }
            stmt.close();
        } catch (SQLException ex) { ex.printStackTrace(); return null; }
        return aLst;
    }
    
    public static ArrayList getListeMateriel(String r){
        ArrayList aLst = new ArrayList();
        try {
            Statement stmt = MyConnection.get().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM tblmateriel WHERE mat_nom LIKE '%"+r+"%' OR mat_prix < '"+r+"' ORDER BY mat_nom");
            while (rs.next()) { 
                aLst.add(new domaine.Materiel(rs.getInt("mat_no"), rs.getString("mat_nom"), rs.getDouble("mat_prix"), rs.getInt("mat_rabais")));               
            }
            stmt.close();
        } catch (SQLException ex) { ex.printStackTrace(); return null; }
        return aLst;
    }   
    
    public static void appliquerRabais(int noMateriel, int rabais){
        try {
            Statement stmt = MyConnection.get().createStatement();
            stmt.executeUpdate("update tblmateriel SET mat_rabais = "+rabais+" WHERE mat_no ="+noMateriel+";");
            stmt.close();
        } catch (SQLException ex) { ex.printStackTrace(); return; }   
    }
    
}