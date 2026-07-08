package P12;

public class DoubleLinkedList09 {
    Node09 head;
    Node09 tail;

    public DoubleLinkedList09() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa09 data) {
        Node09 newNode = new Node09(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa09 data) {
        Node09 newNode = new Node09(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String nim, Mahasiswa09 data) {
        Node09 newNode = new Node09(data);
        Node09 current = head;

        while (current != null) {
            if (current.data.nim.equals(nim)) {
                newNode.next = current.next;
                newNode.prev = current;
                if (current.next != null) {
                    current.next.prev = newNode;
                } else {
                    tail = newNode;
                }
                current.next = newNode;
                System.out.println("Data berhasil disisipkan setelah NIM " + nim);
                return;
            }
            current = current.next;
        }
        System.out.println("NIM " + nim + " tidak ditemukan!");
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
        } else {
            Node09 current = head;
            System.out.println("\n=== DATA MAHASISWA ===");
            while (current != null) {
                current.data.tampil();
                System.out.println("----------------------------");
                current = current.next;
            }
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
        } else {
            Node09 current = tail;
            System.out.println("\n=== DATA MAHASISWA (Terbalik) ===");
            while (current != null) {
                current.data.tampil();
                System.out.println("----------------------------");
                current = current.prev;
            }
        }
    }

    // Method untuk Percobaan 2 - Penghapusan
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        Mahasiswa09 dataDihapus = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data berhasil dihapus.");
        System.out.println("Data yang dihapus:");
        dataDihapus.tampil();
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        Mahasiswa09 dataDihapus = tail.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data berhasil dihapus.");
        System.out.println("Data yang dihapus:");
        dataDihapus.tampil();
    }
}