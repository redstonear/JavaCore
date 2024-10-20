package oldCode;

public class Credit {
    public static double Credit(int Money, int Month) {
        double duty = Money;
        for (int i = 0; i < Month; i++) {
            duty = duty - (duty / 100) * 10;
        }
        return duty;
    }
    static class CreditDemo {
        public static void main(java.lang.String[] args) {
            System.out.println(Credit.Credit(20000, 3));
        }
    }
}