package PengelolaSiswa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Kelas utama untuk mengelola data siswa, termasuk menambahkan, menampilkan,
 * dan menghapus data siswa. Data siswa disimpan dalam ArrayList.
 */
public class PengelolaanDataSiswa {

    private static final ArrayList<Siswa> daftarSiswa = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Metode utama untuk menjalankan program. Menyediakan menu untuk mengelola
     * data siswa.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        int pilihan;

        do {
            tampilkanMenu();
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tambahSiswa();
                    break;
                case 2:
                    tampilkanSemuaSiswa();
                    break;
                case 3:
                    hapusSiswa();
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);

        scanner.close();
    }

    /**
     * Menampilkan menu utama pada konsol untuk pengelolaan data siswa.
     */
    private static void tampilkanMenu() {
        System.out.println("\n=== Pengelolaan Data Siswa ===");
        System.out.println("1. Tambah Siswa");
        System.out.println("2. Tampilkan Semua Siswa");
        System.out.println("3. Hapus Siswa");
        System.out.println("4. Keluar");
        System.out.print("Pilihan: ");
    }

    /**
     * Menambahkan data siswa baru ke dalam daftar siswa dengan meminta
     * input NIS, nama, dan kelas dari pengguna.
     */
    private static void tambahSiswa() {
        System.out.print("NIS: ");
        String nis = scanner.nextLine();
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Kelas: ");
        String kelas = scanner.nextLine();

        Siswa siswa = new Siswa(nis, nama, kelas);
        daftarSiswa.add(siswa);

        System.out.println("Siswa berhasil ditambahkan.");
    }

    /**
     * Menampilkan semua data siswa yang ada dalam daftar. Jika daftar kosong,
     * memberikan informasi bahwa belum ada data siswa.
     */
    private static void tampilkanSemuaSiswa() {
        if (daftarSiswa.isEmpty()) {
            System.out.println("Belum ada data siswa.");
            return;
        }

        System.out.println("\nDaftar Siswa:");
        for (Siswa siswa : daftarSiswa) {
            System.out.println(siswa);
        }
    }

    /**
     * Menghapus data siswa berdasarkan NIS yang dimasukkan oleh pengguna. Jika
     * NIS ditemukan, siswa akan dihapus dari daftar. Jika tidak ditemukan, akan
     * menampilkan pesan bahwa siswa tidak ditemukan.
     */
    private static void hapusSiswa() {
        System.out.print("Masukkan NIS siswa yang akan dihapus: ");
        String nisHapus = scanner.nextLine();

        for (var iterator = daftarSiswa.iterator(); iterator.hasNext();) {
            Siswa siswa = iterator.next();
            if (siswa.getNis().equals(nisHapus)) {
                iterator.remove();
                System.out.println("Siswa dengan NIS " + nisHapus + " berhasil dihapus.");
                return;
            }
        }

        System.out.println("Siswa dengan NIS " + nisHapus + " tidak ditemukan.");
    }
}
