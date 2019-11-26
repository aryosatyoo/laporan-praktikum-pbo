package aryo.percobaan4;

import java.util.ArrayList;

public class InputData1841720170Aryo {

    ArrayList<Mahasiswa1841720170Aryo> ListMahasiswa;

    public InputData1841720170Aryo() {
        ListMahasiswa = new ArrayList();
    }

    public void isiDataAryo(String Nim, String Nama, String Alamat) {
        Mahasiswa1841720170Aryo mhs = new Mahasiswa1841720170Aryo(Nim, Nama, Alamat);
        ListMahasiswa.add(mhs);
    }

    public ArrayList<Mahasiswa1841720170Aryo> getData() {
        return ListMahasiswa;
    }
}
