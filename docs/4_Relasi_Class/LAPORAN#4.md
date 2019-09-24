# Laporan Praktikum #4 - Relasi Kelas

## <h1>Kompetensi

Setelah menempuh pokok bahasan ini, mahasiswa mampu:
1. Memahami konsep relasi kelas;
2. Mengimplementasikan relasi has‑a dalam program.

## <h1>Ringkasan Materi
 
- Relasi
- Setter Getter
- Konstruktor
- Array 

### <h1>Percobaan 1

a. Perhatikan diagram class berikut:
<br>![Percobaan2](img/g1.png)

b. Buka project baru di Netbeans dan buat package dengan format berikut:
<identifier>.relasiclass.percobaan1 (ganti dengan identitas anda atau nama
domain), Contoh: ac.id.polinema, jti.polinema, dan sebagainya).
Catatan: Penamaan package dengan tambahan identifier untuk menghindari adanya
kemungkinan penamaan class yang bentrok.

c. Buatlah class Processor dalam package tersebut.
<br>![percobaan1](img/p1.png)

d. Tambahkan atribut merk dan cache pada class Processor dengan akses modifier
private .
<br>![percobaan1](img/p2.png)

e. Buatlah constructor default untuk class Processor.
<br>![percobaan1](img/p3.png)

f. Buatlah constructor untuk class Processor dengan parameter merk dan cache.
<br>![percobaan1](img/p4.png)

g. Implementasikan setter dan getter untuk class Processor.
<br>![percobaan1](img/p5.png)

h. Implementasikan method info() seperti berikut:
<br>![percobaan1](img/p6.png)

i. Kemudian buatlah class Laptop di dalam package yang telah anda buat.
<br>![percobaan1](img/p7.png)

j. Tambahkan atribut merk dengan tipe String dan proc dengan tipe Object Processor
private String merk; private Processor proc;
<br>![percobaan1](img/p8.png)

k. Buatlah constructor default untuk class Laptop .
<br>![percobaan1](img/p9.png)

l. Buatlah constructor untuk class Laptop dengan parameter merk dan proc .
<br>![percobaan1](img/p10.png)

m. Selanjutnya implementasikan method info() pada class Laptop sebagai berikut
<br>![percobaan1](img/p11.png)

n. Pada package yang sama, buatlah class MainPercobaan1 yang berisi method
main().
<br>![percobaan1](img/p12.png)

o. Deklarasikan Object Processor dengan nama p kemudian instansiasi dengan informasi
atribut Intel i5 untuk nilai merk serta 3 untuk nilai cache .
<br>![percobaan1](img/p13.png)

p. Kemudian deklarasikan serta instansiasi Objek Laptop dengan nama L dengan informasi
atribut Thinkpad dan Objek Processor yang telah dibuat.
<br>![percobaan1](img/p14.png)

q. Panggil method info() dari Objek L.
<br>![percobaan1](img/p15.png)

r. Tambahkan baris kode berikut
<br>![percobaan1](img/p16.png)

s. Compile kemudian run class MainPercobaan1, akan didapatkan hasil seperti berikut:
<br>![percobaan1](img/p17.png)

Pertanyaan
Berdasarkan percobaan 1, jawablah pertanyaan‑pertanyaan yang terkait:

1. Di dalam class Processor dan class Laptop , terdapat method setter dan getter untuk masing‑masing atributnya. Apakah gunanya method setter dan getter tersebut ?
<br>-Fungsinya ialah mengeset dan mengambil suatu nilai dari sebuah class dengan method default.

2. Di dalam class Processor dan class Laptop, masing‑masing terdapat konstruktor default dan konstruktor berparameter. Bagaimanakah beda penggunaan dari kedua jenis konstruktor tersebut ? 
<br>-Jika konstruktor default maka akan memberi setter sebuah nilai dan jika konstruktor berparameter maka hanya memberi nilai di class main. 

3. Perhatikan class Laptop, di antara 2 atribut yang dimiliki (merk dan proc), atribut manakah yang bertipe object ?
<br>-Private Processor proc; 

4. Perhatikan class Laptop, pada baris manakah yang menunjukan bahwa class Laptop memiliki relasi dengan class Processor ?
<br>-Pada konstruktor berparameter. 
<br>![percobaan1](img/pt1.png)

5. Perhatikan pada class Laptop , Apakah guna dari sintaks proc.info() ?
<br>-Untuk menjalankan method dari class Processor.

6. Pada class MainPercobaan1, terdapat baris kode:
Laptop l = new Laptop("Thinkpad", p);.
Apakah p tersebut ? Dan apakah yang terjadi jika baris kode tersebut diubah menjadi:
Laptop l = new Laptop("Thinkpad", new Processor("Intel i5",
3)); Bagaimanakah hasil program saat dijalankan, apakah ada perubahan ?
<br>-p adalah class Processor yang sudah di instansiasi. Code tersebut sama saja, hasilnya sama. Perbedaannya ialah pada instansiasi, jika p langsung memanggil class Processor yang sudah di instansiasi. 

link kode program :[Laptop](../../src/4_Relasi_Class/Percobaan1/Laptop.java)
<br>link kode program :[Main1](../../src/4_Relasi_Class/Percobaan1/MainPercobaan1.java)
<br>link kode program :[Processor](../../src/4_Relasi_Class/Percobaan1/Processor.java)

### <h1>Percobaan 2

Perhatikan diagram class berikut yang menggambarkan sistem rental mobil. Pelanggan bisa menyewa mobil sekaligus sopir. Biaya sopir dan biaya sewa mobil dihitung per hari.
<br>![percobaan1](img/p18.png)

a. Tambahkan package <identifier>.relasiclass.percobaan2.

b. Buatlah class Mobil di dalam package tersebut.
<br>![percobaan1](img/p19.png)

c. Tambahkan atribut merk tipe String dan biaya tipe int dengan akses modifier private.
<br>![percobaan1](img/p20.png)

d. Tambahkan constructor default serta setter dan getter.
<br>![percobaan1](img/p21.png)

e. Implementasikan method hitungBiayaMobil
<br>![percobaan1](img/p22.png)

f. Tambahkan class Sopir dengan atribut nama tipe String dan biaya tipe int dengan akses modifier private berikut dengan constructor default.
<br>![percobaan1](img/p23.png)

g. Implementasikan method hitungBiayaSopir. (Tambahkan setter dan getter di jobsheet tidak di tampilkan)
<br>![percobaan1](img/p24.png)

h. Tambahkan class Pelanggan dengan constructor default.
<br>![percobaan1](img/p25.png)

i. Tambahkan atribut‑atribut dengan akses modifier private berikut:
<br>![percobaan1](img/p26.png)

j. Implementasikan setter dan getter.
<br>![percobaan1](img/p27.png)

k. Tambahkan method hitungBiayaTotal
<br>![percobaan1](img/p28.png)

l. Buatlah class MainPercobaan2 yang berisi method main(). Tambahkan baris kode
berikut:
<br>![percobaan1](img/p29.png)

m. Compile dan jalankan class MainPercobaan2, dan perhatikan hasilnya!
<br>![percobaan1](img/p30.png)

Pertanyaan
1. Perhatikan class Pelanggan. Pada baris program manakah yang menunjukan bahwa class
Pelanggan memiliki relasi dengan class Mobil dan class Sopir ?
<br>![percobaan1](img/pt2.png)

2. Perhatikan method hitungBiayaSopir pada class Sopir, serta method
hitungBiayaMobil pada class Mobil. Mengapa menurut Anda method tersebut harus
memiliki argument hari ?
- Karena 

3. Perhatikan kode dari class Pelanggan. Untuk apakah perintah
mobil.hitungBiayaMobil(hari) dan sopir.hitungBiayaSopir(hari) ?
- Untuk menjumlahkan biaya mobil yang diambil dari harga sopir lalu dikalikan dengan hari sebelumnya lalu dijumlahkan dengan biaya sopir yang diambil dari harga sopir dikali hari.

4. Perhatikan class MainPercobaan2. Untuk apakah sintaks p.setMobil(m) dan
p.setSopir(s) ?
- Digunakan untuk mengisi value dari namaMobil dan namaSopir di pelanggan.

5. Perhatikan class MainPercobaan2. Untuk apakah proses p.hitungBiayaTotal()
tersebut ?
- Digunakan untuk menghitung biaya total sopir+mobil.

6. Perhatikan class MainPercobaan2, coba tambahkan pada baris terakhir dari method
main dan amati perubahan saat di‑run!
System.out.println(p.getMobil().getMerk());
- Digunakan untuk return nilai atribut dari method getMerk()

link kode program :[Mobil](../../src/4_Relasi_Class/Percobaan2/Mobil.java)
<br>link kode program :[Pelanggan](../../src/4_Relasi_Class/Percobaan2/Pelanggan.java)
<br>link kode program :[Sopir](../../src/4_Relasi_Class/Percobaan2/Sopir.java)
<br>link kode program :[Main2](../../src/4_Relasi_Class/Percobaan2/Main.java)


### <h1>Percobaan 3

a. Sebuah Kereta Api dioperasikan oleh Masinis serta seorang Asisten Masinis. Baik Masinis
maupun Asisten Masinis keduanya merupakan Pegawai PT. Kereta Api Indonesia. Dari
ilustrasi cerita tersebut, dapat digambarkan dalam diagram kelas sebagai berikut:

b. Perhatikan dan pahami diagram kelas tersebut, kemudian bukalah IDE anda!

c. Buatlah package <identifier>.relasiclass.percobaan3, kemudian tambahkan
class Pegawai.
<br>![percobaan1](img/p31.png)

d. Tambahkan atribut‑atribut ke dalam class Pegawai
<br>![percobaan1](img/p32.png)

e. Buatlah constructor untuk class Pegawai dengan parameter nip dan nama.
<br>![percobaan1](img/p33.png)

f. Tambahkan setter dan getter untuk masing‑masing atribut.
<br>![percobaan1](img/p34.png)

g. Implementasikan method info() dengan menuliskan baris kode berikut:
<br>![percobaan1](img/p35.png)

h. Buatlah class KeretaApi berdasarkan diagram class
<br>![percobaan1](img/p36.png)

i. Tambahkan atribut‑atribut pada class KeretaApi berupa nama, kelas, masinis, dan
asisten.
<br>![percobaan1](img/p37.png)

j. Tambahkan constructor 3 parameter (nama, kelas, masinis) serta 4 parameter (nama,
kelas, masinis, asisten).
<br>![percobaan1](img/p38.png)

<br>![percobaan1](img/p39.png)

k. Tambahkan setter dan getter untuk atribut‑atribut yang ada pada class KeretaApi .
<br>![percobaan1](img/p40.png)

l. Kemudian implementasikan method info()
<br>![percobaan1](img/p41.png)

m. Buatlah sebuah class MainPercobaan3 dalam package yang sama.

n. Tambahkan method main() kemudian tuliskan baris kode berikut
<br>![percobaan1](img/p42.png)

Pertanyaan 
1. Di dalam method info() pada class KeretaApi, baris this.masinis.info() dan
this.asisten.info() digunakan untuk apa ?
- untuk memanggil method info yang ada di class Pegawai

2. Buatlah main program baru dengan nama class MainPertanyaan pada package yang
sama. Tambahkan kode berikut pada method main() !
Pegawai masinis = new Pegawai("1234", "Spongebob
Squarepants");
KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis",
masinis);
System.out.println(keretaApi.info());
<br>![percobaan1](img/pt3.png)

3. Apa hasil output dari main program tersebut ? Mengapa hal tersebut dapat terjadi ?
<br>![percobaan1](img/pt4.png) 
- dikarenakan tidak adanya variabel, variabel tersebut adalah asisten di class KeretaApi.

4. Perbaiki class KeretaApi sehingga program dapat berjalan !
<br>![percobaan1](img/pt5.png) 

link kode program :[KeretaApi](../../src/4_Relasi_Class/Percobaan3/KeretaApi.java)
<br>link kode program :[Pegawai](../../src/4_Relasi_Class/Percobaan3/Pegawai.java)
<br>link kode program :[Main3](../../src/4_Relasi_Class/Percobaan3/MainPercobaan3.java)


### <h1>Percobaan 4 
a. Perhatikan dan pahami diagram class tersebut.

b. Buatlah masing‑masing class Penumpang, Kursi dan Gerbong sesuai rancangan
tersebut pada package <identifier>.relasiclass.percobaan4.
<br>![percobaan1](img/p43.png) 

<br>![percobaan1](img/p44.png)

<br>![percobaan1](img/p45.png)  

c. Tambahkan method info() pada class Penumpang
<br>![percobaan1](img/p46.png) 

d. Tambahkan method info() pada class Kursi
<br>![percobaan1](img/p47.png) 

e. Pada class Gerbong buatlah method initKursi() dengan akses private.
<br>![percobaan1](img/p48.png) 

f. Panggil method initKursi() dalam constructor Gerbong sehingga baris kode menjadi
berikut:
<br>![percobaan1](img/p49.png) 

g. Tambahkan method info() pada class Gerbong
<br>![percobaan1](img/p50.png) 

h. Implementasikan method untuk memasukkan penumpang sesuai dengan nomor kursi.
<br>![percobaan1](img/p51.png) 

i. Buatlah class MainPercobaan4 yang berisi method main(). Kemudian tambahkan
baris berikut!
<br>![percobaan1](img/p52.png) 

1. Pada main program dalam class MainPercobaan4, berapakah jumlah kursi dalam
Gerbong A ?
- 10 kursi

2. Perhatikan potongan kode pada method info() dalam class Kursi. Apa maksud kode
tersebut ?
- Digunakan untuk menampilkan kursi yang terisi oleh penumpang.

3. Mengapa pada method setPenumpang() dalam class Gerbong, nilai nomor dikurangi
dengan angka 1 ?
- Karena index array dimulai dari 0 maka index harus dikurangi 1 sehingga index pertama terisi.

4. Instansiasi objek baru budi dengan tipe Penumpang, kemudian masukkan objek baru
tersebut pada gerbong dengan gerbong.setPenumpang(budi, 1). Apakah yang
terjadi ?
<br>![percobaan1](img/p53.png)

5. Modifikasi program sehingga tidak diperkenankan untuk menduduki kursi yang sudah ada
penumpang lain !
<br>![percobaan1](img/pt6.png)

link kode program :[Gerbong](../../src/4_Relasi_Class/Percobaan4/Gerbong.java)
<br>link kode program :[Kursi](../../src/4_Relasi_Class/Percobaan4/Kursi.java)
<br>link kode program :[Penumpang](../../src/4_Relasi_Class/Percobaan4/Penumpang.java)
<br>link kode program :[Main4](../../src/4_Relasi_Class/Percobaan4/MainPercobaan4.java)

### <h1> TUGAS
Buatlah sebuah studi kasus, rancang dengan class diagram, kemudian implementasikan ke dalam
program! Studi kasus harus mewakili relasi class dari percobaan‑percobaan yang telah dilakukan
pada materi ini, setidaknya melibatkan minimal 4 class (class yang berisi main tidak dihitung).

<br>![tugas1](img/tugas1.png)
<br>![tugas2](img/tugas2.png)
<br>![tugas3](img/tugas3.png)
<br>![tugas4](img/tugas4.png)
<br>![tugas5](img/tugas5.png)

link kode program :[Film](../../src/4_Relasi_Class/tugas/Film.java)
<br>link kode program :[Genre](../../src/4_Relasi_Class/tugas/Genre.java)
<br>link kode program :[Penonton](../../src/4_Relasi_Class/tugas/Penonton.java)
<br>link kode program :[Studio](../../src/4_Relasi_Class/tugas/Studio.java)
<br>link kode program :[Main](../../src/4_Relasi_Class/tugas/Main.java)

## <h1>Kesimpulan

- Dari jobsheet ini kita masih mempelajari setter dan getter. Selain itu kita juga akan belajar dan mamahami relasi antar class ke class

## <h1>Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

Aryo Satyo Wandowo Adi - 05


