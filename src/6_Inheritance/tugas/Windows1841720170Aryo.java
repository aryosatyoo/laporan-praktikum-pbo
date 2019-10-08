package tugas;

public class Windows1841720170Aryo extends Laptop1841720170Aryo {

    public String fitur;

    public Windows1841720170Aryo() {

    }

    public Windows1841720170Aryo(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String fitur) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
        this.fitur = fitur;
    }

    public void tampilWindows() {
        System.out.println("===Windows===");
        super.tampilData();
        System.out.println("Fitur               :" + fitur);
    }

}
