[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/NdwIuLns)
# T05 Revert

Pada tugas kali ini anda akan mengembangkan sebuah fitur yang memperkaya aplikasi dompet digital. Fitur yang akan dikembangkan merupakan kelanjutan dari ```T04```.

**Note**: anda diizinkan untuk mendefinisikan kelas baru untuk merepresentasikan abstraksi yang dipandang perlu. Letakkan kelas baru anda pada *package* ```fintech.model```.

## Task 01: Revert (60 pts, ```Driver1.java```)

Pada fitur ini, anda diminta untuk mengembangkan fitur transaksi yang mencerminkan pembatalan terhadap transaksi sebelumnya. Reversing transaction adalah transaksi kebalikan dari suatu transaksi target. Misal, transaksi target merupakan transaksi deposit (menambah saldo) maka reverse transactionnya akan melakukan kredit (mengurangi saldo). Perlu diingat bahwa reversing transaction tetap menaati semua aturan yang sudah ada sebelumnya. Perintah yang digunakan untuk membuat sebuah revert transaction adalah ```revert-transaction``` yang diikuti dengan ```account-name```, ```transcation-id```, dan ```posted-at```. Untuk ```transaction-note``` dari revert transaction menggunakan ```transaction-note``` dari target transaction yang diawali dengan teks ```"REVERT: "```.

```bash
create-account#Wiro Sableng#wirsab
create-account#Jaka Sembung#jaksem
create-transaction#jaksem#15.0#2023/02/14 14:14:14#Weekly income
create-transaction#jaksem#-8.4#2023/02/15 15:18:15#SIM credit
create-transaction#jaksem#37.1#2023/02/15 15:15:15#Book refund
create-transaction#wirsab#-5.0#2023/02/16 10:15:41#Tax
revert-transaction#jaksem#3#2023/02/15 15:15:16
show-account#jaksem
show-account#wirsab
create-transaction#jaksem#wirsab#12.0#2023/02/21 13:11:11#Lunch
show-account#jaksem
show-account#wirsab
---

```

Berikut adalah contoh luaran dari kombinasi input di atas. Perhatikan transaksi dengan id ```4``` yang merupakan revert dari transaksi dengan id ```3```.

```bash
wirsab|Wiro Sableng|0.0
jaksem|Jaka Sembung|0.0
jaksem|Jaka Sembung|6.6
1|jaksem|15.0|2023/02/14 14:14:14|Weekly income
3|jaksem|37.1|2023/02/15 15:15:15|Book refund
4|jaksem|-37.1|2023/02/15 15:15:16|REVERT: Book refund
2|jaksem|-8.4|2023/02/15 15:18:15|SIM credit
wirsab|Wiro Sableng|0.0
jaksem|Jaka Sembung|6.6
1|jaksem|15.0|2023/02/14 14:14:14|Weekly income
3|jaksem|37.1|2023/02/15 15:15:15|Book refund
4|jaksem|-37.1|2023/02/15 15:15:16|REVERT: Book refund
2|jaksem|-8.4|2023/02/15 15:18:15|SIM credit
wirsab|Wiro Sableng|0.0

```

### Task 2: Chances for Nested Class, Local Class, Annonymous Class, or Record (40 pts)

Kembangkan solusi anda dari **Task 1** dengan menerapkan salah satu dari nested class, local class, annonymous class, atau record.

Untuk evaluasi, pada presentasi, tunjukkan:
1. konsep apa yang anda gunakan?
2. menjabarkan rasional mengapa konsep tersebut relevan.

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
