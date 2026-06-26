package P9;

public class StackKonversi {
    int[] tumpukanBiner;
    int size;
    int top;

    public StackKonversi(int size){
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size - 1;
    }

    public void push(int value){
        if (isFull()){
            System.out.println("Stack penuh.");
        } else {
            top++;
            tumpukanBiner[top] = value;
        }
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack kosong.");
            return -1;
        } else {
            int value = tumpukanBiner[top];
            top--;
            return value;
        }
    }
}
