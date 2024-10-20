package exceptions;

public class PcIsNotReadyForProgramming extends Exception {
    public PcIsNotReadyForProgramming(String message) {
        super("Invalid: can't access to pc, please try again");
    }
}
