package exceptions;

public class CarIsNotReadyException extends Exception {

    public CarIsNotReadyException(String message) {
        super("Invalid: car is not ready, please try again");
    }
}
