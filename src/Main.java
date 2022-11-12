import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Main {
    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) { // 1 задание
        System.out.println(Arrays.toString(arr));
        for (int index = 0; index < generateRandomArray().length; index++) {
            if (index == generateRandomArray().length - 1)
                System.out.println("Сумма трат за месяц составила " + IntStream.of(generateRandomArray()).sum() + " рублей.");
        }
        IntStream intStream = Arrays.stream(arr);
        OptionalInt optionalInt = intStream.max();
        int maxAsInt = optionalInt.getAsInt();
        System.out.println("Максимальное число = " + maxAsInt); // 2 задание

        int min = 0;
        for (int j : arr) {
            if (j < arr[0]) {
                min = j;
            }
        }
        System.out.println("Минимальное число = " + min);

        double average;
        average = IntStream.of(generateRandomArray()).sum() / 30;

        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей"); // 3 задание
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]); // 4 задание
        }
    }
}