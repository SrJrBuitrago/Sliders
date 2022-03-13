package es.ideas.sliders.modelo;

public class Colorr {
    private int red;
    private int green;
    private int blue;

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public Colorr(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public Colorr() {
    }

    @Override
    public String toString() {
        return
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue
                ;
    }
}
