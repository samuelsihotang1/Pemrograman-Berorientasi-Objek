[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/17VHdLGX)
# F01 Study Plan

Pada tugas ini anda diminta untuk mengembangkan sebuah solusi yang menyimulasikan kegiatan pengisian **Kartu Rencana Studi** (KRS) seorang mahasiswa pada suatu semester. Pada suatu semester akan disediakan beberapa mata kuliah yang kemudian dapat dipilih oleh satu atau lebih mahasiswa.

Untuk mensimplifikasi, sebuah mata kuliah terdiri atas beberapa atribut, yakni `kode` unik, `nama` mata kuliah, `semester` pelaksanaan, serta bobot `kredit`. Sementara seorang mahasiswa dideskripsikan dengan atribut `nim`, `nama`, dan `prodi`.

Solusi dikembangkan dalam struktur Maven *project* dan seluruh data disimpan dalam basis data H2. Berikut adalah beberapa ketentuan umum dari *project*:
1. Lokasi basis data pada direktori `./db`).
2. Lokasi *source code* pada direktori `./src/main/java/pbo`.
3. *Entry point* solusi `./src/main/java/pbo/App.java`.
4. *Persistence configuration* `./src/main/resources/META-INF/persistence.xml`.

Interaksi yang terjadi antara solusi dan pengguna dilakukan melalui `STDIN` dan `STDOUT`. Solusi akan secara terus menerus membaca perintah melalui `STDIN` dan berhenti bila bila diberi masukkan `---`.

## Task 1. Physical Data Model

Tugas pertama anda adalah merancang basis data berdasarkan deskripsi studi kasus. Gambarkan desain anda dalam bentuk *Physical Data Model* (PDM).

## Task 2. Entity Class Definition

Tugas kedua, terjemahkan desain basis data yang sudah anda hasilkan ke dalam *entity classes*. Dalam mengembangkan *entity classes*, perhatikan hal-hal berikut:
1. Tipe data yang digunakan; dan
2. *Persistence configuration*.

## Task 3. Registering Student Data

Tugas berikutnya adalah mengembangkan sebuah fitur yang akan menambahkan sebuah data mahasiswa ke dalam basis data. Perintah yang digunakan adalah `student-add`, diikuti dengan `nim`, `nama` mahasiswa, dan `prodi` dengan `#` sebagai separasi.

Untuk memverifikasi kesuksesan proses registrasi mahasiswa, kembangkan sebuah fitur untuk menampilkan seluruh data mahasiswa yang tersimpan di dalam basis data ke `STDOUT`. Sebuah data mahasiswa direpresentasikan dalam sebuah baris keluaran dengan menampilkan `nim`, `nama`, dan `prodi` diseparasi dengan `|`. Data mahasiswa ditampilkan secara *ascending* berdasarkan `nim`. Perintah yang digunakan untuk mengeksekusi `student-show-all`.

Sebagai ilustrasi, perhatikan contoh berikut.

```bash
student-add#12S21001#Dhino Turnip#S1 Sistem Informasi
student-add#21S21001#Samuel Purba#S1 Manajemen Rekayasa
student-add#12S21002#Marudut Tampubolon#S1 Sistem Informasi
student-show-all
---

```

Eksekusi dari perintah-perintah di atas akan memberikan keluaran sebagai berikut.

```bash
12S21001|Dhino Turnip|S1 Sistem Informasi
12S21002|Marudut Tampubolon|S1 Sistem Informasi
21S21001|Samuel Purba|S1 Manajemen Rekayasa

```

## Task 4. Adding Course Data

Seperti pada **Task 3**, anda diminta untuk mengembangkan sebuah fitur untuk menambahkan sebuah data mata kuliah ke dalam simulator. Perintah yang digunakan adalah `course-add`, diikuti dengan `kode`, `nama`, `semester`, dan `kredit` dengan `#` sebagai separasi.

Untuk keperluan verifikasi, anda juga diminta untuk mengembangkan fitur yang akan digunakan untuk menampilkan seluruh data mata kuliah dari basis data ke `STDOUT`. Setiap mata kuliah ditampilkan dalam sebaris keluaran yang terdiri dari `kode` mata kuliah, `nama`, `semester`, dan `kredit`-nya. Data mata kuliah diurutkan secara ascending menurut `semester` dan `kode`-nya.

Sebagai ilustrasi, perhatikan contoh masukkan berikut.

```bash
student-add#12S21001#Dhino Turnip#S1 Sistem Informasi
student-add#21S21001#Samuel Purba#S1 Manajemen Rekayasa
student-add#12S21002#Marudut Tampubolon#S1 Sistem Informasi
student-show-all
course-add#10S2201#Aljabar Linier#4#3
course-add#10S2202#Jaringan Komputer#4#3
course-add#10S2203#Sistem Operasi#4#3
course-add#12S2201#Analisis dan Desain Sistem#4#3
course-add#12S2202#Interaksi Manusia-Komputer#4#3
course-add#12S2203#Pemrograman Berorientasi Objek#4#3
course-add#KUS3001#Analisis Dampak Lingkungan#6#2
course-add#10S1002#Pemrograman Prosedural#2#2
course-show-all
---

```

Perintah-perintah di atas kemudian akan memberikan keluaran sebagai berikut.

```bash
12S21001|Dhino Turnip|S1 Sistem Informasi
12S21002|Marudut Tampubolon|S1 Sistem Informasi
21S21001|Samuel Purba|S1 Manajemen Rekayasa
10S1002|Pemrograman Prosedural|2|2
10S2201|Aljabar Linier|4|3
10S2202|Jaringan Komputer|4|3
10S2203|Sistem Operasi|4|3
12S2201|Analisis dan Desain Sistem|4|3
12S2202|Interaksi Manusia-Komputer|4|3
12S2203|Pemrograman Berorientasi Objek|4|3
KUS3001|Analisis Dampak Lingkungan|6|2

```

## Task 5. Enrolling Student

Tugas berikutnya adalah meng-*enroll* seorang mahasiswa ke dalam suatu mata kuliah. Perintah yang digunakan adalah `enroll` yang diikuti dengan `nim` mahasiswa dan `kode` mata kuliah dengan `#` sebagai separator. Untuk simplifikasi, tidak diperkenankan bagi seorang mahasiswa untuk meng-*enroll* suatu mata kuliah lebih dari satu kali. Semua `enrollments` harus tersimpan di dalam basis data.

Untuk keperluan verifikasi, anda diminta untuk mengembangkan sebuah fitur untuk menampilkan informasi seorang mahasiswa lengkap dengan `enrollments`-nya. Perintah yang digunakan untuk mengeksekusi fitur ini adalah `student-detail` yang diikuti dengan `nim` dari mahasiswa dengan diseparasi sebuah `#`. Solusi akan terlebih dahulu menampilkan data mahasiswa dalam sebaris keluaran kemudian menampilkan mata kuliah yang di-*enroll*-nya secara *ascending* menurut `semester` dan `kode` mata kuliah-nya.

Sebagai ilustrasi, perhatikan masukkan berikut.

```bash
student-add#12S21001#Dhino Turnip#S1 Sistem Informasi
student-add#21S21001#Samuel Purba#S1 Manajemen Rekayasa
student-add#12S21002#Marudut Tampubolon#S1 Sistem Informasi
course-add#KUS3001#Analisis Dampak Lingkungan#6#2
course-add#10S2201#Aljabar Linier#4#3
course-add#10S2202#Jaringan Komputer#4#3
course-add#10S2203#Sistem Operasi#4#3
course-add#12S2201#Analisis dan Desain Sistem#4#3
course-add#12S2202#Interaksi Manusia-Komputer#4#3
course-add#12S2203#Pemrograman Berorientasi Objek#4#3
course-add#10S1002#Pemrograman Prosedural#2#2
enroll#12S21001#KUS3001
enroll#12S21001#10S2201
enroll#12S21001#10S2202
enroll#12S21001#10S2203
enroll#12S21001#12S2201
enroll#12S21001#12S2202
enroll#12S21001#12S2203
enroll#12S21002#10S1002
enroll#12S21002#10S2201
enroll#12S21002#10S2202
enroll#12S21002#10S2203
enroll#12S21002#12S2201
enroll#12S21002#12S2202
enroll#12S21002#12S2203
student-show#12S21001
student-show#12S21002
---

```

Berikut adalah keluaran yang dihasilkan.

```bash
12S21001|Dhino Turnip|S1 Sistem Informasi
10S2201|Aljabar Linier|4|3
10S2202|Jaringan Komputer|4|3
10S2203|Sistem Operasi|4|3
12S2201|Analisis dan Desain Sistem|4|3
12S2202|Interaksi Manusia-Komputer|4|3
12S2203|Pemrograman Berorientasi Objek|4|3
KUS3001|Analisis Dampak Lingkungan|6|2
12S21002|Marudut Tampubolon|S1 Sistem Informasi
10S1002|Pemrograman Prosedural|2|2
10S2201|Aljabar Linier|4|3
10S2202|Jaringan Komputer|4|3
10S2203|Sistem Operasi|4|3
12S2201|Analisis dan Desain Sistem|4|3
12S2202|Interaksi Manusia-Komputer|4|3
12S2203|Pemrograman Berorientasi Objek|4|3

```

## Compiling & Execution

Pada saat mengkompilasi, Maven akan men-*download* *dependencies*, oleh sebab itu, pastikan koneksi anda baik. Untuk mengkompilasi Maven *project*:

```bash
mvn --quiet clean compile assembly:single
```

Hasil kompilasi akan diletakkan pada direktori `./target`.

Untuk mengeksekusi *bundled jar executable*:

```bash
java -jar ./target/f01-1.0-SNAPSHOT-jar-with-dependencies.jar
```

## Grading

Penilaian dilakukan dengan menggunakan skema berikut.
1. [30 pts] Nilai yang diberikan oleh GitHub Classroom.
2. [10 pts] Kualitas video dan substansi laporan.
3. [10 pts] Desain basis data.
4. [10 pts] Kesesuaian realisasi *entity classes* dengan desain.
5. [10 pts] Ketepatan proses *entitiy insertions* ke dalam basis data.
6. [15 pts] Ketepatan pengembangan, eksekusi Java Persistence Query Language (JPQL), dan penggunaan *execution results*.
7. [15 pts] Ketepatan algoritma/alir solusi.

Lebih detil dapat dilihat pada rubrik penilaian.

## Reporting

Lakukan diskusi dengan pair dan kembangkan sebuah solusi. Presentasikan pekerjaan anda dalam sebuah video. Pada presentasi:
1. Jabarkan solusi anda kelas-per-kelas.
2. Berikan rationale dari setiap implementasi yang anda hasilkan serta berikan argumen mengapa pilihan implementasi anda merupakan pilihan terbaik.
3. Jabarkan alir eksekusi dari solusi anda.
4. Demonstrasikan pekerjaan anda.
5. Tunjukkan hasil yang anda peroleh dari GitHub Classroom.
6. Sebutkan kendala yang dihadapi dalam pengerjaan tugas kali ini.

*Note*: Semakin tajam argumen dan penjabaran anda semakin mudah penilaian dilakukan.

**Kriteria video presentasi**:
+ *fullscreen recording* (*taskbar* terlihat).
+ *presenter* terlihat.
+ suara jernih dan dapat dengan jelas terdengar.
+ *upload* presentasi anda di YouTube, di-set "Not For Kids" dengan *visibility* *Unlisted*.

## Submission

1. `./src/*`; dan
2. `changelog.txt`.

## How to submit?

Please see https://youtu.be/ZOhgmVjWFyo