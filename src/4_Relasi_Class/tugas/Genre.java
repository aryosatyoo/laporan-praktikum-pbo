package tugas;
public class Genre {

    private String namaGenre;
    private Studio studio;

    Genre(String namaGenre, Studio studio) {
        this.namaGenre = namaGenre;
        this.studio = studio;
    }

    public void setNamaGenre(String namaGenre) {
        this.namaGenre = namaGenre;
    }

    public String getNamaGenre() {
        return namaGenre;
    }

    public void getStudio(Studio studio) {
        this.studio = studio;
    }

    public Studio getStudio() {
        return studio;
    }

    public String info() {
        String info = "";
        info += studio.info();
        info += "Nama Genre : " + namaGenre + "\n";
        return info;
    }
}
