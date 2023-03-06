import Angle.Angle;
import Prism.Prism;
import Queue.Queue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner (System.in);
        int x;

        System.out.println("Виберіть завдання: ");
        System.out.println("1. Створити клас Angle для роботи з кутами на площині, які задаються \n" +
                "величиною в градусах та хвилинах. Обов’язково повинні бути реалізовані: \n" +
                "перевід в радіани, приведення до діапазону 0.00-360.00, збільшення та \n" +
                "зменшення кута на задану величину, отримання синусу, порівняння кутів.\n ");
        System.out.println("2. Клас «призма», який описує прямокутну призму заданої висоти, в основі якої\n" +
                "лежить правильний трикутник з заданою стороною. Методи класу дозволяють\n" +
                "знаходити площу бічної основи та об'єм призми.\n");
        System.out.println("3. Організувати динамічну структуру даних чергу з цілих чисел. Реалізувати \n" +
                "додавання елементів у чергу, вилучення їх, пошук потрібного елемента.\n");

        do {
            System.out.print("Виберіть завдання: ");
            x = console.nextInt();
        }while (x <= 0 || x >= 4);

        switch (x) {
            case 1:
                Angle angle1 = new Angle(30, 45);
                int degrees = angle1.GetDegrees(); // поверне 30
                int minutes = angle1.GetMinutes(); // поверне 45
                System.out.println(degrees + " " + minutes);

                Angle angle2 = new Angle(90, 0);
                double radians = angle2.toRadians(); // поверне 1.5708
                double sin = angle2.sin(); // поверне 1.0
                System.out.println(radians + " " + sin);

                Angle angle3 = new Angle(180, 30);
                angle3.add(20, 15); // додає 20 градусів та 15 хвилин до значення кута
                System.out.println(angle3);
                angle3.subtract(40, 10); // віднімає 40 градусів та 10 хвилин від значення кута
                System.out.println(angle3);

                Angle angle4 = new Angle(45, 0);
                Angle angle5 = new Angle(45, 0);
                boolean equal1 = angle4.equals(angle5); // поверне true
                System.out.println(equal1);

                Angle angle6 = new Angle(30, 0);
                boolean equal2 = angle4.equals(angle6); // поверне false
                System.out.println(equal2);

                Angle angle7 = new Angle(270, 15);
                String str = angle7.toString(); // поверне "270 15"
                System.out.println(str);
                break;
            case 2:
                Prism prism1 = new Prism(10, 5);
                double height = prism1.getHeight(); // поверне 10.0
                double side = prism1.getSide(); // поверне 5.0
                System.out.println(height + " " + side);

                prism1.setHeight(20); // стане 20.0
                prism1.setSide(10);   // стане 10.0
                System.out.println(prism1);

                Prism prism2 = new Prism(30, 50);
                System.out.println(prism2.getBaseArea());

                System.out.println(prism2.getVolume());

                Prism prism3 = new Prism(45, 2);
                Prism prism4 = new Prism(45, 2);
                boolean equal12 = prism3.equals(prism4); // поверне true
                System.out.println(equal12);

                Prism prism5 = new Prism(50, 2);
                boolean equal22 = prism3.equals(prism5); // поверне true
                System.out.println(equal22);

                String str1 = prism5.toString(); //поверне 50 2
                System.out.println(str1);
                break;
            case 3:
                Queue queue = new Queue();
                Queue queue1 = new Queue();

                queue.enqueue(5);
                queue.enqueue(10);
                queue.enqueue(15);

                System.out.println(queue);

                System.out.println(queue.get(0));
                System.out.println(queue.get(1));
                System.out.println(queue.get(2));
                //System.out.println(queue.get(3));

                queue1.enqueue(5);
                queue1.enqueue(10);
                queue1.enqueue(15);

                System.out.println(queue.equals(queue1));

                System.out.println("\n");
                while (!queue.isEmpty()) {
                    System.out.println(queue.dequeue());
                }

                break;

            default:
                System.out.println("Incorrect value!!!");
        }
        console.close();

    }
}
