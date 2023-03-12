package Drafts;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {7, 4, 2, 0, 1, 3, 4, 9};
        System.out.println(Arrays.toString(array));

        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            //сохранили 2й элемент массива в переменную key
            int key = array[i];
            //взяли индекс первого элемента массива
            int j = i - 1;

            //пока индекс первого элемента больше 0 а сам 1й эемент больше 2го:
            while (j >= 0 && array[j] > key) {
                //записываем на позизицию ключевого элемента(если условие истина) предыдущий ему элемент
                //до тех пор, пока он больше ключевого
                array[j + 1] = array[j];
                j = j - 1;
            }

            /*
             * К этой строчке массив [0, ..,  j] отсортирован и все его элементы меньше key.
             * В то же время массив [j + 2, .., i] отсортирован и все его элементы больше key.
             * Если вставить key на место j + 1 весь массив [0, .., i] станет отсортированным.
             */
            array[j + 1] = key;
        }
    }
}
