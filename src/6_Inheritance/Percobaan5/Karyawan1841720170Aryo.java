package Percobaan5;



public class Karyawan1841720170Aryo {

    public String nama, alamat, jk;
    public int umur, gaji;

    public Karyawan1841720170Aryo() {

    }

    public Karyawan1841720170Aryo(String nama, String alamat,
            String jk, int umur, int gaji) {

        this.nama = nama;
        this.alamat = alamat;
        this. jk = jk;
        this.umur = umur;
        this.gaji = gaji;

    }
    
    public void tampilDataKaryawan(){
        System.out.println("Nama             : "+nama);
        System.out.println("Alamat           : "+alamat);
        System.out.println("Jenis Kelamin    : "+jk);
        System.out.println("Umur             : "+umur);
        System.out.println("Gaji             : "+gaji);
    }

}
