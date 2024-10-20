package homeWorks.map;

public class CustomHashMap<K, V> {
    private static final int DEFAULTLENGTH = 16;
    private final Node[] arr;
    private int size;
    public CustomHashMap() {
        this.arr = new Node[DEFAULTLENGTH];
    }
    public int getSize() {
        return this.size;
    }
    public V add(K key, V value) {
        int hashBox = key.hashCode();
        int index = hashBox & (arr.length - 1);
        Node<K, V> head = this.arr[index];
        V tmp = null;
        if (head == null) {
            Node<K, V> obj = new Node<>(key, value, null);
            this.arr[index] = obj;
        } else {
            while (head != null) {
                if (head.key.equals(key)) {
                    tmp = head.value;
                    head.value = value;
                    return tmp;
                }
                head = head.next;
            }
            head = this.arr[index];
            Node<K, V> obj = new Node<>(key, value, head);
            this.arr[index] = obj;
        }
        size++;
        return null;
    }
    public V get(K key){
        int hashBox = key.hashCode();
        int bucket = hashBox & (arr.length - 1);
        Node<K, V> head = this.arr[bucket];
        while (head != null) {
            if (head.key.equals(key)) {
                return (V) head.value;
            }
            head = head.next;
        }
        return null;
    }
    public V remove(K key) {
        int hashBox = key.hashCode();
        int index = hashBox & (arr.length - 1);
        Node head = this.arr[index];
        Node tmp = head;
        V val = null;
        while (head != null) {
            if (head.key.equals(key)) {
                val = (V) head.value;
                if (tmp == head) {
                    this.arr[index] = head.next;
                } else {
                    tmp.next = head.next;
                }
                this.size--;
                break;
            }
            tmp = head;
            head = head.next;
        }
        return val;
    }
    public boolean containsKey(K key) {
        boolean result = false;
        int hashBox = key.hashCode();
        int index = hashBox & (arr.length - 1);
        Node<K, V> head = this.arr[index];
        while (head != null) {
            if (head.key.equals(key)) {
                result = true;
            }
            head = head.next;
        }
        return result;
    }
    public boolean containsValue(V value) {
        boolean result = false;
        Node<K, V>[] array;
        array = this.arr;
        for (Node<K, V> sense : array
        ) {
            if (sense != null && sense.value.equals(value)) {
                result = true;
            }
        }
        return result;
    }
    public void clear() {
        Node<K, V>[] array;

        if ((array = arr) != null && size > 0) {
            size = 0;
            for (int i = 0; i < array.length; ++i)
                array[i] = null;
        }
    }
    private class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;
        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}