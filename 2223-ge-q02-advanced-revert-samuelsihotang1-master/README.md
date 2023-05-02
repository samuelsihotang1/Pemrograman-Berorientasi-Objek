[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/ClSJNOtk)
# Q02 Advanced Revert

Pada tugas kali ini anda akan mengembangkan sebuah fitur yang memperkaya aplikasi dompet digital. Fitur yang akan dikembangkan merupakan kelanjutan dari ```T05```.

**Note**: anda diizinkan untuk mendefinisikan kelas baru untuk merepresentasikan abstraksi yang dipandang perlu. Letakkan kelas baru anda pada *package* ```fintech.model```.

## Task 01: Protection Againts Negative Balance (50 pts, ```Driver1.java```)

Pada fitur ini, anda diminta untuk mengulas kembali fitur ```revert``` yang telah dihasilkan pada ```T05``` sedemikian rupa sehingga mampu memproteksi dari terjadinya **negative balance**. Dengan begitu, ```revert``` harus diabaikan bila dapat menyebabkan **negative balance**. Perhatikan contoh berikut.

```bash
create-account#Wiro Sableng#wirsab
create-account#Jaka Sembung#jaksem
create-transaction#jaksem#15.0#2023/02/14 14:14:14#Weekly income
create-transaction#jaksem#-8.4#2023/02/15 15:18:15#SIM credit
create-transaction#jaksem#37.1#2023/02/15 15:15:15#Book refund
create-transaction#wirsab#-5.0#2023/02/16 10:15:41#Tax
revert-transaction#jaksem#3#2023/02/15 15:15:16
revert-transaction#jaksem#1#2023/02/14 14:20:10
show-account#jaksem
show-account#wirsab
create-transaction#jaksem#wirsab#12.0#2023/02/21 13:11:11#Lunch
show-account#jaksem
show-account#wirsab
---

```

Berikut adalah contoh luaran dari kombinasi input di atas. Perhatikan *announcement* terhadap pembatalan transaksi dengan id ```1``` tidak dapat ditindaklanjuti karena akan menyebabkan **negative balance**.

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

### Task 2: Time Ticking (50 pts, ```Driver2.java```)

Kembangkan solusi anda dari **Task 1** dengan menerapkan batasan waktu pembatalan (revert) yang diizinkan 10 menit. Revertion diabaikan bila melebihi batas tersebut. Perhatikan contoh berikut.

```bash
create-account#Wiro Sableng#wirsab
create-account#Jaka Sembung#jaksem
create-transaction#jaksem#-8.4#2023/02/15 15:18:15#SIM credit
revert-transaction#jaksem#1#2023/02/15 15:20:25
create-transaction#jaksem#37.1#2023/02/15 15:15:15#Book refund
create-transaction#wirsab#-5.0#2023/02/16 10:15:41#Tax
create-account#Milkyman#milkyn
create-transaction#jaksem#wirsab#-12.0#2023/02/21 13:11:11#Lunch
create-transaction#jaksem#15.0#2023/02/14 14:14:14#Weekly income
create-transaction#milkyn#100.00#2023/03/11 08:00:40#Research grant (March)
create-transaction#milkyn#8.6#2023/03/11 08:00:20#Assistancy paycheck
revert-transaction#milkyn#4#2023/03/11 08:10:52
remove-account#jaksem
show-accounts
---

```

Pada contoh, revertion terhadap transaksi ```milky``` dengan id ```4``` tidak dapat dilakukan karena melebihi batas 10 menit. Berikut keluaran yang diberikan.

```bash
wirsab|Wiro Sableng|0.0
jaksem|Jaka Sembung|0.0
milkyn|Milkyman|0.0
milkyn|Milkyman|108.6
4|milkyn|8.6|2023/03/11 08:00:20|Assistancy paycheck
3|milkyn|100.0|2023/03/11 08:00:40|Research grant (March)
wirsab|Wiro Sableng|0.0

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
