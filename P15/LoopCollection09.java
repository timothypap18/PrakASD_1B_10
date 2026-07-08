package P15;

import java.util.Iterator;
import java.util.Stack;

public class LoopCollection09 {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.push("Salak");
        
        // For-each loop
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }
        System.out.println("\n" + fruits.toString());
        
        // While loop (pop)
        while (!fruits.empty()) {
            System.out.printf("%s ", fruits.pop());
        }
        
        // Menambahkan kembali untuk percobaan selanjutnya
        fruits.push("Melon");
        fruits.push("Durian");
        System.out.println("");
        
        // Iterator
        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        System.out.println("");
        
        // Stream forEach
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
        System.out.println("");
        
        // For loop dengan index
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }
    }
}
