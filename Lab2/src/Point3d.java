public class Point3d extends Point2d {
    private double zCoord; // Координата Z

    public Point3d(double x, double y, double z) { xCoord = x; yCoord = y; zCoord = z; } // Конструктор инициализации
    public Point3d() { this(0, 0, 0); } // Конструктор по умолчанию

    public double getZ () { return zCoord; } // Возвращение координаты Z

    public void setZ (double val) { zCoord = val; } // Установка значения координаты Z

    public boolean equals (Point3d another) { return getX() == another.getX() && getY() == another.getY() && getZ() == another.getZ(); } // Проверка равенства двух объектов

    // Вычисление расстояния между двумя точками, с точностью двух знаков после запятой
    public double distanceTo (Point3d another) {
        double length = Math.sqrt(Math.pow(another.getX() - getX(), 2) + Math.pow(another.getY() - getY(), 2) + Math.pow(another.getZ() - getZ(), 2));
        String number = String.format("%.2f", length);
        return Double.parseDouble(number);
    }
}
