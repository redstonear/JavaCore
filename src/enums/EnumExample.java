package enums;

public class EnumExample {
    public static void main(String[] args) {
        Language[] values = Language.values();
        for (Language value : values){
            System.out.println(value);
        }
//        String langStr = scanner.nextLine();
//        Language language = Language.valueOf(langStr);
//        System.out.println(language);
    }
}