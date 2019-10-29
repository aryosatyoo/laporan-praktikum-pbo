package interfacelatihan;

public class Mahasiswa1841720170Aryo implements iCumlaude1841720170Aryo {

    protected String nama;

    public Mahasiswa1841720170Aryo(String nama) {
        this.nama = nama;
    }

    @Override
    public void lulusAryo() {
        System.out.println("BISMILLAH TERBAIK");
    }

    @Override
    public void meraihIPKTinggiAryo() {
        System.out.println("LEBIH DARI 3,5");
    }

    public void kuliahDikampusAryo() {
        System.out.println("Aku mahasiswa, namaku " + this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }

}
