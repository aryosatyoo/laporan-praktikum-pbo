package percobaan4;
public class MainPercobaan4 {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345","Mr.Krab");
        Penumpang budi = new Penumpang("1234","Budi");
        Gerbong gerbong = new Gerbong("A",10);
        gerbong.setPenumpang(p, 1);
        gerbong.setPenumpang(budi, 1);
        System.out.println(gerbong.Info());
    }   
}