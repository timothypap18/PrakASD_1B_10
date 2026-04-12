package CM;

public class Buku9 {
    String kodeBuku, judul;
    int tahunTerbit;

    Buku9(String kode, String judul, int tahun) {
        this.kodeBuku = kode;
        this.judul = judul;
        this.tahunTerbit = tahun;
    }

    void tampilBuku9() {
        System.out.println("Kode Buku : " + kodeBuku +" | " + "Judul : " + judul + " | " + "Tahun Terbit : " + tahunTerbit);
    }
}
