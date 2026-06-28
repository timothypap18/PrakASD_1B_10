package P11;

import java.util.Scanner;

public class SLLMain09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList09 singLL = new SingleLinkedList09();
        int pilihan;

        do {
            System.out.println("\n=== MENU LINKED LIST ===");
            System.out.println("1. Tambah Data di Awal (addFirst)");
            System.out.println("2. Tambah Data di Akhir (addLast)");
            System.out.println("3. Tambah Data Setelah NIM Tertentu (insertAfter)");
            System.out.println("4. Tambah Data pada Indeks Tertentu (insertAt)");
            System.out.println("5. Tampilkan Semua Data");
            System.out.println("6. Tampilkan Detail Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Tambah Data di Awal ---");
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("IPK: ");
                    double ipk = sc.nextDouble();
                    sc.nextLine();
                    Mahasiswa09 mhs = new Mahasiswa09(nim, nama, kelas, ipk);
                    singLL.addFirst(mhs);
                    System.out.println("Data berhasil ditambahkan!");
                    singLL.print();
                    break;

                case 2:
                    System.out.println("\n--- Tambah Data di Akhir ---");
                    System.out.print("NIM: ");
                    nim = sc.nextLine();
                    System.out.print("Nama: ");
                    nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    kelas = sc.nextLine();
                    System.out.print("IPK: ");
                    ipk = sc.nextDouble();
                    sc.nextLine();
                    mhs = new Mahasiswa09(nim, nama, kelas, ipk);
                    singLL.addLast(mhs);
                    System.out.println("Data berhasil ditambahkan!");
                    singLL.print();
                    break;

                case 3:
                    System.out.println("\n--- Tambah Data Setelah NIM Tertentu ---");
                    System.out.print("Masukkan NIM setelah data akan ditambahkan: ");
                    String key = sc.nextLine();
                    System.out.print("NIM: ");
                    nim = sc.nextLine();
                    System.out.print("Nama: ");
                    nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    kelas = sc.nextLine();
                    System.out.print("IPK: ");
                    ipk = sc.nextDouble();
                    sc.nextLine();
                    mhs = new Mahasiswa09(nim, nama, kelas, ipk);
                    singLL.insertAfter(key, mhs);
                    System.out.println("Data berhasil ditambahkan!");
                    singLL.print();
                    break;

                case 4:
                    System.out.println("\n--- Tambah Data pada Indeks Tertentu ---");
                    System.out.print("Masukkan indeks: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    System.out.print("NIM: ");
                    nim = sc.nextLine();
                    System.out.print("Nama: ");
                    nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    kelas = sc.nextLine();
                    System.out.print("IPK: ");
                    ipk = sc.nextDouble();
                    sc.nextLine();
                    mhs = new Mahasiswa09(nim, nama, kelas, ipk);
                    singLL.insertAt(index, mhs);
                    System.out.println("Data berhasil ditambahkan!");
                    singLL.print();
                    break;

                case 5:
                    System.out.println();
                    singLL.print();
                    break;

                case 6:
                    System.out.println();
                    singLL.printDetail();
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