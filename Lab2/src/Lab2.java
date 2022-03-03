import java.util.Scanner;

public class Lab2 {
    // Ввод координат точек и расчет площади треугольника
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите координаты первой точки: ");
        Point3d A = new Point3d(input.nextDouble(), input.nextDouble(), input.nextDouble()); // Инициализания первой точки
        System.out.println("Введите координаты второй точки: ");
        Point3d B = new Point3d(input.nextDouble(), input.nextDouble(), input.nextDouble()); // Инициализания второй точки
        System.out.println("Введите координаты третьей точки: ");
        Point3d C = new Point3d(input.nextDouble(), input.nextDouble(), input.nextDouble()); // Инициализания третьей точки

        // Проверка на равность координат точек
        if (A.equals(B) || B.equals(C) || C.equals(A))
            System.out.println("Ошибка: есть равные точки!");
        else
            System.out.println("Площадь треугольника = " + computeArea(A, B, C));
    }

    // Вычисление площади треугольника
    public static double computeArea (Point3d A, Point3d B, Point3d C) {
        double AB = A.distanceTo(B);
        double BC = B.distanceTo(C);
        double CA = C.distanceTo(A);

        double halfP = (AB + BC + CA) / 2;

        double square = Math.sqrt(halfP * (halfP - AB) * (halfP - BC) * (halfP - CA));
        String result = String.format("%.2f", square);
        return Double.parseDouble(result);
    }

}
