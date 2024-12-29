class Polygon extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Polygon...");
    }

    @Override
    public void move() {
        System.out.println("Moving Polygon...");
    }

    @Override
    public void resize() {
        System.out.println("Resizing Polygon...");
    }
}