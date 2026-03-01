package P1;
import java.util.Scanner;
public class Array10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] matkul = {"Pancasila","Konsep Teknologi Informasi", "Chritical Thinking and Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", " Praktikum Dasar Pemrograman", "Kesehatan dan Keselamatan Kerja"};
        int[] sks = {2, 2, 2, 3, 2, 2, 3, 2};
        double[] nilaiAngka = new double[matkul.length];
        String[] nilaiHuruf = new String[matkul.length];
        double[] bobotNilai = new double[matkul.length];
        System.out.println("===============================");
        System.out.println("Program Menghitung IPK Semester");
        System.out.println("===============================");
        for (int i = 0; i < matkul.length; i++) {
            System.out.println("Masukkan nilai untuk mata kiliah " + matkul[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.0;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.0;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.0;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.0;
            }
        }
        System.out.println("Hasil Konversi Nilai");
        System.out.println("===============================");
        System.out.printf("%-40s %-12s %-12s %-12s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        double totalNilaiSKS = 0;
        int totalSKS = 0;
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%-40s %-12.2f %-12s %-12.2f\n", matkul[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
            totalNilaiSKS += bobotNilai[i] * sks[i];
            totalSKS += sks[i];
        }
        double ip = totalNilaiSKS / totalSKS;
        System.out.println("===============================");
        System.out.printf("IP : %.2f\n", ip);
    }
}
