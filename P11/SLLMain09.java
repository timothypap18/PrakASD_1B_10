package P11;

public class SLLMain09 {
    public static void main(String[] args) {
        SingleLinkedList09 singLL = new SingleLinkedList09();

        Mahasiswa09 mhs1 = new Mahasiswa09("123", "Andi", "TI-1A", 3.5);
        Mahasiswa09 mhs2 = new Mahasiswa09("124", "Budi", "TI-1A", 3.2);
        Mahasiswa09 mhs3 = new Mahasiswa09("125", "Cici", "TI-1B", 3.8);
        Mahasiswa09 mhs4 = new Mahasiswa09("126", "Dodi", "TI-1B", 3.0);

        System.out.println("=== Menambahkan data dengan addFirst ===");
        singLL.addFirst(mhs1);
        singLL.print();

        singLL.addFirst(mhs2);
        singLL.print();

        System.out.println("=== Menambahkan data dengan addLast ===");
        singLL.addLast(mhs3);
        singLL.print();

        singLL.addLast(mhs4);
        singLL.print();

        System.out.println("=== Menambahkan data dengan insertAfter ===");
        Mahasiswa09 mhs5 = new Mahasiswa09("127", "Euis", "TI-1C", 3.6);
        singLL.insertAfter("124", mhs5);
        singLL.print();

        System.out.println("=== Menambahkan data dengan insertAt ===");
        Mahasiswa09 mhs6 = new Mahasiswa09("128", "Fajar", "TI-1C", 3.7);
        singLL.insertAt(2, mhs6);
        singLL.print();

        System.out.println("\n=== Detail Linked List ===");
        singLL.printDetail();
    }
}
