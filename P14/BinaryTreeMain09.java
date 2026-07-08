package P14;

public class BinaryTreeMain09 {
    public static void main(String[] args) {
        BinaryTree09 bt = new BinaryTree09();
        
        // Membuat objek mahasiswa
        Mahasiswa09 mhs1 = new Mahasiswa09("244160121", "Ali", "A", 3.57);
        Mahasiswa09 mhs2 = new Mahasiswa09("244160185", "Candra", "C", 3.21);
        Mahasiswa09 mhs3 = new Mahasiswa09("244160221", "Badar", "B", 3.85);
        Mahasiswa09 mhs4 = new Mahasiswa09("244160220", "Dewi", "B", 3.54);
        
        // Menambahkan data
        bt.add(mhs1);
        bt.add(mhs2);
        bt.add(mhs3);
        bt.add(mhs4);
        
        System.out.println("Daftar semua mahasiswa (in order traversal):");
        bt.traverseInOrder(bt.root);
        
        System.out.println("\nPencarian data mahasiswa:");
        System.out.println("Cari mahasiswa dengan ipk: 3.54 : " + (bt.find(3.54) ? "Ditemukan" : "Tidak ditemukan"));
        System.out.println("Cari mahasiswa dengan ipk: 3.22 : " + (bt.find(3.22) ? "Ditemukan" : "Tidak ditemukan"));
        
        // Menambahkan 3 mahasiswa baru
        Mahasiswa09 mhs5 = new Mahasiswa09("244160205", "Ehsan", "D", 3.37);
        Mahasiswa09 mhs6 = new Mahasiswa09("244160170", "Fizi", "B", 3.46);
        Mahasiswa09 mhs7 = new Mahasiswa09("244160131", "Devi", "A", 3.72);
        
        bt.add(mhs5);
        bt.add(mhs6);
        bt.add(mhs7);
        
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("Inorder Traversal:");
        bt.traverseInOrder(bt.root);
        
        System.out.println("\nPreOrder Traversal:");
        bt.traversePreOrder(bt.root);
        
        System.out.println("\nPostOrder Traversal:");
        bt.traversePostOrder(bt.root);
        
        // Menghapus mahasiswa dengan IPK 3.57
        bt.delete(3.57);
        
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        bt.traverseInOrder(bt.root);
        
        // ========== Tugas ==========
        System.out.println("\n========== TUGAS ==========");
        
        // Tugas 1: Uji addRekursif
        System.out.println("\n--- Tugas 1: Menambah Node dengan Rekursif ---");
        BinaryTree09 btRekursif = new BinaryTree09();
        btRekursif.addRekursif(mhs1);
        btRekursif.addRekursif(mhs2);
        btRekursif.addRekursif(mhs3);
        btRekursif.addRekursif(mhs4);
        btRekursif.addRekursif(mhs5);
        btRekursif.addRekursif(mhs6);
        btRekursif.addRekursif(mhs7);
        System.out.println("Data setelah ditambah dengan method rekursif (Inorder):");
        btRekursif.traverseInOrder(btRekursif.root);
        
        // Tugas 2: Cari IPK Min dan Max
        System.out.println("\n--- Tugas 2: Cari IPK Minimum dan Maksimum ---");
        Mahasiswa09 minIPK = bt.cariMinIPK();
        Mahasiswa09 maxIPK = bt.cariMaxIPK();
        if (minIPK != null) {
            System.out.println("IPK Terkecil:");
            minIPK.tampilInformasi();
        }
        if (maxIPK != null) {
            System.out.println("IPK Terbesar:");
            maxIPK.tampilInformasi();
        }
        
        // Tugas 3: Tampil Mahasiswa dengan IPK > 3.50
        System.out.println("\n--- Tugas 3: Mahasiswa dengan IPK > 3.50 ---");
        bt.tampilMahasiswaIPKdiAtas(bt.root, 3.50);
    }
}
