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
 
-Konstruktor mirip dengan method cara deklarasinya akan tetapi tidak memiliki tipe return. Dan
konstruktor dieksekusi ketika instan dari objek dibuat. Jadi setiap kali sebuat objek dibuat dengan
keyword new() maka konstruktor akan dieksekusi.

-Terdapat 2 tipe modifier di java yaitu : akses modifier dan non-access modifier. Dalam hal ini kita
akan fokus pada akses modifier yang berguna untuk mengatur akses method, class, dan constructor.
Terdapat 4 akses modifier yaitu:
1. private – hanya dapat diakses di dalam kelas yang sama
2. default – hanya dapat diakses di dalam package yang sama
3. protected – dapat diakases di luar package menggunakan subclass (membuat inheritance)
4. public – dapat diakases dari mana saja

### <h1>Percobaan 1

<br> 3.1 Percobaan 1 - Enkapsulasi
<br>Didalam percobaan enkapsulasi, buatlah class Motor yang memiliki atribut kecepatan dan kontakOn,
dan memiliki method printStatus() untuk menampilkan status motor. Seperti berikut
1. Buka Netbeans, buat project MotorEncapsulation.
2. Buat class Motor. Klik kanan pada package motorencapsulation – New – Java Class.
3. Ketikkan kode class Motor dibawah ini.

<br>![Percobaan1](img/Screenshot_1.png)

4. Kemudian buat class MotorDemo, ketikkan kode berikut ini
5. Hasilnya adalah sebagai berikut:

<br>![Percobaan1](img/Screenshot_2.png)

<br>Dari percobaan 1 - enkapsulasi, menurut anda, adakah yang janggal?
<br>Yaitu, kecepatan motor tiba-tiba saja berubah dari 0 ke 50. Lebih janggal lagi, posisi kontak motor
masih dalam kondisi OFF. Bagaimana mungkin sebuah motor bisa sekejap berkecepatan dari nol ke
50, dan itupun kunci kontaknya OFF?
<br><br>Nah dalam hal ini, akses ke atribut motor ternyata tidak terkontrol. Padahal, objek di dunia nyata
selalu memiliki batasan dan mekanisme bagaimana objek tersebut dapat digunakan. Lalu,
bagaimana kita bisa memperbaiki class Motor diatas agar dapat digunakan dengan baik? Kita bisa
pertimbangkan beberapa hal berikut ini:
<br>1. Menyembunyikan atribut internal (kecepatan, kontakOn) dari pengguna (class lain)
<br>2. Menyediakan method khusus untuk mengakses atribut.
Untuk itu mari kita lanjutkan percobaan berikutknya tentang Access Modifier.

### <h1>Percobaan 2

3.2 Percobaan 2 - Access Modifier
Pada percobaan ini akan digunakan access modifier untuk memperbaiki cara kerja class Motor pada
percobaan ke-1.

1. Ubah cara kerja class motor sesuai dengan UML class diagram berikut.
<br>![uml](img/uml1.png)

2. Berdasarkan UML class diagram tersebut maka class Motor terdapat perubahan, yaitu:Page 6 of 15
a. Ubah access modifier kecepatan dan kontakOn menjadi private
b. Tambahkan method nyalakanMesin, matikanMesin, tambahKecepatan,
kurangiKecepatan.
<br>Implementasi class Motor adalah sebagai berikut:
<br><br>![Percobaan2](img/Screenshot_3.png)

3. Kemudian pada class MotorDemo, ubah code menjadi seperti berikut:
4. Hasilnya dari class MotorDemo adalah sebagai berikut:
<br><br>![Percobaan2](img/Screenshot_4.png)

<br>Dari percobaan diatas, dapat kita amati sekarang atribut kecepatan tidak bisa diakses oleh pengguna
dan diganti nilainya secara sembarangan. Bahkan ketika mencoba menambah kecepatan saat posisi
kontak masih OFF, maka akan muncul notifikasi bahwa mesin OFF. Untuk mendapatkan kecepatanPage 8 of 15
yang diinginkan, maka harus dilakukan secara gradual, yaitu dengan memanggil method
tambahKecepatan() beberapa kali. Hal ini mirip seperti saat kita mengendarai motor.
<br><br>3.3 Pertanyaan
<br>1. Pada class TestMobil, saat kita menambah kecepatan untuk pertama kalinya, mengapa? 
muncul peringatan “Kecepatan tidak bisa bertambah karena Mesin Off!”?
<br> - Dikarenakan pada class MotorDemo method printstatus() di deklarasikan terlebih dahulu. Seharusnya method tambahkecepatan() terlebih dahulu yang di deklarasikan baru printstatus()
<br>2. Mengapat atribut kecepatan dan kontakOn diset private?
<br> - Supaya bisa di gunakan pada class itu sendiri bukan untuk class lain.
<br>3. Ubah class Motor sehingga kecepatan maksimalnya adalah 100!
<br> - ![pertanyaan](img/p1.png)

<h4>code Percobaan 3-4 : </h4>

link kode program :[Motor](../../src/3_Enkapsulasi/Motor.java)
<br>link kode program :[MotorDemo](../../src/3_Enkapsulasi/MotorDemo.java)

### <h1>Percobaan 3

3.4 Percobaan 3 - Getter dan Sette

Misalkan di sebuah sistem informasi koperasi, terdapat class Anggota. Anggota memiliki atribut
nama, alamat dan simpanan, dan method setter, getter dan setor dan pinjam. Semua atribut pada
anggota tidak boleh diubah sembarangan, melainkan hanya dapat diubah melalui method setter,
getter, setor dan tarik. Khusus untuk atribut simpanan tidak terdapat setter karena simpanan akan
bertambah ketika melakukan transaksi setor dan akan berkurang ketika melakukan
peminjaman/tarik.

<br> 1. Berikut ini UML class buatlah class Mahasiswa pada program:

<br>![Percobaan2](img/uml2.png)

<br>2. Sama dengan percobaan 1 untuk membuat project baru
<br>a. Buka Netbeans, buat project KoperasiGetterSetter.
<br>b. Buat class Anggota. Klik kanan pada package koperasigettersetter – New – Java Class.
<br>c. Ketikkan kode class Anggota dibawah ini.

<br>![Percobaan2](img/Screenshot_5.png)
Jika diperhatikan pada class Anggota, atribut nama dan alamat memili masing-masing 1 getter dan setter. Sedangkan atribut simpanan hanya memiliki getSimpanan() saja, karena
seperti tujuan awal, atribut simpanan akan berubah nilainya jika melakukan transaksi setor() dan pinjam/tarik().

3. Selanjutnya buatlah class KoperasiDemo untuk mencoba class Anggota.
4. Hasil dari main method pada langkah ketiga adalah : 

<br>![Percobaan2](img/Screenshot_6.png)

Dapat dilihat pada hasil percobaan diatas, untuk mengubah simpanan tidak dilakukan secara
langsung dengan mengubah atribut simpanan, melainkan melalui method setor() dan pinjam().
Untuk menampilkan nama pun harus melalui method getNama(), dan untuk menampilkan simpanan
melalui getSimpanan().

### <h1>Percobaan 4 

3.5 Percobaan 4 - Konstruktor, Instansiasi

1. Langkah pertama percobaan 4 adalah ubah class KoperasiDemo seperti berikut

2. Hasil dari program tersebut adalah sebagai berikut

<br>![Percobaan2](img/Screenshot_7.png)

Dapat dilihat hasil running program, ketika dilakukan pemanggilan method getNama()
hasilnya hal ini terjadi karena atribut nama belum diset nilai defaultnya. Hal ini dapat
ditangani dengan membuat kontruktor.

3. Ubah class Anggota menjadi seperti berikut

<br>![Percobaan2](img/Screenshot_8.png)

4. Selanjutnya ubah class KoperasiDemo sebagai berikut

5. Hasil dari program tersebut adalah sebagai berikut

<br>![Percobaan2](img/Screenshot_9.png)

<h4>code Percobaan 3-4 : </h4>

<br>link kode program :[Anggota](../../src/3_Enkapsulasi/Anggota.java)
<br>link kode program :[KoperasiDemo](../../src/3_Enkapsulasi/KoperasiDemo1.java)

<br><h3>3.6 Pertanyaan – Percobaan 3 dan 4</h3>
<br>1. Apa yang dimaksud getter dan setter? 
<br>- Perbedaan method setter dengan getter terletak pada nilai kembalian, parameter, dan isi method-nya.
<br>
<br>2. Apa kegunaan dari method getSimpanan()?
<br>- Method yang bertugas untuk menyimpan nilai yang sudah di deklarasikan.
<br>
<br>3. Method apa yang digunakan untk menambah saldo?
<br>- Method setor();
<br>
<br>4. Apa yand dimaksud konstruktor?
<br>- Memberikan nilai awal pada sebuah class ketika class tersebut dibuat dalam bentuk objek pada class lain.
<br>
<br>5. Sebutkan aturan dalam membuat konstruktor?
<br>- Sebuah konstruktor tidak dapat diwariskan, sebuah konstruktor dapat mempunyai modifier private. konstruktor akan mempunyai default seperti classnya.
<br>
<br>6. Apakah boleh konstruktor bertipe private?
<br>- Boleh.
<br>
<br>7. Kapan menggunakan parameter dengan passsing parameter?
<br>- Ketika akan mendklarasikan sebuah parameter.
<br>
<br>8. Apa perbedaan atribut class dan instansiasi atribut?
<br>- Atribut class adalah Kumpulan variable dalam class, sedangkan instansiasi atribut adalah istilah ini digunakan untuk objek" yang menginisiasi dari sebuah class, sedangkan sebuah class dapat mempunyai banyak object. Untuk dapat membuat sebuah objek, kita perlu melakukan instansiasi.
<br>
<br>9. Apa perbedaan class method dan instansiasi method?
<br>- Class Method adalah sebuah method induk yang mempunyai statment yang dikumpulkan dalam 1 method, sedangkan instansiasi method adalah method khusus yang akan dieksekusi pada saat pembuatan objek (instance).

### <h1> TUGAS

1. Cobalah program dibawah ini dan tuliskan hasil outputnya

<br>![Tugas1](img/t1.png)
<br>![Tugas1](img/t2.png)


2. Pada program diatas, pada class EncapTest kita mengeset age dengan nilai 35, namun pada
saat ditampilkan ke layar nilainya 30, jelaskan mengapa.

    - Dikarenakan pada method setAge sudah di set bahwa ketika newAge diatas 30 maka otomatis age menjadi 30. 

3. Ubah program diatas agar atribut age dapat diberi nilai maksimal 30 dan minimal 18.

    - <br>![Tugas3](img/t3.png)

<h4> Code program tugas no 1-2 : </h4>

<br>link kode program :[EncapDemo](../../src/3_Enkapsulasi/EncapDemo.java)
<br>link kode program :[EncapTest](../../src/3_Enkapsulasi/EncapTest.java)

4. Pada sebuah sistem informasi koperasi simpan pinjam, terdapat class Anggota yang memiliki atribut antara lain nomor KTP, nama, limit peminjaman, dan jumlah pinjaman. Anggota dapat meminjam uang dengan batas limit peminjaman yang ditentukan. Anggota juga dapat
mengangsur pinjaman. Ketika Anggota tersebut mengangsur pinjaman, maka jumlah pinjaman akan berkurang sesuai dengan nominal yang diangsur. Buatlah class Anggota tersebut, berikan atribut, method dan konstruktor sesuai dengan kebutuhan. Uji dengan TestKoperasi berikut ini untuk memeriksa apakah class Anggota yang anda buat telah sesuai dengan yang diharapkan.
    - <br>![Tugas4](img/t4.png)
    - <br>![Tugas4](img/t5.png)
    - <br>![Tugas4](img/t6.png)

5. Modifikasi soal no. 4 agar nominal yang dapat diangsur minimal adalah 10% dari jumlah pinjaman saat ini. Jika mengangsur kurang dari itu, maka muncul peringatan “Maaf, angsuran harus 10% dari jumlah pinjaman”.
    - <br>![Tugas4](img/t7.png)
    - <br>![Tugas4](img/t8.png)
    

6. Modifikasi class TestKoperasi, agar jumlah pinjaman dan angsuran dapat menerima input
dari console
   - <br>![Tugas4](img/t9.png)
   - <br>![Tugas4](img/t10.png)

   HASIL : 

   - <br>![Tugas4](img/t11.png)
   - <br>![Tugas4](img/t12.png)

<h4> Code program tugas no 4-6 : </h4>

<br>link kode program :[TEST](../../src/3_Enkapsulasi/TestKoperasi.java)
<br>link kode program :[DEMO](../../src/3_Enkapsulasi/KoperasiDemo.java)

## <h1>Kesimpulan

Jobsheet kali ini membahas tentang konstruktor, setter dan getter. Konstruktor mirip dengan method cara deklarasinya akan tetapi tidak memiliki tipe return. Selain itu kita bisa memahami UML class diagram lalu di aplikasikan di netbeans.

## <h1>Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

Aryo Satyo Wandowo Adi - 05
