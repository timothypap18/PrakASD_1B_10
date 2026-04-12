package P6.Praktikum2;

public class MahasiswaBerprestasi10 {
    Mahasiswa10[] listMhs;
    int idx;
    void inisialisasiArray(int jml) {
        listMhs = new Mahasiswa10[jml];
        idx = 0;
    }
    void tambah (Mahasiswa10 m){
        if (idx<listMhs.length){
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }
    void tampil(){
        for (Mahasiswa10 m : listMhs){
            m.tampilInformaasi();
            System.out.println("-----------------------");
        }
    }
    void bubbleSort(){
        for (int i=0; i<listMhs.length-1; i++){
            for (int j=1; j<listMhs.length-1; j++){
                if (listMhs[j].ipk < listMhs[j-1].ipk){
                    Mahasiswa10 temp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = temp;
                }
            }
        }
    }
    void selectionSort(){
        for (int i=0; i<listMhs.length-1; i++){
            int idxMin = i;
            for (int j=i+1; j<listMhs.length; j++){
                if (listMhs[j].ipk < listMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            Mahasiswa10 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa10 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
    int sequentialSearching(double cari){
        int posisi = -1;
        for (int j=0; j<listMhs.length; j++){
            if (listMhs[j].ipk == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    void tampilPosisi(double x, int pos){
        if (pos != -1){
            System.out.println("Data mahasiswa dengan IPK : "+x+" ditemukan pada indeks "+pos);
        } else {
            System.out.println("Data "+ x + "tidak ditemukan");
        }
    }
    void tampilDataSearch(double x, int pos){
        if (pos != -1){
            System.out.println("Nim : "+listMhs[pos].nim);
            System.out.println("Nama : "+listMhs[pos].nama);
            System.out.println("Kelas : "+listMhs[pos].kelas);
            System.out.println("IPK : "+ x);
        } else {
            System.out.println("Data Mahasiswa dengan IPK "+x+" tidak ditemukan");
        }
    }
    int findBinarySearch(double cari, int left, int right){
        int mid;
        if (right>=left){
            mid = (left + right)/2;
            if (cari == listMhs[mid].ipk) {
                return mid;
            } else if (cari > listMhs[mid].ipk) { // Ganti < menjadi >
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}
