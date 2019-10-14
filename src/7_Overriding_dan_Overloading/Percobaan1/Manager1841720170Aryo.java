package Percobaan1;
public class Manager1841720170Aryo extends Karyawan1841720170Aryo {

    private double tunjangan;
    private String bagian;
    private Staff1841720170Aryo st[];

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public String getBagian() {
        return bagian;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public void setStaff(Staff1841720170Aryo[] st) {
        this.st = st;
    }

    public void viewStaff() {
        int i;
        System.out.println("---------------------------");
        for (i = 0; i < st.length; i++) {
            st[i].lihatInfo();
        }
        System.out.println("-------------------------------");
    }

    public void lihatInfo() {
        System.out.println("Manager :" + this.getBagian());
        System.out.println("NIP :" + this.getNip());
        System.out.println("Nama :" + this.getNama());
        System.out.println("Golongan :" + this.getGolongan());
        System.out.println("Tunjangan :" + this.getTunjangan());
        System.out.println("Gaji :" + this.getGaji());
        System.out.println("Bgian :" + this.getBagian());
        this.viewStaff();
    }

    public double getGaji() {
        return super.getGaji() + tunjangan;
    }
}
