package tugas1;
public class sewaGame {
    
    public int id,sewa;
    public String nama, game;
    public double harga;
    
    public void cetak(){
        System.out.println("ID: "+id);
        System.out.println("Nama : "+nama);
        System.out.println("Game : "+game);
        System.out.println("Harga Sewa : "+harga);
        System.out.println("Lama Sewa : "+sewa);
        System.out.println("Total Harga : "+bayar());
    
    }
    
    public double bayar(){
        return harga * sewa;
    }
    
}