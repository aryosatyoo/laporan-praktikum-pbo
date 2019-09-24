package tugas;
public class Penonton {

    private String nama;
    private int noPemesanan;

    Penonton(String nama, int noPemesanan) {
        this.nama = nama;
        this.noPemesanan = noPemesanan;
    }

    public Penonton() {

    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNoPemesanan(int noPemesanan) {
        this.noPemesanan = noPemesanan;
    }

    public int getNoPemesanan() {
        return noPemesanan;
    }

    public String info() {
        String info = "";
        info += "Nama          : " + nama + "\n";
        info += "No.Pemesanan  : " + noPemesanan + "\n";
        return info;
    }
}
