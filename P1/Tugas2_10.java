package P1;

import java.util.Scanner;

public class Tugas2_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] jadwal = {
            {"Pemrograman Dasar", "Lab 1", "Senin", "08.00-10.00"},
            {"Algoritma", "Lab 2", "Selasa", "10.00-12.00"}
        };

        System.out.print("Cari Hari: ");
        String hari = in.nextLine();
        String hasilCari = filterJadwal(jadwal, hari);
        System.out.println(hasilCari);
    }

    public static String filterJadwal(String[][] data, String hari) {
        String hasil = "";
        for (String[] row : data) {
            if (row[2].equalsIgnoreCase(hari)) {
                hasil += row[0] + " [" + row[1] + "] Jam: " + row[3] + "\n";
            }
        }
        return hasil.isEmpty() ? "Jadwal tidak ditemukan." : hasil;
    }
}
