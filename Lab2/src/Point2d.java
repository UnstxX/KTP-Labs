public class Point2d {
    protected double xCoord; // Координата X
    protected double yCoord; // Координата Y

    public Point2d(double x, double y) { xCoord = x; yCoord = y; } // Конструктор инициализации
    public Point2d() { this(0, 0); } // Конструктор по умолчанию\

    public double getX () { return xCoord; } // Возвращение координаты X
    public double getY () { return yCoord; } // Возвращение координаты Y

    public void setX (double val) { xCoord = val; } // Установка значения координаты X
    public void setY (double val) { yCoord = val; } // Установка значения координаты Y
}
