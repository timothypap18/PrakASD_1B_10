package P9.Tugas;
import java.util.Scanner;

public class SuratDemo09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat09 tumpukan = new StackSurat09(10); // Kapasitas 10 surat
        int menu;

        do {
            System.out.println("\n=== MENU PRODI ADMINISTRASI SURAT IZIN ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            menu = scan.nextInt();
            scan.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S = Sakit / I = Izin): ");
                    char jenis = scan.next().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = scan.nextInt();
                    
                    Surat09 s = new Surat09(id, nama, kelas, jenis, durasi);
                    tumpukan.push(s);
                    break;
                case 2:
                    Surat09 diproses = tumpukan.pop();
                    if (diproses != null) {
                        System.out.println("Memproses & memvalidasi surat dari: " + diproses.namaMahasiswa + " (" + diproses.idSurat + ")");
                        System.out.println("Status: VALIDASI BERHASIL.");
                    }
                    break;
                case 3:
                    Surat09 teratas = tumpukan.peek();
                    if (teratas != null) {
                        System.out.println("Surat teratas saat ini milik: " + teratas.namaMahasiswa);
                        System.out.println("Keterangan: " + (teratas.jenisIzin == 'S' ? "Sakit" : "Izin") + " selama " + teratas.durasi + " hari.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang ingin dicari: ");
                    String cariNama = scan.nextLine();
                    tumpukan.cariSurat(cariNama);
                    break;
                case 5:
                    System.out.println("Selesai. Keluar dari sistem.");
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid!");
            }
        } while (menu != 5);
    }
}