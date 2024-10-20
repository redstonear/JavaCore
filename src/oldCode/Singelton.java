package oldCode;

class Singleton {

    private static Singleton single_instance = null;


    private Singleton() {

    }

    public static Singleton getInstance() {
        if (single_instance == null) single_instance = new Singleton();

        return single_instance;
    }
}


class SingletonDemo {
    // Main driver method
    public static void main(String[] args) {

        Singleton x = Singleton.getInstance();

        Singleton y = Singleton.getInstance();

        Singleton z = Singleton.getInstance();

        System.out.println("Hashcode of x is " + x.hashCode());
        System.out.println("Hashcode of y is " + y.hashCode());
        System.out.println("Hashcode of z is " + z.hashCode());

        if (x == y && y == z) {

            System.out.println("Three objects point to the same memory location on the heap i.e, to the same object");
        } else {
            // Print statement
            System.out.println("Three objects DO NOT point to the same memory location on the heap");
        }
    }
}


class Whisky {

    private static Whisky oneOfWorldWhisky = null;

    private Whisky() {

    }

    public static Whisky getInstance() {
        if (oneOfWorldWhisky == null) {
            oneOfWorldWhisky = new Whisky();
        }
        return oneOfWorldWhisky;
    }

}

class WhiskyFactory{
    public static void main(String[] args) {

        Whisky daniels = Whisky.getInstance();
        Whisky grands = Whisky.getInstance();
        Whisky jagermaster = Whisky.getInstance();

        System.out.println(daniels.hashCode());
        System.out.println(grands.hashCode());
        System.out.println(jagermaster.hashCode());
    }
}