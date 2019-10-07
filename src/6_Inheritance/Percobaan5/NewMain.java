package Percobaan5;



public class NewMain {

    public static void main(String[] args) {

        Manager1841720170Aryo M = new Manager1841720170Aryo();

        M.nama = "vivin";
        M.alamat = "Jl.Vinolia";
        M.umur = 25;
        M.jk = "Perempuan";
        M.gaji = 3000000;
        M.tunjangan = 1000000;
        M.tampilDataManager();

        Staff1841720170Aryo S = new Staff1841720170Aryo();
        S.nama = "Lestari";
        S.alamat = "Malang";
        S.umur = 25;
        S.jk = "Perempuan";
        S.gaji = 2000000;
        S.lembur = 500000;
        S.potongan = 250000;
        S.tampilDataStaff();

    }

}
