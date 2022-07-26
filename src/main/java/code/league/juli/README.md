## July Edition

Link soal : https://www.hackerrank.com/code-league-3

### 1. CheckPoint

Soal ini mengharuskan peserta untuk menebak kemungkinan dari kumpulan point dapat terjadi atau tidak. Cara menjawabnya bisa dengan berbagai variasi, salah satunya menggunakan beberapa filter seperti berikut :

**Filter angka mustahil**

Filter ini mendeteksi angka yang mustahil dicapai oleh suatu tim yaitu angka 7, 10, dan 11.

**Filter 12**

Filter ini mencegah angka 12 tidak muncul lebih dari 1 kali, karena mustahil ada 2 tim yang mendapatkan 12 point.

**Filter pertandingan**

Filter pertandingan berfungsi untuk mengecek jumlah pertandingan yang terjadi berdasarkan point yang didapat masing-masing tim. Karena terdapat 4 tim yang bertanding, maka terdapat 12 pertandingan (masing-masing tim melakukan 3 pertandingan). Filter Pertandingan memastikan jumlah pertandingan tidak kurang ataupun melebihi angka 12 dengan rincian sebagai berikut:

 -      Point 4 akan bernilai 2 pertandingan

**Contoh 1: Tim A : 4 Point Tim B : 0 point**

Dari kondisi diatas dapat diketahui bahwa telah terjadi 2 pertandingan (1 dari tim A dan 1 dari Tim B) meski hanya Tim A yang mendapatkan point

**Contoh 2: Tim A : 8 Point Tim B : 0 point Tim C : 0 Point**

Dari kondisi diatas dapat diketahui bahwa telah terjadi 4 pertandingan (2 dari tim A, 1 dari tim B, dan 1 dari Tim C) meski hanya Tim A yang mendapatkan point
 
-        Point 1 akan bernilai 1 pertandingan

**Contoh 1: Tim A : 1 Point Tim B : 1 point**

Dari kondisi diatas dapat diketahui bahwa telah terjadi 2 pertandingan (1 dari tim A dan 1 dari Tim B).

**Contoh 2: Tim A : 2 Point Tim B : 1 point Tim C : 1 Point**

Dari kondisi diatas dapat diketahui bahwa telah terjadi 4 pertandingan (2 dari tim A, 1 dari tim B, dan 1 dari Tim C).


Lihat jawaban disini : [CheckPoint](CheckPoint.java)

### 2. Cewek Atau Cowok

Cara menjawab soal ini adalah mengikuti 2 langkah sebagai berikut:
1.      Menghapus 2 huruf atau lebih yang sama dan berdekatan.
2.      Menghitung jumlah “distinct characters” dari username yang telah melewati langkah sebelumnya.
-   jika “distinct characters” pada username berjumlah ganjil, maka ia adalah cowok.
-   jika “distinct characters” pada username berjumlah genap, maka ia adalah cewek.

Lihat jawaban disini : [Cewek Atau Cowok](CewekAtauCowok.java)

### 3. Ayo Berhitung

Cara menjawab soal yang satu ini adalah dengan mengecek setiap kemungkinan jawaban dengan menggunakan teknik 

-       Rekursif

Ice Prince diperbolehkan melompat 1 sampai 5 kotak sehingga setiap node hanya mempunyai 5 node yang mempresentasikan kemungkinan jika Ice Prince melompat di kotak 1 sampai 5. 

Dikarenakan soal hanya meminta poin terbesar, Maka hanya perlu membandingkan return value dari 5 kemungkinan yang diambil oleh Ice Prince. Return value yang terbesar itulah yang nantinya akan diambil.

Contoh : -1 -5 -5 -5 -2 -3 0

Kemungkinan 5 Lompatan pertama
- Node 0 : -1 + (Return dari Lompatan Kedua, Ketiga, ...)
- Node 1 : -5 + (Return dari Lompatan Kedua, Ketiga, ...)
- Node 2 : -5 + (Return dari Lompatan Kedua, Ketiga, ...)
- Node 3 : -5 + (Return dari Lompatan Kedua, Ketiga, ...)
- Node 4 : -2 + (Return dari Lompatan Kedua, Ketiga, ...)

Kemungkinan 5 Lompatan Kedua dari Node 0
- Node 0 : Poin dari Node 0 + -5 + (Return dari Lompatan Kedua, Ketiga, ...)
- Node 1 : Poin dari Node 0 + -5 + (Return dari Lompatan Kedua, Ketiga, ...)
- Node 2 : Poin dari Node 0 + -5 + (Return dari Lompatan Kedua, Ketiga, ...)
- Node 3 : Poin dari Node 0 + -2 + (Return dari Lompatan Kedua, Ketiga, ...)
- Node 4 : Poin dari Node 0 + -3 + (Return dari Lompatan Kedua, Ketiga, ...)

Kemudian program akan terus lanjut sampai hingga akhirnya return dari tiap node akan dibandingkan manakah node yang mempunyai return value terbesar. 

Hasilnya adalah
- Node 0 : -3
- Node 1 : -5
- Node 2 : -5
- Node 3 : -5
- Node 4 : -2 

Didapatlah poin maksimal dari permainan adalah -2

Lihat jawaban disini : [Ayo Berhitung](AyoBerhitung.java)

### 4. Lord Usop

Untuk menjawab soal ini bisa dengan berbagai variasi, salah satunya dengan mencari “impostor” di String A dan “impostor” di array B. Setelah para Impostor ketemu, kita bisa membuat String password baru berdasarkan String A. Namun, impostor di A, kita gantikan dengan Impostor B.

Lihat jawaban disini : [Lord Usop](LordUsop.java)
