package P3.Percobaan2;
import java.util.Scanner;
public class MataKuliahDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah matakuliah: ");
        int jml = sc.nextInt();
        sc.nextLine(); 
        MataKuliah11[] arrayOfMatakuliah = new MataKuliah11[jml];
        MataKuliah11[] ArrayofMataKuliah = new MataKuliah11[3];
        String kode, nama, dummy;
        int sks, jumlahJam;
        for (int i = 0; i < ArrayofMataKuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            ArrayofMataKuliah[i].cetakInfo();
            System.out.println("------------------------------------");
        }
    }
}
