package CM;

public class PemimjamanBuku9 {
    Mahasiswa9 mhs;
    Buku9 buku;
    int lamaPinjam, lamapinjamBaru, batasPinjam = 5, terlambat, denda;
    int batasPinjam1 = 5, terlambat1, denda1;

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

    void hitungDenda1() {
        if (lamapinjamBaru > batasPinjam1){
            terlambat1 = lamapinjamBaru - batasPinjam1;
            denda1 = terlambat1 * 2000;
            } else {
            terlambat1 = 0;
            denda1 = 0;
         }
    }

    void tampilPeminjaman() {
        System.out.println("Nama : " + mhs.nama + " | " + "Buku : " + buku.judul + " | " + "Lama : " + lamaPinjam + " | " + "Terlambat : " + terlambat + " | " + "Denda : Rp." + denda);
    }
}
