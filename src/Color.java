public enum Color {
    RED("FF0000"),
    GREAN("00FF00"),
    BLUE("0000FF");

    private String rgb;
    private Color(String rgb){
        this.rgb = rgb;
    }

    public void print() {
        System.out.println("rgb: " + rgb);
    }
}
