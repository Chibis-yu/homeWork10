import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] expensesArray = generateRandomArray();
        int expensesSumma = 0;
        System.out.println(Arrays.toString(expensesArray));

        for (int expenses : expensesArray) {
            expensesSumma = expensesSumma + expenses;
        }
        System.out.println("Сумма трат за месяц составила " + expensesSumma + " рублей ");
    }


    public static void task2() {
        System.out.println("Задача 2");

        int[] expensesArray = generateRandomArray();
        System.out.println(Arrays.toString(expensesArray));
        int minExpenses = expensesArray[0];
        int maxExpenses = expensesArray[0];

        for (int expenses : expensesArray) {
            if (expenses < minExpenses) {
                minExpenses = expenses;
            }
            if (expenses > maxExpenses) {
                maxExpenses = expenses;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpenses + " рублей ");
        System.out.println("Максимальная сумма трат за день составила " + maxExpenses + " рублей");
    }
    public static void task3() {
        System.out.println("Задача 3");

        int[] expensesArray = generateRandomArray();
        int expensesSumma = 0;
        System.out.println(Arrays.toString(expensesArray));

        for (int expenses : expensesArray) {
            expensesSumma = expensesSumma + expenses;
        }
        double expensesAverage = (double) expensesSumma / expensesArray.length;
        System.out.println("Средняя сумма трат за месяц составила " + expensesAverage + " рублей");
    }

    public static void task4() {
        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

        public static int[] generateRandomArray () {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }
    }

