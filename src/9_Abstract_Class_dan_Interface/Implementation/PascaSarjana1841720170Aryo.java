package Implementation;

import interfacelatihan.*;

public class PascaSarjana1841720170Aryo extends Mahasiswa1841720170Aryo implements iCumlaude1841720170Aryo,iBerprestasi1841720170Aryo {

    public PascaSarjana1841720170Aryo(String nama) {
        super(nama);
    }

   @Override
    public void menjuaraiKompetisiAryo() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiahAryo() {
        System.out.println("Saya telah menerbitkan artikel di jurnal INTERNASIONAL");
    }

}
