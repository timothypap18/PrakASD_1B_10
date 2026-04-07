package P6.Praktikum2;

import java.util.Scanner;

public class MahasiswaDemo10 {
    public static void main(String[] args) { 
        MahasiswaBerprestasi10 list = new MahasiswaBerprestasi10();
        Scanner sc = new Scanner(System.in);
        int jmlMhs = 5; 

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("--- Masukkan Data Mahasiswa ke-" + (i + 1) + " ---");
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc   .nextLine();
            System.out.print("IPK : ");
            double ipk = Double.parseDouble(sc.nextLine());
            System.out.println("-----------------------------");
            list.tambah (new Mahasiswa10(nim, nama, kelas, ipk)); 
        }
            list.tampil();
            System.out.println("---------------------------------");
            System.out.println("Pencarian Data");
            System.out.println("---------------------------------");
            System.out.println("Masukkan IPK Mahasiswa yang dicari: ");
            System.out.print("IPK: ");
            double cari = sc.nextDouble();

            System.out.println("Menggunakan Sequental Searching");
            double posisi = list.sequentialSearching(cari);
            int pss = (int) posisi;
            list.tampilPosisi(cari, pss);
            list.tampilDataSearch(cari, pss);}
}