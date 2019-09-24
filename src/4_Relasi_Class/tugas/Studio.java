package tugas;
public class Studio {

    private String kode;
    private Penonton penonton;

    public Studio(String kode, Penonton penonton) {
        this.kode = kode;
        this.penonton = penonton;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return kode;
    }

    public void setPenonton(Penonton penonton) {
        this.penonton = penonton;
    }

    public Penonton getPenoton() {
        return penonton;
    }

    public String info() {
        String info = "";
        info += penonton.info();
        info += "kode Studio : " + kode + "\n";
        return info;
    }
}
