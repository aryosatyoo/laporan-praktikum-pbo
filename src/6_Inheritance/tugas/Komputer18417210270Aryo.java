package tugas;

public class Komputer18417210270Aryo {

    public String merk, jnsProsesor;
    public int kecProsesor, sizeMemory;

    public Komputer18417210270Aryo() {

    }

    public Komputer18417210270Aryo(String merk, int kecProsesor,
            int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;

    }

    public void tampilData() {
        System.out.println("Nama Merk            :" + merk);
        System.out.println("Kecepatan Prosesor   :" + kecProsesor 
                + "Ghz");
        System.out.println("Ukuran Memory        :" + sizeMemory 
                + "GB");
        System.out.println("Jenis Prosesor       :" + jnsProsesor);
    }

}
