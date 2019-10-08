package tugas;

public class NewMain {

    public static void main(String[] args) {

        Pc1841720170Aryo p = new Pc1841720170Aryo();
        p.merk = "MSI GS65 8RF-219ID";
        p.jnsProsesor = "Intel Core i7-8750H";
        p.sizeMemory = 160000;
        p.kecProsesor = 20;
        p.ukuranMonitor = 13;
        p.tampilPC();

        Mac1841720170Aryo m = new Mac1841720170Aryo();
        m.merk = "MacbookPro 2019";
        m.jnsProsesor = "Intel Core i9 processor";
        m.sizeMemory = 32000;
        m.kecProsesor = 20;
        m.jnsBaterai = "Nickel Cadmium";
        m.security = "Windows Defender";
        m.tampilMac();

        Windows1841720170Aryo w = new Windows1841720170Aryo();
        w.merk = "ASUS TUF FX504";
        w.jnsProsesor = "INTEL i7";
        w.sizeMemory = 8000;
        w.kecProsesor = 20;
        w.fitur = "Portabilitas";
        w.tampilWindows();
    }

}
