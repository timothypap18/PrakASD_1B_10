package P3.Tugas;
import java.util.Scanner;

public class DosenDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Dosen: ");
        int jml = sc.nextInt();
        sc.nextLine(); 
        
        Dosen11[] arrayOfDosen = new Dosen11[jml];

        for (int i = 0; i < jml; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita) : ");
            String jkStr = sc.nextLine();
            Boolean jk = jkStr.equalsIgnoreCase("Pria");
            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine(); 

            // Instansiasi agar tidak NULL
            arrayOfDosen[i] = new Dosen11(kode, nama, jk, usia);
            System.out.println("-----------------------------------");
        }

        // Memanggil semua method dari class DataDosen11
        DataDosen11 helper = new DataDosen11();
        helper.dataSemuaDosen(arrayOfDosen);
        helper.jumlahDosenPerJenisKelamin(arrayOfDosen);
        helper.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        helper.infoDosenPalingTua(arrayOfDosen);
        helper.infoDosenPalingMuda(arrayOfDosen);
    }
}