package interfacelatihan;

public class PascaSarjana1841720170Aryo extends Mahasiswa1841720170Aryo implements iCumlaude1841720170Aryo {

    public PascaSarjana1841720170Aryo(String nama) {
        super(nama);
    }

    @Override
    public void lulusAryo() {
        System.out.println("Aku sudah menyelesaikan TESIS");
    }

    @Override
    public void meraihIPKTinggiAryo() {
        System.out.println("IPK-ku lebih dari 3,71");
    }

}
