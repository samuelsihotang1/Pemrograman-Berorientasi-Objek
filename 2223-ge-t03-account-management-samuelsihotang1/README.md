T03 Account Management

Pada tugas kali ini anda akan kembali mengembangkan fitur-fitur yang memperkaya aplikasi dompet digital. Fitur yang akan dikembangkan merupakan kelanjutan dari ```Q01```.

**Note**: anda diizinkan untuk mendefinisikan kelas baru untuk merepresentasikan abstraksi yang dipandang perlu. Letakkan kelas baru anda pada package ```fintech.model```.

## Task 01: Unique Account (50 pts, ```Driver1.java```)

Pada tugas ini anda perlu memperbaiki perilaku dari fitur ```create-account``` yang telah anda kembangkan sebelumnya. Fitur ```create-account``` harus mampu memproteksi duplikasi data akun sedemikian rupa sehingga upaya untuk membuat akun baru dengan ```account-name``` yang sama harus diabaikan.

Perhatikan contoh berikut. Harap diperhatikan bahwa ```account-name``` bersifat case insensitive.

```bash
create-account#Wiro Sableng#wirsab
create-account#Jaka Sembung#jaksem
show-accounts
create-account#Jaka Sembung#jaksem
show-accounts
create-account#Jaka Sembung#jasemb
show-accounts
---

```

Berikut adalah contoh luaran dari kombinasi input di atas.

```bash
wirsab|Wiro Sableng|0.0
jaksem|Jaka Sembung|0.0
jaksem|Jaka Sembung|0.0
wirsab|Wiro Sableng|0.0
jaksem|Jaka Sembung|0.0
wirsab|Wiro Sableng|0.0
jasemb|Jaka Sembung|0.0
jaksem|Jaka Sembung|0.0
jasemb|Jaka Sembung|0.0
wirsab|Wiro Sableng|0.0

```

### Remove Account (50 pts, ```Driver2.java```)

Pada tugas ini, anda diminta untuk mengembangkan sebuah fitur yang akan menghapus sebuah akun dengan ```account-name``` tertentu. Perintah untuk melakukan penghapusan terdiri atas dua segmen, segmen pertama berisi perintah penghapusan ```remove-account``` yang diikuti dengan ```account-name``` dari account yang akan dihapus. Aplikasi tidak memberikan luaran apapun ke layar pasca eksekusi perintah ini.

```bash
create-account#Wiro Sableng#wirsab
create-account#Jaka Sembung#jasemb
create-account#Jaka Sembung#jaksem
show-accounts
remove-account#jasemb
show-accounts
---

```

Berikut adalah contoh keluaran yang dihasilkan.

```bash
wirsab|Wiro Sableng|0.0
jasemb|Jaka Sembung|0.0
jaksem|Jaka Sembung|0.0
jaksem|Jaka Sembung|0.0
jasemb|Jaka Sembung|0.0
wirsab|Wiro Sableng|0.0
jaksem|Jaka Sembung|0.0
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
