package percobaan3;
public class MainPercobaan3 {

    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234","Spongbob Squarepants");
        Pegawai asisten = new Pegawai("4567","Patrick Star");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru","Bisnis",masinis);
        System.out.println(keretaApi.Info());
    }
    
}
