## June Edition

Link soal : https://www.hackerrank.com/code-league-2

### 1. Illegal Moves by the Rook

Soal ini memiliki pola tertentu untuk menjawabnya. Perhatikan papan catur $4 \times 4$ berikut ini :

| 1  | 2  | 3  | 4  |
|:--:|:--:|:--:|:--:|
| 5  | 6  | 7  | 8  |
| 9  | 10 | 11 | 12 |
| 13 | 14 | 15 | 16 |

Misalkan pion berada pada nomor 6, maka gerakan ilegal yang bisa dilakukan adalah gerakan diagonal ke 1, 3, 9, atau 11. Perhatikan pola berikut :

* $6 - 1 = 5$
* $6 - 3 = 3$
* $6 - 9 = -3$
* $6 - 11 = -5$

Kita dapat membentuk pola dari $(5, 3, -5, -3)$ dengan :

* $| 4 - 1 | = | 3 | = | -3 |$

* $| 4 + 1 | = | 5 | = | -5 |$

* $4$ adalah ukuran dari papan catur $(4 \times 4)$.

Lihat jawaban disini : [Illegal Moves by the Rook](TheRookMove.java)

### 2. Gobta dan Gobzo

Cara menjawab permasalahan ini adalah dengan Menggunakan looping untuk merubah nilai n, dimana jika nilai n terakhir adalah 0, 1, 2 maka n bernilai benar
- Jika n dimodulus 5 = 2 atau 3, maka n bernilai salah,
- Jika n dimodulus 5 = 4, maka ubah nilai n menjadi (n+1) / 5
- Selain itu, ubah nilai n menjadi n / 5

Lihat jawaban disini : [Gobta dan Gobzo](GobtaDanGobzo.java)


### 4. Angka Palindrome Kirisu

Untuk menjawab soal ini, kita dapat menggunakan rekursif. Apabila diilustrasikan dengan binary tree, maka kita dapat membuat rekursif dengan node kiri menggunakan $x$ dan node kanan menggunakan $y$.

Lalu untuk base casenya, dapat berupa:

* return 1, jika jumlah setiap digit pada susunan angkanya **sama dengan num** dan susunan angkanya **palindrome**.
* return 0, jika jumlah setiap digit pada susunan angkanya **sama dengan num**, tetapi **tidak palindrome**.
* return 0, jika jumlah setiap digit pada susunan angkanya **melebihi num**.

```
 | num = 8 |                         root
 | x = 2   |            /                             \
 | y = 3   |           2                               3
                 /            \                  /            \
              22                23            32              33
           /     \            /    \        /    \          /    \
          /       \          /      \      /      \        /      \
        222       223       232    233    322    323      332    333
        / \       / \       / \     |     / \     |        |      |
       /   \     /   \     /   \    0    /   \    1        0      0
     2222 2223 2232 2233 2322 2323     3222 3223
      |    |    |    |    |    |        |    |
      1    0    0    0    0    0        0    0
```

Lihat jawaban disini : [Angka Palindrome Kirisu](AngkaPalindromeKirisu.java)