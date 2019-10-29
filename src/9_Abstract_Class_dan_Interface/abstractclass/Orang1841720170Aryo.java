package abstractclass;

public class Orang1841720170Aryo {

    private String nama;
    private Hewan1841720170Aryo hewanPeliharaan;

    public Orang1841720170Aryo(String nama) {
        this.nama = nama;
    }

    public void peliharaHewan(Hewan1841720170Aryo hewanPeliharaan) {
        this.hewanPeliharaan = hewanPeliharaan;
    }

    public void ajakPeliharaanJalanJalan() {
        System.out.println("Namaku " + this.nama);
        System.out.println("Hewan peliharaanku berjalan dengan cara: ");
        this.hewanPeliharaan.bergerakAryo();
        System.out.println("-----------------------------------------");
    }
}
