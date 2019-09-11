# Laporan Praktikum #3 - Enkapsulasi Pada Pemrograman Berorientasi Objek

## <h1>Kompetensi

<br>Setelah melakukan percobaan pada modul ini, mahasiswa memahami konsep:
<br>1. Konstruktor
<br>2. Akses Modifier
<br>3. Atribut/method pada class
<br>4. Intansiasi atribut/method
<br>5. Setter dan getter
<br>6. Memahami notasi pada UML Class Diagram


## <h1>Ringkasan Materi
 
-

## <h1>Percobaan

### Percobaan 1

<br> 3.1 Percobaan 1 - Enkapsulasi
<br>Didalam percobaan enkapsulasi, buatlah class Motor yang memiliki atribut kecepatan dan kontakOn,
dan memiliki method printStatus() untuk menampilkan status motor. Seperti berikut
<br>1. Buka Netbeans, buat project MotorEncapsulation.
<br>2. Buat class Motor. Klik kanan pada package motorencapsulation – New – Java Class.
<br>3. Ketikkan kode class Motor dibawah ini.

    <br><br>![Percobaan1](img/Screenshot_1.png)
    <br><br>![Percobaan1](img/Screenshot_2.png)

<br>Dari percobaan 1 - enkapsulasi, menurut anda, adakah yang janggal?
<br>Yaitu, kecepatan motor tiba-tiba saja berubah dari 0 ke 50. Lebih janggal lagi, posisi kontak motor
masih dalam kondisi OFF. Bagaimana mungkin sebuah motor bisa sekejap berkecepatan dari nol ke
50, dan itupun kunci kontaknya OFF?
Nah dalam hal ini, akses ke atribut motor ternyata tidak terkontrol. Padahal, objek di dunia nyata
selalu memiliki batasan dan mekanisme bagaimana objek tersebut dapat digunakan. Lalu,
bagaimana kita bisa memperbaiki class Motor diatas agar dapat digunakan dengan baik? Kita bisa
pertimbangkan beberapa hal berikut ini:
<br>1. Menyembunyikan atribut internal (kecepatan, kontakOn) dari pengguna (class lain)
<br>2. Menyediakan method khusus untuk mengakses atribut.
Untuk itu mari kita lanjutkan percobaan berikutknya tentang Access Modifier.

### Percobaan 2

1. Bukalah text editor atau IDE, misalnya Notepad ++ / netbeans.

2. Ketikkan kode program berikut ini:
    <br><br>![Percobaan1](img/Screenshot_2.png)

3. Simpan dengan nama file Mahasiswa.java.

4. Untuk dapat mengakses anggota-anggota dari suatu obyek, maka harus dibuat instance
dari class tersebut terlebih dahulu. Berikut ini adalah cara pengaksesan anggotaanggota dari class Mahasiswa dengan membuka file baru kemudian ketikkan kode
program berikut:
    <br><br>![Percobaan2](img/Screenshot_3.png)
5. Simpan file dengan TestMahasiswa.java

6. Jalankan class TestMahasiswa
    <br><br>![Percobaan3](img/Screenshot_4.png)

link kode program :[mahasiswa](../../src/2_Class_dan_Object/Mahasiswa.java)
<br>link kode program :[Mahasiswa Main](../../src/2_Class_dan_Object/TestMahasiswa.java)

7. Jelaskan pada bagian mana proses pendeklarasian atribut pada program diatas!

    - Atribut pada class Mahasiswa pada method tampilBiodata. Terdapat atribut nim, nama, alamat, kelas.

8. Jelaskan pada bagian mana proses pendeklarasian method pada program diatas!

    - Pendeklarasian method pada class Mahasiswa ialah tampilbiodata() void

9. Berapa banyak objek yang di instansiasi pada program diatas!

    - Objek terdapat pada class TestMahasiswa pada code : Mahasiswa mhs1 = new Mahasiswa();

10. Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.nim=101” ?

    - Code tersebut mendklarasikan bahwa mahasiswa1 ber-nim : 101

11. Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.tampilBiodata()” ?

    - mhs1 akan mencetak biodata yang mecakup nim, nama, alamat, kelas.

12. Instansiasi 2 objek lagi pada program diatas!

    - <br><br>![Percobaan2](img/Screenshot_5.png)


## <h1>Tugas

1. Suatu toko persewaan video game salah satu yang diolah adalah peminjaman, dimana
data yang dicatat ketika ada orang yang melakukan peminjaman adalah id, nama
member, nama game, dan harga yang harus dibayar. Setiap peminjaman bisa
menampilkan data hasil peminjaman dan harga yang harus dibayar. Buatlah class
diagram pada studi kasus diatas!
Penjelasan:
    - Harga yang harus dibayar diperoleh dari lama sewa x harga.
    - Diasumsikan 1x transaksi peminjaman game yang dipinjam hanya   1 game saja.

     <br>![Percobaan2](img/Screenshot_6.png)

     <br>![Percobaan2](img/Screenshot_7.png)

link kode program :[sewaGame](../../src/2_Class_dan_Object/sewaGame.java)
<br>link kode program :[Main Game](../../src/2_Class_dan_Object/mainGame.java)


2. Buatlah program dari class diagram yang sudah anda buat di no 1!

    <br>![Percobaan2](img/Screenshot_8.png)

3. Buatlah program sesuai dengan class diagram berikut ini:

    <br>![Percobaan2](img/Screenshot_9.png)

    <h3>hasil : 

    <br>![Percobaan2](img/Screenshot_12.png)
    <br>![Percobaan2](img/Screenshot_13.png)

link kode program :[Lingkaran](../../src/2_Class_dan_Object/Lingkaran.java)
<br>link kode program :[Main Lingkaran](../../src/2_Class_dan_Object/mainLingkaran.java)

4. Buatlah program sesuai dengan class diagram berikut ini:

    <br>![Percobaan2](img/Screenshot_10.png)

    <h3>hasil :  

    <br>![Percobaan2](img/Screenshot_14.png)
    <br>![Percobaan2](img/Screenshot_15.png)

link kode program :[Barang](../../src/2_Class_dan_Object/Barang.java)
<br>link kode program :[Main Barang](../../src/2_Class_dan_Object/barangMain.java)

## <h1>Kesimpulan

<br>Membuat pemodelan class diagram menggunakan uml. 
<br>Object membantu kita untuk meringkas sebuah code supaya lebih efisien.


## <h1>Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

Aryo Satyo Wandowo Adi - 05

