package P9.Tugas;

public class Surat09 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin; // S: Sakit, I: Izin
    int durasi;

    public Surat09(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }
}