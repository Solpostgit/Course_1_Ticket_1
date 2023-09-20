import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        System.out.println("Исходный массив array " + Arrays.toString(array));

        reverseArray(array); //метод реверса массива

    }
    public static void reverseArray(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0;i < arr.length; i++){
            arr2[i] = arr[arr.length-1-i];
        }
        System.out.println();
        System.out.println("Массив arr2 " + Arrays.toString(arr2));
        arr = Arrays.copyOf(arr2, arr2.length);
        System.out.println("Массив array " + Arrays.toString(arr));
    }
}