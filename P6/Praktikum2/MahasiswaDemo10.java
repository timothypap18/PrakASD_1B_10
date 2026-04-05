package P6.Praktikum2;

import java.util.Scanner;

public class MahasiswaDemo10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in); // Scanner tambahan untuk String agar tidak skip
        
        MahasiswaBerprestasi10 list = new MahasiswaBerprestasi10();
        int jmlMhs = 5; // Misalkan kita ingin menginput 5 mahasiswa

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("--- Masukkan Data Mahasiswa ke-" + (i + 1) + " ---");
            System.out.print("NIM   : ");
            String nim = s1.nextLine();
            System.out.print("Nama  : ");
            String nama = s1.nextLine();
            System.out.print("Kelas : ");
            String kelas = s1.nextLine();
            System.out.print("IPK   : ");
            double ipk = s.nextDouble();
            
            Mahasiswa10 m = new Mahasiswa10(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("\nData mahasiswa sebelum sorting:");
        list.tampil();

        System.out.println("\nData Mahasiswa setelah sorting berdasarkan IPK (DESC):");
        list.bubbleSort();
        list.tampil();
        
        s.close();
        s1.close();
    }
}