package percobaan4;
public class Gerbong {
    private String kode;
    private Kursi arrayKursi[];

    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    public Gerbong(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public Kursi[] getArrayKursi() {
        return arrayKursi;
    }

    public void setArrayKursi(Kursi arrayKursi[], int nomor) {
        this.arrayKursi[nomor] = arrayKursi[nomor];
    }
    
    private void initKursi(){
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i+1));
        }
    }
    
    public String Info(){
        String info="";
        info +="Kode : "+kode+"\n";
        for(Kursi kursi : arrayKursi){
            info += kursi.Info();
        }
        return info;
    }
    
    public void setPenumpang(Penumpang penumpang, int mNomor){
        if(arrayKursi[mNomor-1].getPenumpang()==null){
            this.arrayKursi[mNomor-1].setPenumpang(penumpang);
        }
        else{
            System.out.println("Tidak mendapat tempat:) ");
            System.out.println(penumpang.Info());
            System.out.println("Nomor : "+mNomor);
        }
    }
}
