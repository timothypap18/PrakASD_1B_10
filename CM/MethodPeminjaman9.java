package CM;
import java.util.Scanner;
public class MethodPeminjaman9 {
   public static void main(String[] args) {
    Mahasiswa9[] daftarmhs = {
        new Mahasiswa9("22001", "Andi", "Teknik Informatika"),
        new Mahasiswa9("22002", "Budi", "Teknik Informatika"),
        new Mahasiswa9("22003", "Citra", "Sistem Informasi Bisnis"),
    };
    Buku9[] daftarBuku = {
        new Buku9("B001", "Algoritma", 2020),
        new Buku9("B002", "Basis Data", 2019),
        new Buku9("B003", "Pemrograman", 2021),
        new Buku9("B004", "Fisika", 2022),
    };
    PemimjamanBuku9[] pinjam = {
        new PemimjamanBuku9(daftarmhs[0], daftarBuku[0],7),
        new PemimjamanBuku9(daftarmhs[1], daftarBuku[1], 3),
        new PemimjamanBuku9(daftarmhs[2], daftarBuku[2], 10),
        new PemimjamanBuku9(daftarmhs[2], daftarBuku[3], 6),
        new PemimjamanBuku9(daftarmhs[1], daftarBuku[1], 4),
    };
    Scanner sc = new Scanner (System.in);
    int menu;
    do {
        System.out.println("=== Sistem Peminjaman Ruang Baca JTI ===");
        System.out.println("1. Tampilkan Mahasiswa");
        System.out.println("2. Tampilkan Buku");
        System.out.println("3. Tampilkan Peminjaman");
        System.out.println("4. Urutkan Berdasarkan Denda");
        System.out.println("5. Cari Berdasarkan NIM");
        System.out.println("0. Keluar");
        System.out.println("Pilih Menu : ");
        menu = sc.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Daftar Mahasiswa :");
                for (Mahasiswa9 mhs : daftarmhs) {
                    mhs.tampilMahasiswa9();
                }
                break;
            case 2:
                System.out.println("Daftar Buku :");
                for (Buku9 buku : daftarBuku) {
                    buku.tampilBuku9();
                }
                break;
            case 3:
                System.out.println("Daftar Peminjaman :");
                for (PemimjamanBuku9 p : pinjam) {
                    p.hitungDenda();
                    p.tampilPeminjaman();
                }
                break;
            case 4:
                System.out.println("Setelah diurutkan ( denda terbesar ) :");
                for (int i = 1; i < pinjam.length; i++) {
                    PemimjamanBuku9 key = pinjam[i];
                    int j = i -1;
                    while (j >= 0 && pinjam[j].denda < key.denda) {
                        pinjam[j + 1] = pinjam[j];
                        j--;
                    }
                    pinjam[j + 1] = key;
                }
                for (PemimjamanBuku9 p : pinjam) {
                    p.tampilPeminjaman();
                }
                break;
            case 5:
                for (int i = 0; i < pinjam.length - 1; i++) {
                        for (int j = 0; j < pinjam.length - i - 1; j++) {
                            if (pinjam[j].mhs.nim.compareTo(pinjam[j+1].mhs.nim) > 0) {
                                PemimjamanBuku9 t = pinjam[j];
                                pinjam[j] = pinjam[j+1];
                                pinjam[j+1] = t;
                            }
                        }
                    }
                System.out.println("Cari berdasarkan NIM :");
                System.out.println("Masukkan NIM : ");
                String caruNIM = sc.next();
                int low = 0, high = pinjam.length - 1;
                    boolean found = false;
                    while (low <= high) {
                        int mid = (low + high) / 2;
                        if (pinjam[mid].mhs.nim.equals(caruNIM)) {
                            pinjam[mid].tampilPeminjaman();
                            found = true;
                            break; 
                        } else if (pinjam[mid].mhs.nim.compareTo(caruNIM) < 0) low = mid + 1;
                        else high = mid - 1;
                    }
                    if (!found) System.out.println("Data tidak ditemukan.");
                    break;
            }
        } while (menu != 0);
    }
}
