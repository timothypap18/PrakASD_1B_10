package P12;

import java.util.Scanner;

public class DoubleLinkedListMain09 {
    static Scanner sc = new Scanner(System.in);

    public static Mahasiswa09 inputMahasiswa() {
        System.out.print("Masukkan NIM : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK : ");
        double ipk = sc.nextDouble();
        sc.nextLine();
        return new Mahasiswa09(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        DoubleLinkedList09 list = new DoubleLinkedList09();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("7. Tampilkan data terbalik (Reverse)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Tambah Data di Awal ---");
                    Mahasiswa09 mhsAwal = inputMahasiswa();
                    list.addFirst(mhsAwal);
                    break;

                case 2:
                    System.out.println("\n--- Tambah Data di Akhir ---");
                    Mahasiswa09 mhsAkhir = inputMahasiswa();
                    list.addLast(mhsAkhir);
                    break;

                case 3:
                    System.out.println("\n--- Sisipkan Data di Tengah ---");
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = sc.nextLine();
                    System.out.println("Masukkan data baru: ");
                    Mahasiswa09 dataBaru = inputMahasiswa();
                    list.insertAfter(keyNim, dataBaru);
                    break;

                case 4:
                    System.out.println("\n--- Hapus Data di Awal ---");
                    list.removeFirst();
                    break;

                case 5:
                    System.out.println("\n--- Hapus Data di Akhir ---");
                    list.removeLast();
                    break;

                case 6:
                    list.print();
                    break;

                case 7:
                    list.printReverse();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
