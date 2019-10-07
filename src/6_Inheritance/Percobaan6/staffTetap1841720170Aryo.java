package Percobaan6;

public class staffTetap1841720170Aryo
        extends Staff1841720170Aryo {

    public String golongan;
    public int asuransi;

    public staffTetap1841720170Aryo() {

    }

    public staffTetap1841720170Aryo(String nama,
            String alamat, String jk, int umur,
            int gaji, int lembur, int potongan,
            String golongan, int asuransi) {

        super(nama, alamat, jk, umur, gaji, potongan, lembur);
        this.golongan = golongan;
        this.asuransi = asuransi;

    }

    public void tampilStaffTetap() {
        System.out.println("=======Data Staff Tetap=======");
        super.tampilDataStaff();
        System.out.println("Golongan            : " + golongan);
        System.out.println("Jumlah Asuransi     : " + asuransi);
        System.out.println("Gaji Bersih         : " + (gaji 
                + lembur - potongan - asuransi));
    }

}
