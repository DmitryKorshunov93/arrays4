import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    public static void task1() {
        int[] salary = generateRandomArray();
        System.out.println(Arrays.toString(salary));
        int sum = 0;
        for (int i = 0; i < salary.length; i++) {
            sum = sum + salary[i];
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        }
    }

    public static void task2() {
        int[] salary = generateRandomArray();
        System.out.println(Arrays.toString(salary));

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < salary.length; i++) {
            if (salary[i] < min) {
                min = salary[i];
            }
            if (salary[i] > max) {
                max = salary[i];
            }
        }
        if (min == Integer.MAX_VALUE && max == Integer.MIN_VALUE) {
            System.out.println("Error");
        } else {
            System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
        }
    }

    public static void task3() {
        int[] salary = generateRandomArray();
        System.out.println(Arrays.toString(salary));

        double sum = 0;

        for (int i = 0; i < salary.length; i++) {
            sum = sum + salary[i];

            double avarageValue = sum / salary.length;
            System.out.println("Средняя сумма трат за месяц составила " + avarageValue + " рублей");
        }
    }

    public static void task4() {
        int[] salary = generateRandomArray();
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }
    }
}
