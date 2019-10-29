package abstractclass;

public class NewMain {

    public static void main(String[] args) {
        Kucing1841720170Aryo Kucingkampung = new Kucing1841720170Aryo();
        Ikan1841720170Aryo Lumbalumba = new Ikan1841720170Aryo();

        Orang1841720170Aryo ani = new Orang1841720170Aryo("Ani");
        Orang1841720170Aryo Budi = new Orang1841720170Aryo("Budi");

        ani.peliharaHewan(Kucingkampung);
        Budi.peliharaHewan(Lumbalumba);

        ani.ajakPeliharaanJalanJalan();
        Budi.ajakPeliharaanJalanJalan();

    }
}
