package P15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ContohList09 {
    public static void main(String[] args) {
        // Baris 25-36: ArrayList dengan berbagai tipe data
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        // l.add("Cireng"); // Ini akan error karena bukan Integer
        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
                l.get(0), l.size(), l.get(l.size() - 1));
        
        // Baris 38: LinkedList dengan tipe String
        LinkedList<String> names = new LinkedList<>();
        names.add("Noureen");
        names.add("Akhleema");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");
        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
                names.get(0), names.size(), names.getLast());
        System.out.println("Names: " + names.toString());
        
        names.push("Mei-mei");
        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n", names.getFirst(), names.size(), names.getLast());
        System.out.println("Names: " + names.toString());
    }
}