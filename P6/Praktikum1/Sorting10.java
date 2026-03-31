package P6.Praktikum1;

public class Sorting10 {
    int [] data;
    int jumlahData;

    Sorting10(int Data[], int jmlData) {
        jumlahData = jmlData;
        data = new int [jmlData];
        for (int i=0; i<jumlahData; i++) {
            data[i]= Data[i];
        }
    }
    void bubbleSort(){
        int temp=0;
        for(int i=0; i<jumlahData-1; i++){
            for(int j=1; j<jumlahData-1; j++){
                if(data[j-1]>data[j]){
                    temp=data[j];
                    data[j]=data[j-1];
                    data[j-1]=temp;
                }
            }
        }
    }
    void tampil(){
        for(int i=0; i<jumlahData; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    void SelectionSort(){
        for (int i=0; i<jumlahData; i++){
            int min=i;
            for (int j=i+1; j<jumlahData; j++){
                if (data[j]<data[min]){
                    min=j;
                }
            }
            int temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }
    }
    void insertionSort(){
        for (int i=1; i<=data.length-1; i++){
            int temp=data[i];
            int j=i-1;
            while (j>=0 && data[j]>temp){
                data[j+1]=data[j];
                j--;
            }
            data[j+1]=temp;
        }
    }
}
