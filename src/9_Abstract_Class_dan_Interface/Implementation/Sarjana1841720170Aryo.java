package Implementation;

import interfacelatihan.*;

public class Sarjana1841720170Aryo extends Mahasiswa1841720170Aryo implements iCumlaude1841720170Aryo, iBerprestasi1841720170Aryo {

    public Sarjana1841720170Aryo(String nama) {
        super(nama);
    }

    @Override
    public void lulusAryo() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggiAryo() {
        System.out.println("IPK-ku lebih dari 3,51");
    }

    @Override
    public void menjuaraiKompetisiAryo() {
        System.out.println("Saya telah menjuarai kompetisi NASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiahAryo() {
        System.out.println("Saya menerbitkan artikel di jurnal NASIONAL");
    }
}
