package P14;

public class BinaryTree09 {
    Node09 root;
    
    public BinaryTree09() {
        root = null;
    }
    
    boolean isEmpty() {
        return root == null;
    }
    
    // Method add iteratif
    void add(Mahasiswa09 mahasiswa) {
        Node09 newNode = new Node09(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node09 current = root;
            Node09 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }
    
    // Method add rekursif (Tugas 1)
    void addRekursif(Mahasiswa09 mahasiswa) {
        root = addRekursif(root, mahasiswa);
    }
    
    Node09 addRekursif(Node09 current, Mahasiswa09 mahasiswa) {
        if (current == null) {
            return new Node09(mahasiswa);
        }
        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left = addRekursif(current.left, mahasiswa);
        } else if (mahasiswa.ipk > current.mahasiswa.ipk) {
            current.right = addRekursif(current.right, mahasiswa);
        }
        return current;
    }
    
    boolean find(double ipk) {
        boolean result = false;
        Node09 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }
    
    void traversePreOrder(Node09 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    
    void traverseInOrder(Node09 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }
    
    void traversePostOrder(Node09 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }
    
    Node09 getSuccessor(Node09 del) {
        Node09 successorParent = del;
        Node09 successor = del;
        Node09 current = del.right;
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    
    boolean delete(double ipk) {
        Node09 parent = root;
        Node09 current = root;
        boolean isLeftChild = false;
        
        // Mencari node yang akan dihapus
        while (current != null && current.mahasiswa.ipk != ipk) {
            parent = current;
            if (ipk < current.mahasiswa.ipk) {
                current = current.left;
                isLeftChild = true;
            } else {
                current = current.right;
                isLeftChild = false;
            }
        }
        
        if (current == null) {
            return false;
        }
        
        // Jika node tidak memiliki anak (leaf)
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }
        // Jika hanya memiliki anak kanan
        else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        }
        // Jika hanya memiliki anak kiri
        else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        }
        // Jika memiliki 2 anak
        else {
            Node09 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
        return true;
    }
    
    // Method untuk mencari IPK minimum (Tugas 2)
    Mahasiswa09 cariMinIPK() {
        if (isEmpty()) {
            return null;
        }
        Node09 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.mahasiswa;
    }
    
    // Method untuk mencari IPK maksimum (Tugas 2)
    Mahasiswa09 cariMaxIPK() {
        if (isEmpty()) {
            return null;
        }
        Node09 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.mahasiswa;
    }
    
    // Method untuk menampilkan mahasiswa dengan IPK di atas batas tertentu (Tugas 3)
    void tampilMahasiswaIPKdiAtas(Node09 node, double ipkBatas) {
        if (node != null) {
            tampilMahasiswaIPKdiAtas(node.left, ipkBatas);
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
                System.out.println("------------------------");
            }
            tampilMahasiswaIPKdiAtas(node.right, ipkBatas);
        }
    }
}