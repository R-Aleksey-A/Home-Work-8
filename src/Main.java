import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Home Work-8");
        System.out.println("Задание-1");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        System.out.println(number[0]);

        double[] numberDrobnve = {1.57, 7.654, 9.986};
        System.out.println(numberDrobnve[0]);

        int[] people = new int[5];
        people[0] = 10;
        people[1] = 20;
        people[2] = 30;
        people[3] = 40;
        people[4] = 50;
        System.out.println(people[4]);

        System.out.println();

        System.out.println("Звадание-2");
        System.out.println("Вариант с помощью Arra.toString");
        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(numberDrobnve));
        System.out.println(Arrays.toString(people));
        System.out.println("Вариант спомощью Цикла");
        for (int i = 0; i < number.length - 1; i++) {
            System.out.print(number[i] + ",");
        }
        System.out.println(number[number.length - 1]);

        for (int i = 0; i < numberDrobnve.length - 1; i++) {
            System.out.print(numberDrobnve[i] + ",");

        }
        System.out.println(numberDrobnve[numberDrobnve.length - 1]);

        for (int i = 0; i < people.length - 1; i++) {
            System.out.print(people[i] + ",");
        }
        System.out.println(people[people.length - 1]);

    }
}