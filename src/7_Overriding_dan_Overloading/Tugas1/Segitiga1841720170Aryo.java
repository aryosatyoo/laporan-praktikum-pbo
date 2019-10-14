package Tugas1;

public class Segitiga1841720170Aryo {

    private int sudut;

    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        System.out.println("Total Sudut : " + sudut);
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB) {
        System.out.println("Total Sudut : " + sudut);
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        int kel = sisiA + sisiB + sisiC;
        System.out.println("Keliling Segitiga : " + kel);
        return kel;
    }

    public double keliling(int sisiA, int sisiB) {
        double akar = (Math.sqrt(sisiA * sisiA) + Math.sqrt(sisiB * sisiB));
        System.out.println("Sudut C : " + akar);
        return akar;
    }
}
