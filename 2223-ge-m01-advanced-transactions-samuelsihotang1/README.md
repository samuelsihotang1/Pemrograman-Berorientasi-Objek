M01 Advanced Transactions

Pada tugas kali ini anda akan kembali mengembangkan fitur-fitur yang memperkaya aplikasi dompet digital. Fitur yang akan dikembangkan merupakan kelanjutan dari ```T03```.

**Note**: anda diizinkan untuk mendefinisikan kelas baru untuk merepresentasikan abstraksi yang dipandang perlu. Letakkan kelas baru anda pada *package* ```fintech.model```.

## Task 01: Always Positive (60 pts, ```Driver1.java```)

Pada tugas sebelumnya (**T03**) anda telah diminta untuk mengembangkan fitur untuk menambahkan transaksi ke dalam akun bank digital. Fitur tersebut masih sederhana dan belum memperhatikan kemungkinan terjadinya saldo bernilai negatif (*negative balance*) yang diakibatkan oleh sebuah transaksi (*expense transaction*). Oleh sebab itu, pada tugas kali ini, anda diminta untuk memberikan sebuah mekanisme proteksi sedemikian rupa sehingga transaksi yang dapat berakibat pada kondisi defisit akan diabaikan.

Perhatikan contoh berikut.

```bash
create-account#Wiro Sableng#wirsab
create-account#Jaka Sembung#jaksem
create-transaction#jaksem#15.0#2023/02/14 14:14:14#Weekly income
create-transaction#jaksem#-8.4#2023/02/15 15:18:15#SIM credit
create-transaction#jaksem#37.1#2023/02/15 15:15:15#Book refund
create-transaction#wirsab#-5.0#2023/02/16 10:15:41#Tax
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

```

### Task 2: Raise An Exception (40 pts)

Pada tugas ini anda diminta untuk mengembangkan sebuah **custom exception** yang mencerminkan situasi tak wajar terhadap transaksi yang menyebabkan *negative balance*. Sekalipun menggunakan *exception*, penanganan harus tetap dilakukan sehingga eksekusi program tidak terhenti.

Untuk evaluasi, pada presentasi, tunjukkan:
1. definisi *custom exception*;
2. penggunaan *exception*;
3. bagaimana pembangkitan *exception* (dan *exception escalation* -- optional);
4. bagaimana anda meng-*handle* *exception* tersebut untuk mengakomodir persoalan pada **Task 1**.

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

![Result](https://github.com/samuelsihotang1/Pemrograman-Berorientasi-Objek/assets/89495323/527a2707-be0b-460b-9580-211dc04f5ffb)
