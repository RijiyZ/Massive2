public class Main {
    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() { // рандом
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if ( i > 28){
            System.out.println("1 Задание: | Сумма трат за месяц составила " + sum + " рублей.  | "); }
        }

        int min = arr[0];
        int max = 0;
        for (int h : arr) {
            if (h < arr[0]) {
                min = h;
            }
        }
        for (int w : arr) {
            if (w > arr[0]) {
                max = w;
            }
        }
        System.out.println("2 Задание: | Минимальное число = " + min +" | Максимальное число = " + max + " |");

        double average = sum / arr.length;
        System.out.println("3 Задание: | Средняя сумма трат за месяц составила " + average + " рублей | ");

        System.out.print("4 Задание: | ");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'e', 'r', 'a', 'k', 'i', 'D'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.print(" | ");
    }
}