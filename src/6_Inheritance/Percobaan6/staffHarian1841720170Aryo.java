package Percobaan6;

public class staffHarian1841720170Aryo
        extends Staff1841720170Aryo {

    public int jmlJamKerja;

    public staffHarian1841720170Aryo() {
    }

    public staffHarian1841720170Aryo(String nama, String alamat,
            String jk, int umur, int gaji, int lembur, 
            int potongan, int jmlJamKerja) {
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.jmlJamKerja = jmlJamKerja;

    }

    public void tampilStaffHarian() {
        System.out.println("=====Data Staff Harian=====");
        super.tampilDataStaff();
        System.out.println("Jumlah Jam Kerja : " + jmlJamKerja);
        System.out.println("Gaji Bersih      : " + (gaji
                + jmlJamKerja + lembur - potongan));
    }

}
