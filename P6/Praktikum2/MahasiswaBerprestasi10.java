package P6.Praktikum2;

public class MahasiswaBerprestasi10 {
    Mahasiswa10[] listMhs= new Mahasiswa10[5];
    int idx;
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
}
