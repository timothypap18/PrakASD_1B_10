package CM;

public class Mahasiswa9 {
    String nim, nama, prodi;

    Mahasiswa9(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilMahasiswa9() {
        System.out.println("NIM : " + nim + " | " + "NAMA : " + nama + " | " + "PRODI : " + prodi);
    }
}
