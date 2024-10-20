package homeWorks.arrays;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;

    DynamicArray(){
        int[] array = new int[10];
    }

    DynamicArray(int length){
        array = new int[length];
    }

        public void add(int value){
            if(size == array.length){
                extend();
            }
            array[size++] = value;
        }

        private void extend(){
            int[] tmp = new int[array.length * 10];
           for (int i = 0; i < array.length; i++) {
                tmp[i] = array[i];
            }
           this.array = tmp;
        }

        public int getByIndex(int index){
            if (index < 0 || index >= size){
                return -1;
            }
            return array[index];
        }

        public void print(){
            for (int i = 0; i < size; i++) {
                System.out.println(array[i] + " ");
            }
        }

        public void deleteByIndex(int index){
        if (index < 0 || index >= size){
            return;
        }
            for (int i = index+1; i < size; i++) {
                array[i] = array[i-1];
            }
            size--;
    }

    public void set(int index, int value){

    }

    public void add(int index, int value){
        if (index < 0 || index >= size){
            return;
        }
        if (size == array.length){
            extend();
        }
        for (int i = size; i >= index ; i++) {
            array[i] = array[i-1];
        }
        array[index] = value;
        size++;
    }
    public boolean exists(int value){
        for (int i = 0; i < size; i++) {
            if (array[i] == value){
                return true;
            }
        }
        return false;
    }
}
