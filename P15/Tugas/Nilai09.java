package P15.Tugas;

public class Nilai09 {
    private Mahasiswa09 mahasiswa;
    private MataKuliah09 mataKuliah;
    private double nilai;
    
    public Nilai09() {
    }
    
    public Nilai09(Mahasiswa09 mahasiswa, MataKuliah09 mataKuliah, double nilai) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilai = nilai;
    }
    
    public Mahasiswa09 getMahasiswa() { return mahasiswa; }
    public MataKuliah09 getMataKuliah() { return mataKuliah; }
    public double getNilai() { return nilai; }
    
    public void setMahasiswa(Mahasiswa09 mahasiswa) { this.mahasiswa = mahasiswa; }
    public void setMataKuliah(MataKuliah09 mataKuliah) { this.mataKuliah = mataKuliah; }
    public void setNilai(double nilai) { this.nilai = nilai; }
    
    public String getGrade() {
        if (nilai >= 85) return "A";
        else if (nilai >= 75) return "B";
        else if (nilai >= 60) return "C";
        else if (nilai >= 45) return "D";
        else return "E";
    }
    
    @Override
    public String toString() {
        return "Nilai{" + "mahasiswa=" + mahasiswa.getNama() + 
               ", mataKuliah=" + mataKuliah.getNamaMK() + 
               ", nilai=" + nilai + ", grade=" + getGrade() + '}';
    }
}
