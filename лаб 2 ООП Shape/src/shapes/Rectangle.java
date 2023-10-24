package shapes;

public class Rectangle extends sh {
    private Point pointA;
    private Point pointC;

    public Rectangle() {
        this.pointA = new Point();
        this.pointC = new Point();
    }

    public Rectangle(Point pointA, Point pointC) throws Exception {
        this.pointA = pointA;
        this.pointC = pointC;
        validate();
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    private void validate() throws Exception {
        if (pointA.getX() == pointC.getX() || pointA.getY() == pointC.getY()) {
            throw new Exception("Не удалось создать фигуру, так как точки лежат на одной прямой.");
        }
    }

    @Override
    public double getArea() {
        double width = Math.abs(pointC.getX() - pointA.getX());
        double height = Math.abs(pointC.getY() - pointA.getY());
        return width * height;
    }

    @Override
    public double getPerimeter() {
        double width = Math.abs(pointC.getX() - pointA.getX());
        double height = Math.abs(pointC.getY() - pointA.getY());
        return 2 * (width + height);
    }

    @Override
    public void move(double moveX, double moveY) {
        pointA.move(moveX, moveY);
        pointC.move(moveX, moveY);
    }

    @Override
    public void draw() {
        System.out.println("Фигура: Прямоугольник");
        System.out.println("Цвет: " + getColor());
        System.out.println("Координаты точки A: (" + pointA.getX() + ", " + pointA.getY() + ")");
        System.out.println("Координаты точки C: (" + pointC.getX() + ", " + pointC.getY() + ")");
    }

    @Override
    protected String getShapeName() {
        return "Прямоугольник";
    }

    @Override
    protected String getCoordinates() {
        return "Координаты точки A: (" + pointA.getX() + ", " + pointA.getY() + ")\n" +
                "Координаты точки C: (" + pointC.getX() + ", " + pointC.getY() + ")";
    }
}