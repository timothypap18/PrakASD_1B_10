package P2.Percobaan1;

public class MahasiswaMain11 {
    public static void main(String[] args) {
        Mahasiswa11 mhs1 = new Mahasiswa11();
        mhs1.nama = "I Gusti Agung Timothy Pasquale Anggra Putra";
        mhs1.nim = "254107020157";
        mhs1.kelas = "TI-1A";
        mhs1.ipk = 3.55;
        mhs1.tampilkaninfo();
        mhs1.ubahkelas("TI-1B");
        mhs1.ubahipk(3.69);
        mhs1.tampilkaninfo();
        Mahasiswa11 mhs2 = new Mahasiswa11("Muhammad Rayyan", "254309202122", "TI-1J", 3.23);
        mhs2.ubahipk(3.12);
        mhs2.tampilkaninfo();
    }
}
