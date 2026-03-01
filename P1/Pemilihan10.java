package P1;
import java.util.Scanner;

public class Pemilihan10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = sc.nextDouble();

        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = sc.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        double uts = sc.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        double uas = sc.nextDouble();

        System.out.println("==============================");

        if (!valid(tugas) || !valid(kuis) || !valid(uts) || !valid(uas)) {
            System.out.println("\nnilai tidak valid");
            System.out.println("==============================");
            return;
        }

        double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);

        String nilaiHuruf;
        String status;

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            status = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir > 73) {
            nilaiHuruf = "B+";
            status = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir > 65) {
            nilaiHuruf = "B";
            status = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir > 60) {
            nilaiHuruf = "C+";
            status = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir > 50) {
            nilaiHuruf = "C";
            status = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir > 39) {
            nilaiHuruf = "D";
            status = "ANDA TIDAK LULUS";
        } else {
            nilaiHuruf = "E";
            status = "ANDA TIDAK LULUS";
        }

        System.out.println("\nnilai akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("==============================");
        System.out.println(status);
        System.out.println("==============================");
    }

    static boolean valid(double nilai) {
        return nilai >= 0 && nilai <= 100;
    }
}