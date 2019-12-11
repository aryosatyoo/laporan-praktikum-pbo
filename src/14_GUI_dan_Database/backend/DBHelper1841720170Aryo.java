package backend;

import java.sql.*;

public class DBHelper1841720170Aryo {

    private static Connection sKoneksi;

    private static void bukaKoneksiAryo() {
        if (sKoneksi == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                sKoneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbperpus?useTimezone=true&serverTimezone=UTC", "root", "");
            } catch (Exception e) {
                System.out.println("Error koneksi!");
            }
        }
    }

    public static int insertQueryGetId(String query) {
        bukaKoneksiAryo();
        int num = 0;
        int result = -1;
        try {
            Statement stmt = sKoneksi.createStatement();
            num = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                result = rs.getInt(1);
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            result = -1;
        }
        return result;
    }

    public static boolean executeQuery(String query) {
        bukaKoneksiAryo();
        boolean result = false;
        try {
            Statement stmt = sKoneksi.createStatement();
            stmt.executeUpdate(query);
            result = true;
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static ResultSet selectQuery(String query) {
        bukaKoneksiAryo();
        ResultSet rs = null;
        try {
            Statement stmt = sKoneksi.createStatement();
            rs = stmt.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
}
