## Mei Edition

Link soal : https://www.hackerrank.com/code-league-5

### 1. Skor Matriks Pak Dengklek

Salah satu penyelesaian dari soal ini adalah dengan melakukan sorting terlebih dahulu pada tiap matriks m di dalam matriks genshin. Setelah itu, matriks genshin dapat diiterasikan untuk mendapatkan nilai maks dari matriks m ( index ke-0 setelah disorting). Setelah itu, nilai yang didapat akan disimpan pada sebuah list sementara dan nilai tersebut dihapus dari matriks m. Setelah m kali iterasi, skor akan ditambah dengan nilai maksimum dari list sementara tersebut. Berikut contoh dari penyelesaian salah satu soal pada test case : 

| 7  | 2  | 1  |
|:--:|:--:|:--:|
| 6  | 4  | 2  |
| 6  | 5  | 3  |
| 3  | 2  | 1  |

perulangan 1 : nilai maksimum tiap m matriks pada genshin [7, 6, 6, 3] , nilai dihapus, dan score ditambah dengan nilai maksimum dari matriks tersebut. ($score += 7$)

| 2  | 1  |
|:--:|:--:|
| 4  | 2  |
| 5  | 3  |
| 2  | 1  |

perulangan 2 : nilai maksimum tiap m matriks pada genshin [2, 4, 5, 2], nilai dihapus, dan score ditambah dengan nilai maksimum dari matriks tersebut. ($score += 5$)

| 1  |
|:--:|
| 2  |
| 3  |
| 1  |

perulangan 3 : nilai maksimum tiap m matriks pada genshin [1, 2, 3, 1], nilai dihapus, dan score ditambah dengan nilai maksimum dari matriks tersebut. ($score += 3$)

$score = 7 + 5 + 3 = 15$

Lihat jawaban disini : [Skor Matriks Pak Dengklek](SkorMatriksPakDengklek.java)

### 2. Bowo Si Tukang Susu

Bowo adalah seorang tukang susu. Ia menyediakan paket botol susu dalam ukuran yang bervariasi. Jenis-jenis ukurang yang mungkin untuk botol susu adalah {1, 5, 7, dan 10} liter. Bowo ingin mensuplai setiap liter air susu kedalam botol sesedikit mungkin. Tolong bantu bowo untuk menemukan jumlah minimum botol yang diperlukan untuk memasok permintaan susu yang diberikan.

15 Liter = (10 + 1) + (5 + 1) => 2
15 Liter = (10 Liter + 1 Botol) + (5 Liter + 1 Botol) => 15 Liter | 2 Botol

9 Liter = (7 + 1) + (1 + 2) => 3
9 Liter = (7 Liter + 1 Botol) + (1 Liter + 2 Botol) => 9 Liter | 3 Botol

Lihat jawaban disini : [Bowo Si Tukang Susu](bowoSiTukangSusu.java)

### 3. Urutkan Kurawal-ku
Seperti yang kita tahu, tanda kurung memiliki banyak jenis. Dan dalam penggunaan secara bersama kurung harus diletakkan sesuai dengan posisinya.
Contoh : "{()}"
Didalam contoh kita dapat menemukan 2 jenis kurung, diantaranya kurung "{}" dan "()".
Keduanya harus diletakkan dengan posisi yang benar untuk mendapatkan keluaran hasil terutama dalam operasi penghitungan.

Pada soal ini, Peserta diharuskan untuk memrancang sebuah program berbasis code yang dapat mengecek kebenaran dalam posisi tumpukan tanda kurung.
Dan seperti diatas, tumpukan kurung dianggap seimbang jika setiap karakter pembuka memiliki karakter penutup dengan urutan yang benar.

Untuk metode penyelesaian bisa digunakan dengan memanggil library internal java yakni "tumpukan".
tumpukan digunakan untuk mengorganisir setiap karakter dari inputan yang di buat

Penjelasan Algoritma:

1. Akan dilakukan perulangan sebanyak jumlah karakter yang diinput
   ex: {()} = 4 Perulangan.
2. Teks akan diubah menjadi variabel char dengan mengestrak setiap karakter dalam teks
3. Karakter akan selalu dimasukkan pada sebuah tumpukan
4. Didalam perulangan akan terdapat sebuah perilaku seleksi dimana seleksi akan memilah antara karakter pembuka seperti "{", "[]" , "(". Jika terdapat diantaranya maka akan dimasukkan kedalam sebuah tumpukan tumpukan
   Jika karakter "c" bukanlah tanda kurung buka, maka dilakukan pengecekan lebih lanjut:
   a. Jika tumpukan kosong, artinya tidak ada tanda kurung buka yang sesuai untuk karakter "c", maka method mengembalikan nilai false.
   b. Jika tumpukan tidak kosong, karakter teratas dari tumpukan diambil menggunakan pemanggilan "tumpukan.pop()" dan disimpan dalam variabel "top".
   c. Dilakukan pengecekan apakah karakter "c" sesuai dengan tanda kurung tutup yang diharapkan berdasarkan karakter teratas tumpukan:
   Jika karakter "c" adalah ')' dan karakter teratas tumpukan bukan '(', maka method mengembalikan nilai false.
   Jika karakter "c" adalah ']' dan karakter teratas tumpukan bukan '[', maka method mengembalikan nilai false.
   Jika karakter "c" adalah '}' dan karakter teratas tumpukan bukan '{', maka method mengembalikan nilai false.
5. Setelah selesai memeriksa semua karakter dalam string "s", dilakukan pengecekan apakah tumpukan kosong. Jika tumpukan kosong, artinya semua tanda kurung telah seimbang,

Lihat jawaban disini : [Urutkan Kurawal-ku](urutkanKurawalKu.java)

### 4. Penjadwalan Acara Musik

1. Membaca Jumlah Penyanyi:

   Menggunakan Scanner, baca nilai integer dari input sebagai n, yang merupakan jumlah penyanyi.
   Membaca Durasi dan Keindahan Lagu;

2. Buat dua array songDurations dan songBeauties dengan panjang n yang telah diinputkan tadi.
   Selanjutnya, menggunakan loop for dengan perulangan sebanyak jumalah penyanyi dikurang 1, baca nilai integer dari input dan simpan ke dalam array songDurations dan songBeauties masing-masing sesuai dengan indeksnya;

3. Kemudian setelah itu membaca Batasan Waktu

4. Setelah semua input sudah dibaca
   Invoke Fungsi findMaximumBeauty,Fungsi ini menerima tiga parameter, yaitu songDurations (array berisi durasi dari setiap lagu), songBeauties (array berisi keindahan dari setiap lagu), dan totalTime (batasan waktu);

5. Didalam fungsi findMaximumBeauty
   -Kita membuat Variabel n yang diambil dari panjang Array songDurations,
   setelah itu menginisiasi Matriks dp dengan panjang baris dari nilai n+1 dan kolom total time - 1;

   -Kemudia membuat iterasi yang dilakukan untuk setiap penyanyi dan waktu yang tersedia;

   -Jika durasi lagu saat ini lebih kecil atau sama dengan waktu yang tersedia, maka keindahan maksimum pada waktu tersebut adalah maksimum antara keindahan maksimum dari penyanyi sebelumnya pada waktu yang sama atau keindahan maksimum dari penyanyi sebelumnya pada waktu yang lebih sedikit ditambah keindahan lagu saat ini.;

   -Jika durasi lagu saat ini lebih besar dari waktu yang tersedia, maka keindahan maksimum pada waktu tersebut adalah keindahan maksimum dari penyanyi sebelumnya pada waktu yang sama.;

   -Kembalikan keindahan maksimum yang dapat dicapai pada waktu total yang tersedia;

6. Setelah proses Invoke fungsi telah selesai,maka simpan nilai yang direturn fungsi tersebut kedalam variabel
   Maximum Beauty,setelah itu tampilkan


Lihat jawaban disini : [Penjadwalan Acara Musik](PenjadwalanMusik.java)

### 5. Melipat Death Note
Untuk menjawab soal ini, kita perlu mengecek mana yang lebih panjang antara kedua inputan (kita anggap saja P dan Q). Yang paling panjang akan kita bagi dengan 2. hal ini kita lakukan perulangan sebanyak M kali. Dan jika ada diantara kedua inputan yang bernilai ganjil, maka kita akan melakukan pembulatan ke bawah.

Contoh: 
P = 10
Q = 8
M = 3

* pada Pelipatan pertama( M = 1 ):
    P > Q, maka P akan dibagi 2. 
    P = 10/2 

    P = 5, Q = 8

* pada pelipatan kedua ( M = 2 )
    Q > P, maka Q akan dibagi 2. 
    Q = 8/2 

    P = 5, Q = 4

* pada pelipatan ketiga( M = 3 )
    P > Q, maka P akan dibagi 2. 
    P = 5/2 
    P = 2 (2,5 dibulatkan kebawah menjadi 2)
    
    P = 2, Q = 10

Setelah semua perulangan telah dilakukan maka tampilkan P dan Q secara berurutan (Jangan sampai terbalik).

Lihat jawaban disini : [Melipat Death Note](MelipatDeathNote.java)
