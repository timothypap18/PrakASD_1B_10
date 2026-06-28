package P10.Tugas;

public class AntrianKRS {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int jumlahDiproses;

    public AntrianKRS(int n) {
        max = n;
        data = new Mahasiswa[max];
        front = 0;
        rear = -1;
        size = 0;
        jumlahDiproses = 0;
    }

    // Cek antrian kosong
    public boolean isEmpty() {
        return size == 0;
    }

    // Cek antrian penuh
    public boolean isFull() {
        return size == max;
    }

    // Mengosongkan antrian
    public void clear() {
        if (!isEmpty()) {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian sudah kosong");
        }
    }

    // Menambahkan antrian
    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! Maksimal 10 mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk antrian KRS.");
    }

    // Memanggil antrian untuk proses KRS - setiap 1x panggilan terdiri dari 2 mahasiswa
    public void prosesKRS() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa yang diproses.");
            return;
        }

        // Cek DPA sudah menangani 30 mahasiswa
        if (jumlahDiproses >= 30) {
            System.out.println("DPA sudah menangani 30 mahasiswa. Kapasitas penuh!");
            return;
        }

        int prosesSekarang = Math.min(2, size); // Ambil 2 atau sesuai sisa antrian
        int sisaKuota = 30 - jumlahDiproses;
        if (prosesSekarang > sisaKuota) {
            prosesSekarang = sisaKuota;
        }

        System.out.println("\n=== Proses KRS ===");
        for (int i = 0; i < prosesSekarang; i++) {
            Mahasiswa mhs = data[front];
            System.out.println("Mahasiswa ke-" + (i + 1) + " diproses:");
            mhs.tampilkanData();
            front = (front + 1) % max;
            size--;
            jumlahDiproses++;
            System.out.println("Status: KRS disetujui ✓");
            System.out.println();
        }
        System.out.println("Total mahasiswa yang sudah diproses: " + jumlahDiproses);
    }

    // Menampilkan semua antrian
    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("\n=== Daftar Antrian KRS ===");
        System.out.println("No | NIM | Nama | Prodi | Kelas");
        System.out.println("----------------------------------------");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + "  ");
            data[index].tampilkanData();
        }
        System.out.println("----------------------------------------");
    }

    // Menampilkan 2 antrian terdepan
    public void tampilkanDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("\n=== 2 Mahasiswa Terdepan ===");
        int tampil = Math.min(2, size);
        for (int i = 0; i < tampil; i++) {
            int index = (front + i) % max;
            System.out.print("Antrian ke-" + (i + 1) + ": ");
            data[index].tampilkanData();
        }
    }

    // Menampilkan antrian paling akhir
    public void tampilkanAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.print("\nMahasiswa paling akhir: ");
        data[rear].tampilkanData();
    }

    // Cetak jumlah antrian
    public int getJumlahAntrian() {
        return size;
    }

    // Cetak jumlah yang sudah melakukan proses KRS
    public int getJumlahDiproses() {
        return jumlahDiproses;
    }

    // Cetak jumlah mahasiswa yang belum melakukan proses KRS
    public int getJumlahBelumProses() {
        return size;
    }
}
