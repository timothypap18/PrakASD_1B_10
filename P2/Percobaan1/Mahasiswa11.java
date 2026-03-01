package P2.Percobaan1;

public class Mahasiswa11 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkaninfo() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Kelas :" + kelas);
        System.out.println("IPK : " + ipk);
    }

    void ubahkelas(String kelasbaru) {
        kelas = kelasbaru;
    }
    void ubahipk(double ipkbaru) {
        if (ipkbaru >= 0.0 && ipkbaru <= 4.0) {
            ipk = ipkbaru;
        } else {
            System.out.println("Nilai IPK tidak valid! Harus diantara 0.0 dan 4.0!");
        }
    }
    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
    public Mahasiswa11() {
    
    }
    public Mahasiswa11(String nm, String nim, String kls, double ipk) {
        nama = nm;
        this.nim = nim;
        kelas = kls;
        this.ipk = ipk;
    }
}
