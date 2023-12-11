package data;

public enum ColorData {

    BLACK("черный"),
    BLUE("синий"),
    WHITE("белый"),
    RED("красный");

    private String name;

    ColorData(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
