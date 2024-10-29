package PengelolaSiswa;

/**
 * Kelas yang merepresentasikan data seorang siswa, termasuk NIS, nama, dan kelas.
 */
class Siswa {
    private final String nis;
    private final String nama;
    private final String kelas;

    /**
     * Konstruktor untuk membuat objek Siswa baru.
     *
     * @param nis   Nomor Induk Siswa yang unik untuk setiap siswa.
     * @param nama  Nama lengkap siswa.
     * @param kelas Kelas tempat siswa berada.
     */
    public Siswa(String nis, String nama, String kelas) {
        this.nis = nis;
        this.nama = nama;
        this.kelas = kelas;
    }

    /**
     * Mengembalikan NIS (Nomor Induk Siswa) dari siswa.
     *
     * @return String NIS siswa.
     */
    public String getNis() {
        return nis;
    }

    /**
     * Mengembalikan representasi string dari objek Siswa, termasuk NIS, nama, dan kelas.
     *
     * @return String yang berisi informasi NIS, nama, dan kelas siswa.
     */
    @Override
    public String toString() {
        return "NIS: " + nis + ", Nama: " + nama + ", Kelas: " + kelas;
    }
}
