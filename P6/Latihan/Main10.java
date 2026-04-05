package P6.Latihan;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen10 daftar = new DataDosen10();
        int pilih;

        do {
            System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Bubble Sort)");
            System.out.println("4. Sorting DSC (Selection Sort)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (pilih) {
                case 1:
                    System.out.print("Kode: "); String kd = sc.nextLine();
                    System.out.print("Nama: "); String nm = sc.nextLine();
                    System.out.print("Pria? (true/false): "); boolean jk = sc.nextBoolean();
                    System.out.print("Usia: "); int us = sc.nextInt();
                    daftar.tambah(new Dosen10(kd, nm, jk, us));
                    break;
                case 2:
                    System.out.println("\n--- Daftar Dosen ---");
                    daftar.tampil();
                    break;
                case 3:
                    daftar.SortingASC();
                    System.out.println("Data berhasil diurutkan (ASC)!");
                    break;
                case 4:
                    daftar.sortingDSC();
                    System.out.println("Data berhasil diurutkan (DSC)!");
                    break;
            }
        } while (pilih != 5);
        sc.close();
    }
}
