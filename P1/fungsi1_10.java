package P1;

public class fungsi1_10 {
    public static void main(String[] args) {
        int[][] stok = {
            {10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9}
        };
        int[] harga = {75000, 50000, 60000, 10000};
        int[] hasilPendapatan = dapatkanTotal(stok, harga);

        for (int i = 0; i < hasilPendapatan.length; i++) {
            String status = (hasilPendapatan[i] > 1500000) ? "Sangat Baik" : "Perlu Evaluasi";
            System.out.printf("RoyalGarden %d: Rp%,d | Status: %s\n", (i + 1), hasilPendapatan[i], status);
        }
    }
    public static int[] dapatkanTotal(int[][] stok, int[] harga) {
        int[] totalPerCabang = new int[stok.length];
        for (int i = 0; i < stok.length; i++) {
            for (int j = 0; j < stok[i].length; j++) {
                totalPerCabang[i] += stok[i][j] * harga[j];
            }
        }
        return totalPerCabang;
    }
}
