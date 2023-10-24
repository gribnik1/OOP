import shapes.Circle;
import shapes.Point;

import java.awt.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Point point = new Point(3,3);
        Circle circle = new Circle(point,5);
        circle.draw();

        circle.setColor(Color.BLACK);

        circle.move(1,1);
        circle.draw();


    }
}
