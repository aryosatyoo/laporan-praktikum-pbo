package Percobaan6;

import Percobaan5.*;



public class Manager1841720170Aryo extends Karyawan1841720170Aryo {

    public int tunjangan;

    public Manager1841720170Aryo() {
    }

    public void tampilDataManager() {
        super.tampilDataKaryawan();
        System.out.println("Tunjangan   : " + tunjangan);
        System.out.println("Total Gaji  : " + super.gaji
                + tunjangan);
    }

}
