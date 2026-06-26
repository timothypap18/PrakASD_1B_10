package CM;

import java.util.Scanner;

public class KeretaApi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi Variabel
        int jml_dewasa, jml_bayi;
        long harga_dewasa = 100000;
        long total_awal, total_bayar;
        long voucher = 0;

        System.out.println("=========================================");
        System.out.println("=== SISTEM PEMESANAN TIKET KERETA API ===");
        System.out.println("=========================================");
        System.out.println("Ketentuan:");
        System.out.println("- Harga Dewasa/Anak (>1th): Rp 100.000");
        System.out.println("- Bayi (<1th): GRATIS");
        System.out.println("- Total > Rp 500.000 dapat voucher Rp 50.000");
        System.out.println("-----------------------------------------");

        // 1. INPUT
        System.out.print("Masukkan Jumlah Tiket Dewasa/Anak: ");
        jml_dewasa = input.nextInt();

        System.out.print("Masukkan Jumlah Bayi (<1th)      : ");
        jml_bayi = input.nextInt();

        // 2. PROSES PERHITUNGAN
        total_awal = jml_dewasa * harga_dewasa;

        // Cek Kondisi Voucher
        if (total_awal > 500000) {
            voucher = 50000;
        } else {
            voucher = 0;
        }

        total_bayar = total_awal - voucher;

        // 3. OUTPUT
        System.out.println("\n-----------------------------------------");
        System.out.println("========== RINCIAN PEMESANAN ==========");
        System.out.println("-----------------------------------------");
        System.out.println("Jumlah Tiket Berbayar : " + jml_dewasa + " tiket");
        System.out.println("Jumlah Bayi (Gratis)  : " + jml_bayi + " tiket");
        System.out.println("Total Biaya Awal      : Rp " + total_awal);

        if (voucher > 0) {
            System.out.println("Potongan Voucher      : Rp " + voucher + " (DAPAT!)");
        } else {
            System.out.println("Potongan Voucher      : Rp 0 (Tidak dapat)");
        }

        System.out.println("-----------------------------------------");
        System.out.println("TOTAL AKHIR PEMBAYARAN: Rp " + total_bayar);
        System.out.println("=========================================");

        input.close();
    }
}
