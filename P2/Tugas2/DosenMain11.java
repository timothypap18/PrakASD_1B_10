package P2.Tugas2;

public class DosenMain11 {
    public static void main(String[] args) {
   
        Dosen11 dosen1 = new Dosen11();
        dosen1.idDosen = "D01";
        dosen1.nama = "Dr. Aris";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2015;
        dosen1.bidangKeahlian = "Algoritma dan Struktur Data";

    
        Dosen11 dosen2 = new Dosen11("D02", "Dra. Siti", false, 2010, "Sistem Operasi");

        System.out.println("=== Informasi Dosen 1 ===");
        dosen1.tampilInformasi();
        System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2026) + " tahun");
        
        System.out.println("\n--- Update Dosen 1 ---");
        dosen1.ubahKeahlian("Kecerdasan Buatan");
        dosen1.setStatusAktif(false);
        dosen1.tampilInformasi();

        System.out.println("\n=========================\n");

   
        System.out.println("=== Informasi Dosen 2 ===");
        dosen2.tampilInformasi();
        System.out.println("Masa Kerja: " + dosen2.hitungMasaKerja(2026) + " tahun");
    }
}
