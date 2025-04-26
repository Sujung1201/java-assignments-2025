public class Image {
    public int width;
    public int height;
    public Pixel[][] data;

    public Image() {
        this.width = 1;
        this.height = 1;
        this.data = new Pixel[1][1];
        this.data[0][0] = new Pixel();
    }

    public Image(int width, int height, Pixel[][] data) {
        setWidth(width);
        setHeight(height);
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dimensions: ").append(width).append(" by ").append(height).append("\n");
        sb.append("Data:\n");

        for (Pixel[] row : data) {
            for (Pixel pixel : row) {
                sb.append(pixel).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width must be greater than 0.");
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Height must be greater than 0.");
        }
    }

    public Pixel[][] getData() {
        return data;
    }

    public void setData(Pixel[][] data) {
        this.data = data;
    }

    public void setPixel(Pixel pixel, int row, int column) {
        if (row >= 0 && row < height && column >= 0 && column < width) {
            data[row][column] = pixel;
        } else {
            throw new IndexOutOfBoundsException("Invalid row or column index.");
        }
    }

}
