# Laporan Praktikum #14 - GUI DAN DATABASE

## <h1>Kompetensi

Setelah menempuh materi percobaan ini, mahasiswa mampu mengenal:
1. Menggunakan paradigma berorientasi objek untuk interaksi dengan database
2. Membuat backend dan frontend
3. Membuat form sebagai frontend

## <h1>Ringkasan Materi

### <h1>Praktikum

### Percobaan 1

Membuat database.

1. Langkah pertama untuk percobaan ini adalah membuat database. Install XAMPP, buka
phpMyAdmin, buat database dbperpus, dan tabel-tabelnya:
<br>![Screenshot_1](img/Screenshot_1.png)

Set semua primary key id pada tiap tabel (idanggota, idkategori, idpeminjaman, idbuku) dengan
Auto Increment.

### Percobaan 2

1. Buat project baru, beri nama Perpustakaan.
2. Pada project explorer, klik kanan pada Libraries → Add Library, pilih MySQL JDBC Driver.
3. Buat package frontend dan backend. Cara membuat package adalah, pada project explorer, klik
kanan pada Source Packages → New → Java Package, beri nama package nya (frontend,
backend).
<br>![Screenshot_2](img/Screenshot_2.png)

### Percobaan 3

1. Pada package backend, buat class DBHelper.

2. Import java.sql.*
<br>![Screenshot_3](img/Screenshot_3.png)

3. Didalam class ini ada method-method antara lain:
<br>a. bukaKoneksi(), untuk membuka koneksi ke database
<br>![Screenshot_4](img/Screenshot_4.png)
<br>b. insertQueryGetId(String query), untuk melakukan insert ke tabel dan mengembalikan
nilai ID yang digenerate oleh database (hasil Auto Increment).
<br>![Screenshot_5](img/Screenshot_5.png)
<br>c. executeQuery(String query), untuk mengeksekusi query yang tidak mengembalikan nilai
(misal: insert, update, delete).
<br>d. selectQuery(String query), untuk mengeksekusi select query yang mengembalikan nilai
hasil query.
<br>![Screenshot_6](img/Screenshot_6.png)

4. Berikut adalah kode dari class DBHelper. Anda perlu sesuaikan method bukaKoneksi() dengan
setting database yang terinstall di sistem anda. Namun jika anda install XAMPP secara default,
maka setting ini tidak perlu diubah, mungkin nama database saja yang perlu disesuaikan.
Silahkan COPAS kode berikut ini.

### Percobaan 4

1. Pada package backend, buat class baru yaitu Kategori.

2. Tambahkan import java.util.ArrayList dan java.sql.*
<br>![Screenshot_7](img/Screenshot_7.png)

3. Tambahkan atribut sesuai field pada tabel kategori.
<br>![Screenshot_8](img/Screenshot_8.png)

4. Tambahkan getter setter untuk setiap atribut. Anda bisa gunakan fasilitas Insert Code pada
NetBeans. Caranya adalah, klik kanan sembarang tempat di editor, pilih Insert Code, pilih Setter
and Getter, centang semua atribut yang ada (idkategori, nama, keterangan).
<br>![Screenshot_9](img/Screenshot_9.png)

5. Tambahkan konstruktor default dan konstruktor custom, yang digunakan untuk mengeset
atribut nama dan keterangan. Atribut idkategori tidak boleh diset, karena id ini akan digenerate
secara otomatis lewat fitur AutoIncrement pada MySQL.
<br>![Screenshot_10](img/Screenshot_10.png)

6. Tambahkan method getById() untuk mendapatkan objek Kategori yang ada di database
berdasarkan id-nya.
<br>![Screenshot_11](img/Screenshot_11.png)

7. Tambahkan method getAll() untuk mendapatkan semua data Kategori yang ada di database, dan
ditampung ke ArrayList<Kategori>.
<br>![Screenshot_12](img/Screenshot_12.png)

8. Tambahkan method search() agar bisa melakukan pencarian data. Method ini mirip dengan
method getAll() namun querynya berbeda.
<br>![Screenshot_13](img/Screenshot_13.png)

9. Tambahkan method save(). Method ini memiliki dua fungsi, yaitu insert dan update. Jika data
yang diinputkan belum ada (idkategori = 0) maka akan otomatis insert. Jika data yang diinputkan
sudah ada, maka otomatis update.
<br>![Screenshot_14](img/Screenshot_14.png)

10. Tambahkan method delete() untuk melakukan operasi penghapusan pada tabel kategori pada
database.
<br>![Screenshot_15](img/Screenshot_15.png)

### Percobaan 5

1. Pada package frontend, buat class TestBackend. Tambahkan import backend.*

2. Berikut kode lengkap untuk class TestBackend. Silahkan di COPAS

3. Jalankan TestBackend dengan klik kanan, Run File. Cocokkan outputnya:
<br>![Screenshot_16](img/Screenshot_16.png)

### Percobaan 6

1. Pada package frontend, buat JFrame dengan nama FrmKategori. Caranya adalah, klik kanan

pada package frontend → New →JFrame Form.
2. Susun form sehingga seperti berikut ini, atur propertinya sesuai nomor:

3. Edit kodenya, tambahkan import backend.*, java.util.ArrayList,
javax.swing.table.DefaultTableModel;
<br>![Screenshot_17](img/Screenshot_17.png)

4. Tambahkan method kosongkanForm() untuk mengosongkan isian textbox pada form.
<br>![Screenshot_19](img/Screenshot_19.png)

5. Tambahkan method tampilkanData() untuk mengambil semua data kategori dari database dan
menampilkannya ke JTable tblKategori.
<br>![Screenshot_18](img/Screenshot_18.png)

6. Tambahkan method cari() untuk melakukan pencarian berdasarkan keyword tertentu.
<br>![Screenshot_20](img/Screenshot_20.png)

7. Pada konstruktor, tambahkan pemanggilan method kosongkanForm() dan tampilkanData(), agar
ketika form ditampilkan pertama kali, maka form isian akan kosong dan data kategori langsung
ditampilkan.
<br>![Screenshot_21](img/Screenshot_21.png)

8. Double klik pada btnSimpan untuk menambahkan kode untuk menyimpan data. Aksi
menyimpan ini secara otomatis menentukan apakah insert atau update, karena pada method
save() dari objek kat, sudah dicek apakah data baru atau sudah ada (baca Percobaan 4, no. 9)
<br>![Screenshot_22](img/Screenshot_22.png)

9. Double klik pada btnHapus untuk menambahkan kode untuk menghapus data.
<br>![Screenshot_23](img/Screenshot_23.png)

10. Double klik pada btnTambahBaru untuk mengosongkan form sehingga dapat digunakan untuk
menginputkan data baru.
<br>![Screenshot_24](img/Screenshot_24.png)

11. Double klik pada btnCari untuk melakukan pencarian terhadap keyword yang dimasukkan pada
txtCari.
<br>![Screenshot_25](img/Screenshot_25.png)

12. Agar kita dapat memilih data yang ada pada tblKategori, agar dapat diedit atau dihapus, maka
kita tambahkan event mouse click pada tblKategori. Ketika pengguna mengklik pada tblKategori,
maka data tersebut akan ditampilkan di tex field. Caranya, klik kanan pada tblKategori, pilih
Events → Mouse → MouseClicked. Tambahkan kode berikut ini:
<br>![Screenshot_26](img/Screenshot_26.png)

13. Jalankan form dengan opsi Run File. Kemudian ujicoba tambah baru, edit, hapus, cari.
<br>![Screenshot_27](img/Screenshot_27.png)

### Percobaan 7

1. Buat class Anggota pada package backend, lengkapi atribut dan method-nya.
<br>![Screenshot_28](img/Screenshot_28.png)
<br>![Screenshot_29](img/Screenshot_29.png)
<br>![Screenshot_30](img/Screenshot_30.png)
<br>![Screenshot_31](img/Screenshot_31.png)
<br>![Screenshot_32](img/Screenshot_32.png)

2. Lakukan test pada class TestBackend pada package frontend.
<br>![Screenshot_33](img/Screenshot_33.png)

### Percobaan 8

Buat form untuk data Anggota.

1. Buat FrmAnggota pada package frontend dan lengkapi komponen, method serta event-nya.
<br>![Screenshot_34](img/Screenshot_34.png)

### Percobaan 9
Untuk data Buku, caranya kurang lebih sama seperti data Kategori dan Anggota. Hanya saja yang
berbeda adalah:

<br>a. Pemanggilan getKategori().getIdKategori() pada query insert dan update untuk mengeset idkategori pada tabel buku
<br>b. Query select yang melibatkan join table pada method getById(), getAll() dan search().

<br>![Screenshot_35](img/Screenshot_35.png)
<br>![Screenshot_36](img/Screenshot_36.png)
<br>![Screenshot_37](img/Screenshot_37.png)

<br>Kode lengkap class Buku dapat anda lihat di Lampiran 1. Untuk test buku pada frontend, bisa anda
lihat di Lampiran 2.

### Percobaan 10
Membuat GUI untuk data Buku, yang dilengkapi dengan combo box untuk memilih kategori yang
terhubung dengan tabel kategori.

1. Pada package frontend, buat jFrame FrmBuku. Susun formnya sebagai berikut:

2. Edit kodenya, tambahkan import backend.*, java.util.ArrayList,
javax.swing.table.DefaultTableModel, javax.swing.DefaultComboBoxModel;
<br>![Screenshot_38](img/Screenshot_38.png)

3. Tambahkan method kosongkanForm() untuk mengosongkan isian textbox pada form.
<br>![Screenshot_39](img/Screenshot_39.png)

4. Tambahkan method tampilkanData() untuk mengambil semua data buku dari database dan
menampilkannya ke JTable tblBuku.
<br>![Screenshot_41](img/Screenshot_41.png)

5. Tambahkan method cari() untuk melakukan pencarian berdasarkan keyword tertentu.
<br>![Screenshot_42](img/Screenshot_42.png)

6. Tambahkan method tampilkanCmbKategori() untuk mengambil data Kategori dari database dan
menampilkannya ke cmbKategori.
<br>![Screenshot_43](img/Screenshot_43.png)

7. Pada konstruktor, tambahkan pemanggilan method kosongkanForm(), tampilkanCmbKategori()
dan tampilkanData(), agar ketika form ditampilkan pertama kali, maka form isian akan kosong
dan data buku langsung ditampilkan.
<br>![Screenshot_44](img/Screenshot_44.png)

8. Double klik pada btnSimpan untuk menambahkan kode untuk menyimpan data. Aksi
menyimpan ini secara otomatis menentukan apakah insert atau update, karena pada method
save() dari objek kat, sudah dicek apakah data baru atau sudah ada (baca Percobaan 4, no. 9)
<br>![Screenshot_45](img/Screenshot_45.png)

9. Double klik pada btnHapus untuk menambahkan kode untuk menghapus data.
<br>![Screenshot_46](img/Screenshot_46.png)

10. Double klik pada btnTambahBaru untuk mengosongkan form sehingga dapat digunakan untuk
menginputkan data baru.
<br>![Screenshot_47](img/Screenshot_47.png)

11. Double klik pada btnCari untuk melakukan pencarian terhadap keyword yang dimasukkan pada
txtCari.
<br>![Screenshot_48](img/Screenshot_48.png)

12. Agar kita dapat memilih data yang ada pada tblBuku, agar dapat ditampilkan di textfield untuk
diedit atau dihapus, maka kita tambahkan event mouse click pada tblKategori. Caranya, klik
kanan pada tblBuku, pilih Events → Mouse → MouseClicked. Tambahkan kode berikut ini:
<br>![Screenshot_49](img/Screenshot_49.png)

13. Jalankan form dengan opsi Run File. Kemudian ujicoba tambah baru, edit, hapus, cari
<br>![Screenshot_40](img/Screenshot_40.png)

## <h1>Kesimpulan



## <h1>Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

Aryo Satyo Wandowo Adi - 05


Link kode program :[FormKoneksi1841720170Aryo](../../src/12_Java_API/percobaan5/FormKoneksi1841720170Aryo.form)
<br><br>Link kode program :[FormKoneksi1841720170Aryo](../../src/12_Java_API/percobaan5/FormKoneksi1841720170Aryo.java)