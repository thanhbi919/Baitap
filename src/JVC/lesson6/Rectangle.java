package JVC.lesson6;

public class Rectangle {
    private float width, height;

    public Rectangle() {
    }

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getPermeter() {
        return 2 * (width + height);
    }

    public float getArea() {
        return width * height;
    }

    public boolean isSquare() {
        if (width == height) {
            return true;
        } else {
            return false;
        }
    }
}
