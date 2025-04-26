public class Pixel {
    private int red;
    private int green;
    private int blue;

    public Pixel() {
        this(0, 0, 0);
    }

    public Pixel(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    @Override
    public String toString() {
        return "(" + red + ", " + green + ", " + blue + ")";
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public static Pixel createRandomPixel() {
        int x = (int) (Math.random() * 256);
        int y = (int) (Math.random() * 256);
        int z = (int) (Math.random() * 256);
        return new Pixel(x, y, z);
    }
}
