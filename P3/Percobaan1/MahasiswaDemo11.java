package P3.Percobaan1;
import java.util.Scanner;
public class MahasiswaDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa11[] ArrayofMahasiswa = new Mahasiswa11[3];
        String dummy;
        for ( int i = 0; i < 3; i++) {
            ArrayofMahasiswa[i] = new Mahasiswa11();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM   : ");
            ArrayofMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama  : ");
            ArrayofMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas : ");
            ArrayofMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK   : ");
            dummy = sc.nextLine(); 
            ArrayofMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("------------------------------");
        }

        for ( int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            ArrayofMahasiswa[i].cetakinfo();
        }
    }
}
