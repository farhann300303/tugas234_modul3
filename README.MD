# Pengelolaan Data Siswa

Program ini adalah aplikasi konsol sederhana yang digunakan untuk mengelola data siswa. Program dapat menambahkan, menampilkan, dan menghapus data siswa yang disimpan dalam daftar.

## Fitur

- **Tambah Siswa**: Menambahkan data siswa baru (NIS, Nama, dan Kelas).
- **Tampilkan Semua Siswa**: Menampilkan semua data siswa yang ada di daftar.
- **Hapus Siswa**: Menghapus data siswa berdasarkan NIS.
- **Keluar**: Mengakhiri program.

## Struktur Kode

- **PengelolaanDataSiswa.java**: Kelas utama yang berisi metode `main` dan metode lain untuk mengelola data siswa.
- **Siswa.java**: Kelas yang merepresentasikan data siswa, termasuk atribut `NIS`, `Nama`, dan `Kelas`.

## Cara Menjalankan Program

1. Pastikan Anda memiliki **Java** yang terinstal di sistem Anda.
2. Unduh atau salin kedua file **PengelolaanDataSiswa.java** dan **Siswa.java** ke dalam direktori yang sama.
3. Buka terminal atau command prompt, navigasikan ke direktori tempat file berada, lalu kompilasi program dengan perintah:
   ```bash
   javac PengelolaanDataSiswa.java
   ```
4. Jalankan program dengan perintah:
   ```bash
   java PengelolaanDataSiswa
   ```

## Panduan Penggunaan

1. Setelah program dijalankan, Anda akan melihat menu dengan beberapa opsi.
2. Ketik angka sesuai dengan pilihan Anda, lalu tekan **Enter**:
    - **1** untuk menambahkan siswa baru.
    - **2** untuk menampilkan semua siswa yang ada.
    - **3** untuk menghapus siswa berdasarkan NIS.
    - **4** untuk keluar dari program.
3. Program akan meminta input sesuai dengan pilihan Anda.

## Contoh

```
=== Pengelolaan Data Siswa ===
1. Tambah Siswa
2. Tampilkan Semua Siswa
3. Hapus Siswa
4. Keluar
Pilihan: 1
NIS: 12345
Nama: Budi
Kelas: 10A
Siswa berhasil ditambahkan.

=== Pengelolaan Data Siswa ===
1. Tambah Siswa
2. Tampilkan Semua Siswa
3. Hapus Siswa
4. Keluar
Pilihan: 2

Daftar Siswa:
NIS: 12345, Nama: Budi, Kelas: 10A
```

## Informasi Tambahan

Program ini memanfaatkan struktur data `ArrayList` untuk menyimpan data siswa dan menyediakan fungsionalitas dasar yang dapat dikembangkan lebih lanjut, misalnya dengan menambahkan penyimpanan ke dalam file atau basis data.

