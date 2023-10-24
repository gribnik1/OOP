package shapes;
public class Triangle extends sh {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle() {
        this.pointA = new Point();
        this.pointB = new Point();
        this.pointC = new Point();
    }

    public Triangle(Point pointA, Point pointB, Point pointC) throws Exception {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        validate();
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    private void validate() throws Exception {
        double area = 0.5 * ((pointB.getX() - pointA.getX()) * (pointC.getY() - pointA.getY()) - (pointC.getX() - pointA.getX()) * (pointB.getY() - pointA.getY()));
        if (area == 0) {
            throw new Exception("Не удалось создать фигуру, так как все три точки лежат на одной прямой.");
        }
    }

    @Override
    public double getArea() {
        double area = 0.5 * ((pointB.getX() - pointA.getX()) * (pointC.getY() - pointA.getY()) - (pointC.getX() - pointA.getX()) * (pointB.getY() - pointA.getY()));
        return Math.abs(area);
    }

    @Override
    public double getPerimeter() {
        double sideAB = Math.sqrt(Math.pow(pointB.getX() - pointA.getX(), 2) + Math.pow(pointB.getY() - pointA.getY(), 2));
        double sideBC = Math.sqrt(Math.pow(pointC.getX() - pointB.getX(), 2) + Math.pow(pointC.getY() - pointB.getY(), 2));
        double sideCA = Math.sqrt(Math.pow(pointA.getX() - pointC.getX(), 2) + Math.pow(pointA.getY() - pointC.getY(), 2));
        return sideAB + sideBC + sideCA;
    }

    @Override
    public void move(double moveX, double moveY) {
        pointA.move(moveX, moveY);
        pointB.move(moveX, moveY);
        pointC.move(moveX, moveY);
    }

    @Override
    public void draw() {
        System.out.println("Фигура: Треугольник");
        System.out.println("Цвет: " + getColor());
        System.out.println("Координаты точки A: (" + pointA.getX() + ", " + pointA.getY() + ")");
        System.out.println("Координаты точки B: (" + pointB.getX() + ", " + pointB.getY() + ")");
        System.out.println("Координаты точки C: (" + pointC.getX() + ", " + pointC.getY() + ")");
    }

    @Override
    protected String getShapeName() {
        return "Треугольник";
    }

    @Override
    protected String getCoordinates() {
        return "Координаты точки A: (" + pointA.getX() + ", " + pointA.getY() + ")\n" +
                "Координаты точки B: (" + pointB.getX() + ", " + pointB.getY() + ")\n" +
                "Координаты точки C: (" + pointC.getX() + ", " + pointC.getY() + ")";
    }
}