package tugas3;
public class Barang {
    
    public String kode, namaBarang;
    public int hargaDasar;
    public double diskon;
    
    public double hitungHargaJual(){
        return hargaDasar - (diskon * hargaDasar);
    }
    
    public void tampilData(){
        System.out.println("Kode : "+kode);
        System.out.println("Nama Barang : " +namaBarang);
        System.out.println("Harga Dasar : "+hargaDasar);
        System.out.println("Diskon : "+diskon);
        System.out.println("Harga Jual : "+hitungHargaJual());
    }
    
}