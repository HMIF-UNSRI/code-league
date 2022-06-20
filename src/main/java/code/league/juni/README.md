## June Edition

Link soal : https://www.hackerrank.com/code-league-2

### 1. Illegal Moves by the Rook

Soal ini memiliki pola tertentu untuk menjawabnya. Perhatikan papan catur 4 x 4 berikut ini :

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

* $4$ adalah ukuran dari papan catur $(4 x 4)$.

Lihat jawaban disini : [Illegal Moves by the Rook](TheRookMove.java)