# T02 Multi-TransAksi

Pada ```T01``` yang lalu anda telah mengembangkan essential components dari sebuah dompet digital TransAksi. Anda telah mengembangkan fitur untuk menambah sebuah akun dan menambah sebuah transaksi yang terasosiasi dengan sebuah akun. Pada tugas kali ini, anda akan meneruskan pengembangan TransAksi dengan beberapa fitur tambahan.

**Note**: anda diizinkan untuk mendefinisikan kelas baru untuk merepresentasikan abstraksi yang dipandang perlu. Letakkan kelas baru anda pada package ```fintech.model```.

**Hint**: anda dapat memanfaatkan array atau Java Collection API untuk menyelesaikan tugas kali ini.

## Task 01: Multiple Accounts (30 pts, ```Driver1.java```)

Pada tugas ini anda akan mengembangkan aplikasi sehingga mampu menyimpan banyak akun. Perlu diperhatikan bahwa jumlah akun tidak dibatasi. Oleh sebab itu, anda harus mengembangkan mekanisme yang dapat menangani kapasitas secara dinamik. Berbeda dengan ```T01```, pada tugas ini aplikasi akan terus menerus membaca masukkan dari ```stdin``` hingga diberi sebaris masukkan ```---```.

Pada bagian ini, kita juga akan menyederhanakan struktur input yang digunakan untuk membuat sebuah akun. Input terdiri atas satu baris masukkan, baris masukkan terdiri atas tiga segmen yang dibatasi oleh hash (```#```). Segmen pertama adalah perintah untuk membuat akun ```create-account```, diikuti oleh ```owner```, dan ```account-name```.

Perhatikan contoh berikut. Pada contoh ditunjukkan bagaimana aplikasi membaca dan membuat dua buah akun dompet digital sebelum akhirnya diterminasi.

```bash
create-account#Wiro Sableng#wirsab
create-account#Jaka Sembung#jaksem
---

```

Berikut adalah contoh luaran dari kombinasi input di atas.

```bash
wirsab|Wiro Sableng|0.0
jaksem|Jaka Sembung|0.0

```

### Find My Account (30 pts, ```Driver2.java```)

Pada tugas ini, anda diminta untuk mengembangkan sebuah fitur pencarian akun dompet digital. Pencarian dilakukan dengan bertumpu pada ```account-name``` dan menggunakan pendekatan ```case insensitive```. Perintah untuk melakukan pencarian terdiri atas dua segmen yang diseparasi dengan hash (```#```). Segmen pertama adalah perintah pencarian ```find-account``` dan disertai dengan ```owner```. Perlu diingat bahwa pencarian harus memastikan ```account-name``` cocok seutuhnya dengan ```search key``` yang dimasukkan.

Bila pencarian membuahkan hasil, silakan tampilkan akun. Bila tidak, aplikasi tidak memberi keluaran apapun. Perhatikan contoh berikut.

```bash
create-account#Wiro Sableng#wirsab
find-account#Milkyman
create-account#Jaka Sembung#jaksem
find-account#JAKSEM
---

```

Berikut adalah contoh keluaran yang dihasilkan.

```bash
wirsab|Wiro Sableng|0.0
jaksem|Jaka Sembung|0.0
jaksem|Jaka Sembung|0.0

```

### Multiple Transactions (40 pts, ```Driver3.java```)

Pada tugas ini anda diminta untuk mampu mengembangkan aplikasi sehingga mampu memproses lebih dari satu transaksi. Sebuah transaksi harus terasosiasi pada satu akun. Perintah untuk mendaftarkan sebuah transaksi terdiri atas lima segmen yang diseparasi dengan hash (```#```). Segmen pertama adalah perintah pembuatan transaksi ```create-transaction``` diikuti dengan ```account-name```, nilai transaksi (```amount```), tanggal transaksi (```posted-at```), dan catatan (```note```) yang sifatnya opsional. Bila akun yang akan diasosiasikan tidak ditemukan, maka transaksi secara otomatis dibatalkan.

```bash
create-account#Wiro Sableng#wirsab
find-account#Milkyman
create-account#Jaka Sembung#jaksem
create-transaction#jaksem#15.0#2023/02/14 14:14:14#Weekly income
create-transaction#jaksem#37.1#2023/02/15 15:15:15#Book refund
create-transaction#jaksem#-8.4#2023/02/15 15:18:15#SIM credit
find-account#JAKSEM
create-transaction#congcong#-5.0#2023/02/16 10:15:41#Tax
---

```

Berikut ini adalah hasil eksekusi dari masukkan di atas.

```bash
wirsab|Wiro Sableng|0.0
jaksem|Jaka Sembung|0.0
jaksem|Jaka Sembung|43.7

```

## Reporting
Lakukan diskusi dengan pair dan kembangkan sebuah solusi. Presentasikan pekerjaan anda dalam sebuah video. Pada presentasi:
1. Jabarkan solusi anda kelas-per-kelas.
2. Berikan rationale dari setiap implementasi yang anda hasilkan serta berikan argumen mengapa pilihan implementasi anda merupakan pilihan terbaik.
3. Jabarkan alir eksekusi dari solusi anda.
4. Demonstrasikan pekerjaan anda.
5. Tunjukkan hasil yang anda peroleh dari GitHub Classroom.
6. Sebutkan kendala yang dihadapi dalam pengerjaan tugas kali ini.

Note: Semakin tajam argumen dan penjabaran anda semakin mudah penilaian dilakukan.

Kriteria Video Presentasi:
+ Fullscreen (taskbar terlihat).
+ Suara jernih dan dapat dengan jelas terdengar.
+ Posting video anda di YouTube, di-set "Not For Kids" dengan visibility Unlisted.

## Submission
1. ```src/fintech/model/*.java```;
2. ```src/fintech/driver/*.java```;
3. changelog.txt

## How to submit?
Please see https://youtu.be/ZOhgmVjWFyo
