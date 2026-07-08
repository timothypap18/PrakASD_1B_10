package P15.Tugas;

public class MataKuliah09 {
    private String kodeMK;
    private String namaMK;
    private int sks;
    
    public MataKuliah09() {
    }
    
    public MataKuliah09(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }
    
    public String getKodeMK() { return kodeMK; }
    public String getNamaMK() { return namaMK; }
    public int getSks() { return sks; }
    
    public void setKodeMK(String kodeMK) { this.kodeMK = kodeMK; }
    public void setNamaMK(String namaMK) { this.namaMK = namaMK; }
    public void setSks(int sks) { this.sks = sks; }
    
    @Override
    public String toString() {
        return "MataKuliah{" + "kodeMK=" + kodeMK + ", namaMK=" + namaMK + ", sks=" + sks + '}';
    }
}
