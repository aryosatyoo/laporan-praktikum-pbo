package tugas;
public class Film {

    private String film;
    private Genre genre;

    public Film(String film, Genre genre) {
        this.film = film;
        this.genre = genre;
    }

    public Film() {

    }

    public void setFilm(String film) {
        this.film = film;
    }

    public String getFilm() {
        return film;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    public String info() {
        String info = " ";
        info += genre.info();
        info += "Nama Film : " + film + "\n";
        return info;
    }
}
