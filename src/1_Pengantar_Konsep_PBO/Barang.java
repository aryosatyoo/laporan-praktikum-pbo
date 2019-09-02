package tugas;
public class Barang {
    
    private String nama;
    public int harga, hargatot, jumlah, hargatotal;
    double diskon;
    
    public void namaBarang (String newValue)
    {
        nama = newValue;
    }
    
    public void hargaSatuan (int newValue)
    {
        harga = newValue;
    }
    
    public void totalBarang(int newValue)
    {
        jumlah = newValue;
    }
    
    public void totalHarga ()
    {
        hargatot = harga * jumlah;
    }
    
    public void jumlahDiskon()
    {
        if(hargatot>=1000)
        {
            diskon = (hargatot - (hargatot*5)/100);        
        }
        
         if(hargatot>=2000)
        {
            diskon = (hargatot - (hargatot*10)/100);        
        }
        
         if(hargatot>=3000)
        {
            diskon = (hargatot - (hargatot*15)/100);        
        }
    }
    
    public void cetak()
    {
        System.out.println("Nama Barang : "+nama);
        System.out.println("Harga Barang : "+harga);
        System.out.println("Jumlah yang Dibeli : "+jumlah);
        System.out.println("Harga Asli : "+hargatot);
        System.out.println("Harga Diskon : "+diskon);
    }
    
}
