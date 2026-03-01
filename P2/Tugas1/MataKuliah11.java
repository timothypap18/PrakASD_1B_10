package P2.Tugas1;

public class MataKuliah11 {
    String kodeMK;
    String namaMK;
    int sks;
    int jumlahjam;

    void tampilkaninfo() {
        System.out.println("Kode Mata Kuliah : " + kodeMK);
        System.out.println("Nama Mata Kuliah : " + namaMK);
        System.out.println("SKS : " + sks);
        System.out.println("Jumlah jam : " + jumlahjam);
    }

    void ubahSKS(int sksbaru) {
        if (sksbaru > 0) {
            sks = sksbaru;
        } else {
            System.out.println("Nilai SKS tidak valid! Harus lebih dari 0!");
        }
    }

    void tambahjam(int jambaru) {
        if (jambaru > 0) {
            jumlahjam += jambaru;
        } else {
            System.out.println("Nilai jam tidak valid! Harus lebih dari 0!");
        }
    }

    void kurangijam(int jamkurang) {
        if (jamkurang > 0 && jamkurang < jumlahjam) {
            jumlahjam -= jamkurang;
        } else {
            System.out.println("Nilai jam tidak valid! Harus lebih dari 0 dan kurang dari jumlah jam saat ini!");
        }
    }

    public MataKuliah11() {}
    public MataKuliah11(String kode, String nama, int sks, int jmljam) {
        kodeMK = kode;
        namaMK = nama;
        this.sks = sks;
        jumlahjam = jmljam;
    }
}
