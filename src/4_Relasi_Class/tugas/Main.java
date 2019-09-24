package tugas;
public class Main {
    public static void main(String[] args) {
        Penonton p = new Penonton("Ario",1841720170);
        Studio s = new Studio("A1",p);
        Genre g = new Genre("Horor",s);
        Film f = new Film("Pocong pala mawang",g);
        
        System.out.println(f.info());
    }
}