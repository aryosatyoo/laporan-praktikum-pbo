package tugas2;
public class Lingkaran {
    public double phi = 3.14;
    public double r;
    public double hasil, hitung;
    
    public double hitungLuas(){
        return hitung = r * r * phi;
    }
    
    public double hitungKeliling(){
        return hasil = 2 * phi * r;
    }
    
    public void cetak(){
        System.out.println("R : "+r);
        System.out.println("Luas : "+hitungLuas());
        System.out.println("Keliling : "+hitungKeliling());
        
    }
}
