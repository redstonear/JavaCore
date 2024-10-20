package homeWorks.strings;

public class CustomString {
    public static java.lang.String Reverse(java.lang.String text) {
        java.lang.String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result = result + text.charAt(i);
        }
        return result;
    }

    public static java.lang.String subString(java.lang.String text, int fromIndex, int toIndex) throws IndexOutOfBoundsException {
        java.lang.String result = "";
        if (fromIndex < 0 || fromIndex > text.length()) {
            throw new IndexOutOfBoundsException();
        } else {
            for (int i = fromIndex; i <= toIndex; i++) {
                result = result + text.charAt(i);
            }
        }
        return result;
    }

    public static int CountCount(java.lang.String Text, java.lang.String findCount) throws NullPointerException {
        if (Text == null || findCount == null) throw new NullPointerException("Error");
        java.lang.String tmp;
        int a = 0;
        for (int i = 0; i < Text.length(); i++) {
            tmp = subString(Text, i, i + findCount.length());
            if (tmp.equals(findCount)) {
                a++;
            }
        }
        return a;
    }
}
