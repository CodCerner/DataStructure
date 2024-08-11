package datastructures.heap;

public class HeapMain {

    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.insert(99);
        heap.insert(72);
        heap.insert(61);
        heap.insert(58);

        heap.print();

        heap.insert(100);

        heap.print();

        heap.insert(75);

        heap.print();

        heap.remove();

        heap.print();

        heap.remove();

        heap.print();
    }
}
