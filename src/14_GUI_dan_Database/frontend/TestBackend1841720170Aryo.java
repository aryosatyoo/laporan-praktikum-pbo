package frontend;

import backend.*;

public class TestBackend1841720170Aryo {

    public static void main(String[] args) {
        Kategori1821720170Aryo kat1 = new Kategori1821720170Aryo("Novel", "Koleksi buku novel");
        Kategori1821720170Aryo kat2 = new Kategori1821720170Aryo("Referensi", "Buku referensi ilmiah");
        Kategori1821720170Aryo kat3 = new Kategori1821720170Aryo("Komik", "Komik anak-anak");
// test insert
        kat1.save();
        kat2.save();
        kat3.save();
// test update
        kat2.setKeterangan("Koleksi buku referensi ilmiah");
        kat2.save();
// test delete
        kat3.delete();
// test select all
        for (Kategori1821720170Aryo k : new Kategori1821720170Aryo().getAll()) {
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }
// test search
        for (Kategori1821720170Aryo k : new Kategori1821720170Aryo().search("ilmiah")) {
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }
    }
}
