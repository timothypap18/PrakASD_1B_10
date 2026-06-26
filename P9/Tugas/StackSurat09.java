package P9.Tugas;

public class StackSurat09 {
    Surat09[] stack;
    int top;
    int size;

    public StackSurat09(int size) {
        this.size = size;
        stack = new Surat09[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat09 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
            System.out.println("Surat izin berhasil diterima.");
        } else {
            System.out.println("Tumpukan surat penuh!");
        }
    }

    public Surat09 pop() {
        if (!isEmpty()) {
            Surat09 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat09 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Tidak ada surat di dalam tumpukan.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("\n--- Surat Ditemukan! ---");
                System.out.println("ID Surat    : " + stack[i].idSurat);
                System.out.println("Nama        : " + stack[i].namaMahasiswa);
                System.out.println("Kelas       : " + stack[i].kelas);
                System.out.println("Jenis Izin  : " + (stack[i].jenisIzin == 'S' ? "Sakit" : "Izin Keperluan Lain"));
                System.out.println("Durasi      : " + stack[i].durasi + " hari");
                System.out.println("Posisi Antrian: Urutan ke-" + (top - i + 1) + " dari atas");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat izin atas nama '" + nama + "' tidak ditemukan.");
        }
    }
}
