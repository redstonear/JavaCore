package homeWorks.arrays;

public class CustomArrayList<E> {
    private E[] array;
    private int size;
    private final int DEFAULTCAPACITY = 5;

    public CustomArrayList(){
        array = (E[]) new Object();
    }
    void add(E value){
        if (array.length==size){
            grow();
        }
        array[size]=value;
        size++;
    }
    void grow(){
        E[] newArray;
        newArray = (E[]) new Object[array.length + array.length / 2 + 1];
        System.arraycopy(array,0,newArray,0,array.length);
        array= newArray;
    }
    @Override
    public String toString() {
        String ArrayOfStrings = "array[0]";
        for (int i = 0; i < array.length; i++) if (array[i] == null) break;
        return ArrayOfStrings;
    }
}

class Main{
    public static void main(String[] args) {
        CustomArrayList<String> List = new CustomArrayList<String>();
        List.add("Tigran");
        List.add("Xachik");
        List.add("Gevorg");
        List.add("Hrant");
        System.out.println(List);
    }
}
