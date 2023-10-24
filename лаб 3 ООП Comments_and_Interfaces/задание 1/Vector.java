/**
 * Класс Vector представляет собой двумерный вектор и содержит методы для работы с векторами.
 */
public class Vector {
    public double x1;
    public double y1;
    public double x2;
    public double y2;

    /**
     * Конструктор класса Vector. Создает вектор с заданными начальными координатами.
     *
     * @param x1 x-координата начальной точки
     * @param y1 y-координата начальной точки
     * @param x2 x-координата конечной точки
     * @param y2 y-координата конечной точки
     */
    public Vector(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
     * Конструктор класса Vector без параметров. Создает вектор с начальными и конечными координатами (0, 0).
     */
    public Vector() {
        this(0, 0, 0, 0);
    }

    /**
     * Метод для вычисления векторного произведения данного вектора с другим вектором.
     *
     * @param otherVector вектор, с которым производится вычисление векторного произведения
     * @return векторное произведение текущего вектора и указанного вектора
     */
    public Vector vectorProduct(Vector otherVector) {
        double newX = this.y1 * otherVector.y2 - this.y2 * otherVector.y1;
        double newY = this.x2 * otherVector.x1 - this.x1 * otherVector.x2;
        return new Vector(newX, newY, 0, 0);
    }

    /**
     * Метод для вычисления скалярного произведения данного вектора с другим вектором.
     *
     * @param otherVector вектор, с которым производится вычисление скалярного произведения
     * @return скалярное произведение текущего вектора и указанного вектора
     */
    public double scalarProduct(Vector otherVector) {
        return this.x2 * otherVector.x2 + this.y2 * otherVector.y2;
    }

    /**
     * Метод для вычисления длины вектора.
     *
     * @return длина вектора
     */
    public double length() {
        return Math.sqrt(Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2));
    }

    /**
     * Метод для умножения вектора на скалярное значение.
     *
     * @param scalar скалярное значение, на которое умножается вектор
     */
    public void multiplyByScalar(double scalar) {
        this.x2 *= scalar;
        this.y2 *= scalar;
    }

    /**
     * Метод для вычисления суммы данного вектора с другим вектором.
     *
     * @param otherVector вектор, с которым производится вычисление суммы
     * @return вектор, представляющий собой сумму текущего вектора и указанного вектора
     */
    public Vector sum(Vector otherVector) {
        double newX = this.x2 + otherVector.x2;
        double newY = this.y2 + otherVector.y2;
        return new Vector(this.x1, this.y1, newX, newY);
    }

    /**
     * Метод для вычисления разности данного вектора с другим вектором.
     *
     * @param otherVector вектор, с которым производится вычисление разности
     * @return вектор, представляющий собой разность текущего вектора и указанного вектора
     */
    public Vector difference(Vector otherVector) {
        double newX = this.x2 - otherVector.x2;
        double newY = this.y2 - otherVector.y2;
        return new Vector(this.x1, this.y1, newX, newY);
    }
}