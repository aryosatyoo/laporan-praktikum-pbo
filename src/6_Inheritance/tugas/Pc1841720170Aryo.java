package tugas;

public class Pc1841720170Aryo extends Komputer18417210270Aryo {

    public int ukuranMonitor;

    public Pc1841720170Aryo() {

    }

    public Pc1841720170Aryo(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilPC() {
        System.out.println("===PC===");
        super.tampilData();
        System.out.println("Ukuran Monitor        :" + ukuranMonitor + "inc");
    }

}
