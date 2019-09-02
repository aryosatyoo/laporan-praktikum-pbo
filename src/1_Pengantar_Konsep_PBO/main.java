package tugas;
public class main {
    
    public static void main(String[]args)
    {
        Barang br = new Barang();
        
        br.namaBarang("Iphone X1");
        br.hargaSatuan(5000);
        br.totalBarang(2);
        br.totalHarga();
        br.jumlahDiskon();
        br.cetak();
        
    }
}