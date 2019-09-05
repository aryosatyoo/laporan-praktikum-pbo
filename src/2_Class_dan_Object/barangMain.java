package tugas3;
public class barangMain {
    public static void main(String[] args){
    
    Barang br = new Barang();
    
    br.kode="A1";
    br.namaBarang = "Gelas";
    br.hargaDasar = 2000;
    br.diskon = 0.1;
    br.hitungHargaJual();
    br.tampilData();
    }
    
}
