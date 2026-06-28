package P11;

public class SingleLinkedList09 {
    Node09 head;
    Node09 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        } else {
            Node09 tmp = head;
            System.out.print("Isi Linked List: ");
            while (tmp != null) {
                System.out.print(tmp.data.nama + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        }
    }

    public void printDetail() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        } else {
            Node09 tmp = head;
            int i = 1;
            System.out.println("=== Isi Linked List ===");
            while (tmp != null) {
                System.out.println("Node ke-" + i);
                tmp.data.tampilInformasi();
                tmp = tmp.next;
                i++;
            }
        }
    }

    public void addFirst(Mahasiswa09 input) {
        Node09 ndInput = new Node09(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa09 input) {
        Node09 ndInput = new Node09(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa09 input) {
        Node09 ndInput = new Node09(input, null);
        Node09 temp = head;
        while (temp != null) {
            if (temp.data.nim.equals(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }

    public void insertAt(int index, Mahasiswa09 input) {
        if (index < 0) {
            System.out.println("Indeks tidak valid!");
            return;
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node09 temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp == null) {
                    System.out.println("Indeks melebihi batas!");
                    return;
                }
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Indeks melebihi batas!");
                return;
            }
            Node09 ndInput = new Node09(input, null);
            ndInput.next = temp.next;
            temp.next = ndInput;
            if (ndInput.next == null) {
                tail = ndInput;
            }
        }
    }
}