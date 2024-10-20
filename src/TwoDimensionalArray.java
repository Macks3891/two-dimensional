import java.util.Arrays;

public class TwoDimensionalArray {

    /**
     * Создает двумерный массив 3x3, заполняет его, выводит на экран и вычисляет сумму элементов по строкам и колонкам.
     * Также создает и изменяет одномерный массив.
     *
     * @param args Аргументы командной строки (не используются в этой программе).
     */
    public static void main(String[] args) {
        int[][] nums = new int[3][3];

        fillArray(nums);
        printArray(nums);

        findSumLines(nums);
        findSumColuns(nums);

        int[] nums2 = new int[]{4, 12, 15, 28, 1};
        System.out.println("Исходный массив: " + Arrays.toString(nums2));
        changeArray(nums2);
        System.out.println("Измененный массив: " + Arrays.toString(nums2));
        changeCopyArray(nums2);
        System.out.println("Копия измененного массива: " + Arrays.toString(nums2));
    }

    /**
     * Метод для сортировки одномерного массива.
     *
     * @param nums Одномерный массив, который нужно отсортировать.
     */
    static void changeArray(int[] nums) {
        Arrays.sort(nums);
    }

    /**
     * Метод для создания копии одномерного массива и заполнения исходного массива нулями.
     *
     * @param nums Одномерный массив, который нужно изменить.
     */
    static void changeCopyArray(int[] nums) {
        int[] numsCopy = Arrays.copyOf(nums, nums.length);
        Arrays.fill(nums, 0);
        System.out.println(Arrays.toString(numsCopy));
    }

    /**
     * Метод для вычисления и вывода суммы элементов по колонкам двумерного массива.
     *
     * @param nums Двумерный массив, элементы которого нужно суммировать.
     */
    static void findSumColuns(int[][] nums) {
        System.out.println("Сумма элементов по колонкам:");
        int[] sumColunsResult = sumColuns(nums);
        for (int j = 0; j < sumColunsResult.length; j++) {
            System.out.println("Сумма колонки " + j + ": " + sumColunsResult[j]);
        }
    }

    /**
     * Метод для суммирования элементов по колонкам двумерного массива.
     *
     * @param nums Двумерный массив, элементы которого нужно суммировать.
     * @return Массив, содержащий суммы элементов каждой колонки.
     */
    static int[] sumColuns(int[][] nums) {
        int[] result = new int[nums[0].length];

        for (int j = 0; j < nums[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i][j];
            }
            result[j] = sum;
        }

        return result;
    }

    /**
     * Метод для вычисления и вывода суммы элементов по строкам двумерного массива.
     *
     * @param nums Двумерный массив, элементы которого нужно суммировать.
     */
    static void findSumLines(int[][] nums) {
        System.out.println("Сумма элементов по строкам:");
        int[] sumLinesResult = sumLines(nums);
        for (int i = 0; i < sumLinesResult.length; i++) {
            System.out.println("Сумма строки " + i + ": " + sumLinesResult[i]);
        }
    }

    /**
     * Метод для суммирования элементов по строкам двумерного массива.
     *
     * @param nums Двумерный массив, элементы которого нужно суммировать.
     * @return Массив, содержащий суммы элементов каждой строки.
     */
    static int[] sumLines(int[][] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < nums[0].length; j++) {
                sum += nums[i][j];
            }
            result[i] = sum;
        }

        return result;
    }

    /**
     * Метод для заполнения двумерного массива последовательными целыми числами.
     *
     * @param nums Двумерный массив, который нужно заполнить.
     */
    static void fillArray(int[][] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                nums[i][j] = count;
                count++;
            }
        }
    }

    /**
     * Метод для вывода двумерного массива на экран.
     * Каждая строка массива выводится на отдельной строке,
     * а элементы в строке разделяются пробелами.
     *
     * @param nums Двумерный массив, который нужно вывести.
     */
    static void printArray(int[][] nums) {
        for (int[] inboxNums : nums) {
            for (int num : inboxNums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}