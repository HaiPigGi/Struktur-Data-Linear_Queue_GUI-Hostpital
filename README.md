# Struktur-Data-Linear_Queue_GUI-Hostpital
![image](https://github.com/HaiPigGi/Struktur-Data-Linear_Queue_GUI-Hostpital/assets/119752348/a9272653-12e2-4bc6-9a5e-b4a20adb78be)

-
-
-
-
-
-
-
```java
Struktur-Data-Linear_Queue_GUI-Hostpital adalah proyek Java yang mengimplementasikan struktur data Queue untuk simulasi antrian di rumah sakit. Proyek ini juga memiliki antarmuka pengguna grafis (GUI) untuk memudahkan interaksi. Fitur-fitur utama proyek ini meliputi suara, melihat jadwal dokter, memilih jadwal, serta login dan register pengguna. Proyek ini menggunakan database Oracle untuk menyimpan data.

## Fitur

- **Suara**: Proyek ini mendukung fitur suara untuk memberikan pengumuman atau notifikasi kepada pengguna.
- **Lihat Jadwal Dokter**: Pengguna dapat melihat jadwal dokter yang tersedia di rumah sakit.
- **Memilih Jadwal**: Pengguna dapat memilih jadwal kunjungan dokter yang diinginkan.
- **Login dan Register**: Terdapat fitur login dan register untuk pengguna. Ini memungkinkan pengguna untuk mengakses fitur-fitur yang terkait dengan jadwal dokter.
- **Database Oracle**: Proyek ini menggunakan database Oracle untuk menyimpan data jadwal dokter dan informasi pengguna.

## Cara Menjalankan

Berikut adalah langkah-langkah untuk menjalankan proyek Struktur-Data-Linear_Queue_GUI-Hostpital:

1. Pastikan Anda telah menginstal JDK (Java Development Kit) dan Oracle Database pada sistem Anda.
2. Clone repositori proyek ini ke direktori lokal Anda dengan perintah berikut:
git clone link_repositori


3. Masuk ke direktori proyek dengan perintah berikut:
cd Struktur-Data-Linear_Queue_GUI-Hostpital


4. Ubah konfigurasi database Oracle di file `config.properties` sesuai dengan pengaturan database Anda:
db.url=jdbc:oracle:thin:@localhost:1521:XE
db.username=nama_pengguna
db.password=kata_sandi


5. Kompilasi file Java dalam proyek ini dengan perintah berikut:
javac -d bin src/*.java


6. Jalankan aplikasi menggunakan Java dengan perintah berikut:
java -cp bin:ojdbc6.jar MainApp


Copy code
7. Aplikasi akan dijalankan dan antarmuka pengguna grafis (GUI) akan ditampilkan. Anda dapat menggunakan fitur-fitur yang tersedia di aplikasi ini.

Pastikan Anda telah mengikuti semua langkah dengan benar untuk memastikan proyek dapat berjalan dengan lancar di sistem lokal Anda.

## Kontribusi

Jika Anda ingin berkontribusi pada proyek ini, silakan ikuti langkah-langkah berikut:

1. Fork repositori ini.
2. Buatlah branch fitur baru.
3. Lakukan perubahan pada branch fitur.
4. Commit perubahan Anda.
5. Push branch ke repositori Anda.
6. Ajukan pull request ke repositori utama.

Kami sangat menghargai kontribusi Anda!

## Kontak

Jika Anda memiliki pertanyaan atau ingin berdiskusi lebih lanjut tentang proyek ini, silakan hubungi kami melalui email: [email protected]

Terima kasih telah menggunakan Struktur-Data-Linear_Queue_GUI-Hostpital!
