public class BinaryHeap {
    private int capacity;
    private int size;
    private int[] arr;

    public BinaryHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.arr = new int[capacity];
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    int left(int i) {
        return 2 * i + 1;
    }

    int right(int i) {
        return 2 * i + 2;
    }

    void insert(int x) {
        if (size == capacity) {
            System.out.println("Binary Heap Overflown");
            return;
        }
        arr[size] = x;
        int k = size;
        size++;
        while (k != 0 && arr[parent(k)] > arr[k]) {
            int temp = arr[parent(k)];
            arr[parent(k)] = arr[k];
            arr[k] = temp;
            k = parent(k);
        }
    }

    void heapIFy(int ind) {
        int ri = right(ind);
        int li = left(ind);
        int smallest = ind;
        if (li < size && arr[li] < arr[smallest])
            smallest = li;
        if (ri < size && arr[ri] < arr[smallest])
            smallest = ri;
        if (smallest != ind) {
            int temp = arr[ind];
            arr[ind] = arr[smallest];
            arr[smallest] = temp;
            heapIFy(smallest);
        }
    }

    int getMin() {
        return arr[0];
    }

    int extractMin() {
        if (size <= 0)
            return Integer.MIN_VALUE;
        if (size == 1) {
            size--;
            return arr[0];
        }
        int min = arr[0];
        arr[0] = arr[size - 1];
        size--;
        heapIFy(0);
        return min;
    }

    void decreaseKey(int val, int i) {
        arr[i] = val;
        while (i != 0 && arr[parent(i)] > arr[i]) {
            int temp = arr[parent(i)];
            arr[parent(i)] = arr[i];
            arr[i] = temp;
            i = parent(i);
        }
    }

    void delete(int i) {
        decreaseKey(Integer.MIN_VALUE, i);
        extractMin();
    }

    void printArr() {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        BinaryHeap heap = new BinaryHeap(10);
        heap.insert(4);
        heap.insert(1);
        heap.insert(2);
        heap.insert(6);
        heap.insert(7);
        heap.insert(3);
        heap.insert(8);
        heap.insert(5);
        System.out.println("Min value is " + heap.getMin());
        // heap.insert(-1);
        // System.out.println("Min value is " + heap.getMin());

    }
}