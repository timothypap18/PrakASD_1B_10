package CM;

public class PemimjamanBuku9 {
    Mahasiswa9 mhs;
    Buku9 buku;
    int lamaPinjam, batasPinjam = 5, terlambat, denda;

    public PemimjamanBuku9(Mahasiswa9 mhs, Buku9 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
    }

    void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    void tampilPeminjaman() {
        System.out.println("Nama : " + mhs.nama + " | " + "Buku : " + buku.judul + " | " + "Lama : " + lamaPinjam + " | " + "Terlambat : " + terlambat + " | " + "Denda : Rp." + denda);
    }
}
