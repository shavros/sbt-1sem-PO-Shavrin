import myFigures.*;

public class Program {
    public static void main(String[] args){
        square square1 = new square(5);
        System.out.printf("Площадь квадрата равна %d.\n", square1.calculateArea());

        rectangle rectangle1 = new rectangle(5, 10);
        System.out.printf("Площадь прямоугольника равна %d.\n", rectangle1.calculateArea());

        circle circle1 = new circle(5);
        System.out.printf("Площадь круга равна %.2f.\n", circle1.calculateArea());
    }
}
