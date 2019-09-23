package percobaan2;

public class Pelanggan {

    private String nama;
    private int hari;
    private Mobil mobil;
    private Sopir sopir;

    public Pelanggan() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHari() {
        return hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    public Sopir getSopir() {
        return sopir;
    }

    public void setSopir(Sopir sopir) {
        this.sopir = sopir;
    }

    public int hitungBiayaTotal(){
        return mobil.hitungBiayaMobil(hari)+sopir.hitungBiayaMobil(hari);
    }

}
