package exceptions;

public class ArithmeticException extends Exception {
    private int z;
    public int Divide(int x, int y){
        if (y == 0 || x == 0){
            throw new java.lang.ArithmeticException("Invalid: Can't divide by zero");
        }
        else {
            z = x/y;
        }
        return z;
    }

    public static void main(String[] args) {
        ArithmeticException a = new ArithmeticException();
        try{
            System.out.println(a.Divide(10,0));
        } catch(java.lang.ArithmeticException E){
            System.out.println(E.fillInStackTrace().getMessage());
        }
    }
}  