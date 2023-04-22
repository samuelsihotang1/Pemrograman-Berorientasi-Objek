# T01 TransAksi

Serba digital. Ya, zaman sekarang serba digital. Salah satu aspek dalam kehidupan yang sudah mulai terdampak adalah bidang perbankan dan manajemen keuangan. Tidak sedikit dompet digital ditawarkan oleh berbagai fintech startups.

Konsep dompet digital pada dasarnya cukup sederhana. Seseorang memiliki akun yang mencatat ```balance``` (saldo) beserta berbagai ```transactions``` (transaksi) yang mengenainya. Sebuah akun terikat pada pemilik akun melalui identitasnya berupa nama pemilik (```owner```). Sebuah akun dapat diidentifikasi secara unik melalui ```account-name``` yang merupakan kombinasi teks dan angka.

## Task 01: My Account (40 pts, ```Driver1.java```)

Pada tugas pertama ini, anda diminta untuk mengembangkan simulasi pembuatan sebuah akun dompet digital. Pada saat dibuka, sebuah akun dompet digital memerlukan nama pemilik akun (```owner```) dan sebuah ```account-name```. Untuk membuat sebuah akun, aplikasi akan membaca tiga baris masukkan melalui ```stdin```. Baris pertama merupakan perintah untuk membuat akun (```create-account```), baris kedua merupakan nama pemilik akun (```owner```), dan baris terakhir adalah ```account-name```. Perhatikan format masukkan berikut.

```bash
<command>
<owner>
<account-name>

```

Berikut adalah contoh masukkan.

```bash
create-account
Wiro Sableng
wirsab

```

Setelah kedua masukkan diterima, aplikasi akan membuat sebuah akun serta menampilkan informasi akun berupa nama pemilik (```owner```), ```account-name```, dan ```balance``` (saldo) dalam satu baris luaran ke ```stdout```. Perhatikan format keluaran berikut.

```bash
<account-name>|<owner>|<balance>

```

Berikut adalah contoh luaran.

```bash
wirsab|Wiro Sableng|0.0

```

### Source Code Compilation & Execution

Open your terminal, command prompt, for example. You need to be in the ```bin``` directory. To change directory run the following command. This command should only be executed once.

```bash
cd bin

```

Afterwards, compile all the java codes, located in the ```src``` directory and put all the bytecode to the ```bin``` directory. Remember, at the momment you are in the ```bin``` directory itself. Run the following command.

```bash
javac ../src/fintech/driver/*.driver.java ../src/fintech/model/*.java -d .

```

To execute the bytecode, run the following command from the ```bin``` directory.

```bash
java fintech.driver.Driver1

```

If you have some input files stored in the test directory, use the stream redirection instead.

```bash
java fintech.driver.Driver1 < ..\tests\in01.txt

```

## Task 02: Transaction (60 pts, ```Driver2.java```)

Pada tugas kedua ini, anda diminta untuk mengembangkan simulasi pembuatan sebuah transaksi. Sebuah transaksi harus memiliki dampak terhadap suatu akun. Dampak dimaksud dapat berupa peningkatan nilai ```balance``` (increase) maupun sebaliknya (decrease). Sebuah transaksi memiliki ```id``` yang di-generate secara otomatis secara sequential, nilai transaksi (```amount```), waktu terjadinya transaksi (```posted-at```), dan sebuah catatan singkat sepanjang 40 karakter yang sifatnya opsional.

Untuk membuat sebuah transaksi, aplikasi akan membaca lima baris masukkan. Baris pertama merupakan perintah untuk membuat transaksi (```create-transaction```) diikuti dengan ```account-name```, nilai transaksi (```amount```), waktu terjadinya transaksi (```posted-at```), dan catatan (```note```). Perlu diperhatikan bahwa ```account-name``` diperlukan untuk mengasosiasikan transaksi dengan sebuah akun. Perhatikan format masukkan berikut.

```bash
create-transaction
<account-name>
<amount>
<posted-at>
<note>

```

Sebagai contoh, perhatikan interaksi berikut.

```bash
create-account
Wiro Sableng
wirsab
create-transaction
wirsab
24.0
2023/02/14 14:14:14
Weekly income

```
Setelah semua baris masukkan diproses, aplikasi kemudian akan menampilkan detil transaksi dalam sebaris luaran. Perhatikan format luaran berikut.

```bash
<id>|<account-name>|<amount>|<posted-at>|<note>|<balance>

```

Berikut merupakan contoh luaran.

```bash
wirsab|Wiro Sableng|0.0
1|wirsab|24.0|2023/02/14 14:14:14|Weekly income|24.0

```

## Reporting
Lakukan diskusi dengan pair dan kembangkan sebuah solusi. Presentasikan pekerjaan anda dalam sebuah video. Pada presentasi:
1. Jabarkan solusi anda kelas-per-kelas.
2. Berikan rationale dari setiap implementasi yang anda hasilkan serta berikan argumen mengapa pilihan implementasi anda merupakan pilihan terbaik.
3. Jabarkan alir eksekusi dari solusi anda.
4. Demonstrasikan pekerjaan anda.
5. Buktikan ```id``` pada transaction di-generate secara otomatis dan sekuensial.
6. Tunjukkan hasil yang anda peroleh dari GitHub Classroom.
7. Sebutkan kendala yang dihadapi dalam pengerjaan tugas kali ini.

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
