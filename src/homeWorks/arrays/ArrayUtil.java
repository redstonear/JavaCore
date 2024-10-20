package homeWorks.arrays;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1,6,8,12,87};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();
        System.out.println();
        System.out.println("first element: " + numbers[0]);
        System.out.println();
        System.out.println("last element " + numbers[numbers.length-1]);
        System.out.println("Length " + numbers.length);
        System.out.println();
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("min: " + min);
        if (numbers.length <= 2){
            System.out.println("cant print middle values");
        }else {
            if (numbers.length % 2 == 0){
                System.out.println("muddle values");
                System.out.println(numbers[(numbers.length / 2 - 1)]);
                System.out.println(numbers[(numbers.length / 2 +1)]);
            } else {
                System.out.println("muddle value");
                System.out.println(numbers[numbers.length/2]);
            }
        }
        System.out.println();
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                oddCount++;
            }
        }
        System.out.println("oddCount: " + oddCount);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0){
                evenCount++;
            }
        }
        System.out.println("evenCount: " + evenCount);

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("sum: " + sum);
        System.out.println("avg: " + sum / numbers.length);
    }
}
