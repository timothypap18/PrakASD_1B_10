package P15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa09 {
    List<Mahasiswa09> mahasiswa = new ArrayList<>();
    
    public void tambah(Mahasiswa09... mahasiswa) {
        this.mahasiswa.addAll(Arrays.asList(mahasiswa));
    }
    
    public void hapus(int index) {
        mahasiswa.remove(index);
    }
    
    public void update(int index, Mahasiswa09 mhs) {
        mahasiswa.set(index, mhs);
    }
    
    public void tampil() {
        mahasiswa.stream().forEach(mhs -> {
            System.out.println(mhs.toString());
        });
    }
    
    public int linearSearch(String nim) {
        for (int i = 0; i < mahasiswa.size(); i++) {
            if (nim.equals(mahasiswa.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }
    
    // ========== TUGAS: binarySearch ==========
    public int binarySearch(String nim) {
        // Sorting dulu berdasarkan NIM
        Collections.sort(mahasiswa, Comparator.comparing(m -> m.nim));
        
        int left = 0;
        int right = mahasiswa.size() - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = nim.compareTo(mahasiswa.get(mid).nim);
            
            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
    
    // ========== TUGAS: sorting ==========
    public void sortAscending() {
        Collections.sort(mahasiswa, Comparator.comparing(m -> m.nim));
    }
    
    public void sortDescending() {
        Collections.sort(mahasiswa, Comparator.comparing((Mahasiswa09 m) -> m.nim).reversed());
    }
    
    public static void main(String[] args) {
        ListMahasiswa09 lm = new ListMahasiswa09();
        Mahasiswa09 m = new Mahasiswa09("201234", "Noureen", "021xx1");
        Mahasiswa09 m1 = new Mahasiswa09("201235", "Akhleema", "021xx2");
        Mahasiswa09 m2 = new Mahasiswa09("201236", "Shannum", "021xx3");
        
        // menambahkan objek mahasiswa
        lm.tambah(m, m1, m2);
        
        // menampilkan list mahasiswa
        lm.tampil();
        
        // update mahasiswa
        lm.update(lm.linearSearch("201235"), new Mahasiswa09("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();
    }
}