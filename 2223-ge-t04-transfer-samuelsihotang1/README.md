[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-8d59dc4de5201274e310e4c54b9627a8934c3b88527886e3b421487c677d23eb.svg)](https://classroom.github.com/a/jdQQ_ivL)
T04 Transfer

Pada tugas kali ini anda akan mengembangkan sebuah fitur yang memperkaya aplikasi dompet digital. Fitur yang akan dikembangkan merupakan kelanjutan dari ```M01```.

**Note**: anda diizinkan untuk mendefinisikan kelas baru untuk merepresentasikan abstraksi yang dipandang perlu. Letakkan kelas baru anda pada *package* ```fintech.model```.

## Task 01: Transfer (60 pts, ```Driver1.java```)

Pada fitur ini, anda diminta untuk mengembangkan fitur transaksi yang mencerminkan pemindahan ```balance``` dari suatu akun ke akun lainnya. Konsepnya sangat mirip dengan transaksi biasa, perbedaannya terdapat pada adanya sumber ```balance```. Perlu diingat bahwa transaksi tidak boleh menyebabkan **negative balance** pada sumber transaksi (**sender**). Perintah yang digunakan untuk membuat sebuah transaksi transfer adalah ```create-transaction```, sama dengan ketika membuat transaksi biasa. Selanjutnya diikuti dengan ```sender-name```, ```recepient-name```, ```amount```, ```posted-at```, dan ```note```. Perhatikan contoh berikut.

```bash
create-account#Wiro Sableng#wirsab
create-account#Jaka Sembung#jaksem
create-transaction#jaksem#15.0#2023/02/14 14:14:14#Weekly income
create-transaction#jaksem#-8.4#2023/02/15 15:18:15#SIM credit
create-transaction#jaksem#37.1#2023/02/15 15:15:15#Book refund
create-transaction#wirsab#-5.0#2023/02/16 10:15:41#Tax
show-account#jaksem
show-account#wirsab
create-transaction#jaksem#wirsab#12.0#2023/02/21 13:11:11#Lunch
show-account#jaksem
show-account#wirsab
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
wirsab|Wiro Sableng|0.0
jaksem|Jaka Sembung|31.7
1|jaksem|15.0|2023/02/14 14:14:14|Weekly income
3|jaksem|37.1|2023/02/15 15:15:15|Book refund
2|jaksem|-8.4|2023/02/15 15:18:15|SIM credit
4|jaksem|wirsab|12.0|2023/02/21 13:11:11|Lunch
wirsab|Wiro Sableng|12.0
4|jaksem|wirsab|12.0|2023/02/21 13:11:11|Lunch

```

### Task 2: Chances for Inheritance and Polymorphism (40 pts)

Kembangkan solusi anda dari **Task 1** dengan menerapkan konsep inheritance dan/atau polymorphism.

Untuk evaluasi, pada presentasi, tunjukkan:
1. konsep apa yang anda gunakan?
2. menjabarkan rasional mengapa konsep tersebut relevan.
3. gambarkan solusi anda dalam sebuah class diagram.

## Reporting
Lakukan diskusi dengan pair dan kembangkan sebuah solusi. Presentasikan pekerjaan anda dalam sebuah video. Pada presentasi:
1. Jabarkan solusi anda kelas-per-kelas.
2. Berikan rationale dari setiap implementasi yang anda hasilkan serta berikan argumen mengapa pilihan implementasi anda merupakan pilihan terbaik.
3. Jabarkan alir eksekusi dari solusi anda.
4. Demonstrasikan pekerjaan anda.
5. Tunjukkan hasil yang anda peroleh dari GitHub Classroom.
6. Sebutkan kendala yang dihadapi dalam pengerjaan tugas kali ini.

Note: Semakin tajam argumen dan penjabaran anda semakin mudah penilaian dilakukan.

Kriteria video presentasi:
+ *fullscreen* (*taskbar* terlihat).
+ suara jernih dan dapat dengan jelas terdengar.
+ I video anda di YouTube, di-set "Not For Kids" dengan *visibility* *Unlisted*.

## Submission
1. ```src/fintech/model/*.java```;
2. ```src/fintech/driver/*.java```;
3. changelog.txt

## How to submit?
Please see https://youtu.be/ZOhgmVjWFyo
