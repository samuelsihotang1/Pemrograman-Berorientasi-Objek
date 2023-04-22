Q01 Detailed

Pada ```T02``` yang lalu anda telah mengembangkan berbagai fitur penting dompet digital. Pada sesi ini anda akan diminta untuk mengembangkan dua fitur tambahan yang mendasarkan pada hasil pekerjaan anda sebelumnya.

**Note**: anda diizinkan untuk mendefinisikan kelas baru untuk merepresentasikan abstraksi yang dipandang perlu. Letakkan kelas baru anda pada package ```fintech.model```.

## Task 01: Account Detail (50 pts, ```Driver1.java```)

Pada tugas ini anda akan mengembangkan sebuah fitur untuk menampilkan akun secara detil. Melalui fitur ini, aplikasi akan menampilkan informasi akun beserta semua transaksi yang relevan secara berurut berdasarkan waktu transaksi secara menaik. Perintah yang digunakan terdiri atas dua segments yang diseparasi dengan sebuah hash (```#```). Segment pertama adalah perintah ```show-account``` diikuti dengan ```account-name```.

Perhatikan contoh berikut. Harap diperhatikan bahwa ```account-name``` bersifat case insensitive.

```bash
create-account#Wiro Sableng#wirsab
create-account#Jaka Sembung#jaksem
create-transaction#jaksem#15.0#2023/02/14 14:14:14#Weekly income
create-transaction#jaksem#-8.4#2023/02/15 15:18:15#SIM credit
create-transaction#jaksem#37.1#2023/02/15 15:15:15#Book refund
create-transaction#wirsab#-5.0#2023/02/16 10:15:41#Tax
show-account#jaksem
---

```

Berikut adalah contoh luaran dari kombinasi input di atas.

```bash
wirsab|Wiro Sableng|0.0
jaksem|Jaka Sembung|0.0
jaksem|Jaka Sembung|43.7
1|jaksem|15.0|2023/02/14 14:14:14|Weekly income
3|jaksem|37.1|2023/02/15 15:15:15|Book refund
2|jaksem|-8.4|2023/02/15 15:18:15|SIM credit

```

### Find My Account (50 pts, ```Driver2.java```)

Pada tugas ini, anda diminta untuk mengembangkan sebuah fitur yang akan menampilkan semua akun secara ```alphabetical order``` berdasarkan ```account-name```. Perintah untuk melakukan pencarian hanya terdiri dari satu segmen, ```show-accounts```.

Bila pencarian membuahkan hasil, silakan tampilkan akun. Bila tidak, aplikasi tidak memberi keluaran apapun. Perhatikan contoh berikut.

```bash
create-account#Wiro Sableng#wirsab
create-account#Jaka Sembung#jaksem
create-transaction#jaksem#15.0#2023/02/14 14:14:14#Weekly income
create-transaction#jaksem#-8.4#2023/02/15 15:18:15#SIM credit
create-transaction#jaksem#37.1#2023/02/15 15:15:15#Book refund
create-transaction#wirsab#-5.0#2023/02/16 10:15:41#Tax
show-accounts
---

```

Berikut adalah contoh keluaran yang dihasilkan.

```bash
wirsab|Wiro Sableng|0.0
jaksem|Jaka Sembung|0.0
jaksem|Jaka Sembung|43.7
1|jaksem|15.0|2023/02/14 14:14:14|Weekly income
3|jaksem|37.1|2023/02/15 15:15:15|Book refund
2|jaksem|-8.4|2023/02/15 15:18:15|SIM credit
wirsab|Wiro Sableng|-5.0
4|wirsab|-5.0|2023/02/16 10:15:41|Tax

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
