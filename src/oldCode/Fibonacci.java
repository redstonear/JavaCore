package oldCode;

public class Fibonacci {

    int fibo(int n){
        int result = 0;
        int first = 0;
        int next = 1;
        for (int i = 0; i <= n; i++) {
            System.out.println(first + " ");
            result = first + next;
            first = next;
            next = result;
        }
        return result;
    }

    public int fibo1(int n){
        if (n <= 1) return 1;
        return fibo1(n-1) + fibo1(n-2);
    }

}
class Main3 {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        System.out.println(f.fibo1(10));
//        System.out.println(f.fibo(10));
    }
}