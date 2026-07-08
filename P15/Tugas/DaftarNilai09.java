package P15.Tugas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class DaftarNilai09 {
    private List<Mahasiswa09> daftarMahasiswa = new ArrayList<>();
    private List<MataKuliah09> daftarMataKuliah = new ArrayList<>();
    private List<Nilai09> daftarNilai = new ArrayList<>();
    private Queue<Mahasiswa09> antrianHapus = new LinkedList<>();
    
    // ========== CRUD Mahasiswa ==========
    public void tambahMahasiswa(Mahasiswa09... mahasiswa) {
        for (Mahasiswa09 m : mahasiswa) {
            daftarMahasiswa.add(m);
        }
    }
    
    public void tampilMahasiswa() {
        System.out.println("\n=== DAFTAR MAHASISWA ===");
        daftarMahasiswa.stream().forEach(m -> System.out.println(m.toString()));
    }
    
    public Mahasiswa09 cariMahasiswa(String nim) {
        for (Mahasiswa09 m : daftarMahasiswa) {
            if (m.getNim().equals(nim)) {
                return m;
            }
        }
        return null;
    }
    
    // ========== CRUD Mata Kuliah ==========
    public void tambahMataKuliah(MataKuliah09... mataKuliah) {
        for (MataKuliah09 mk : mataKuliah) {
            daftarMataKuliah.add(mk);
        }
    }
    
    public void tampilMataKuliah() {
        System.out.println("\n=== DAFTAR MATA KULIAH ===");
        daftarMataKuliah.stream().forEach(mk -> System.out.println(mk.toString()));
    }
    
    public MataKuliah09 cariMataKuliah(String kodeMK) {
        for (MataKuliah09 mk : daftarMataKuliah) {
            if (mk.getKodeMK().equals(kodeMK)) {
                return mk;
            }
        }
        return null;
    }
    
    // ========== CRUD Nilai ==========
    public void tambahNilai(String nim, String kodeMK, double nilai) {
        Mahasiswa09 mhs = cariMahasiswa(nim);
        MataKuliah09 mk = cariMataKuliah(kodeMK);
        
        if (mhs != null && mk != null) {
            daftarNilai.add(new Nilai09(mhs, mk, nilai));
            System.out.println("Nilai berhasil ditambahkan!");
        } else {
            System.out.println("Mahasiswa atau Mata Kuliah tidak ditemukan!");
        }
    }
    
    public void tampilNilai() {
        System.out.println("\n=== DAFTAR NILAI MAHASISWA ===");
        if (daftarNilai.isEmpty()) {
            System.out.println("Belum ada data nilai.");
            return;
        }
        daftarNilai.stream().forEach(n -> System.out.println(n.toString()));
    }
    
    public void tampilNilaiMahasiswa(String nim) {
        System.out.println("\n=== NILAI MAHASISWA ===");
        boolean found = false;
        for (Nilai09 n : daftarNilai) {
            if (n.getMahasiswa().getNim().equals(nim)) {
                System.out.println(n.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Mahasiswa dengan NIM " + nim + " belum memiliki nilai.");
        }
    }
    
    public void tampilNilaiMataKuliah(String kodeMK) {
        System.out.println("\n=== NILAI MATA KULIAH ===");
        boolean found = false;
        for (Nilai09 n : daftarNilai) {
            if (n.getMataKuliah().getKodeMK().equals(kodeMK)) {
                System.out.println(n.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Mata Kuliah dengan kode " + kodeMK + " belum memiliki nilai.");
        }
    }
    
    // ========== Sorting ==========
    public void sortNilaiAscending() {
        Collections.sort(daftarNilai, Comparator.comparing(Nilai09::getNilai));
        System.out.println("Data nilai diurutkan ascending (terkecil ke terbesar).");
    }
    
    public void sortNilaiDescending() {
        Collections.sort(daftarNilai, Comparator.comparing(Nilai09::getNilai).reversed());
        System.out.println("Data nilai diurutkan descending (terbesar ke terkecil).");
    }
    
    // ========== Tugas 2: Queue untuk Hapus Mahasiswa ==========
    public void tambahAntrianHapus(String nim) {
        Mahasiswa09 mhs = cariMahasiswa(nim);
        if (mhs != null) {
            antrianHapus.add(mhs);
            System.out.println("Mahasiswa " + mhs.getNama() + " ditambahkan ke antrian hapus.");
        } else {
            System.out.println("Mahasiswa tidak ditemukan!");
        }
    }
    
    public void prosesHapusAntrian() {
        if (antrianHapus.isEmpty()) {
            System.out.println("Antrian hapus kosong.");
            return;
        }
        
        Mahasiswa09 mhs = antrianHapus.poll();
        
        // Hapus nilai mahasiswa
        daftarNilai.removeIf(n -> n.getMahasiswa().getNim().equals(mhs.getNim()));
        
        // Hapus mahasiswa
        daftarMahasiswa.removeIf(m -> m.getNim().equals(mhs.getNim()));
        
        System.out.println("Mahasiswa " + mhs.getNama() + " berhasil dihapus beserta nilainya.");
    }
    
    public void tampilAntrianHapus() {
        System.out.println("\n=== ANTRIAN HAPUS MAHASISWA ===");
        if (antrianHapus.isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        antrianHapus.forEach(m -> System.out.println(m.toString()));
    }
    
    // ========== Menu Utama ==========
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DaftarNilai09 dn = new DaftarNilai09();
        int pilihan;
        
        // Data awal
        dn.tambahMahasiswa(
            new Mahasiswa09("201234", "Noureen", "TI-1A"),
            new Mahasiswa09("201235", "Akhleema", "TI-1A"),
            new Mahasiswa09("201236", "Shannum", "TI-1B")
        );
        
        dn.tambahMataKuliah(
            new MataKuliah09("MK01", "Algoritma", 3),
            new MataKuliah09("MK02", "Basis Data", 3),
            new MataKuliah09("MK03", "Pemrograman Web", 2)
        );
        
        do {
            System.out.println("\n==================================");
            System.out.println("   PROGRAM DAFTAR NILAI MAHASISWA");
            System.out.println("==================================");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tambah Mata Kuliah");
            System.out.println("3. Tambah Nilai");
            System.out.println("4. Tampil Semua Nilai");
            System.out.println("5. Tampil Nilai Mahasiswa");
            System.out.println("6. Tampil Nilai Mata Kuliah");
            System.out.println("7. Urutkan Nilai (Ascending)");
            System.out.println("8. Urutkan Nilai (Descending)");
            System.out.println("9. Tambah Antrian Hapus Mahasiswa");
            System.out.println("10. Proses Hapus Antrian");
            System.out.println("11. Tampil Antrian Hapus");
            System.out.println("12. Tampil Semua Mahasiswa");
            System.out.println("13. Tampil Semua Mata Kuliah");
            System.out.println("0. Keluar");
            System.out.println("==================================");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            
            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    dn.tambahMahasiswa(new Mahasiswa09(nim, nama, kelas));
                    System.out.println("Mahasiswa berhasil ditambahkan!");
                    break;
                    
                case 2:
                    System.out.print("Kode MK: ");
                    String kode = sc.nextLine();
                    System.out.print("Nama MK: ");
                    String namaMK = sc.nextLine();
                    System.out.print("SKS: ");
                    int sks = sc.nextInt();
                    sc.nextLine();
                    dn.tambahMataKuliah(new MataKuliah09(kode, namaMK, sks));
                    System.out.println("Mata Kuliah berhasil ditambahkan!");
                    break;
                    
                case 3:
                    System.out.print("NIM Mahasiswa: ");
                    String nimNilai = sc.nextLine();
                    System.out.print("Kode MK: ");
                    String kodeNilai = sc.nextLine();
                    System.out.print("Nilai: ");
                    double nilai = sc.nextDouble();
                    sc.nextLine();
                    dn.tambahNilai(nimNilai, kodeNilai, nilai);
                    break;
                    
                case 4:
                    dn.tampilNilai();
                    break;
                    
                case 5:
                    System.out.print("NIM Mahasiswa: ");
                    String nimCari = sc.nextLine();
                    dn.tampilNilaiMahasiswa(nimCari);
                    break;
                    
                case 6:
                    System.out.print("Kode MK: ");
                    String kodeCari = sc.nextLine();
                    dn.tampilNilaiMataKuliah(kodeCari);
                    break;
                    
                case 7:
                    dn.sortNilaiAscending();
                    dn.tampilNilai();
                    break;
                    
                case 8:
                    dn.sortNilaiDescending();
                    dn.tampilNilai();
                    break;
                    
                case 9:
                    System.out.print("NIM Mahasiswa yang akan dihapus: ");
                    String nimHapus = sc.nextLine();
                    dn.tambahAntrianHapus(nimHapus);
                    break;
                    
                case 10:
                    dn.prosesHapusAntrian();
                    break;
                    
                case 11:
                    dn.tampilAntrianHapus();
                    break;
                    
                case 12:
                    dn.tampilMahasiswa();
                    break;
                    
                case 13:
                    dn.tampilMataKuliah();
                    break;
                    
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        
        sc.close();
    }
}
