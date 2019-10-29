package Implementation;

import interfacelatihan.*;

public class Rektor1841720170Aryo {

    public void beriSertifikatCumlaude(iCumlaude1841720170Aryo Mahasiswa1841720170Aryo) {
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! silahkan perkenalkan diri Anda..");

        Mahasiswa1841720170Aryo.lulusAryo();
        Mahasiswa1841720170Aryo.meraihIPKTinggiAryo();

        System.out.println("--------------------------------------------");
        
    }
    public void beriSertifikatMawapres(iBerprestasi1841720170Aryo Mahasiswa1841720170Aryo) {
        System.out.println("Saya REKTOR,memberikan sertifikat MAWAPRES");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");

        Mahasiswa1841720170Aryo.menjuaraiKompetisiAryo();
        Mahasiswa1841720170Aryo.membuatPublikasiIlmiahAryo();

        System.out.println("---------------------------------------------");
    }
}
