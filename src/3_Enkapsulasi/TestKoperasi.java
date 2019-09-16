package tugas2;

import java.util.Scanner;

public class TestKoperasi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sd = new Scanner(System.in);

        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("NIK : ");
        int nik = sd.nextInt();
        System.out.print("Limit Pinjam : ");
        int limit = sd.nextInt();

        KoperasiDemo kop = new KoperasiDemo(nik, nama, limit);

        System.out.println("--------");
        System.out.println("Nama :  " + nama);

        System.out.println("MENU : ");
        System.out.println("1. Pinjaman");
        System.out.println("2. Angsuran");
        System.out.print("Masukkan Pilihan : ");
        int koperasi = sd.nextInt();

        switch (koperasi) {
            case 1:
                System.out.print("Masukkan jumlah Pinjaman : ");
                int pinjam = sd.nextInt();
                kop.setPinjam(pinjam);
                System.out.println("---");
                System.out.println("Nama : "+nama);
                System.out.println("NIK : "+nik);
                System.out.println("Jumlah Pinjam : " + kop.getPinjam());
                break;
            case 2:
                System.out.print("Masukkan Angsuran Anda : ");
                int angsur = sd.nextInt();
                kop.setPinjam(angsur);
                System.out.println("---");
                System.out.println("Nama : "+nama);
                System.out.println("NIK : "+nik);
                System.out.print("Jumlah Angsur : " + kop.getAngsur());
                break;
        }
    }
}