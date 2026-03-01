package P2.Tugas1;

public class MataKuliahmain11 {
    public static void main(String[] args) {
        MataKuliah11 mk1 = new MataKuliah11();
        mk1.kodeMK = "ASD.S-2";
        mk1.namaMK = "Algoritma dan Struktur Data";
        mk1.sks = 5;
        mk1.jumlahjam = 300;
        mk1.tampilkaninfo();
        mk1.ubahSKS(4);
        mk1.tambahjam(2);
        mk1.kurangijam(2);
        mk1.tampilkaninfo();
        MataKuliah11 mk2 = new MataKuliah11("DB.S-2", "Basis Data", 3, 150);
        mk2.ubahSKS(2);
        mk2.tampilkaninfo();
    }
}
