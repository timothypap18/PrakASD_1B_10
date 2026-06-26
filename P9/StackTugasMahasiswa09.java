package P9;

public class StackTugasMahasiswa09 {
    Mahasiswa09[] stack;
    int top;
    int size;

    public StackTugasMahasiswa09(int size){
        this.size = size;
        stack = new Mahasiswa09[size];
        top = -1;
    }

    public boolean isFull(){
        if (top == size - 1){
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty(){
        if (top == -1){
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa09 mhs) {
        if (!isFull()){
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh, tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa09 pop(){
        if(!isEmpty()){
            Mahasiswa09 mhs = stack[top];
            top--;
            return mhs;
        } else {
            System.out.println("Stack kosong, tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa09 peekBottom() {
        if (!isEmpty()) {
            return stack[0]; 
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public void print(){
        for (int i = top; i >= 0; i--){
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    public int getJumlahTugas() {
        return top + 1; 
    }

    public String konversiDesimalKeBiner(int nilai){
        StackKonversi stack = new StackKonversi(32);
        while (nilai > 0){
            int sisa = nilai%2;
            stack.push(sisa);
            nilai = nilai/2;
        }
        String  biner = new String();
        while (!stack.isEmpty()){
            biner += stack.pop();
        }
        return biner;
    }
}
