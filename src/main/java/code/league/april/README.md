## April Edition

Link soal : https://www.hackerrank.com/code-league-1-1

### 1. Kaguya Sama

Ide dari permasalahan ini adalah penghapusan kata `KAGUYASAMA`. Misal terdapat kalimat `KAGUYASAMKAGUYASAMAA`. Maka
dapat dipecah menjadi KAGUYASAM**KAGUYASAMA**A, selanjutnya hapus kata tersebut, dan tersisa KAGUYASAMA, lalu dihapus
lagi. Total penghapusan adalah 2.

Lihat jawaban disini : [Kaguya-Sama](KaguyaSama.java)

### 2. Dadu Kaori

Cara menjawab permasalahan ini adalah kita hitung terlebih dahulu berapa banyak angka dari tiap nilai. Jika lebih kecil
dari 3, maka hitung nilai berdasarkan peraturan kemunculan 1x. Jika banyak kemunculan sama dengan 3, maka hitung
berdasarkan kemunculan 3x, dan terakhir jika lebih dari 3, maka hitung berdasarkan kemuncul 1x dan 3x.

Lihat jawaban disini : [Dadu Kaori](DaduKaori.java)

### 3. Kelinci Inori
Cara menjawab soal ini dapat bervariasi, bisa menggunakan looping dimana setiap loop merupakan detik, atau juga menggunakan persamaan kecepatan.
Jika menggunakan loop, perlu dipahami kembali mengenai detik apabila terdapat koma, karena pada looping hanya memeriksa presisi setiap 1 detik.

Lihat jawaban disini : [Kelinci Inori](KelinciInori.java)

### 4. Anya Forger

Cara menjawab soal ini mempunyai sangat banyak cara dan untuk lebih jelasnya bisa dibuat sebuah tabel seperti ini

| 1,1 | 1,2 | 1,3 | 1,4 | 1,5 | 1,6 |
|-----|-----|-----|-----|-----|-----|
| 2,1 | 2,2 | 2,3 | 2,4 | 2,5 | 2,6 |
| 3,1 | 3,2 | 3,3 | 3,4 | 3,5 | 3,6 |
| 4,1 | 4,2 | 4,3 | 4,4 | 4,5 | 4,6 |
| 5,1 | 5,2 | 5,3 | 5,4 | 5,5 | 5,6 |
| 6,1 | 6,2 | 6,3 | 6,4 | 6,5 | 6,6 |

Sehingga kita dapat melihat sebuah pola disini

| 2 | 3 | 4 | 5  | 6  | 7  |
|---|---|---|----|----|----|
| 3 | 4 | 5 | 6  | 7  | 8  |
| 4 | 5 | 6 | 7  | 8  | 9  |
| 5 | 6 | 7 | 8  | 9  | 10 |
| 6 | 7 | 8 | 9  | 10 | 11 |
| 7 | 8 | 9 | 10 | 11 | 12 |

Sehingga kita dapat menggunakan perulangan dengan pola tersebut dan memodifikasi hasilnya menggunakan perkondisian.

Lihat jawaban disini : [Anya Forger](AnyaForger.java)
