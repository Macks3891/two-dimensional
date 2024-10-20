//import java.util.Arrays;
//
//public class Main {
//
//    // Метод, который создает копию массива и работает с копией
//    public static void modifyArrayWithCopy(int[] arr) {
//        // Создаем копию массива
//        int[] copy = Arrays.copyOf(arr, arr.length);
//
//        // Изменяем значения в копии массива
//        for (int i = 0; i < copy.length; i++) {
//            copy[i] = copy[i] * 2;
//        }
//
//        // Выводим измененную копию массива
//        System.out.println("Измененная копия массива: " + Arrays.toString(copy));
//    }
//
//    // Метод, который работает с исходным массивом
//    public static void modifyArrayInPlace(int[] arr) {
//        // Изменяем значения в исходном массиве
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = arr[i] * 2;
//        }
//
//        // Выводим измененный исходный массив
//        System.out.println("Измененный исходный массив: " + Arrays.toString(arr));
//    }
//
//    public static void main(String[] args) {
//        // Исходный массив
//        int[] originalArray = {1, 2, 3, 4, 5};
//
//        // Выводим исходный массив перед вызовом первого метода
//        System.out.println("Исходный массив: " + Arrays.toString(originalArray));
//
//        // Вызываем первый метод
//        modifyArrayWithCopy(originalArray);
//
//        // Выводим исходный массив после вызова первого метода
//        System.out.println("Исходный массив после вызова первого метода: " + Arrays.toString(originalArray));
//
//        // Выводим исходный массив перед вызовом второго метода
//        System.out.println("Исходный массив перед вызовом второго метода: " + Arrays.toString(originalArray));
//
//        // Вызываем второй метод
//        modifyArrayInPlace(originalArray);
//
//        // Выводим исходный массив после вызова второго метода
//        System.out.println("Исходный массив после вызова второго метода: " + Arrays.toString(originalArray));
//    }
//}