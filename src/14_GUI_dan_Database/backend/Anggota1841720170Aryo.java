package backend;

import java.util.ArrayList;
import java.sql.*;
import backend.*;

public class Anggota1841720170Aryo {

    private int idAnggota;
    private String nama;
    private String alamat;
    private String telepon;

    public int getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(int idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public Anggota1841720170Aryo() {

    }

    public Anggota1841720170Aryo(String nama, String alamat, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public Anggota1841720170Aryo getById(int id) {
        Anggota1841720170Aryo agt = new Anggota1841720170Aryo();
        ResultSet rs = DBHelper1841720170Aryo.selectQuery("SELECT * FROM anggota " + " WHERE idAnggota = '" + id + "'");

        try {
            while (rs.next()) {
                agt = new Anggota1841720170Aryo();
                agt.setIdAnggota(rs.getInt("idAnggota"));
                agt.setNama(rs.getString("nama"));
                agt.setAlamat(rs.getString("alamat"));
                agt.setTelepon(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return agt;
    }

    public ArrayList<Anggota1841720170Aryo> getAll() {
        ArrayList<Anggota1841720170Aryo> ListAnggota = new ArrayList();

        ResultSet rs = DBHelper1841720170Aryo.selectQuery("SELECT * FROM anggota");

        try {
            while (rs.next()) {
                Anggota1841720170Aryo agt = new Anggota1841720170Aryo();
                agt.setIdAnggota(rs.getInt("idAnggota"));
                agt.setNama(rs.getString("nama"));
                agt.setAlamat(rs.getString("alamat"));
                agt.setTelepon(rs.getString("telepon"));

                ListAnggota.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListAnggota;
    }

    public ArrayList<Anggota1841720170Aryo> search(String keyword) {
        ArrayList<Anggota1841720170Aryo> ListAnggota = new ArrayList();

        String sql = "Select * from anggota where " + " nama like '%" + keyword + "%' " + " or alamat like '%" + keyword + "%' ";

        ResultSet rs = DBHelper1841720170Aryo.selectQuery(sql);

        try {
            while (rs.next()) {
                Anggota1841720170Aryo agt = new Anggota1841720170Aryo();
                agt.setIdAnggota(rs.getInt("idAnggota"));
                agt.setNama(rs.getString("nama"));
                agt.setAlamat(rs.getString("alamat"));
                agt.setTelepon(rs.getString("telepon"));

                ListAnggota.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListAnggota;
    }

    public void save() {
        if (getById(idAnggota).getIdAnggota() == 0) {
            String SQL = "Insert into anggota (nama,alamat,telepon) values("
                    + " '" + this.nama + "', "
                    + " '" + this.alamat + "', "
                    + " '" + this.telepon + "' "
                    + " )";
            this.idAnggota = DBHelper1841720170Aryo.insertQueryGetId(SQL);
        } else {
            String SQL = "Update anggota set"
                    + " nama = '" + this.nama + "', "
                    + " alamat = '" + this.alamat + "', "
                    + " telepon = '" + this.telepon + "' "
                    + "Where idAnggota = '" + this.idAnggota + "'";
            DBHelper1841720170Aryo.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM anggota WHERE idAnggota = '" + this.idAnggota + "'";
        DBHelper1841720170Aryo.executeQuery(SQL);
    }

}
