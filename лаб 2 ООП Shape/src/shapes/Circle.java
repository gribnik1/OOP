package shapes;
public class Circle extends sh {
    private Point center;
    private double radius;

    public Circle() {
        this.center = new Point();
        this.radius = 0.0;
    }

    public Circle(Point center, double radius) throws Exception {
        this.center = center;
        this.radius = radius;
        validate();
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws Exception {
        this.radius = radius;
        validate();
    }

    private void validate() throws Exception {
        if (radius <= 0) {
            throw new Exception("Не удалось создать фигуру, так как радиус должен быть больше нуля.");
        }
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void move(double moveX, double moveY) {
        center.move(moveX, moveY);
    }

    @Override
    public void draw() {
        System.out.println("Фигура: Круг");
        System.out.println("Центр: (" + center.getX() + ", " + center.getY() + ")");
        System.out.println("Радиус: " + radius);
        System.out.println("Площадь: " + getArea());
    }

    @Override
    protected String getShapeName() {
        return null;
    }

    @Override
    protected String getCoordinates() {
        return null;
    }
}