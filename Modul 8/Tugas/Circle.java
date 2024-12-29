class Circle extends Shape {
    private float radius;
    private Point center;

    public Circle(float radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public void setCenter(Point newCenter) {
        this.center = newCenter;
    }

    public void setRadius(float newRadius) {
        this.radius = newRadius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle at (" + center.x + ", " + center.y + ") with radius " + radius);
    }

    @Override
    public void move() {
        System.out.println("Moving Circle...");
    }

    @Override
    public void resize() {
        System.out.println("Resizing Circle...");
    }
}
