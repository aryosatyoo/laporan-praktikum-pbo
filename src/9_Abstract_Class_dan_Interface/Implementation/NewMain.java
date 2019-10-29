package Implementation;

import interfacelatihan.*;

public class NewMain {

    public static void main(String[] args) {
        Rektor1841720170Aryo pakRektor = new Rektor1841720170Aryo();

//        Mahasiswa1841720170Aryo MahasiswaBiasa = new Mahasiswa1841720170Aryo("Charlie");
        Sarjana1841720170Aryo sarjanaCumlaude = new Sarjana1841720170Aryo("Dini");
        PascaSarjana1841720170Aryo masterCumlaude = new PascaSarjana1841720170Aryo("Elok");

//        MahasiswaBiasa.kuliahDikampusAryo();
//        pakRektor.beriSertifikatCumlaude(masterCumlaude);
//        sarjanaCumlaude.kuliahDikampusAryo();
//        pakRektor.beriSertifikatCumlaude(MahasiswaBiasa);
//        masterCumlaude.kuliahDikampusAryo();
//        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);

        pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapres(masterCumlaude);


    }

}
