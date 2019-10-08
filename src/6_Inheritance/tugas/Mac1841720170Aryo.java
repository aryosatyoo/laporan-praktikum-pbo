package tugas;

public class Mac1841720170Aryo extends Laptop1841720170Aryo {

    public String security;

    public Mac1841720170Aryo() {

    }

    public Mac1841720170Aryo(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String security) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
        this.security = security;
    }

    public void tampilMac() {
        System.out.println("===MAC===");
        super.tampilData();
        System.out.println("Security             :" + security);
    }

}
