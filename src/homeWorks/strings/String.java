package homeWorks.strings;

public class String {
    public static String Reverse(String text) {
        java.lang.String txt = "", nstr = "";
        char ca;
        for (int i = 0; i < txt.length(); i++) {
            ca = nstr.charAt(i);
            nstr = ca + nstr;
        }
        System.out.println("Reversed word +: " + nstr);
        return text;
    }

    public static java.lang.String SubString(java.lang.String message, int fromIndex, int toIndex) throws StringIndexOutOfBoundsException {
        if (message == null) {
            return message;
        } else if (fromIndex > message.length() || toIndex > message.length()) {
            throw new StringIndexOutOfBoundsException();
        }
        java.lang.String t = "";
        for (int i = fromIndex; i <= toIndex; i++) {
            t += message.charAt(i);
        }
        return t;
    }
}
class StringDemo extends String {
    public static void main(String[] args) {
        System.out.println("123456");
        try {
            System.out.println(String.SubString("abcdefg", 0, 7));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error");
        }
    }
}