package CM2;

import java.util.Scanner;

public class SistemRoyalDelish {
    // Head dan Tail untuk Double Linked List Antrean
    private NodeAntrian09 headAntrian = null;
    private NodeAntrian09 tailAntrian = null;
    private int counterAntrian = 0;

    // Head dan Tail untuk Double Linked List Pesanan
    private NodePesanan09 headPesanan = null;
    private NodePesanan09 tailPesanan = null;

    // Menu 1: Tambah Antrian
    public void tambahAntrian(String nama, String noHp) {
        counterAntrian++;
        Pembeli09 pembeliBaru = new Pembeli09(nama, noHp);
        NodeAntrian09 nodeBaru = new NodeAntrian09(counterAntrian, pembeliBaru);

        if (headAntrian == null) {
            headAntrian = nodeBaru;
            tailAntrian = nodeBaru;
        } else {
            tailAntrian.next = nodeBaru;
            nodeBaru.prev = tailAntrian;
            tailAntrian = nodeBaru;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + counterAntrian); // [cite: 56]
    }

    // Menu 2: Cetak Antrian
    public void cetakAntrian() {
        System.out.println("----------------------------------------");
        System.out.println("Daftar Antrian Pembeli"); // [cite: 67]
        System.out.println("----------------------------------------");
        System.out.printf("%-12s %-15s %-15s\n", "No Antrian", "Nama", "No HP"); // [cite: 68, 74, 75]
        
        if (headAntrian == null) {
            System.out.println("(Antrian Kosong)");
            return;
        }

        NodeAntrian09 current = headAntrian;
        while (current != null) {
            System.out.printf("%-12d %-15s %-15s\n", 
                current.noAntrian, current.data.namaPembeli, current.data.NoHp);
            current = current.next;
        }
    }

    // Menu 3: Hapus Antrian dan Pesan (FIFO Queue style)
    public void hapusAntrianDanPesan(int kode, String namaMenu, int harga) {
        if (headAntrian == null) {
            System.out.println("Gagal: Antrian sudah kosong!");
            return;
        }

        // Ambil data antrean paling depan (head)
        NodeAntrian09 dipanggil = headAntrian;
        
        // Simpan data pesanan ke dalam linked list pesanan
        Pesanan09 pesananBaru = new Pesanan09(kode, namaMenu, harga);
        NodePesanan09 nodePesananBaru = new NodePesanan09(pesananBaru);
        
        if (headPesanan == null) {
            headPesanan = nodePesananBaru;
            tailPesanan = nodePesananBaru;
        } else {
            tailPesanan.next = nodePesananBaru;
            nodePesananBaru.prev = tailPesanan;
            tailPesanan = nodePesananBaru;
        }

        System.out.println(dipanggil.data.namaPembeli + " telah memesan " + namaMenu); // [cite: 102]

       
        if (headAntrian == tailAntrian) {
            headAntrian = null;
            tailAntrian = null;
        } else {
            headAntrian = headAntrian.next;
            headAntrian.prev = null;
        }
    }

    
    public void laporanPesanan() {
        System.out.println("----------------------------------------");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)"); // [cite: 132]
        System.out.println("----------------------------------------");
        System.out.printf("%-15s %-20s %-10s\n", "Kode Pesanan", "Nama Pesanan", "Harga"); // [cite: 133, 134, 141]

        if (headPesanan == null) {
            System.out.println("(Belum ada pesanan yang direkap)");
            System.out.println("Total Pendapatan: Rp 0");
            return;
        }

        
        urutkanPesanan();

        NodePesanan09 current = headPesanan;
        int totalPendapatan = 0;
        
        while (current != null) {
            System.out.printf("%-15d %-20s %-10d\n", 
                current.data.kodePesanan, current.data.namaPesanan, current.data.harga);
            totalPendapatan += current.data.harga;
            current = current.next;
        }
        System.out.println("----------------------------------------");
        System.out.println("Total Pendapatan: Rp " + totalPendapatan); // [cite: 26]
    }

    
    private void urutkanPesanan() {
        if (headPesanan == null || headPesanan.next == null) {
            return; 
        }

        NodePesanan09 current = headPesanan.next;
        while (current != null) {
            NodePesanan09 nextNode = current.next;
            Pesanan09 key = current.data;
            NodePesanan09 search = current.prev;

            
            while (search != null && search.data.namaPesanan.compareToIgnoreCase(key.namaPesanan) > 0) {
                search.next.data = search.data;
                search = search.prev;
            }

            if (search == null) {
                headPesanan.data = key;
            } else {
                search.next.data = key;
            }
            current = nextNode;
        }
    }

    
    public static void main(String[] args) {
        SistemRoyalDelish resto = new SistemRoyalDelish();
        Scanner sc = new Scanner(System.in);

       
        resto.tambahAntrian("Ainra", "08224500000"); 
        resto.tambahAntrian("Danra", "08224511111"); 
        resto.tambahAntrian("Sanri", "08224522222"); 
        resto.tambahAntrian("Ricky", "08223456789");
        resto.tambahAntrian("Galang", "0888345765");
        resto.tambahAntrian("Timothy", "0898888876");

        int pilihan;
        do {
            System.out.println("\n================================");
            System.out.println("SISTEM ANTREAN ROYAL DELISH");
            System.out.println("================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian"); 
            System.out.println("3. Hapus Antrian dan Pesan"); 
            System.out.println("4. Laporan Pesanan"); 
            System.out.println("5. Cari Data Berdasarkan No.HP");
            System.out.println("0. Keluar"); 
            System.out.print("Pilih menu : "); 
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pembeli : "); 
                    String nama = sc.nextLine();
                    System.out.print("No HP        : "); 
                    String hp = sc.nextLine();
                    resto.tambahAntrian(nama, hp);
                    break;

                case 2:
                    resto.cetakAntrian();
                    break;

                case 3:
                    if (resto.headAntrian == null) {
                        System.out.println("Antrian kosong! Tidak ada pembeli yang bisa dipesan.");
                        break;
                    }
                    System.out.print("Kode Pesanan : "); 
                    int kode = sc.nextInt();
                    sc.nextLine(); // clear buffer
                    System.out.print("Nama Pesanan : "); 
                    String menuMakanan = sc.nextLine();
                    System.out.print("Harga        : "); 
                    int harga = sc.nextInt();
                    
                    resto.hapusAntrianDanPesan(kode, menuMakanan, harga);
                    break;

                case 4:
                    resto.laporanPesanan();
                    break;

                case 5:
                    System.out.println("No HP : ");
                    String CariNoHp = sc.nextLine();
                    int low = 0, hight = resto.tambahAntrian - 1;
                                 

                case 0:
                    System.out.println("Keluar dari sistem. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid!");
            }
        } while (pilihan != 0);

        sc.close();
    }
}