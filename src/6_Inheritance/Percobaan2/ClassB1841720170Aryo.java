package Percobaan2;

public class ClassB1841720170Aryo extends ClassA1841720170Aryo {

    private int z;

    public void setZ(int z) {
        this.z = z;
    }

    public void getNilaiZ() {
        System.out.println("Nilai Z: " + z);
    }

    public void getJumlah() {
        System.out.println("Jumlah : " + (super.getX() + 
                super.getY() + z));
    }
}
