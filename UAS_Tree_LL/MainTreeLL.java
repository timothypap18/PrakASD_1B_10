package UAS_Tree_LL;

public class MainTreeLL {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.add(new Pegawai(105, "Fajar", "Direktur", 15000000));
        tree.add(new Pegawai(109, "Andi", "Manager", 9000000));
        tree.add(new Pegawai(103, "Citra", "Supervisor", 7000000));
        tree.add(new Pegawai(101, "Budi", "Staff", 4500000));
        tree.add(new Pegawai(104, "Dina", "Staff", 4000000));
        tree.add(new Pegawai(110, "Eko", "Staff", 5000000));
        
        System.out.println("=== InOrder ===");
        tree.traverseInOrder(tree.root);


   


    }
}
