package oldCode;

import java.util.Arrays;

public class Merge{
    public static int[] grow(int[] array, int size){
        int[] newArray = new int[size];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }
    public static void merge(int[] array1, int[] array2){
        if (array1.length == 0){
            System.out.println(array2);
            System.out.println(Arrays.toString(array2));
        } else {
            if (array2.length == 0)
                System.out.println(array1);
            System.out.println(Arrays.toString(array1));
        }
        int nums1 = array1.length;
        int nums2 = array2.length;

        array1 = grow(array1, nums1+nums2);
        for (int i = 0; i < array2.length ; nums1++, i++) {
            array1[nums1] = array2[i];
        }
    }
}
class MergeDemo{
    public static void main(java.lang.String[] args) {
        int [] a = {1,2,3,0,0,0};
        int [] b = {2,5,6};
    }
}
