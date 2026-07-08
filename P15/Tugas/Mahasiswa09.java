package P15.Tugas;

public class Mahasiswa09 {
    private String nim;
    private String nama;
    private String kelas;
    
    public Mahasiswa09() {
    }
    
    public Mahasiswa09(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }
    
    public String getNim() { return nim; }
    public String getNama() { return nama; }
    public String getKelas() { return kelas; }
    
    public void setNim(String nim) { this.nim = nim; }
    public void setNama(String nama) { this.nama = nama; }
    public void setKelas(String kelas) { this.kelas = kelas; }
    
    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", kelas=" + kelas + '}';
    }
}
