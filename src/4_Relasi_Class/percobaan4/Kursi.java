package percobaan4;
public class Kursi {
    private String nomor;
    private Penumpang penumpang;

    public Kursi(String nomor) {
        this.nomor = nomor;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public Penumpang getPenumpang() {
        return penumpang;
    }

    public void setPenumpang(Penumpang penumpang) {
        this.penumpang = penumpang;
    }
    
    public String Info(){
        String info="";
        info+="Nomer :"+nomor+"\n";
        if(this.penumpang!=null){
            info+="Penumpang : \n"+penumpang.Info()+"\n";
        }
        return info;
    }
}
