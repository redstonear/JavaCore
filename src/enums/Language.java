package enums;

public enum Language {
    ARM("Armenia"),
    ENG("English"),
    RU("Russian"),
    FR("French");

    private String countryName;

    Language(String countryName){
        this.countryName = countryName;
    }
}
