package P1;

import java.util.Scanner;

public class Tugas1_10 {
    public static void main(String[] args) {
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[] KOTA = {"BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR", "PEKALONGAN", "SEMARANG", "SURABAYA", "MALANG", "TEGAL"};

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Kode Plat: ");
        char cari = input.next().toUpperCase().charAt(0);
        String hasil = cariKota(KODE, KOTA, cari);
        System.out.println("Hasil: " + hasil);
    }

    public static String cariKota(char[] kode, String[] kota, char target) {
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == target) {
                return kota[i]; 
            }
        }
        return "Kode plat tidak ditemukan";
    }
}
