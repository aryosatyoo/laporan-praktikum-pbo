# Laporan Praktikum #6 - Inheritance

## <h1>Kompetensi

1. Memahami konsep dasar inheritance atau pewarisan.	
2. Mampu membuat suatu subclass dari suatu superclass tertentu.	
3. Mampu mengimplementasikan konsep single dan multilevel inheritance.	 

## <h1>Ringkasan Materi
 
 Inheritance Dalam Java. Perngertian dari inheritance adalah dimana sebuah objek dapat mempunyai objek turunan. Dalam hal pemrogramman makan dapat diimpelementasikan dengan sebuah class yang mempunyai class turunan.

### <h1>Percobaan 1

A. Tahapan Percobaan
1. Buatlah	sebuah	class	parent/superclass	dengan nama ClassA.java
<br>![Screenshot_1](img/Screenshot_1.png)

2. Buatlah	sebuah	class	anak/subclass	dengan	nama ClassB.java
<br>![Screenshot_2](img/Screenshot_2.png)

3. Buatlah	class	Percobaan1.java	untuk	menjalankan	program	diatas!
<br>![Screenshot_3](img/Screenshot_3.png)

4. Jalankan	program	diatas,	kemudian	amati	apa	yang terjadi!
<br>![Screenshot_4](img/Screenshot_4.png)

link kode program :[ClassA](../../src/6_Inheritance/Percobaan1/classA1841720170Aryo.java)
<br>link kode program :[ClassB](../../src/6_Inheritance/Percobaan1/classB1841720170Aryo.java)
<br>link kode program :[newMain](../../src/6_Inheritance/Percobaan1/NewMain.java)


B. PERTANYAAN

1. Pada	percobaan 1 diatas program yang	dijalankan	terjadi	error,	kemudian perbaiki sehingga program tersebut bisa dijalankan dan tidak error!
<br>![per1](img/per1.png)
2. Jelaskan	apa	penyebab program pada percobaan	1	ketika dijalankan terdapat error!
- karena class B tidak diberi relasi dengan class A. Diberi relasi dengan ditambahkan code extends.


### <h1>Percobaan 2

A. TAHAPAN	PERCOBAAN

1. Buatlah sebuah class	parent/superclass dengan	nama ClassA.java
<br>![Screenshot_5](img/Screenshot_5.png)

2. Buatlah	sebuah	class	anak/subclass	dengan	nama	ClassB.java
<br>![Screenshot_6](img/Screenshot_6.png)

3. Buatlah	class	Percobaan2.java	untuk	menjalankan	program	diatas!
<br>![Screenshot_7](img/Screenshot_7.png)

link kode program :[ClassA](../../src/6_Inheritance/Percobaan2/ClassA1841720170Aryo.java)
<br>link kode program :[ClassB](../../src/6_Inheritance/Percobaan2/ClassB1841720170Aryo.java)
<br>link kode program :[newMain](../../src/6_Inheritance/Percobaan2/NewMain.java)

B. PERTANYAAN

1. Pada	percobaan	2 diatas	program	yang	dijalankan terjadi error, kemudian perbaiki	sehingga program	tersebut bisa dijalankan dan tidak error!
<br>Pada Class A : 
<br>![per2](img/per2.png)

Pada Class B : 
<br>![per3](img/per3.png)

2. Jelaskan	apa	penyebab program pada percobaan	1	ketika dijalankan terdapat error!
- Pada percobaan 2 tidak ada code untuk getter, maka diberi code getter di class A. Lalu pada method getJumlah diberikan super untuk memanggil getter.


### <h1>Percobaan 3

A. TAHAPAN	PERCOBAAN

1. Buatlah sebuah class parent/superclass	dengan nama Bangun.java
<br>![Screenshot_8](img/Screenshot_8.png)

2. Buatlah	sebuah	class	anak/subclass	dengan	nama Tabung.java
<br>![Screenshot_9](img/Screenshot_9.png)

3. Buatlah	class	Percobaan3.java	untuk	menjalankan	program	diatas!
<br>![Screenshot_11](img/Screenshot_11.png)

4. Jalankan	program	diatas!
<br>![Screenshot_10](img/Screenshot_10.png)

link kode program :[Bangun](../../src/6_Inheritance/Percobaan3/Bangun1841720170Aryo.java)
<br>link kode program :[Tabung](../../src/6_Inheritance/Percobaan3/Tabung1841720170Aryo.java)
<br>link kode program :[newMain](../../src/6_Inheritance/Percobaan3/NewMain.java)

B. PERTANYAAN

1. Jelaskan	fungsi	 “super”	pada	potongan	program	berikut	di	class	Tabung!
- Untuk mempresentasikan objek dari induk class.

2. Jelaskan	fungsi	“super”	dan	“this”	pada	potongan	program	berikut	di	class	Tabung!
- Jika this merepresentasikan objek dari class itu sendiri, maka super akan merepresentasikan objek dari class induk.

3. Jelaskan	mengapa	pada class Tabung tidak	dideklarasikan	atribut	“phi” dan “r” tetapi class tersebut dapat mengakses atribut tersebut!
- Karena class Tabung mengambil objek dari kelass Bangun.


### <h1>Percobaan 4 

A. TAHAPAN	PERCOBAAN

1. Buatlah	tiga	file	dengan	nama	ClassA.java	,	ClassB.java	,	dan	ClassC.java,	seperti	pada kode program dibawah ini!

ClassA1841720170Aryo
<br>![Screenshot_12](img/Screenshot_12.png)

ClassB1841720170Aryo
<br>![Screenshot_13](img/Screenshot_13.png)

ClassC1841720170Aryo
<br>![Screenshot_14](img/Screenshot_14.png)

2. Buatlah	class	Percobaan4.java	untuk	menjalankan	program	diatas!
3. Jalankan	program	kemudian	amati	apa	yang	terjadi!
<br>![Screenshot_15](img/Screenshot_15.png)

link kode program :[Class A](../../src/6_Inheritance/Percobaan4/ClassA1841720170Aryo.java)
<br>link kode program :[Class B](../../src/6_Inheritance/Percobaan4/ClassB1841720170Aryo.java)
<br>link kode program :[Class C](../../src/6_Inheritance/Percobaan4/ClassC1841720170Aryo.java)
<br>link kode program :[NewMain](../../src/6_Inheritance/Percobaan4/NewMain.java)


B. PERTANYAAN

1. Pada	percobaan	4	sebutkan	mana	class	yang	termasuk	superclass	dan	subclass,	kemudian	
jelaskan	alasannya!
- Super Class terdapat pada class A
- Sub Class terdapat pada class B dan C
- Alasannya karena class C turunan dari class B, sedangkan class B turunan dari class A.

2. Ubahlah	isi	konstruktor	default	ClassC	seperti	berikut:

<br>Tambahkan	kata	super()	di	baris	Pertaman	dalam	konstruktor	defaultnya.	Coba	jalankan	
kembali	class	Percobaan4	dan	terlihat	tidak	ada	perbedaan	dari	hasil	outputnya!
<br>![per4](img/per4.png)

3. Ublah	isi	konstruktor	default	ClassC	seperti	berikut:

<br>Ketika	mengubah	posisi	super()	dibaris	kedua	dalam	kontruktor	defaultnya	dan	terlihat	ada	
error.	Kemudian	kembalikan	super()	kebaris	pertama	seperti	sebelumnya,	maka	errornya	
akan	hilang.
Perhatikan	hasil	keluaran	ketika	class	Percobaan4	dijalankan.	Kenapa	bisa	tampil	output	
seperti	berikut	pada	saat	instansiasi	objek	test	dari	class	ClassC

- Karena code super() harus diletakan diatas sendiri dibawah method yang diberikan.

4. Apakah	fungsi	super()	pada	potongan	program	dibawah	ini	di	ClassC!

- untuk memanggil method dari class induk.

### <h1>Percobaan 5 

1. Buatlah	class	Karyawan	
<br>![Screenshot_16](img/Screenshot_16.png)

2. Buatlah	class	Manager	
<br>![Screenshot_17](img/Screenshot_17.png)

3. Buatlah	class	Staff	
<br>![Screenshot_18](img/Screenshot_18.png)

4. Buatlah	class	inheritance1	
<br>![Screenshot_19](img/Screenshot_19.png)

5. Jalankan	program,	maka	tampilanya	adalah	sebagai	berikut:
<br>![Screenshot_20](img/Screenshot_20.png)

link kode program :[Karyawan](../../src/6_Inheritance/Percobaan5/Karyawan1841720170Aryo.java)
<br>link kode program :[Manager](../../src/6_Inheritance/Percobaan5/Manager1841720170Aryo.java)
<br>link kode program :[Staff](../../src/6_Inheritance/Percobaan5/Staff1841720170Aryo.java)
<br>link kode program :[NewMain](../../src/6_Inheritance/Percobaan5/NewMain.java)

B. PERTANYAAN
1. Sebutkan	class	mana	yang	termasuk	super	class	dan	sub	class	dari	percobaan	1	diatas!
- Super Class : Karyawan.
- Sub Class : Staff, Manager.

2. Kata	kunci	apakah	yang	digunakan	untuk	menurunkan	suatu	class	ke	class	yang	lain?
- extends, super() 

3. Perhatikan	kode	program	pada	class	Manager,	atribut	apa	saja	yang	dimiliki	oleh	class	
tersebut?	Sebutkan	atribut	mana	saja	yang	diwarisi	dari	class	Karyawan!
- int tunjangan; 
- Class Karyawan : int gaji;
- gaji akan diturunkan pada atribut tunjangan di class Manager.

4. Jelaskan	kata	kunci	super	pada	potongan	program	dibawah	ini	yang	terdapat	pada	class	
Manager!
- Untuk mewakili dari class induk int gaji, tunjangan mewakili class Manager.

5. Program	pada	percobaan	1	diatas	termasuk	dalam	jenis	inheritance	apa?	Jelaskan	
alasannya!
- Multilevel Inheritance, karena ada sub class yang menjadi induk dari class lain. 

### <h1>Percobaan 6 

2. Berdasarkan	program	yang	sudah	anda	buat	pada	percobaan	1	sebelumnya	tambahkan	dua	
class	yaitu	class	StaffTetap	dan	class	StaffHarian.	Kode	Programnya	adalah	sebagai	berikut

staffTetap1841720170Aryo
<br>![Screenshot_21](img/Screenshot_21.png)

staffHarian1841720170Aryo
<br>![Screenshot_22](img/Screenshot_22.png)

3. Setelah	membuat	dua	class	diatas	kemudian	edit	class	inheritance1.java	menjadi	sebagai	
berikut:
4. Jalankan	program	maka	tampilanny	adalah	sebagai	berikut:
<br>![Screenshot_23](img/Screenshot_23.png)

link kode program :[Staff Harian](../../src/6_Inheritance/Percobaan6/staffHarian1841720170Aryo.java)
<br>link kode program :[Staff Tetap](../../src/6_Inheritance/Percobaan6/staffTetap1841720170Aryo.java)
<br>link kode program :[Staff](../../src/6_Inheritance/Percobaan6/Staff1841720170Aryo.java)
<br>link kode program :[New Main](../../src/6_Inheritance/Percobaan6/NewMain.java)

B. PERTANYAAN
1. Berdasarkan	class	diatas	manakah	yang	termasuk	single	inheritance	dan	mana	yang	
termasuk	multilevel	inheritance?
- Class B, Class Tabung
- Multilevel : Class B turunan Class A, Class StaffTetap turunan Class Staff.

2. Perhatikan	kode	program	class	StaffTetap	dan	StaffHarian,	atribut	apa	saja	yang	dimiliki	oleh	
class	tersebut?	Sebutkan	atribut	mana	saja	yang	diwarisi	dari	class	Staff!
- jmlJamKerja diwarisi class Karyawan : int potongan;
- staffTetap : jmlJamKerja iwarisi class Karyawan : int potongan;

3. Apakah	fungsi	potongan	program	berikut	pada	class	StaffHarian
- memanggil nilai variable yang ada di class induk.

4. Apakah	fungsi	potongan	program	berikut	pada	class	StaffHarian
- memanggil nilai dari variable yang ada di dalam subclass.

9. Perhatikan	kode	program	dibawah	ini	yang	terdapat	pada	class	StaffTetap

<br>Terlihat	dipotongan	program	diatas	atribut	gaji,	lembur	dan	potongan	dapat	diakses	
langsung.	Kenapa	hal	ini	bisa	terjadi	dan	bagaimana	class	StaffTetap	memiliki	atribut	gaji,	
lembur,	dan	potongan	padahal	dalam	class	tersebut	tidak	dideklarasikan	atribut	gaji,	lembur,	
dan	potongan?

- class StaffTetap turunan dari class Staff maka memanggil isi yang ada di dalam class Staff.


### <h1> TUGAS

<br>Class Komputer : 
<br>![tugas1](img/tugas1.png)
<br>link kode program :[Komputer](../../src/6_Inheritance/tugas/Komputer18417210270Aryo.java)

<br>Class Laptop : 
<br>![tugas2](img/tugas2.png)
<br>link kode program :[Laptop](../../src/6_Inheritance/tugas/Laptop1841720170Aryo.java)

<br>Class mac : 
<br>![tugas3](img/tugas3.png)
<br>link kode program :[Mac](../../src/6_Inheritance/tugas/Mac1841720170Aryo.java)

<br>Class PC : 
<br>![tugas4](img/tugas4.png)
<br>link kode program :[Pc](../../src/6_Inheritance/tugas/Pc1841720170Aryo.java)

<br>Class Windows : 
<br>![tugas5](img/tugas5.png)
<br>link kode program :[Windows](../../src/6_Inheritance/tugas/Windows1841720170Aryo.java)

<br>Class newMain : 
<br>![tugas6](img/tugas6.png)
<br>link kode program :[Main](../../src/6_Inheritance/tugas/newMain.java)

## <h1>Kesimpulan

inheritance atau pewarisan itu sendiri adalah penurunan sifat yang sama dari super class / induk kelas kepada sub class / anak kelas yang sifat sub class itu sendiri memiliki karakteristik yang sama persis dari super class.

## <h1>Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

Aryo Satyo Wandowo Adi - 05


