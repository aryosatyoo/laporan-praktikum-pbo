package tugas2;

public class KoperasiDemo {

    private int Nik, Pinjam;
    private int Limit;
    private int Angsur;
    private String Nama;

    public KoperasiDemo(int Nik, String Nama, int limit) {
        this.Nik = Nik;
        this.Nama = Nama;
        this.Limit = limit;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public int getNik() {
        return Nik;
    }

    public void setNik(int Ktp) {
        this.Nik = Ktp;
    }

    public int getLimit() {
        return Limit;
    }

    public void setLimit(int Limit) {
        this.Limit = Limit;
    }

    public int getAngsur() {
        return Angsur;
    }

    public void setAngsur(int Angsur) {
        int a = 10 * this.Pinjam / 100;
        if (a <= Angsur) {
            this.Pinjam -= Angsur;
        } else {
            System.out.println("Sorry, Angsuran harus 10% dari jumlah peminjaman ");
        }
    }
    
    public int getPinjam() {
        return Pinjam;
    }
    
    public void setPinjam(int newPinjaman){
        if(newPinjaman <= Limit){
            this.Pinjam += newPinjaman;
        }
        else{
            System.out.println("Sorry, pinjaman melebihi dari limit");
        }
    }
}
