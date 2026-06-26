package CM2;

public class NodeAntrian09 {
    int noAntrian;
    Pembeli09 data;
    NodeAntrian09 prev;
    NodeAntrian09 next;

    public NodeAntrian09(int noAntrian, Pembeli09 data) {
        this.noAntrian = noAntrian;
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
